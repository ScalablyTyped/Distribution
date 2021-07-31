package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPNotifications {
  
  @js.native
  sealed trait ContainerID extends StObject
  @JSGlobal("SPNotifications.ContainerID")
  @js.native
  object ContainerID extends StObject {
    
    @js.native
    sealed trait Basic
      extends StObject
         with ContainerID
    
    @js.native
    sealed trait Status
      extends StObject
         with ContainerID
  }
  
  @js.native
  sealed trait EventID extends StObject
  @JSGlobal("SPNotifications.EventID")
  @js.native
  object EventID extends StObject {
    
    @js.native
    sealed trait OnDisplayNotification
      extends StObject
         with EventID
    
    @js.native
    sealed trait OnHide
      extends StObject
         with EventID
    
    @js.native
    sealed trait OnNotificationCountChanged
      extends StObject
         with EventID
    
    @js.native
    sealed trait OnRemoveNotification
      extends StObject
         with EventID
    
    @js.native
    sealed trait OnShow
      extends StObject
         with EventID
  }
}
