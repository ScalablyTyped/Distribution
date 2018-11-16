package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.EventReceiverDefinitionCreationInformation")
@js.native
class EventReceiverDefinitionCreationInformation () extends ClientValueObject {
  def get_eventType(): EventReceiverType = js.native
  def get_receiverAssembly(): java.lang.String = js.native
  def get_receiverClass(): java.lang.String = js.native
  def get_receiverName(): java.lang.String = js.native
  def get_receiverUrl(): java.lang.String = js.native
  def get_sequenceNumber(): scala.Double = js.native
  def get_synchronization(): EventReceiverSynchronization = js.native
  def set_eventType(value: EventReceiverType): scala.Unit = js.native
  def set_receiverAssembly(value: java.lang.String): scala.Unit = js.native
  def set_receiverClass(value: java.lang.String): scala.Unit = js.native
  def set_receiverName(value: java.lang.String): scala.Unit = js.native
  def set_receiverUrl(value: java.lang.String): scala.Unit = js.native
  def set_sequenceNumber(value: scala.Double): scala.Unit = js.native
  def set_synchronization(value: EventReceiverSynchronization): scala.Unit = js.native
}

