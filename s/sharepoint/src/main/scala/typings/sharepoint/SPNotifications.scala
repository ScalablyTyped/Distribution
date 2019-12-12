package typings.sharepoint

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SPNotifications.ContainerID
import typings.sharepoint.SPNotifications.ContainerID.Basic
import typings.sharepoint.SPNotifications.ContainerID.Status
import typings.sharepoint.SPNotifications.EventID
import typings.sharepoint.SPNotifications.EventID.OnDisplayNotification
import typings.sharepoint.SPNotifications.EventID.OnHide
import typings.sharepoint.SPNotifications.EventID.OnNotificationCountChanged
import typings.sharepoint.SPNotifications.EventID.OnRemoveNotification
import typings.sharepoint.SPNotifications.EventID.OnShow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPNotifications")
@js.native
object SPNotifications extends js.Object {
  @js.native
  sealed trait ContainerID extends js.Object
  
  @js.native
  sealed trait EventID extends js.Object
  
  @js.native
  object ContainerID extends js.Object {
    @js.native
    sealed trait Basic extends ContainerID
    
    @js.native
    sealed trait Status extends ContainerID
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContainerID with Double] = js.native
    /* 0 */ @js.native
    object Basic extends TopLevel[Basic with Double]
    
    /* 1 */ @js.native
    object Status extends TopLevel[Status with Double]
    
  }
  
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EventID with Double] = js.native
    /* 2 */ @js.native
    object OnDisplayNotification extends TopLevel[OnDisplayNotification with Double]
    
    /* 1 */ @js.native
    object OnHide extends TopLevel[OnHide with Double]
    
    /* 4 */ @js.native
    object OnNotificationCountChanged extends TopLevel[OnNotificationCountChanged with Double]
    
    /* 3 */ @js.native
    object OnRemoveNotification extends TopLevel[OnRemoveNotification with Double]
    
    /* 0 */ @js.native
    object OnShow extends TopLevel[OnShow with Double]
    
  }
  
}

