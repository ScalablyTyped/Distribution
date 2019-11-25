package typings.ravenDashJs.ravenDashJsMod

import typings.ravenDashJs.Anon_Request
import typings.ravenDashJs.Anon_Sentryclient
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RavenTransportOptions extends js.Object {
  var auth: Anon_Sentryclient
  var data: js.Any
  var url: String
  def onError(error: Error with Anon_Request): Unit
  def onSuccess(): Unit
}

object RavenTransportOptions {
  @scala.inline
  def apply(
    auth: Anon_Sentryclient,
    data: js.Any,
    onError: Error with Anon_Request => Unit,
    onSuccess: () => Unit,
    url: String
  ): RavenTransportOptions = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError), onSuccess = js.Any.fromFunction0(onSuccess), url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RavenTransportOptions]
  }
}

