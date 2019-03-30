package typings
package rashaLib.rashaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateOptions extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var format: java.lang.String
  var modulusLength: js.UndefOr[scala.Double] = js.undefined
  var publicExponent: js.UndefOr[scala.Double] = js.undefined
}

object GenerateOptions {
  @scala.inline
  def apply(
    format: java.lang.String,
    encoding: java.lang.String = null,
    modulusLength: scala.Int | scala.Double = null,
    publicExponent: scala.Int | scala.Double = null
  ): GenerateOptions = {
    val __obj = js.Dynamic.literal(format = format)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (modulusLength != null) __obj.updateDynamic("modulusLength")(modulusLength.asInstanceOf[js.Any])
    if (publicExponent != null) __obj.updateDynamic("publicExponent")(publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOptions]
  }
}

