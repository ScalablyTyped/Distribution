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

/* Inlined parent std.Partial<react-toastify.react-toastify/dist/types.ToastProps> */
trait NotValidatedToastProps extends StObject {
  
  var autoClose: js.UndefOr[Double | `false`] = js.undefined
  
  var bodyClassName: js.UndefOr[ToastClassName] = js.undefined
  
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var children: js.UndefOr[ToastContent[Any]] = js.undefined
  
  var className: js.UndefOr[ToastClassName] = js.undefined
  
  var closeButton: js.UndefOr[Boolean | (js.Function1[/* props */ CloseButtonProps, ReactNode]) | ReactElement] = js.undefined
  
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  
  var closeToast: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var containerId: js.UndefOr[Id] = js.undefined
  
  var data: js.UndefOr[js.Object] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var deleteToast: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var draggableDirection: js.UndefOr[DraggableDirection] = js.undefined
  
  var draggablePercent: js.UndefOr[Double] = js.undefined
  
  var hideProgressBar: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[ToastIcon] = js.undefined
  
  var iconOut: js.UndefOr[ReactNode] = js.undefined
  
  var isIn: js.UndefOr[Boolean] = js.undefined
  
  var isLoading: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[Id] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
  
  var onClose: js.UndefOr[js.Function1[/* props */ js.Object, Unit]] = js.undefined
  
  var onOpen: js.UndefOr[js.Function1[/* props */ js.Object, Unit]] = js.undefined
  
  var pauseOnFocusLoss: js.UndefOr[Boolean] = js.undefined
  
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[ToastPosition] = js.undefined
  
  var progress: js.UndefOr[Double | String] = js.undefined
  
  var progressClassName: js.UndefOr[ToastClassName] = js.undefined
  
  var progressStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  var staleId: js.UndefOr[Id] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var theme: js.UndefOr[Theme] = js.undefined
  
  var toastId: Id
  
  var transition: js.UndefOr[ToastTransition] = js.undefined
  
  var `type`: js.UndefOr[TypeOptions] = js.undefined
  
  var updateId: js.UndefOr[Id] = js.undefined
}
object NotValidatedToastProps {
  
  inline def apply(toastId: Id): NotValidatedToastProps = {
    val __obj = js.Dynamic.literal(toastId = toastId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotValidatedToastProps]
  }
  
  extension [Self <: NotValidatedToastProps](x: Self) {
    
    inline def setAutoClose(value: Double | `false`): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setBodyClassName(value: ToastClassName): Self = StObject.set(x, "bodyClassName", value.asInstanceOf[js.Any])
    
    inline def setBodyClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): Self = StObject.set(x, "bodyClassName", js.Any.fromFunction1(value))
    
    inline def setBodyClassNameUndefined: Self = StObject.set(x, "bodyClassName", js.undefined)
    
    inline def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
    
    inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
    
    inline def setChildren(value: ToastContent[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* props */ ToastContentProps[Any] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: ToastClassName): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): Self = StObject.set(x, "className", js.Any.fromFunction1(value))
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCloseButton(value: Boolean | (js.Function1[/* props */ CloseButtonProps, ReactNode]) | ReactElement): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonFunction1(value: /* props */ CloseButtonProps => ReactNode): Self = StObject.set(x, "closeButton", js.Any.fromFunction1(value))
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    inline def setCloseToast(value: () => Unit): Self = StObject.set(x, "closeToast", js.Any.fromFunction0(value))
    
    inline def setCloseToastUndefined: Self = StObject.set(x, "closeToast", js.undefined)
    
    inline def setContainerId(value: Id): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDeleteToast(value: () => Unit): Self = StObject.set(x, "deleteToast", js.Any.fromFunction0(value))
    
    inline def setDeleteToastUndefined: Self = StObject.set(x, "deleteToast", js.undefined)
    
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
    
    inline def setIconOut(value: ReactNode): Self = StObject.set(x, "iconOut", value.asInstanceOf[js.Any])
    
    inline def setIconOutUndefined: Self = StObject.set(x, "iconOut", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIsIn(value: Boolean): Self = StObject.set(x, "isIn", value.asInstanceOf[js.Any])
    
    inline def setIsInUndefined: Self = StObject.set(x, "isIn", js.undefined)
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    inline def setKey(value: Id): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOnClick(value: /* event */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnClose(value: /* props */ js.Object => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnOpen(value: /* props */ js.Object => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setPauseOnFocusLoss(value: Boolean): Self = StObject.set(x, "pauseOnFocusLoss", value.asInstanceOf[js.Any])
    
    inline def setPauseOnFocusLossUndefined: Self = StObject.set(x, "pauseOnFocusLoss", js.undefined)
    
    inline def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
    
    inline def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
    
    inline def setPosition(value: ToastPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setProgress(value: Double | String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressClassName(value: ToastClassName): Self = StObject.set(x, "progressClassName", value.asInstanceOf[js.Any])
    
    inline def setProgressClassNameFunction1(value: /* context */ js.UndefOr[DefaultClassName] => String): Self = StObject.set(x, "progressClassName", js.Any.fromFunction1(value))
    
    inline def setProgressClassNameUndefined: Self = StObject.set(x, "progressClassName", js.undefined)
    
    inline def setProgressStyle(value: CSSProperties): Self = StObject.set(x, "progressStyle", value.asInstanceOf[js.Any])
    
    inline def setProgressStyleUndefined: Self = StObject.set(x, "progressStyle", js.undefined)
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setStaleId(value: Id): Self = StObject.set(x, "staleId", value.asInstanceOf[js.Any])
    
    inline def setStaleIdUndefined: Self = StObject.set(x, "staleId", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setToastId(value: Id): Self = StObject.set(x, "toastId", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: ToastTransition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setType(value: TypeOptions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateId(value: Id): Self = StObject.set(x, "updateId", value.asInstanceOf[js.Any])
    
    inline def setUpdateIdUndefined: Self = StObject.set(x, "updateId", js.undefined)
  }
}
