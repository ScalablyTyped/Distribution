package typings.signalfx.signalfxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalClient extends js.Object {
  def send(report: SignalReport): Unit
}

object SignalClient {
  @scala.inline
  def apply(send: SignalReport => Unit): SignalClient = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[SignalClient]
  }
}

