package typings.rsocketCore.rsocketserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSocketServer[D, M] extends js.Object {
  def start(): Unit
  def stop(): Unit
}

object RSocketServer {
  @scala.inline
  def apply[D, M](start: () => Unit, stop: () => Unit): RSocketServer[D, M] = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[RSocketServer[D, M]]
  }
}

