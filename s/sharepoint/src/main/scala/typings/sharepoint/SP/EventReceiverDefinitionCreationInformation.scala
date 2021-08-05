package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventReceiverDefinitionCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_eventType(): EventReceiverType
  
  def get_receiverAssembly(): String
  
  def get_receiverClass(): String
  
  def get_receiverName(): String
  
  def get_receiverUrl(): String
  
  def get_sequenceNumber(): Double
  
  def get_synchronization(): EventReceiverSynchronization
  
  def set_eventType(value: EventReceiverType): Unit
  
  def set_receiverAssembly(value: String): Unit
  
  def set_receiverClass(value: String): Unit
  
  def set_receiverName(value: String): Unit
  
  def set_receiverUrl(value: String): Unit
  
  def set_sequenceNumber(value: Double): Unit
  
  def set_synchronization(value: EventReceiverSynchronization): Unit
}
object EventReceiverDefinitionCreationInformation {
  
  inline def apply(
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
  
  extension [Self <: EventReceiverDefinitionCreationInformation](x: Self) {
    
    inline def setGet_eventType(value: () => EventReceiverType): Self = StObject.set(x, "get_eventType", js.Any.fromFunction0(value))
    
    inline def setGet_receiverAssembly(value: () => String): Self = StObject.set(x, "get_receiverAssembly", js.Any.fromFunction0(value))
    
    inline def setGet_receiverClass(value: () => String): Self = StObject.set(x, "get_receiverClass", js.Any.fromFunction0(value))
    
    inline def setGet_receiverName(value: () => String): Self = StObject.set(x, "get_receiverName", js.Any.fromFunction0(value))
    
    inline def setGet_receiverUrl(value: () => String): Self = StObject.set(x, "get_receiverUrl", js.Any.fromFunction0(value))
    
    inline def setGet_sequenceNumber(value: () => Double): Self = StObject.set(x, "get_sequenceNumber", js.Any.fromFunction0(value))
    
    inline def setGet_synchronization(value: () => EventReceiverSynchronization): Self = StObject.set(x, "get_synchronization", js.Any.fromFunction0(value))
    
    inline def setSet_eventType(value: EventReceiverType => Unit): Self = StObject.set(x, "set_eventType", js.Any.fromFunction1(value))
    
    inline def setSet_receiverAssembly(value: String => Unit): Self = StObject.set(x, "set_receiverAssembly", js.Any.fromFunction1(value))
    
    inline def setSet_receiverClass(value: String => Unit): Self = StObject.set(x, "set_receiverClass", js.Any.fromFunction1(value))
    
    inline def setSet_receiverName(value: String => Unit): Self = StObject.set(x, "set_receiverName", js.Any.fromFunction1(value))
    
    inline def setSet_receiverUrl(value: String => Unit): Self = StObject.set(x, "set_receiverUrl", js.Any.fromFunction1(value))
    
    inline def setSet_sequenceNumber(value: Double => Unit): Self = StObject.set(x, "set_sequenceNumber", js.Any.fromFunction1(value))
    
    inline def setSet_synchronization(value: EventReceiverSynchronization => Unit): Self = StObject.set(x, "set_synchronization", js.Any.fromFunction1(value))
  }
}
