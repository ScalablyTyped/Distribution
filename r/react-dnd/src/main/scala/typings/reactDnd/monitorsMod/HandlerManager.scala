package typings.reactDnd.monitorsMod

import typings.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerManager extends js.Object {
  def getHandlerId(): Identifier | Null = js.native
  def receiveHandlerId(): Unit = js.native
  def receiveHandlerId(handlerId: Identifier): Unit = js.native
}

