package typings.rcDialog

import org.scalablytyped.runtime.Shortcut
import typings.rcDialog.anon.X
import typings.rcUtil.libPortalWrapperMod.GetContainer
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDialogContentPanelMod extends Shortcut {
  
  @JSImport("rc-dialog/es/Dialog/Content/Panel", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PanelProps & RefAttributes[ContentRef]] = js.native
  
  trait ContentRef extends StObject {
    
    def changeActive(next: Boolean): Unit
    
    def focus(): Unit
  }
  object ContentRef {
    
    inline def apply(changeActive: Boolean => Unit, focus: () => Unit): ContentRef = {
      val __obj = js.Dynamic.literal(changeActive = js.Any.fromFunction1(changeActive), focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[ContentRef]
    }
    
    extension [Self <: ContentRef](x: Self) {
      
      inline def setChangeActive(value: Boolean => Unit): Self = StObject.set(x, "changeActive", js.Any.fromFunction1(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined parent std.Omit<rc-dialog.rc-dialog/es/IDialogPropTypes.IDialogPropTypes, 'getOpenCount'> */
  trait PanelProps extends StObject {
    
    var afterClose: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var animation: js.UndefOr[Any] = js.undefined
    
    var ariaId: js.UndefOr[String] = js.undefined
    
    var bodyProps: js.UndefOr[Any] = js.undefined
    
    var bodyStyle: js.UndefOr[Record[String, Any]] = js.undefined
    
    var children: js.UndefOr[Any] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    var destroyOnClose: js.UndefOr[Boolean] = js.undefined
    
    var focusTriggerAfterClose: js.UndefOr[Boolean] = js.undefined
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var getContainer: js.UndefOr[GetContainer | false] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var holderRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var mask: js.UndefOr[Boolean] = js.undefined
    
    var maskAnimation: js.UndefOr[Any] = js.undefined
    
    var maskClosable: js.UndefOr[Boolean] = js.undefined
    
    var maskProps: js.UndefOr[Any] = js.undefined
    
    var maskStyle: js.UndefOr[Record[String, Any]] = js.undefined
    
    var maskTransitionName: js.UndefOr[String] = js.undefined
    
    var modalRender: js.UndefOr[js.Function1[/* node */ ReactNode, ReactNode]] = js.undefined
    
    var mousePosition: js.UndefOr[X | Null] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Any]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    
    var prefixCls: String
    
    var rootClassName: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
    
    var wrapClassName: js.UndefOr[String] = js.undefined
    
    var wrapProps: js.UndefOr[Any] = js.undefined
    
    var wrapStyle: js.UndefOr[Record[String, Any]] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PanelProps {
    
    inline def apply(prefixCls: String): PanelProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelProps]
    }
    
    extension [Self <: PanelProps](x: Self) {
      
      inline def setAfterClose(value: () => Any): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setAnimation(value: Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAriaId(value: String): Self = StObject.set(x, "ariaId", value.asInstanceOf[js.Any])
      
      inline def setAriaIdUndefined: Self = StObject.set(x, "ariaId", js.undefined)
      
      inline def setBodyProps(value: Any): Self = StObject.set(x, "bodyProps", value.asInstanceOf[js.Any])
      
      inline def setBodyPropsUndefined: Self = StObject.set(x, "bodyProps", js.undefined)
      
      inline def setBodyStyle(value: Record[String, Any]): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setDestroyOnClose(value: Boolean): Self = StObject.set(x, "destroyOnClose", value.asInstanceOf[js.Any])
      
      inline def setDestroyOnCloseUndefined: Self = StObject.set(x, "destroyOnClose", js.undefined)
      
      inline def setFocusTriggerAfterClose(value: Boolean): Self = StObject.set(x, "focusTriggerAfterClose", value.asInstanceOf[js.Any])
      
      inline def setFocusTriggerAfterCloseUndefined: Self = StObject.set(x, "focusTriggerAfterClose", js.undefined)
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setGetContainer(value: GetContainer | false): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      inline def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHolderRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "holderRef", value.asInstanceOf[js.Any])
      
      inline def setHolderRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "holderRef", js.Any.fromFunction1(value))
      
      inline def setHolderRefNull: Self = StObject.set(x, "holderRef", null)
      
      inline def setHolderRefUndefined: Self = StObject.set(x, "holderRef", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskAnimation(value: Any): Self = StObject.set(x, "maskAnimation", value.asInstanceOf[js.Any])
      
      inline def setMaskAnimationUndefined: Self = StObject.set(x, "maskAnimation", js.undefined)
      
      inline def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      inline def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      inline def setMaskProps(value: Any): Self = StObject.set(x, "maskProps", value.asInstanceOf[js.Any])
      
      inline def setMaskPropsUndefined: Self = StObject.set(x, "maskProps", js.undefined)
      
      inline def setMaskStyle(value: Record[String, Any]): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      inline def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      inline def setMaskTransitionName(value: String): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      inline def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setModalRender(value: /* node */ ReactNode => ReactNode): Self = StObject.set(x, "modalRender", js.Any.fromFunction1(value))
      
      inline def setModalRenderUndefined: Self = StObject.set(x, "modalRender", js.undefined)
      
      inline def setMousePosition(value: X): Self = StObject.set(x, "mousePosition", value.asInstanceOf[js.Any])
      
      inline def setMousePositionNull: Self = StObject.set(x, "mousePosition", null)
      
      inline def setMousePositionUndefined: Self = StObject.set(x, "mousePosition", js.undefined)
      
      inline def setOnClose(value: /* e */ SyntheticEvent[Element, Event] => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnMouseDown(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseUp(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      inline def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapClassName(value: String): Self = StObject.set(x, "wrapClassName", value.asInstanceOf[js.Any])
      
      inline def setWrapClassNameUndefined: Self = StObject.set(x, "wrapClassName", js.undefined)
      
      inline def setWrapProps(value: Any): Self = StObject.set(x, "wrapProps", value.asInstanceOf[js.Any])
      
      inline def setWrapPropsUndefined: Self = StObject.set(x, "wrapProps", js.undefined)
      
      inline def setWrapStyle(value: Record[String, Any]): Self = StObject.set(x, "wrapStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapStyleUndefined: Self = StObject.set(x, "wrapStyle", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PanelProps & RefAttributes[ContentRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esDialogContentPanelMod.foo` */
  override def _to: ForwardRefExoticComponent[PanelProps & RefAttributes[ContentRef]] = default
}
