package typings.socketclusterClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportHandlers extends js.Object {
  def onClose(value: OnCloseValue): Unit = js.native
  def onError(value: OnErrorValue): Unit = js.native
  def onEvent(value: OnEventValue): Unit = js.native
  def onInboundInvoke(value: OnInboundInvokeValue): Unit = js.native
  def onInboundTransmit(value: OnInboundTransmitValue): Unit = js.native
  def onOpen(): Unit = js.native
  def onOpen(value: OnOpenValue): Unit = js.native
  def onOpenAbort(value: OnOpenAbortValue): Unit = js.native
}

