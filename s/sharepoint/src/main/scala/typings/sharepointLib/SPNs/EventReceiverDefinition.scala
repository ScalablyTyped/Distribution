package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.EventReceiverDefinition")
@js.native
class EventReceiverDefinition () extends ClientObject {
  def deleteObject(): scala.Unit = js.native
  def get_eventType(): EventReceiverType = js.native
  def get_receiverAssembly(): java.lang.String = js.native
  def get_receiverClass(): java.lang.String = js.native
  def get_receiverId(): Guid = js.native
  def get_receiverName(): java.lang.String = js.native
  def get_receiverUrl(): java.lang.String = js.native
  def get_sequenceNumber(): scala.Double = js.native
  def get_synchronization(): EventReceiverSynchronization = js.native
  def update(): scala.Unit = js.native
}

