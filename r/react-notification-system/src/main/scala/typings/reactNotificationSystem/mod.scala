package typings.reactNotificationSystem

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNotificationSystem.reactNotificationSystemStrings.bc
import typings.reactNotificationSystem.reactNotificationSystemStrings.bl
import typings.reactNotificationSystem.reactNotificationSystemStrings.both
import typings.reactNotificationSystem.reactNotificationSystemStrings.br
import typings.reactNotificationSystem.reactNotificationSystemStrings.button
import typings.reactNotificationSystem.reactNotificationSystemStrings.click
import typings.reactNotificationSystem.reactNotificationSystemStrings.error
import typings.reactNotificationSystem.reactNotificationSystemStrings.hide
import typings.reactNotificationSystem.reactNotificationSystemStrings.info
import typings.reactNotificationSystem.reactNotificationSystemStrings.none
import typings.reactNotificationSystem.reactNotificationSystemStrings.success
import typings.reactNotificationSystem.reactNotificationSystemStrings.tc
import typings.reactNotificationSystem.reactNotificationSystemStrings.tl
import typings.reactNotificationSystem.reactNotificationSystemStrings.tr
import typings.reactNotificationSystem.reactNotificationSystemStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-notification-system", JSImport.Namespace)
  @js.native
  open class ^ () extends NotificationSystem
  
  trait ActionObject extends StObject {
    
    var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var label: String
  }
  object ActionObject {
    
    inline def apply(label: String): ActionObject = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionObject]
    }
    
    extension [Self <: ActionObject](x: Self) {
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait Attributes extends StObject {
    
    var allowHTML: js.UndefOr[Boolean] = js.undefined
    
    var noAnimation: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[Style | Boolean] = js.undefined
  }
  object Attributes {
    
    inline def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    extension [Self <: Attributes](x: Self) {
      
      inline def setAllowHTML(value: Boolean): Self = StObject.set(x, "allowHTML", value.asInstanceOf[js.Any])
      
      inline def setAllowHTMLUndefined: Self = StObject.set(x, "allowHTML", js.undefined)
      
      inline def setNoAnimation(value: Boolean): Self = StObject.set(x, "noAnimation", value.asInstanceOf[js.Any])
      
      inline def setNoAnimationUndefined: Self = StObject.set(x, "noAnimation", js.undefined)
      
      inline def setStyle(value: Style | Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type CallBackFunction = js.Function1[/* notification */ Notification, Unit]
  
  trait ContainersStyle extends StObject {
    
    var DefaultStyle: CSSProperties
    
    var bc: js.UndefOr[CSSProperties] = js.undefined
    
    var bl: js.UndefOr[CSSProperties] = js.undefined
    
    var br: js.UndefOr[CSSProperties] = js.undefined
    
    var tc: js.UndefOr[CSSProperties] = js.undefined
    
    var tl: js.UndefOr[CSSProperties] = js.undefined
    
    var tr: js.UndefOr[CSSProperties] = js.undefined
  }
  object ContainersStyle {
    
    inline def apply(DefaultStyle: CSSProperties): ContainersStyle = {
      val __obj = js.Dynamic.literal(DefaultStyle = DefaultStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainersStyle]
    }
    
    extension [Self <: ContainersStyle](x: Self) {
      
      inline def setBc(value: CSSProperties): Self = StObject.set(x, "bc", value.asInstanceOf[js.Any])
      
      inline def setBcUndefined: Self = StObject.set(x, "bc", js.undefined)
      
      inline def setBl(value: CSSProperties): Self = StObject.set(x, "bl", value.asInstanceOf[js.Any])
      
      inline def setBlUndefined: Self = StObject.set(x, "bl", js.undefined)
      
      inline def setBr(value: CSSProperties): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      inline def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
      
      inline def setDefaultStyle(value: CSSProperties): Self = StObject.set(x, "DefaultStyle", value.asInstanceOf[js.Any])
      
      inline def setTc(value: CSSProperties): Self = StObject.set(x, "tc", value.asInstanceOf[js.Any])
      
      inline def setTcUndefined: Self = StObject.set(x, "tc", js.undefined)
      
      inline def setTl(value: CSSProperties): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
      
      inline def setTlUndefined: Self = StObject.set(x, "tl", js.undefined)
      
      inline def setTr(value: CSSProperties): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
    }
  }
  
  trait ItemStyle extends StObject {
    
    var DefaultStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var error: js.UndefOr[CSSProperties] = js.undefined
    
    var info: js.UndefOr[CSSProperties] = js.undefined
    
    var success: js.UndefOr[CSSProperties] = js.undefined
    
    var warning: js.UndefOr[CSSProperties] = js.undefined
  }
  object ItemStyle {
    
    inline def apply(): ItemStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemStyle]
    }
    
    extension [Self <: ItemStyle](x: Self) {
      
      inline def setDefaultStyle(value: CSSProperties): Self = StObject.set(x, "DefaultStyle", value.asInstanceOf[js.Any])
      
      inline def setDefaultStyleUndefined: Self = StObject.set(x, "DefaultStyle", js.undefined)
      
      inline def setError(value: CSSProperties): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInfo(value: CSSProperties): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setSuccess(value: CSSProperties): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setWarning(value: CSSProperties): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  trait Notification extends StObject {
    
    var action: js.UndefOr[ActionObject] = js.undefined
    
    var autoDismiss: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var dismissible: js.UndefOr[both | button | click | hide | none | Boolean] = js.undefined
    
    var level: js.UndefOr[error | warning | info | success] = js.undefined
    
    var message: js.UndefOr[String | Element] = js.undefined
    
    var onAdd: js.UndefOr[CallBackFunction] = js.undefined
    
    var onRemove: js.UndefOr[CallBackFunction] = js.undefined
    
    var position: js.UndefOr[tr | tl | tc | br | bl | bc] = js.undefined
    
    var title: js.UndefOr[String | Element] = js.undefined
    
    var uid: js.UndefOr[Double | String] = js.undefined
  }
  object Notification {
    
    inline def apply(): Notification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Notification]
    }
    
    extension [Self <: Notification](x: Self) {
      
      inline def setAction(value: ActionObject): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAutoDismiss(value: Double): Self = StObject.set(x, "autoDismiss", value.asInstanceOf[js.Any])
      
      inline def setAutoDismissUndefined: Self = StObject.set(x, "autoDismiss", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDismissible(value: both | button | click | hide | none | Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
      
      inline def setDismissibleUndefined: Self = StObject.set(x, "dismissible", js.undefined)
      
      inline def setLevel(value: error | warning | info | success): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMessage(value: String | Element): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnAdd(value: /* notification */ Notification => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setOnRemove(value: /* notification */ Notification => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setPosition(value: tr | tl | tc | br | bl | bc): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTitle(value: String | Element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUid(value: Double | String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  @js.native
  trait NotificationSystem extends Component[Attributes, State, Any] {
    
    def addNotification(notification: Notification): Notification = js.native
    
    def clearNotifications(): Unit = js.native
    
    def editNotification(uidOrNotification: String, newNotification: Notification): Unit = js.native
    def editNotification(uidOrNotification: Double, newNotification: Notification): Unit = js.native
    def editNotification(uidOrNotification: Notification, newNotification: Notification): Unit = js.native
    
    def removeNotification(uidOrNotification: String): Unit = js.native
    def removeNotification(uidOrNotification: Double): Unit = js.native
    def removeNotification(uidOrNotification: Notification): Unit = js.native
  }
  
  trait State extends StObject {
    
    var notifications: js.Array[Notification]
  }
  object State {
    
    inline def apply(notifications: js.Array[Notification]): State = {
      val __obj = js.Dynamic.literal(notifications = notifications.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value*))
    }
  }
  
  trait Style extends StObject {
    
    var Action: js.UndefOr[ItemStyle] = js.undefined
    
    var ActionWrapper: js.UndefOr[WrapperStyle] = js.undefined
    
    var Containers: js.UndefOr[ContainersStyle] = js.undefined
    
    var Dismiss: js.UndefOr[ItemStyle] = js.undefined
    
    var MessageWrapper: js.UndefOr[WrapperStyle] = js.undefined
    
    var NotificationItem: js.UndefOr[ItemStyle] = js.undefined
    
    var Title: js.UndefOr[ItemStyle] = js.undefined
    
    var Wrapper: js.UndefOr[Any] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setAction(value: ItemStyle): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      inline def setActionWrapper(value: WrapperStyle): Self = StObject.set(x, "ActionWrapper", value.asInstanceOf[js.Any])
      
      inline def setActionWrapperUndefined: Self = StObject.set(x, "ActionWrapper", js.undefined)
      
      inline def setContainers(value: ContainersStyle): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
      
      inline def setContainersUndefined: Self = StObject.set(x, "Containers", js.undefined)
      
      inline def setDismiss(value: ItemStyle): Self = StObject.set(x, "Dismiss", value.asInstanceOf[js.Any])
      
      inline def setDismissUndefined: Self = StObject.set(x, "Dismiss", js.undefined)
      
      inline def setMessageWrapper(value: WrapperStyle): Self = StObject.set(x, "MessageWrapper", value.asInstanceOf[js.Any])
      
      inline def setMessageWrapperUndefined: Self = StObject.set(x, "MessageWrapper", js.undefined)
      
      inline def setNotificationItem(value: ItemStyle): Self = StObject.set(x, "NotificationItem", value.asInstanceOf[js.Any])
      
      inline def setNotificationItemUndefined: Self = StObject.set(x, "NotificationItem", js.undefined)
      
      inline def setTitle(value: ItemStyle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
      
      inline def setWrapper(value: Any): Self = StObject.set(x, "Wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "Wrapper", js.undefined)
    }
  }
  
  trait WrapperStyle extends StObject {
    
    var DefaultStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object WrapperStyle {
    
    inline def apply(): WrapperStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrapperStyle]
    }
    
    extension [Self <: WrapperStyle](x: Self) {
      
      inline def setDefaultStyle(value: CSSProperties): Self = StObject.set(x, "DefaultStyle", value.asInstanceOf[js.Any])
      
      inline def setDefaultStyleUndefined: Self = StObject.set(x, "DefaultStyle", js.undefined)
    }
  }
}
