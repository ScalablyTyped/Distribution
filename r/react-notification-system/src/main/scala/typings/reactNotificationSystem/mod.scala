package typings.reactNotificationSystem

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.ClassAttributes
import typings.react.mod.ClassicComponent
import typings.react.mod.ClassicComponentClass
import typings.react.mod.Component
import typings.react.mod.ComponentState
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

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-notification-system", JSImport.Namespace)
  @js.native
  class ^ protected () extends ClassicComponent[Attributes, ComponentState] {
    def this(props: Attributes) = this()
    def this(props: Attributes, context: js.Any) = this()
  }
  @JSImport("react-notification-system", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ClassicComponentClass[Attributes] = js.native
  
  trait ActionObject extends StObject {
    
    var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var label: String
  }
  object ActionObject {
    
    @scala.inline
    def apply(label: String): ActionObject = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionObject]
    }
    
    @scala.inline
    implicit class ActionObjectMutableBuilder[Self <: ActionObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait Attributes
    extends StObject
       with ClassAttributes[System] {
    
    var allowHTML: js.UndefOr[Boolean] = js.undefined
    
    var noAnimation: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[Style | Boolean] = js.undefined
  }
  object Attributes {
    
    @scala.inline
    def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    @scala.inline
    implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHTML(value: Boolean): Self = StObject.set(x, "allowHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHTMLUndefined: Self = StObject.set(x, "allowHTML", js.undefined)
      
      @scala.inline
      def setNoAnimation(value: Boolean): Self = StObject.set(x, "noAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoAnimationUndefined: Self = StObject.set(x, "noAnimation", js.undefined)
      
      @scala.inline
      def setStyle(value: Style | Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
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
    
    @scala.inline
    def apply(DefaultStyle: CSSProperties): ContainersStyle = {
      val __obj = js.Dynamic.literal(DefaultStyle = DefaultStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainersStyle]
    }
    
    @scala.inline
    implicit class ContainersStyleMutableBuilder[Self <: ContainersStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBc(value: CSSProperties): Self = StObject.set(x, "bc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBcUndefined: Self = StObject.set(x, "bc", js.undefined)
      
      @scala.inline
      def setBl(value: CSSProperties): Self = StObject.set(x, "bl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlUndefined: Self = StObject.set(x, "bl", js.undefined)
      
      @scala.inline
      def setBr(value: CSSProperties): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
      
      @scala.inline
      def setDefaultStyle(value: CSSProperties): Self = StObject.set(x, "DefaultStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTc(value: CSSProperties): Self = StObject.set(x, "tc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTcUndefined: Self = StObject.set(x, "tc", js.undefined)
      
      @scala.inline
      def setTl(value: CSSProperties): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlUndefined: Self = StObject.set(x, "tl", js.undefined)
      
      @scala.inline
      def setTr(value: CSSProperties): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
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
    
    @scala.inline
    def apply(): ItemStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemStyle]
    }
    
    @scala.inline
    implicit class ItemStyleMutableBuilder[Self <: ItemStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultStyle(value: CSSProperties): Self = StObject.set(x, "DefaultStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleUndefined: Self = StObject.set(x, "DefaultStyle", js.undefined)
      
      @scala.inline
      def setError(value: CSSProperties): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInfo(value: CSSProperties): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setSuccess(value: CSSProperties): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setWarning(value: CSSProperties): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
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
    
    @scala.inline
    def apply(): Notification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Notification]
    }
    
    @scala.inline
    implicit class NotificationMutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: ActionObject): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAutoDismiss(value: Double): Self = StObject.set(x, "autoDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDismissUndefined: Self = StObject.set(x, "autoDismiss", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDismissible(value: both | button | click | hide | none | Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissibleUndefined: Self = StObject.set(x, "dismissible", js.undefined)
      
      @scala.inline
      def setLevel(value: error | warning | info | success): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMessage(value: String | Element): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnAdd(value: /* notification */ Notification => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      @scala.inline
      def setOnRemove(value: /* notification */ Notification => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setPosition(value: tr | tl | tc | br | bl | bc): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTitle(value: String | Element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUid(value: Double | String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var notifications: js.Array[Notification]
  }
  object State {
    
    @scala.inline
    def apply(notifications: js.Array[Notification]): State = {
      val __obj = js.Dynamic.literal(notifications = notifications.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
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
    
    var Wrapper: js.UndefOr[js.Any] = js.undefined
  }
  object Style {
    
    @scala.inline
    def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: ItemStyle): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      @scala.inline
      def setActionWrapper(value: WrapperStyle): Self = StObject.set(x, "ActionWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionWrapperUndefined: Self = StObject.set(x, "ActionWrapper", js.undefined)
      
      @scala.inline
      def setContainers(value: ContainersStyle): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainersUndefined: Self = StObject.set(x, "Containers", js.undefined)
      
      @scala.inline
      def setDismiss(value: ItemStyle): Self = StObject.set(x, "Dismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissUndefined: Self = StObject.set(x, "Dismiss", js.undefined)
      
      @scala.inline
      def setMessageWrapper(value: WrapperStyle): Self = StObject.set(x, "MessageWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageWrapperUndefined: Self = StObject.set(x, "MessageWrapper", js.undefined)
      
      @scala.inline
      def setNotificationItem(value: ItemStyle): Self = StObject.set(x, "NotificationItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationItemUndefined: Self = StObject.set(x, "NotificationItem", js.undefined)
      
      @scala.inline
      def setTitle(value: ItemStyle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
      
      @scala.inline
      def setWrapper(value: js.Any): Self = StObject.set(x, "Wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "Wrapper", js.undefined)
    }
  }
  
  @js.native
  trait System
    extends Component[Attributes, State, js.Any] {
    
    def addNotification(notification: Notification): Notification = js.native
    
    def clearNotifications(): Unit = js.native
    
    def editNotification(uidOrNotification: String, newNotification: Notification): Unit = js.native
    def editNotification(uidOrNotification: Double, newNotification: Notification): Unit = js.native
    def editNotification(uidOrNotification: Notification, newNotification: Notification): Unit = js.native
    
    def removeNotification(uidOrNotification: String): Unit = js.native
    def removeNotification(uidOrNotification: Double): Unit = js.native
    def removeNotification(uidOrNotification: Notification): Unit = js.native
  }
  
  trait WrapperStyle extends StObject {
    
    var DefaultStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object WrapperStyle {
    
    @scala.inline
    def apply(): WrapperStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrapperStyle]
    }
    
    @scala.inline
    implicit class WrapperStyleMutableBuilder[Self <: WrapperStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultStyle(value: CSSProperties): Self = StObject.set(x, "DefaultStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleUndefined: Self = StObject.set(x, "DefaultStyle", js.undefined)
    }
  }
  
  type _To = js.Object & ClassicComponentClass[Attributes]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & ClassicComponentClass[Attributes] = ^
}
