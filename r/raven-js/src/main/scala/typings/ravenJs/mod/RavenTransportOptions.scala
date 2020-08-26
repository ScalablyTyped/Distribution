package typings.ravenJs.mod

import typings.ravenJs.anon.ErrorrequestXMLHttpReques
import typings.ravenJs.anon.Sentryclient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RavenTransportOptions extends js.Object {
  var auth: Sentryclient = js.native
  var data: js.Any = js.native
  var url: String = js.native
  def onError(error: ErrorrequestXMLHttpReques): Unit = js.native
  def onSuccess(): Unit = js.native
}

object RavenTransportOptions {
  @scala.inline
  def apply(
    auth: Sentryclient,
    data: js.Any,
    onError: ErrorrequestXMLHttpReques => Unit,
    onSuccess: () => Unit,
    url: String
  ): RavenTransportOptions = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError), onSuccess = js.Any.fromFunction0(onSuccess), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RavenTransportOptions]
  }
  @scala.inline
  implicit class RavenTransportOptionsOps[Self <: RavenTransportOptions] (val x: Self) extends AnyVal {
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
    def setAuth(value: Sentryclient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnError(value: ErrorrequestXMLHttpReques => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def setOnSuccess(value: () => Unit): Self = this.set("onSuccess", js.Any.fromFunction0(value))
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

