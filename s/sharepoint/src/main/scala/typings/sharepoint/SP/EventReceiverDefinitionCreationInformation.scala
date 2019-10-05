package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.EventReceiverDefinitionCreationInformation")
@js.native
class EventReceiverDefinitionCreationInformation () extends ClientValueObject {
  def get_eventType(): EventReceiverType = js.native
  def get_receiverAssembly(): String = js.native
  def get_receiverClass(): String = js.native
  def get_receiverName(): String = js.native
  def get_receiverUrl(): String = js.native
  def get_sequenceNumber(): Double = js.native
  def get_synchronization(): EventReceiverSynchronization = js.native
  def set_eventType(value: EventReceiverType): Unit = js.native
  def set_receiverAssembly(value: String): Unit = js.native
  def set_receiverClass(value: String): Unit = js.native
  def set_receiverName(value: String): Unit = js.native
  def set_receiverUrl(value: String): Unit = js.native
  def set_sequenceNumber(value: Double): Unit = js.native
  def set_synchronization(value: EventReceiverSynchronization): Unit = js.native
}

