package typings.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionErrorContext extends js.Object {
  var readyState: Double
  var responseText: String
  var status: Double
  var statusText: String
}

object ConnectionErrorContext {
  @scala.inline
  def apply(readyState: Double, responseText: String, status: Double, statusText: String): ConnectionErrorContext = {
    val __obj = js.Dynamic.literal(readyState = readyState.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionErrorContext]
  }
}

