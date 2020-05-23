package typings.sharepoint.SP.BusinessData

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.IntResult
import typings.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.Runtime")
@js.native
object Runtime extends js.Object {
  @js.native
  sealed trait EntityEventType extends js.Object
  
  @js.native
  trait EntityFieldValueDictionary extends ClientObject {
    def createCollectionInstance(fieldDotNotation: String, size: Double): Unit = js.native
    def createInstance(fieldInstanceDotNotation: String, fieldDotNotation: String): Unit = js.native
    def fromXml(xml: String): Unit = js.native
    def getCollectionSize(fieldDotNotation: String): IntResult = js.native
    def get_fieldValues(): js.Any = js.native
    def get_item(fieldName: String): js.Any = js.native
    def set_item(fieldName: String, value: js.Any): Unit = js.native
    def toXml(): StringResult = js.native
  }
  
  @js.native
  trait EntityIdentity extends ClientObject {
    def get_fieldValues(): js.Any = js.native
    def get_identifierCount(): Double = js.native
    def get_item(fieldName: String): js.Any = js.native
  }
  
  @js.native
  trait EntityInstance extends ClientObject {
    def createCollectionInstance(fieldDotNotation: String, size: Double): Unit = js.native
    def createInstance(fieldInstanceDotNotation: String, fieldDotNotation: String): Unit = js.native
    def deleteObject(): Unit = js.native
    def fromXml(xml: String): Unit = js.native
    def getIdentity(): EntityIdentity = js.native
    def get_fieldValues(): js.Any = js.native
    def get_item(fieldName: String): js.Any = js.native
    def set_item(fieldName: String, value: js.Any): Unit = js.native
    def toXml(): StringResult = js.native
    def update(): Unit = js.native
  }
  
  @js.native
  trait NotificationCallback extends ClientObject {
    def get_notificationContext(): String = js.native
    def get_notificationEndpoint(): String = js.native
    def get_notificationForwarderType(): String = js.native
    def set_notificationContext(value: String): Unit = js.native
    def set_notificationForwarderType(value: String): Unit = js.native
  }
  
  @js.native
  trait Subscription extends ClientObject {
    def get_hash(): String = js.native
    def get_iD(): js.Any = js.native
  }
  
  @js.native
  object EntityEventType extends js.Object {
    @js.native
    sealed trait itemAdded extends EntityEventType
    
    @js.native
    sealed trait itemDeleted extends EntityEventType
    
    @js.native
    sealed trait itemUpdated extends EntityEventType
    
    @js.native
    sealed trait none extends EntityEventType
    
  }
  
}

