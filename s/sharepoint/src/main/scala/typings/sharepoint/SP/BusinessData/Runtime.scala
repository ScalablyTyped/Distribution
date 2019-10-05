package typings.sharepoint.SP.BusinessData

import typings.sharepoint.SP.BusinessData.Runtime.EntityEventType
import typings.sharepoint.SP.BusinessData.Runtime.EntityIdentity
import typings.sharepoint.SP.BusinessData.Runtime.NotificationCallback
import typings.sharepoint.SP.BusinessData.Runtime.Subscription
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.ClientRuntimeContext
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
  class EntityFieldValueDictionary () extends ClientObject {
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
  class EntityIdentity protected () extends ClientObject {
    def this(context: ClientRuntimeContext, identifierValues: js.Array[_]) = this()
    def get_fieldValues(): js.Any = js.native
    def get_identifierCount(): Double = js.native
    def get_item(fieldName: String): js.Any = js.native
  }
  
  @js.native
  class EntityInstance () extends ClientObject {
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
  class NotificationCallback protected () extends ClientObject {
    def this(context: ClientRuntimeContext, notificationEndpoint: String) = this()
    def get_notificationContext(): String = js.native
    def get_notificationEndpoint(): String = js.native
    def get_notificationForwarderType(): String = js.native
    def set_notificationContext(value: String): Unit = js.native
    def set_notificationForwarderType(value: String): Unit = js.native
  }
  
  @js.native
  class Subscription protected () extends ClientObject {
    def this(context: ClientRuntimeContext, id: js.Any, hash: String) = this()
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
    
    /* 1 */ val itemAdded: typings.sharepoint.SP.BusinessData.Runtime.EntityEventType.itemAdded with Double = js.native
    /* 3 */ val itemDeleted: typings.sharepoint.SP.BusinessData.Runtime.EntityEventType.itemDeleted with Double = js.native
    /* 2 */ val itemUpdated: typings.sharepoint.SP.BusinessData.Runtime.EntityEventType.itemUpdated with Double = js.native
    /* 0 */ val none: typings.sharepoint.SP.BusinessData.Runtime.EntityEventType.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EntityEventType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object EntityIdentity extends js.Object {
    def newObject(context: ClientRuntimeContext, identifierValues: js.Array[_]): EntityIdentity = js.native
  }
  
  /* static members */
  @js.native
  object NotificationCallback extends js.Object {
    def newObject(context: ClientRuntimeContext, notificationEndpoint: String): NotificationCallback = js.native
  }
  
  /* static members */
  @js.native
  object Subscription extends js.Object {
    def newObject(context: ClientRuntimeContext, id: js.Any, hash: String): Subscription = js.native
  }
  
}

