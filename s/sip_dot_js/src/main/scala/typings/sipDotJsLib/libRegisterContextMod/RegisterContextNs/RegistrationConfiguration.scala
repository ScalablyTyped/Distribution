package typings
package sipDotJsLib.libRegisterContextMod.RegisterContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationConfiguration extends js.Object {
  var expires: js.UndefOr[java.lang.String] = js.undefined
  var extraContactHeaderParams: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var regId: js.UndefOr[scala.Double] = js.undefined
  var registrar: js.UndefOr[java.lang.String] = js.undefined
}

object RegistrationConfiguration {
  @scala.inline
  def apply(
    expires: java.lang.String = null,
    extraContactHeaderParams: js.Array[java.lang.String] = null,
    instanceId: java.lang.String = null,
    params: js.Any = null,
    regId: scala.Int | scala.Double = null,
    registrar: java.lang.String = null
  ): RegistrationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (extraContactHeaderParams != null) __obj.updateDynamic("extraContactHeaderParams")(extraContactHeaderParams)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (params != null) __obj.updateDynamic("params")(params)
    if (regId != null) __obj.updateDynamic("regId")(regId.asInstanceOf[js.Any])
    if (registrar != null) __obj.updateDynamic("registrar")(registrar)
    __obj.asInstanceOf[RegistrationConfiguration]
  }
}

