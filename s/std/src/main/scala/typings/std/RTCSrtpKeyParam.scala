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
    mkiLength: js.UndefOr[Double] = js.undefined,
    mkiValue: js.UndefOr[Double] = js.undefined
  ): RTCSrtpKeyParam = {
    val __obj = js.Dynamic.literal()
    if (keyMethod != null) __obj.updateDynamic("keyMethod")(keyMethod.asInstanceOf[js.Any])
    if (keySalt != null) __obj.updateDynamic("keySalt")(keySalt.asInstanceOf[js.Any])
    if (lifetime != null) __obj.updateDynamic("lifetime")(lifetime.asInstanceOf[js.Any])
    if (!js.isUndefined(mkiLength)) __obj.updateDynamic("mkiLength")(mkiLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mkiValue)) __obj.updateDynamic("mkiValue")(mkiValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSrtpKeyParam]
  }
}

