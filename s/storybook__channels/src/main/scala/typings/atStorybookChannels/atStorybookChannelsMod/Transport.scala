package typings.atStorybookChannels.atStorybookChannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  def send(event: js.Any): Unit
  def setHandler(handler: EventHandler): Unit
}

object Transport {
  @scala.inline
  def apply(send: js.Any => Unit, setHandler: EventHandler => Unit): Transport = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), setHandler = js.Any.fromFunction1(setHandler))
  
    __obj.asInstanceOf[Transport]
  }
}

