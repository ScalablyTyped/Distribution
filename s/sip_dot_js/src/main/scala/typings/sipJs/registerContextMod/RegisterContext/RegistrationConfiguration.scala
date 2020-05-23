package typings.sipJs.registerContextMod.RegisterContext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationConfiguration extends js.Object {
  var expires: js.UndefOr[String] = js.undefined
  var extraContactHeaderParams: js.UndefOr[js.Array[String]] = js.undefined
  var instanceId: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var regId: js.UndefOr[Double] = js.undefined
  var registrar: js.UndefOr[String] = js.undefined
}

object RegistrationConfiguration {
  @scala.inline
  def apply(
    expires: String = null,
    extraContactHeaderParams: js.Array[String] = null,
    instanceId: String = null,
    params: js.Any = null,
    regId: js.UndefOr[Double] = js.undefined,
    registrar: String = null
  ): RegistrationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (extraContactHeaderParams != null) __obj.updateDynamic("extraContactHeaderParams")(extraContactHeaderParams.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(regId)) __obj.updateDynamic("regId")(regId.get.asInstanceOf[js.Any])
    if (registrar != null) __obj.updateDynamic("registrar")(registrar.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistrationConfiguration]
  }
}

