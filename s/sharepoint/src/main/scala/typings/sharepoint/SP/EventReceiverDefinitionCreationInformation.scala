package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventReceiverDefinitionCreationInformation extends ClientValueObject {
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

object EventReceiverDefinitionCreationInformation {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_eventType: () => EventReceiverType,
    get_receiverAssembly: () => String,
    get_receiverClass: () => String,
    get_receiverName: () => String,
    get_receiverUrl: () => String,
    get_sequenceNumber: () => Double,
    get_synchronization: () => EventReceiverSynchronization,
    get_typeId: () => String,
    set_eventType: EventReceiverType => Unit,
    set_receiverAssembly: String => Unit,
    set_receiverClass: String => Unit,
    set_receiverName: String => Unit,
    set_receiverUrl: String => Unit,
    set_sequenceNumber: Double => Unit,
    set_synchronization: EventReceiverSynchronization => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): EventReceiverDefinitionCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_eventType = js.Any.fromFunction0(get_eventType), get_receiverAssembly = js.Any.fromFunction0(get_receiverAssembly), get_receiverClass = js.Any.fromFunction0(get_receiverClass), get_receiverName = js.Any.fromFunction0(get_receiverName), get_receiverUrl = js.Any.fromFunction0(get_receiverUrl), get_sequenceNumber = js.Any.fromFunction0(get_sequenceNumber), get_synchronization = js.Any.fromFunction0(get_synchronization), get_typeId = js.Any.fromFunction0(get_typeId), set_eventType = js.Any.fromFunction1(set_eventType), set_receiverAssembly = js.Any.fromFunction1(set_receiverAssembly), set_receiverClass = js.Any.fromFunction1(set_receiverClass), set_receiverName = js.Any.fromFunction1(set_receiverName), set_receiverUrl = js.Any.fromFunction1(set_receiverUrl), set_sequenceNumber = js.Any.fromFunction1(set_sequenceNumber), set_synchronization = js.Any.fromFunction1(set_synchronization), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[EventReceiverDefinitionCreationInformation]
  }
  @scala.inline
  implicit class EventReceiverDefinitionCreationInformationOps[Self <: EventReceiverDefinitionCreationInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet_eventType(value: () => EventReceiverType): Self = this.set("get_eventType", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_receiverAssembly(value: () => String): Self = this.set("get_receiverAssembly", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_receiverClass(value: () => String): Self = this.set("get_receiverClass", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_receiverName(value: () => String): Self = this.set("get_receiverName", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_receiverUrl(value: () => String): Self = this.set("get_receiverUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_sequenceNumber(value: () => Double): Self = this.set("get_sequenceNumber", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_synchronization(value: () => EventReceiverSynchronization): Self = this.set("get_synchronization", js.Any.fromFunction0(value))
    @scala.inline
    def setSet_eventType(value: EventReceiverType => Unit): Self = this.set("set_eventType", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_receiverAssembly(value: String => Unit): Self = this.set("set_receiverAssembly", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_receiverClass(value: String => Unit): Self = this.set("set_receiverClass", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_receiverName(value: String => Unit): Self = this.set("set_receiverName", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_receiverUrl(value: String => Unit): Self = this.set("set_receiverUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_sequenceNumber(value: Double => Unit): Self = this.set("set_sequenceNumber", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_synchronization(value: EventReceiverSynchronization => Unit): Self = this.set("set_synchronization", js.Any.fromFunction1(value))
  }
  
}

