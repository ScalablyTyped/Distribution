package typings.sipJs.registererOptionsMod

import typings.sipJs.anon.FromTag
import typings.sipJs.coreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistererOptions extends js.Object {
  /** Registration expiration time in seconds. */
  var expires: js.UndefOr[Double] = js.native
  /** Array of extra Contact header parameters. */
  var extraContactHeaderParams: js.UndefOr[js.Array[String]] = js.native
  /** Array of extra headers added to the REGISTER. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * UUID to provide with "+sip.instance" Contact parameter.
    * @defaultValue a randomly generated uuid
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * If true, constructor logs the registerer configuration.
    * @defaultValue `true`
    */
  var logConfiguration: js.UndefOr[Boolean] = js.native
  /** @deprecated TODO: provide alternative. */
  var params: js.UndefOr[FromTag] = js.native
  /**
    * Value to provide with "reg-id" Contact parameter.
    * @defaultValue 1
    */
  var regId: js.UndefOr[Double] = js.native
  /**
    * The URI of the registrar to send the REGISTER requests.
    * @defaultValue domain portion of the user agent's uri
    */
  var registrar: js.UndefOr[URI] = js.native
}

object RegistererOptions {
  @scala.inline
  def apply(): RegistererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistererOptions]
  }
  @scala.inline
  implicit class RegistererOptionsOps[Self <: RegistererOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setExtraContactHeaderParamsVarargs(value: String*): Self = this.set("extraContactHeaderParams", js.Array(value :_*))
    @scala.inline
    def setExtraContactHeaderParams(value: js.Array[String]): Self = this.set("extraContactHeaderParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraContactHeaderParams: Self = this.set("extraContactHeaderParams", js.undefined)
    @scala.inline
    def setExtraHeadersVarargs(value: String*): Self = this.set("extraHeaders", js.Array(value :_*))
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = this.set("extraHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraHeaders: Self = this.set("extraHeaders", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    @scala.inline
    def setLogConfiguration(value: Boolean): Self = this.set("logConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogConfiguration: Self = this.set("logConfiguration", js.undefined)
    @scala.inline
    def setParams(value: FromTag): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setRegId(value: Double): Self = this.set("regId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegId: Self = this.set("regId", js.undefined)
    @scala.inline
    def setRegistrar(value: URI): Self = this.set("registrar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrar: Self = this.set("registrar", js.undefined)
  }
  
}

