package typings.rasha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var format: String
  var modulusLength: js.UndefOr[Double] = js.undefined
  var publicExponent: js.UndefOr[Double] = js.undefined
}

object GenerateOptions {
  @scala.inline
  def apply(
    format: String,
    encoding: String = null,
    modulusLength: js.UndefOr[Double] = js.undefined,
    publicExponent: js.UndefOr[Double] = js.undefined
  ): GenerateOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(modulusLength)) __obj.updateDynamic("modulusLength")(modulusLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(publicExponent)) __obj.updateDynamic("publicExponent")(publicExponent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOptions]
  }
}

