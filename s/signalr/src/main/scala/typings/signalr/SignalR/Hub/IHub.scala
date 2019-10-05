package typings.signalr.SignalR.Hub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHub extends js.Object {
  def start(): Unit
}

object IHub {
  @scala.inline
  def apply(start: () => Unit): IHub = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[IHub]
  }
}

