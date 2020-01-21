package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// signal
trait SignalParameters extends js.Object {
  var channel: String
  var message: js.Any
}

object SignalParameters {
  @scala.inline
  def apply(channel: String, message: js.Any): SignalParameters = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignalParameters]
  }
}

