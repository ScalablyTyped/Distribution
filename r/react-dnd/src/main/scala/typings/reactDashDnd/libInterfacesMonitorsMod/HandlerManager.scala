package typings.reactDashDnd.libInterfacesMonitorsMod

import typings.dndDashCore.libInterfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerManager extends js.Object {
  def getHandlerId(): Identifier | Null = js.native
  def receiveHandlerId(): Unit = js.native
  def receiveHandlerId(handlerId: Identifier): Unit = js.native
}

