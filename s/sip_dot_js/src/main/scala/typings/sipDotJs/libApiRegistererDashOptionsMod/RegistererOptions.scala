package typings.sipDotJs.libApiRegistererDashOptionsMod

import typings.sipDotJs.Anon_FromDisplayNameFromTag
import typings.sipDotJs.libCoreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistererOptions extends js.Object {
  /** Registration expiration time in seconds. */
  var expires: js.UndefOr[Double] = js.undefined
  /** Array of extra Contact header parameters. */
  var extraContactHeaderParams: js.UndefOr[js.Array[String]] = js.undefined
  /** Array of extra headers added to the REGISTER. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * UUID to provide with "+sip.instance" Contact parameter.
    * @defaultValue a randomly generated uuid
    */
  var instanceId: js.UndefOr[String] = js.undefined
  /**
    * If true, constructor logs the registerer configuration.
    * @defaultValue `true`
    */
  var logConfiguration: js.UndefOr[Boolean] = js.undefined
  /** @deprecated TODO: provide alternative. */
  var params: js.UndefOr[Anon_FromDisplayNameFromTag] = js.undefined
  /**
    * Value to provide with "reg-id" Contact parameter.
    * @defaultValue 1
    */
  var regId: js.UndefOr[Double] = js.undefined
  /**
    * The URI of the registrar to send the REGISTER requests.
    * @defaultValue domain portion of the user agent's uri
    */
  var registrar: js.UndefOr[URI] = js.undefined
}

object RegistererOptions {
  @scala.inline
  def apply(
    expires: Int | Double = null,
    extraContactHeaderParams: js.Array[String] = null,
    extraHeaders: js.Array[String] = null,
    instanceId: String = null,
    logConfiguration: js.UndefOr[Boolean] = js.undefined,
    params: Anon_FromDisplayNameFromTag = null,
    regId: Int | Double = null,
    registrar: URI = null
  ): RegistererOptions = {
    val __obj = js.Dynamic.literal()
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (extraContactHeaderParams != null) __obj.updateDynamic("extraContactHeaderParams")(extraContactHeaderParams)
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (!js.isUndefined(logConfiguration)) __obj.updateDynamic("logConfiguration")(logConfiguration)
    if (params != null) __obj.updateDynamic("params")(params)
    if (regId != null) __obj.updateDynamic("regId")(regId.asInstanceOf[js.Any])
    if (registrar != null) __obj.updateDynamic("registrar")(registrar)
    __obj.asInstanceOf[RegistererOptions]
  }
}

