package typings.ravenJs.mod

import typings.ravenJs.anon.ErrorrequestXMLHttpReques
import typings.ravenJs.anon.Sentryclient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RavenTransportOptions extends js.Object {
  var auth: Sentryclient
  var data: js.Any
  var url: String
  def onError(error: ErrorrequestXMLHttpReques): Unit
  def onSuccess(): Unit
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
}

