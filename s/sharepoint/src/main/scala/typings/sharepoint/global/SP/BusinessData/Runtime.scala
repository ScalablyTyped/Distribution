package typings.sharepoint.global.SP.BusinessData

import typings.sharepoint.SP.ClientRuntimeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.BusinessData.Runtime")
@js.native
object Runtime extends js.Object {
  
  @js.native
  object EntityEventType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.BusinessData.Runtime.EntityEventType with Double] = js.native
    
    /* 1 */ val itemAdded: typings.sharepoint.SP.BusinessData.Runtime.EntityEventType.itemAdded with Double = js.native
    
    /* 3 */ val itemDeleted: typings.sharepoint.SP.BusinessData.Runtime.EntityEventType.itemDeleted with Double = js.native
    
    /* 2 */ val itemUpdated: typings.sharepoint.SP.BusinessData.Runtime.EntityEventType.itemUpdated with Double = js.native
    
    /* 0 */ val none: typings.sharepoint.SP.BusinessData.Runtime.EntityEventType.none with Double = js.native
  }
  
  @js.native
  class EntityFieldValueDictionary ()
    extends typings.sharepoint.SP.BusinessData.Runtime.EntityFieldValueDictionary
  
  @js.native
  class EntityIdentity protected ()
    extends typings.sharepoint.SP.BusinessData.Runtime.EntityIdentity {
    def this(context: ClientRuntimeContext, identifierValues: js.Array[_]) = this()
  }
  /* static members */
  @js.native
  object EntityIdentity extends js.Object {
    
    def newObject(context: ClientRuntimeContext, identifierValues: js.Array[_]): typings.sharepoint.SP.BusinessData.Runtime.EntityIdentity = js.native
  }
  
  @js.native
  class EntityInstance ()
    extends typings.sharepoint.SP.BusinessData.Runtime.EntityInstance
  
  @js.native
  class NotificationCallback protected ()
    extends typings.sharepoint.SP.BusinessData.Runtime.NotificationCallback {
    def this(context: ClientRuntimeContext, notificationEndpoint: String) = this()
  }
  /* static members */
  @js.native
  object NotificationCallback extends js.Object {
    
    def newObject(context: ClientRuntimeContext, notificationEndpoint: String): typings.sharepoint.SP.BusinessData.Runtime.NotificationCallback = js.native
  }
  
  @js.native
  class Subscription protected ()
    extends typings.sharepoint.SP.BusinessData.Runtime.Subscription {
    def this(context: ClientRuntimeContext, id: js.Any, hash: String) = this()
  }
  /* static members */
  @js.native
  object Subscription extends js.Object {
    
    def newObject(context: ClientRuntimeContext, id: js.Any, hash: String): typings.sharepoint.SP.BusinessData.Runtime.Subscription = js.native
  }
}
