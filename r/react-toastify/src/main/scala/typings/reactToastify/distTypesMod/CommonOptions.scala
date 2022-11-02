package typings.reactToastify.distTypesMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactToastify.anon.DefaultClassName
import typings.reactToastify.distComponentsCloseButtonMod.CloseButtonProps
import typings.reactToastify.distComponentsIconsMod.IconProps
import typings.reactToastify.reactToastifyBooleans.`false`
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonOptions extends StObject {
  
  /**
    * Set the delay in ms to close the toast automatically.
    * Use `false` to prevent the toast from closing.
    * `Default: 5000`
    */
  var autoClose: js.UndefOr[Double | `false`] = js.undefined
  
  /**
    * An optional css class to set for the toast content.
    */
  var bodyClassName: js.UndefOr[ToastClassName] = js.undefined
  
  /**
    * An optional inline style to apply for the toast content.
    */
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * Pass a custom close button.
    * To remove the close button pass `false`
    */
  var closeButton: js.UndefOr[Boolean | (js.Function1[/* props */ CloseButtonProps, ReactNode]) | ReactElement] = js.undefined
  
  /**
    * Remove the toast when clicked.
    * `Default: true`
    */
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set id to handle multiple container
    */
  var containerId: js.UndefOr[Id] = js.undefined
  
  /**
    * Allow toast to be draggable
    * `Default: true`
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify in which direction should you swipe to dismiss the toast
    * `Default: "x"`
    */
  var draggableDirection: js.UndefOr[DraggableDirection] = js.undefined
  
  /**
    * The percentage of the toast's width it takes for a drag to dismiss a toast
    * `Default: 80`
    */
  var draggablePercent: js.UndefOr[Double] = js.undefined
  
  /**
    * Hide or show the progress bar.
    * `Default: false`
    */
  var hideProgressBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used to display a custom icon. Set it to `false` to prevent
    * the icons from being displayed
    */
  var icon: js.UndefOr[ToastIcon] = js.undefined
  
  /**
    * @deprecated
    * ⚠️ Will be removed in the next major release. You can pass a react component with you handler instead.
    *
    * Fired when clicking inside toaster
    */
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
  
  /**
    * Pause the toast when the window loses focus.
    * `Default: true`
    */
  var pauseOnFocusLoss: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Pause the timer when the mouse hover the toast.
    * `Default: true`
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the default position to use.
    * `One of: 'top-right', 'top-center', 'top-left', 'bottom-right', 'bottom-center', 'bottom-left'`
    * `Default: 'top-right'`
    */
  var position: js.UndefOr[ToastPosition] = js.undefined
  
  /**
    * An optional css class to set for the progress bar.
    */
  var progressClassName: js.UndefOr[ToastClassName] = js.undefined
  
  /**
    * An optional style to set for the progress bar.
    */
  var progressStyle: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * Define the ARIA role for the toast
    * `Default: alert`
    *  https://www.w3.org/WAI/PF/aria/roles
    */
  var role: js.UndefOr[String] = js.undefined
  
  /**
    * Support right to left display.
    * `Default: false`
    */
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Theme to use.
    * `One of: 'light', 'dark', 'colored'`
    * `Default: 'light'`
    */
  var theme: js.UndefOr[Theme] = js.undefined
  
  /**
    * Pass a custom transition built with react-transition-group.
    */
  var transition: js.UndefOr[ToastTransition] = js.undefined
}
object CommonOptions {
  
  inline def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  
  extension [Self <: CommonOptions](x: Self) {
    
    inline def setAutoClose(value: Double | `false`): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setBodyClassName(value: ToastClassName): Self = StObject.set(x, "bodyClassName", value.asInstanceOf[js.Any])
    
    inline def setBodyClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): Self = StObject.set(x, "bodyClassName", js.Any.fromFunction1(value))
    
    inline def setBodyClassNameUndefined: Self = StObject.set(x, "bodyClassName", js.undefined)
    
    inline def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
    
    inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
    
    inline def setCloseButton(value: Boolean | (js.Function1[/* props */ CloseButtonProps, ReactNode]) | ReactElement): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonFunction1(value: /* props */ CloseButtonProps => ReactNode): Self = StObject.set(x, "closeButton", js.Any.fromFunction1(value))
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    inline def setContainerId(value: Id): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableDirection(value: DraggableDirection): Self = StObject.set(x, "draggableDirection", value.asInstanceOf[js.Any])
    
    inline def setDraggableDirectionUndefined: Self = StObject.set(x, "draggableDirection", js.undefined)
    
    inline def setDraggablePercent(value: Double): Self = StObject.set(x, "draggablePercent", value.asInstanceOf[js.Any])
    
    inline def setDraggablePercentUndefined: Self = StObject.set(x, "draggablePercent", js.undefined)
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setHideProgressBar(value: Boolean): Self = StObject.set(x, "hideProgressBar", value.asInstanceOf[js.Any])
    
    inline def setHideProgressBarUndefined: Self = StObject.set(x, "hideProgressBar", js.undefined)
    
    inline def setIcon(value: ToastIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconFunction1(value: /* props */ IconProps => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOnClick(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setPauseOnFocusLoss(value: Boolean): Self = StObject.set(x, "pauseOnFocusLoss", value.asInstanceOf[js.Any])
    
    inline def setPauseOnFocusLossUndefined: Self = StObject.set(x, "pauseOnFocusLoss", js.undefined)
    
    inline def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
    
    inline def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
    
    inline def setPosition(value: ToastPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setProgressClassName(value: ToastClassName): Self = StObject.set(x, "progressClassName", value.asInstanceOf[js.Any])
    
    inline def setProgressClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): Self = StObject.set(x, "progressClassName", js.Any.fromFunction1(value))
    
    inline def setProgressClassNameUndefined: Self = StObject.set(x, "progressClassName", js.undefined)
    
    inline def setProgressStyle(value: CSSProperties): Self = StObject.set(x, "progressStyle", value.asInstanceOf[js.Any])
    
    inline def setProgressStyleUndefined: Self = StObject.set(x, "progressStyle", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTransition(value: ToastTransition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
