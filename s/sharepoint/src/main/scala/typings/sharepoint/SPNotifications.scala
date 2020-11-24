package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SPNotifications")
@js.native
object SPNotifications extends js.Object {
  
  @js.native
  sealed trait ContainerID extends js.Object
  @js.native
  object ContainerID extends js.Object {
    
    @js.native
    sealed trait Basic extends ContainerID
    
    @js.native
    sealed trait Status extends ContainerID
  }
  
  @js.native
  sealed trait EventID extends js.Object
  @js.native
  object EventID extends js.Object {
    
    @js.native
    sealed trait OnDisplayNotification extends EventID
    
    @js.native
    sealed trait OnHide extends EventID
    
    @js.native
    sealed trait OnNotificationCountChanged extends EventID
    
    @js.native
    sealed trait OnRemoveNotification extends EventID
    
    @js.native
    sealed trait OnShow extends EventID
  }
}
