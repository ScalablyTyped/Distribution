package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventReceiverDefinition extends ClientObject {
  def deleteObject(): Unit = js.native
  def get_eventType(): EventReceiverType = js.native
  def get_receiverAssembly(): String = js.native
  def get_receiverClass(): String = js.native
  def get_receiverId(): Guid = js.native
  def get_receiverName(): String = js.native
  def get_receiverUrl(): String = js.native
  def get_sequenceNumber(): Double = js.native
  def get_synchronization(): EventReceiverSynchronization = js.native
  def update(): Unit = js.native
}

