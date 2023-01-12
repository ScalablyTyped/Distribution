package typings.reapop

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReducersNotificationsTypesMod {
  
  /* Inlined std.Partial<reapop.reapop/dist/reducers/notifications/types.Notification> */
  trait NewNotification extends StObject {
    
    var allowHTML: js.UndefOr[Boolean] = js.undefined
    
    var buttons: js.UndefOr[js.Array[NotificationButton]] = js.undefined
    
    var dismissAfter: js.UndefOr[Double] = js.undefined
    
    var dismissible: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var onAdd: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var onDismiss: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var showDismissButton: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[Status] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object NewNotification {
    
    inline def apply(): NewNotification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewNotification]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NewNotification] (val x: Self) extends AnyVal {
      
      inline def setAllowHTML(value: Boolean): Self = StObject.set(x, "allowHTML", value.asInstanceOf[js.Any])
      
      inline def setAllowHTMLUndefined: Self = StObject.set(x, "allowHTML", js.undefined)
      
      inline def setButtons(value: js.Array[NotificationButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: NotificationButton*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setDismissAfter(value: Double): Self = StObject.set(x, "dismissAfter", value.asInstanceOf[js.Any])
      
      inline def setDismissAfterUndefined: Self = StObject.set(x, "dismissAfter", js.undefined)
      
      inline def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
      
      inline def setDismissibleUndefined: Self = StObject.set(x, "dismissible", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnAdd(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setOnDismiss(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShowDismissButton(value: Boolean): Self = StObject.set(x, "showDismissButton", value.asInstanceOf[js.Any])
      
      inline def setShowDismissButtonUndefined: Self = StObject.set(x, "showDismissButton", js.undefined)
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Notification
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    var allowHTML: js.UndefOr[Boolean] = js.undefined
    
    var buttons: js.Array[NotificationButton]
    
    var dismissAfter: js.UndefOr[Double] = js.undefined
    
    var dismissible: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var image: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var onAdd: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var onDismiss: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var position: Position
    
    var showDismissButton: js.UndefOr[Boolean] = js.undefined
    
    var status: Status
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Notification {
    
    inline def apply(buttons: js.Array[NotificationButton], id: String, position: Position, status: Status): Notification = {
      val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notification]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
      
      inline def setAllowHTML(value: Boolean): Self = StObject.set(x, "allowHTML", value.asInstanceOf[js.Any])
      
      inline def setAllowHTMLUndefined: Self = StObject.set(x, "allowHTML", js.undefined)
      
      inline def setButtons(value: js.Array[NotificationButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsVarargs(value: NotificationButton*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setDismissAfter(value: Double): Self = StObject.set(x, "dismissAfter", value.asInstanceOf[js.Any])
      
      inline def setDismissAfterUndefined: Self = StObject.set(x, "dismissAfter", js.undefined)
      
      inline def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
      
      inline def setDismissibleUndefined: Self = StObject.set(x, "dismissible", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnAdd(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setOnDismiss(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setShowDismissButton(value: Boolean): Self = StObject.set(x, "showDismissButton", value.asInstanceOf[js.Any])
      
      inline def setShowDismissButtonUndefined: Self = StObject.set(x, "showDismissButton", js.undefined)
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait NotificationButton extends StObject {
    
    var name: String
    
    var onClick: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var primary: js.UndefOr[Boolean] = js.undefined
  }
  object NotificationButton {
    
    inline def apply(name: String): NotificationButton = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationButton]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationButton] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
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
    
    inline def `bottom-center`: typings.reapop.reapopStrings.`bottom-center` = "bottom-center".asInstanceOf[typings.reapop.reapopStrings.`bottom-center`]
    
    inline def `bottom-left`: typings.reapop.reapopStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.reapop.reapopStrings.`bottom-left`]
    
    inline def `bottom-right`: typings.reapop.reapopStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.reapop.reapopStrings.`bottom-right`]
    
    inline def `top-center`: typings.reapop.reapopStrings.`top-center` = "top-center".asInstanceOf[typings.reapop.reapopStrings.`top-center`]
    
    inline def `top-left`: typings.reapop.reapopStrings.`top-left` = "top-left".asInstanceOf[typings.reapop.reapopStrings.`top-left`]
    
    inline def `top-right`: typings.reapop.reapopStrings.`top-right` = "top-right".asInstanceOf[typings.reapop.reapopStrings.`top-right`]
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
    
    inline def error: typings.reapop.reapopStrings.error = "error".asInstanceOf[typings.reapop.reapopStrings.error]
    
    inline def info: typings.reapop.reapopStrings.info = "info".asInstanceOf[typings.reapop.reapopStrings.info]
    
    inline def loading: typings.reapop.reapopStrings.loading = "loading".asInstanceOf[typings.reapop.reapopStrings.loading]
    
    inline def none: typings.reapop.reapopStrings.none = "none".asInstanceOf[typings.reapop.reapopStrings.none]
    
    inline def success: typings.reapop.reapopStrings.success = "success".asInstanceOf[typings.reapop.reapopStrings.success]
    
    inline def warning: typings.reapop.reapopStrings.warning = "warning".asInstanceOf[typings.reapop.reapopStrings.warning]
  }
}
