package typings.rcComponentTrigger

import typings.rcComponentTrigger.esInterfaceMod.ActionType
import typings.rcComponentTrigger.esInterfaceMod.AlignType
import typings.rcComponentTrigger.esInterfaceMod.AnimationType
import typings.rcComponentTrigger.esInterfaceMod.ArrowTypeOuter
import typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import typings.rcComponentTrigger.esInterfaceMod.TransitionNameType
import typings.rcMotion.esCssmotionMod.CSSMotionProps
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rc-component/trigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@rc-component/trigger", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TriggerProps & RefAttributes[TriggerRef]] = js.native
  
  inline def generateTrigger(): ForwardRefExoticComponent[TriggerProps & RefAttributes[TriggerRef]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateTrigger")().asInstanceOf[ForwardRefExoticComponent[TriggerProps & RefAttributes[TriggerRef]]]
  inline def generateTrigger(PortalComponent: ComponentType[Any]): ForwardRefExoticComponent[TriggerProps & RefAttributes[TriggerRef]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateTrigger")(PortalComponent.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[TriggerProps & RefAttributes[TriggerRef]]]
  
  trait TriggerProps extends StObject {
    
    var action: js.UndefOr[ActionType | js.Array[ActionType]] = js.undefined
    
    var afterPopupVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var alignPoint: js.UndefOr[Boolean] = js.undefined
    
    var arrow: js.UndefOr[Boolean | ArrowTypeOuter] = js.undefined
    
    var autoDestroy: js.UndefOr[Boolean] = js.undefined
    
    var blurDelay: js.UndefOr[Double] = js.undefined
    
    var builtinPlacements: js.UndefOr[BuildInPlacements] = js.undefined
    
    var children: ReactElement
    
    /** @deprecated Add `className` on `children`. Please add `className` directly instead. */
    var className: js.UndefOr[String] = js.undefined
    
    var defaultPopupVisible: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Please use `autoDestroy` instead */
    var destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined
    
    var focusDelay: js.UndefOr[Double] = js.undefined
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var getPopupClassNameFromAlign: js.UndefOr[js.Function1[/* align */ AlignType, String]] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
    
    /**
      * @private Get trigger DOM node.
      * Used for some component is function component which can not access by `findDOMNode`
      */
    var getTriggerDOMNode: js.UndefOr[js.Function1[/* node */ ReactInstance, HTMLElement]] = js.undefined
    
    var hideAction: js.UndefOr[js.Array[ActionType]] = js.undefined
    
    var mask: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Please us `maskMotion` instead. */
    var maskAnimation: js.UndefOr[AnimationType] = js.undefined
    
    var maskClosable: js.UndefOr[Boolean] = js.undefined
    
    /** Set mask motion. You can ref `rc-motion` for more info. */
    var maskMotion: js.UndefOr[CSSMotionProps] = js.undefined
    
    /** @deprecated Please us `maskMotion` instead. */
    var maskTransitionName: js.UndefOr[TransitionNameType] = js.undefined
    
    var mouseEnterDelay: js.UndefOr[Double] = js.undefined
    
    var mouseLeaveDelay: js.UndefOr[Double] = js.undefined
    
    var onPopupAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.undefined
    
    var onPopupClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onPopupVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var popup: ReactNode | js.Function0[ReactNode]
    
    var popupAlign: js.UndefOr[AlignType] = js.undefined
    
    /** @deprecated Please us `popupMotion` instead. */
    var popupAnimation: js.UndefOr[AnimationType] = js.undefined
    
    var popupClassName: js.UndefOr[String] = js.undefined
    
    /** Set popup motion. You can ref `rc-motion` for more info. */
    var popupMotion: js.UndefOr[CSSMotionProps] = js.undefined
    
    var popupPlacement: js.UndefOr[String] = js.undefined
    
    var popupStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /** @deprecated Please us `popupMotion` instead. */
    var popupTransitionName: js.UndefOr[TransitionNameType] = js.undefined
    
    var popupVisible: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var showAction: js.UndefOr[js.Array[ActionType]] = js.undefined
    
    var stretch: js.UndefOr[String] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object TriggerProps {
    
    inline def apply(children: ReactElement): TriggerProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TriggerProps] (val x: Self) extends AnyVal {
      
      inline def setAction(value: ActionType | js.Array[ActionType]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setActionVarargs(value: ActionType*): Self = StObject.set(x, "action", js.Array(value*))
      
      inline def setAfterPopupVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "afterPopupVisibleChange", js.Any.fromFunction1(value))
      
      inline def setAfterPopupVisibleChangeUndefined: Self = StObject.set(x, "afterPopupVisibleChange", js.undefined)
      
      inline def setAlignPoint(value: Boolean): Self = StObject.set(x, "alignPoint", value.asInstanceOf[js.Any])
      
      inline def setAlignPointUndefined: Self = StObject.set(x, "alignPoint", js.undefined)
      
      inline def setArrow(value: Boolean | ArrowTypeOuter): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      inline def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      inline def setBlurDelay(value: Double): Self = StObject.set(x, "blurDelay", value.asInstanceOf[js.Any])
      
      inline def setBlurDelayUndefined: Self = StObject.set(x, "blurDelay", js.undefined)
      
      inline def setBuiltinPlacements(value: BuildInPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      inline def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultPopupVisible(value: Boolean): Self = StObject.set(x, "defaultPopupVisible", value.asInstanceOf[js.Any])
      
      inline def setDefaultPopupVisibleUndefined: Self = StObject.set(x, "defaultPopupVisible", js.undefined)
      
      inline def setDestroyPopupOnHide(value: Boolean): Self = StObject.set(x, "destroyPopupOnHide", value.asInstanceOf[js.Any])
      
      inline def setDestroyPopupOnHideUndefined: Self = StObject.set(x, "destroyPopupOnHide", js.undefined)
      
      inline def setFocusDelay(value: Double): Self = StObject.set(x, "focusDelay", value.asInstanceOf[js.Any])
      
      inline def setFocusDelayUndefined: Self = StObject.set(x, "focusDelay", js.undefined)
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setGetPopupClassNameFromAlign(value: /* align */ AlignType => String): Self = StObject.set(x, "getPopupClassNameFromAlign", js.Any.fromFunction1(value))
      
      inline def setGetPopupClassNameFromAlignUndefined: Self = StObject.set(x, "getPopupClassNameFromAlign", js.undefined)
      
      inline def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setGetTriggerDOMNode(value: /* node */ ReactInstance => HTMLElement): Self = StObject.set(x, "getTriggerDOMNode", js.Any.fromFunction1(value))
      
      inline def setGetTriggerDOMNodeUndefined: Self = StObject.set(x, "getTriggerDOMNode", js.undefined)
      
      inline def setHideAction(value: js.Array[ActionType]): Self = StObject.set(x, "hideAction", value.asInstanceOf[js.Any])
      
      inline def setHideActionUndefined: Self = StObject.set(x, "hideAction", js.undefined)
      
      inline def setHideActionVarargs(value: ActionType*): Self = StObject.set(x, "hideAction", js.Array(value*))
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskAnimation(value: AnimationType): Self = StObject.set(x, "maskAnimation", value.asInstanceOf[js.Any])
      
      inline def setMaskAnimationUndefined: Self = StObject.set(x, "maskAnimation", js.undefined)
      
      inline def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      inline def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      inline def setMaskMotion(value: CSSMotionProps): Self = StObject.set(x, "maskMotion", value.asInstanceOf[js.Any])
      
      inline def setMaskMotionUndefined: Self = StObject.set(x, "maskMotion", js.undefined)
      
      inline def setMaskTransitionName(value: TransitionNameType): Self = StObject.set(x, "maskTransitionName", value.asInstanceOf[js.Any])
      
      inline def setMaskTransitionNameUndefined: Self = StObject.set(x, "maskTransitionName", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMouseEnterDelay(value: Double): Self = StObject.set(x, "mouseEnterDelay", value.asInstanceOf[js.Any])
      
      inline def setMouseEnterDelayUndefined: Self = StObject.set(x, "mouseEnterDelay", js.undefined)
      
      inline def setMouseLeaveDelay(value: Double): Self = StObject.set(x, "mouseLeaveDelay", value.asInstanceOf[js.Any])
      
      inline def setMouseLeaveDelayUndefined: Self = StObject.set(x, "mouseLeaveDelay", js.undefined)
      
      inline def setOnPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): Self = StObject.set(x, "onPopupAlign", js.Any.fromFunction2(value))
      
      inline def setOnPopupAlignUndefined: Self = StObject.set(x, "onPopupAlign", js.undefined)
      
      inline def setOnPopupClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onPopupClick", js.Any.fromFunction1(value))
      
      inline def setOnPopupClickUndefined: Self = StObject.set(x, "onPopupClick", js.undefined)
      
      inline def setOnPopupVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onPopupVisibleChange", js.Any.fromFunction1(value))
      
      inline def setOnPopupVisibleChangeUndefined: Self = StObject.set(x, "onPopupVisibleChange", js.undefined)
      
      inline def setPopup(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupAlign(value: AlignType): Self = StObject.set(x, "popupAlign", value.asInstanceOf[js.Any])
      
      inline def setPopupAlignUndefined: Self = StObject.set(x, "popupAlign", js.undefined)
      
      inline def setPopupAnimation(value: AnimationType): Self = StObject.set(x, "popupAnimation", value.asInstanceOf[js.Any])
      
      inline def setPopupAnimationUndefined: Self = StObject.set(x, "popupAnimation", js.undefined)
      
      inline def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      inline def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      inline def setPopupFunction0(value: () => ReactNode): Self = StObject.set(x, "popup", js.Any.fromFunction0(value))
      
      inline def setPopupMotion(value: CSSMotionProps): Self = StObject.set(x, "popupMotion", value.asInstanceOf[js.Any])
      
      inline def setPopupMotionUndefined: Self = StObject.set(x, "popupMotion", js.undefined)
      
      inline def setPopupPlacement(value: String): Self = StObject.set(x, "popupPlacement", value.asInstanceOf[js.Any])
      
      inline def setPopupPlacementUndefined: Self = StObject.set(x, "popupPlacement", js.undefined)
      
      inline def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      inline def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      inline def setPopupTransitionName(value: TransitionNameType): Self = StObject.set(x, "popupTransitionName", value.asInstanceOf[js.Any])
      
      inline def setPopupTransitionNameUndefined: Self = StObject.set(x, "popupTransitionName", js.undefined)
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      inline def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
      
      inline def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setShowAction(value: js.Array[ActionType]): Self = StObject.set(x, "showAction", value.asInstanceOf[js.Any])
      
      inline def setShowActionUndefined: Self = StObject.set(x, "showAction", js.undefined)
      
      inline def setShowActionVarargs(value: ActionType*): Self = StObject.set(x, "showAction", js.Array(value*))
      
      inline def setStretch(value: String): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait TriggerRef extends StObject {
    
    var forceAlign: VoidFunction
  }
  object TriggerRef {
    
    inline def apply(forceAlign: () => Unit): TriggerRef = {
      val __obj = js.Dynamic.literal(forceAlign = js.Any.fromFunction0(forceAlign))
      __obj.asInstanceOf[TriggerRef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TriggerRef] (val x: Self) extends AnyVal {
      
      inline def setForceAlign(value: () => Unit): Self = StObject.set(x, "forceAlign", js.Any.fromFunction0(value))
    }
  }
}
