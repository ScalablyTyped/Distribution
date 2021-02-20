package typings.reapop

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Inlined std.Partial<reapop.reapop/dist/reducers/notifications/types.Notification> */
  @js.native
  trait NewNotification extends StObject {
    
    var allowHTML: js.UndefOr[Boolean] = js.native
    
    var buttons: js.UndefOr[js.Array[NotificationButton]] = js.native
    
    var dismissAfter: js.UndefOr[Double] = js.native
    
    var dismissible: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var image: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var onAdd: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var onDismiss: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var position: js.UndefOr[Position] = js.native
    
    var showDismissButton: js.UndefOr[Boolean] = js.native
    
    var status: js.UndefOr[Status] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object NewNotification {
    
    @scala.inline
    def apply(): NewNotification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewNotification]
    }
    
    @scala.inline
    implicit class NewNotificationMutableBuilder[Self <: NewNotification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHTML(value: Boolean): Self = StObject.set(x, "allowHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHTMLUndefined: Self = StObject.set(x, "allowHTML", js.undefined)
      
      @scala.inline
      def setButtons(value: js.Array[NotificationButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: NotificationButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setDismissAfter(value: Double): Self = StObject.set(x, "dismissAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissAfterUndefined: Self = StObject.set(x, "dismissAfter", js.undefined)
      
      @scala.inline
      def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissibleUndefined: Self = StObject.set(x, "dismissible", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnAdd(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setShowDismissButton(value: Boolean): Self = StObject.set(x, "showDismissButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDismissButtonUndefined: Self = StObject.set(x, "showDismissButton", js.undefined)
      
      @scala.inline
      def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait Notification
    extends /* index */ StringDictionary[js.Any] {
    
    var allowHTML: js.UndefOr[Boolean] = js.native
    
    var buttons: js.Array[NotificationButton] = js.native
    
    var dismissAfter: js.UndefOr[Double] = js.native
    
    var dismissible: js.UndefOr[Boolean] = js.native
    
    var id: String = js.native
    
    var image: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var onAdd: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var onDismiss: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var position: Position = js.native
    
    var showDismissButton: js.UndefOr[Boolean] = js.native
    
    var status: Status = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object Notification {
    
    @scala.inline
    def apply(buttons: js.Array[NotificationButton], id: String, position: Position, status: Status): Notification = {
      val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notification]
    }
    
    @scala.inline
    implicit class NotificationMutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowHTML(value: Boolean): Self = StObject.set(x, "allowHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowHTMLUndefined: Self = StObject.set(x, "allowHTML", js.undefined)
      
      @scala.inline
      def setButtons(value: js.Array[NotificationButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsVarargs(value: NotificationButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setDismissAfter(value: Double): Self = StObject.set(x, "dismissAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissAfterUndefined: Self = StObject.set(x, "dismissAfter", js.undefined)
      
      @scala.inline
      def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissibleUndefined: Self = StObject.set(x, "dismissible", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnAdd(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDismissButton(value: Boolean): Self = StObject.set(x, "showDismissButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDismissButtonUndefined: Self = StObject.set(x, "showDismissButton", js.undefined)
      
      @scala.inline
      def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait NotificationButton extends StObject {
    
    var name: String = js.native
    
    var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var primary: js.UndefOr[Boolean] = js.native
  }
  object NotificationButton {
    
    @scala.inline
    def apply(name: String): NotificationButton = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationButton]
    }
    
    @scala.inline
    implicit class NotificationButtonMutableBuilder[Self <: NotificationButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    }
  }
  
  /* Inlined {  topCenter :'top-center',   topLeft :'top-left',   topRight :'top-right',   bottomCenter :'bottom-center',   bottomLeft :'bottom-left',   bottomRight :'bottom-right'}[keyof {  topCenter :'top-center',   topLeft :'top-left',   topRight :'top-right',   bottomCenter :'bottom-center',   bottomLeft :'bottom-left',   bottomRight :'bottom-right'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.reapop.reapopStrings.`bottom-left`
    - typings.reapop.reapopStrings.`top-right`
    - typings.reapop.reapopStrings.`top-left`
    - typings.reapop.reapopStrings.`bottom-center`
    - typings.reapop.reapopStrings.`bottom-right`
    - typings.reapop.reapopStrings.`top-center`
  */
  trait Position extends StObject
  object Position {
    
    @scala.inline
    def `bottom-center`: typings.reapop.reapopStrings.`bottom-center` = "bottom-center".asInstanceOf[typings.reapop.reapopStrings.`bottom-center`]
    
    @scala.inline
    def `bottom-left`: typings.reapop.reapopStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.reapop.reapopStrings.`bottom-left`]
    
    @scala.inline
    def `bottom-right`: typings.reapop.reapopStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.reapop.reapopStrings.`bottom-right`]
    
    @scala.inline
    def `top-center`: typings.reapop.reapopStrings.`top-center` = "top-center".asInstanceOf[typings.reapop.reapopStrings.`top-center`]
    
    @scala.inline
    def `top-left`: typings.reapop.reapopStrings.`top-left` = "top-left".asInstanceOf[typings.reapop.reapopStrings.`top-left`]
    
    @scala.inline
    def `top-right`: typings.reapop.reapopStrings.`top-right` = "top-right".asInstanceOf[typings.reapop.reapopStrings.`top-right`]
  }
  
  /* Inlined {  none :'none',   info :'info',   success :'success',   loading :'loading',   warning :'warning',   error :'error'}[keyof {  none :'none',   info :'info',   success :'success',   loading :'loading',   warning :'warning',   error :'error'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.reapop.reapopStrings.loading
    - typings.reapop.reapopStrings.none
    - typings.reapop.reapopStrings.info
    - typings.reapop.reapopStrings.warning
    - typings.reapop.reapopStrings.error
    - typings.reapop.reapopStrings.success
  */
  trait Status extends StObject
  object Status {
    
    @scala.inline
    def error: typings.reapop.reapopStrings.error = "error".asInstanceOf[typings.reapop.reapopStrings.error]
    
    @scala.inline
    def info: typings.reapop.reapopStrings.info = "info".asInstanceOf[typings.reapop.reapopStrings.info]
    
    @scala.inline
    def loading: typings.reapop.reapopStrings.loading = "loading".asInstanceOf[typings.reapop.reapopStrings.loading]
    
    @scala.inline
    def none: typings.reapop.reapopStrings.none = "none".asInstanceOf[typings.reapop.reapopStrings.none]
    
    @scala.inline
    def success: typings.reapop.reapopStrings.success = "success".asInstanceOf[typings.reapop.reapopStrings.success]
    
    @scala.inline
    def warning: typings.reapop.reapopStrings.warning = "warning".asInstanceOf[typings.reapop.reapopStrings.warning]
  }
}
