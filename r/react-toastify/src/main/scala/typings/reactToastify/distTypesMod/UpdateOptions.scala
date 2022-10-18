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

/* Inlined parent react-toastify.react-toastify/dist/types.Nullable<react-toastify.react-toastify/dist/types.ToastOptions<T>> */
trait UpdateOptions[T] extends StObject {
  
  var autoClose: js.UndefOr[Double | `false` | Null] = js.undefined
  
  var bodyClassName: js.UndefOr[ToastClassName | Null] = js.undefined
  
  var bodyStyle: js.UndefOr[CSSProperties | Null] = js.undefined
  
  var className: js.UndefOr[ToastClassName | Null] = js.undefined
  
  var closeButton: js.UndefOr[
    Boolean | (js.Function1[/* props */ CloseButtonProps, ReactNode]) | ReactElement | Null
  ] = js.undefined
  
  var closeOnClick: js.UndefOr[Boolean | Null] = js.undefined
  
  var containerId: js.UndefOr[Id | Null] = js.undefined
  
  var data: js.UndefOr[T | Null] = js.undefined
  
  var delay: js.UndefOr[Double | Null] = js.undefined
  
  var draggable: js.UndefOr[Boolean | Null] = js.undefined
  
  var draggableDirection: js.UndefOr[DraggableDirection | Null] = js.undefined
  
  var draggablePercent: js.UndefOr[Double | Null] = js.undefined
  
  var hideProgressBar: js.UndefOr[Boolean | Null] = js.undefined
  
  var icon: js.UndefOr[
    Boolean | (js.Function1[/* props */ IconProps, ReactNode]) | ReactElement | String | Double | ReactNode | Null
  ] = js.undefined
  
  var isLoading: js.UndefOr[Boolean | Null] = js.undefined
  
  var onClick: js.UndefOr[(js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]) | Null] = js.undefined
  
  var onClose: js.UndefOr[(js.Function1[/* props */ js.Object, Unit]) | Null] = js.undefined
  
  var onOpen: js.UndefOr[(js.Function1[/* props */ js.Object, Unit]) | Null] = js.undefined
  
  var pauseOnFocusLoss: js.UndefOr[Boolean | Null] = js.undefined
  
  var pauseOnHover: js.UndefOr[Boolean | Null] = js.undefined
  
  var position: js.UndefOr[ToastPosition | Null] = js.undefined
  
  var progress: js.UndefOr[Double | String | Null] = js.undefined
  
  var progressClassName: js.UndefOr[ToastClassName | Null] = js.undefined
  
  var progressStyle: js.UndefOr[CSSProperties | Null] = js.undefined
  
  /**
    * Used to update a toast.
    * Pass any valid ReactNode(string, number, component)
    */
  var render: js.UndefOr[ToastContent[T]] = js.undefined
  
  var role: js.UndefOr[String | Null] = js.undefined
  
  var rtl: js.UndefOr[Boolean | Null] = js.undefined
  
  var style: js.UndefOr[CSSProperties | Null] = js.undefined
  
  var theme: js.UndefOr[Theme | Null] = js.undefined
  
  var toastId: js.UndefOr[Id | Null] = js.undefined
  
  var transition: js.UndefOr[ToastTransition | Null] = js.undefined
  
  var `type`: js.UndefOr[TypeOptions | Null] = js.undefined
  
  var updateId: js.UndefOr[Id | Null] = js.undefined
}
object UpdateOptions {
  
  inline def apply[T](): UpdateOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOptions[T]]
  }
  
  extension [Self <: UpdateOptions[?], T](x: Self & UpdateOptions[T]) {
    
    inline def setAutoClose(value: Double | `false`): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseNull: Self = StObject.set(x, "autoClose", null)
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setBodyClassName(value: ToastClassName): Self = StObject.set(x, "bodyClassName", value.asInstanceOf[js.Any])
    
    inline def setBodyClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): Self = StObject.set(x, "bodyClassName", js.Any.fromFunction1(value))
    
    inline def setBodyClassNameNull: Self = StObject.set(x, "bodyClassName", null)
    
    inline def setBodyClassNameUndefined: Self = StObject.set(x, "bodyClassName", js.undefined)
    
    inline def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
    
    inline def setBodyStyleNull: Self = StObject.set(x, "bodyStyle", null)
    
    inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
    
    inline def setClassName(value: ToastClassName): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
    
    inline def setClassNameNull: Self = StObject.set(x, "className", null)
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCloseButton(value: Boolean | (js.Function1[/* props */ CloseButtonProps, ReactNode]) | ReactElement): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonFunction1(value: /* props */ CloseButtonProps => ReactNode): Self = StObject.set(x, "closeButton", js.Any.fromFunction1(value))
    
    inline def setCloseButtonNull: Self = StObject.set(x, "closeButton", null)
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClickNull: Self = StObject.set(x, "closeOnClick", null)
    
    inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    inline def setContainerId(value: Id): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdNull: Self = StObject.set(x, "containerId", null)
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayNull: Self = StObject.set(x, "delay", null)
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableDirection(value: DraggableDirection): Self = StObject.set(x, "draggableDirection", value.asInstanceOf[js.Any])
    
    inline def setDraggableDirectionNull: Self = StObject.set(x, "draggableDirection", null)
    
    inline def setDraggableDirectionUndefined: Self = StObject.set(x, "draggableDirection", js.undefined)
    
    inline def setDraggableNull: Self = StObject.set(x, "draggable", null)
    
    inline def setDraggablePercent(value: Double): Self = StObject.set(x, "draggablePercent", value.asInstanceOf[js.Any])
    
    inline def setDraggablePercentNull: Self = StObject.set(x, "draggablePercent", null)
    
    inline def setDraggablePercentUndefined: Self = StObject.set(x, "draggablePercent", js.undefined)
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setHideProgressBar(value: Boolean): Self = StObject.set(x, "hideProgressBar", value.asInstanceOf[js.Any])
    
    inline def setHideProgressBarNull: Self = StObject.set(x, "hideProgressBar", null)
    
    inline def setHideProgressBarUndefined: Self = StObject.set(x, "hideProgressBar", js.undefined)
    
    inline def setIcon(
      value: Boolean | (js.Function1[/* props */ IconProps, ReactNode]) | ReactElement | String | Double | ReactNode
    ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconFunction1(value: /* props */ IconProps => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsLoadingNull: Self = StObject.set(x, "isLoading", null)
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    inline def setOnClick(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickNull: Self = StObject.set(x, "onClick", null)
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnClose(value: /* props */ js.Object => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    inline def setOnCloseNull: Self = StObject.set(x, "onClose", null)
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnOpen(value: /* props */ js.Object => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
    
    inline def setOnOpenNull: Self = StObject.set(x, "onOpen", null)
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setPauseOnFocusLoss(value: Boolean): Self = StObject.set(x, "pauseOnFocusLoss", value.asInstanceOf[js.Any])
    
    inline def setPauseOnFocusLossNull: Self = StObject.set(x, "pauseOnFocusLoss", null)
    
    inline def setPauseOnFocusLossUndefined: Self = StObject.set(x, "pauseOnFocusLoss", js.undefined)
    
    inline def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
    
    inline def setPauseOnHoverNull: Self = StObject.set(x, "pauseOnHover", null)
    
    inline def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
    
    inline def setPosition(value: ToastPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setProgress(value: Double | String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressClassName(value: ToastClassName): Self = StObject.set(x, "progressClassName", value.asInstanceOf[js.Any])
    
    inline def setProgressClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): Self = StObject.set(x, "progressClassName", js.Any.fromFunction1(value))
    
    inline def setProgressClassNameNull: Self = StObject.set(x, "progressClassName", null)
    
    inline def setProgressClassNameUndefined: Self = StObject.set(x, "progressClassName", js.undefined)
    
    inline def setProgressNull: Self = StObject.set(x, "progress", null)
    
    inline def setProgressStyle(value: CSSProperties): Self = StObject.set(x, "progressStyle", value.asInstanceOf[js.Any])
    
    inline def setProgressStyleNull: Self = StObject.set(x, "progressStyle", null)
    
    inline def setProgressStyleUndefined: Self = StObject.set(x, "progressStyle", js.undefined)
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRender(value: ToastContent[T]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderFunction1(value: /* props */ ToastContentProps[T] => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlNull: Self = StObject.set(x, "rtl", null)
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeNull: Self = StObject.set(x, "theme", null)
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setToastId(value: Id): Self = StObject.set(x, "toastId", value.asInstanceOf[js.Any])
    
    inline def setToastIdNull: Self = StObject.set(x, "toastId", null)
    
    inline def setToastIdUndefined: Self = StObject.set(x, "toastId", js.undefined)
    
    inline def setTransition(value: ToastTransition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionNull: Self = StObject.set(x, "transition", null)
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateId(value: Id): Self = StObject.set(x, "updateId", value.asInstanceOf[js.Any])
    
    inline def setUpdateIdNull: Self = StObject.set(x, "updateId", null)
    
    inline def setUpdateIdUndefined: Self = StObject.set(x, "updateId", js.undefined)
  }
}
