package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCSrtpKeyParam extends js.Object {
  var keyMethod: js.UndefOr[java.lang.String] = js.undefined
  var keySalt: js.UndefOr[java.lang.String] = js.undefined
  var lifetime: js.UndefOr[java.lang.String] = js.undefined
  var mkiLength: js.UndefOr[Double] = js.undefined
  var mkiValue: js.UndefOr[Double] = js.undefined
}

object RTCSrtpKeyParam {
  @scala.inline
  def apply(
    keyMethod: java.lang.String = null,
    keySalt: java.lang.String = null,
    lifetime: java.lang.String = null,
    mkiLength: Int | Double = null,
    mkiValue: Int | Double = null
  ): RTCSrtpKeyParam = {
    val __obj = js.Dynamic.literal()
    if (keyMethod != null) __obj.updateDynamic("keyMethod")(keyMethod)
    if (keySalt != null) __obj.updateDynamic("keySalt")(keySalt)
    if (lifetime != null) __obj.updateDynamic("lifetime")(lifetime)
    if (mkiLength != null) __obj.updateDynamic("mkiLength")(mkiLength.asInstanceOf[js.Any])
    if (mkiValue != null) __obj.updateDynamic("mkiValue")(mkiValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSrtpKeyParam]
  }
}

