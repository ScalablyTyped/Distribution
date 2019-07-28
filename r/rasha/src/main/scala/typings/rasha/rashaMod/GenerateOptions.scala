package typings.rasha.rashaMod

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
    modulusLength: Int | Double = null,
    publicExponent: Int | Double = null
  ): GenerateOptions = {
    val __obj = js.Dynamic.literal(format = format)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (modulusLength != null) __obj.updateDynamic("modulusLength")(modulusLength.asInstanceOf[js.Any])
    if (publicExponent != null) __obj.updateDynamic("publicExponent")(publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOptions]
  }
}

