package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.rx.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxSettings extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var body: js.UndefOr[String] = js.native
  // This options does not seem to be used in the code yet
  // contentType?: string;
  var crossDomain: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var method: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var progressObserver: js.UndefOr[Observer[_]] = js.native
  var responseType: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var user: js.UndefOr[String] = js.native
}

object AjaxSettings {
  @scala.inline
  def apply(): AjaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxSettings]
  }
  @scala.inline
  implicit class AjaxSettingsOps[Self <: AjaxSettings] (val x: Self) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCrossDomain(value: Boolean): Self = this.set("crossDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossDomain: Self = this.set("crossDomain", js.undefined)
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setProgressObserver(value: Observer[_]): Self = this.set("progressObserver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressObserver: Self = this.set("progressObserver", js.undefined)
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

