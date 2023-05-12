package typings.rcDropdown

import org.scalablytyped.runtime.Shortcut
import typings.rcComponentTrigger.esInterfaceMod.ActionType
import typings.rcComponentTrigger.esInterfaceMod.AlignType
import typings.rcComponentTrigger.esInterfaceMod.AnimationType
import typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import typings.rcDropdown.rcDropdownStrings.bottom
import typings.rcDropdown.rcDropdownStrings.bottomLeft
import typings.rcDropdown.rcDropdownStrings.bottomRight
import typings.rcDropdown.rcDropdownStrings.top
import typings.rcDropdown.rcDropdownStrings.topLeft
import typings.rcDropdown.rcDropdownStrings.topRight
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDropdownMod extends Shortcut {
  
  @JSImport("rc-dropdown/es/Dropdown", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[DropdownProps & RefAttributes[Any]] = js.native
  
  /* Inlined parent std.Pick<@rc-component/trigger.@rc-component/trigger.TriggerProps, 'getPopupContainer' | 'children' | 'mouseEnterDelay' | 'mouseLeaveDelay' | 'onPopupAlign' | 'builtinPlacements'> */
  trait DropdownProps extends StObject {
    
    var align: js.UndefOr[AlignType] = js.undefined
    
    var alignPoint: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[AnimationType] = js.undefined
    
    var arrow: js.UndefOr[Boolean] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var builtinPlacements: js.UndefOr[BuildInPlacements] = js.undefined
    
    var children: ReactElement
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
    
    var hideAction: js.UndefOr[js.Array[ActionType]] = js.undefined
    
    var minOverlayWidthMatchTrigger: js.UndefOr[Boolean] = js.undefined
    
    var mouseEnterDelay: js.UndefOr[Double] = js.undefined
    
    var mouseLeaveDelay: js.UndefOr[Double] = js.undefined
    
    var onOverlayClick: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onPopupAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.undefined
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var openClassName: js.UndefOr[String] = js.undefined
    
    var overlay: js.UndefOr[js.Function0[ReactElement] | ReactElement] = js.undefined
    
    var overlayClassName: js.UndefOr[String] = js.undefined
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var placement: js.UndefOr[topLeft | top | topRight | bottomLeft | bottom | bottomRight] = js.undefined
    
    var placements: js.UndefOr[BuildInPlacements] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var showAction: js.UndefOr[js.Array[ActionType]] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[ActionType | js.Array[ActionType]] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DropdownProps {
    
    inline def apply(children: ReactElement): DropdownProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropdownProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignPoint(value: Boolean): Self = StObject.set(x, "alignPoint", value.asInstanceOf[js.Any])
      
      inline def setAlignPointUndefined: Self = StObject.set(x, "alignPoint", js.undefined)
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setBuiltinPlacements(value: BuildInPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      inline def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setHideAction(value: js.Array[ActionType]): Self = StObject.set(x, "hideAction", value.asInstanceOf[js.Any])
      
      inline def setHideActionUndefined: Self = StObject.set(x, "hideAction", js.undefined)
      
      inline def setHideActionVarargs(value: ActionType*): Self = StObject.set(x, "hideAction", js.Array(value*))
      
      inline def setMinOverlayWidthMatchTrigger(value: Boolean): Self = StObject.set(x, "minOverlayWidthMatchTrigger", value.asInstanceOf[js.Any])
      
      inline def setMinOverlayWidthMatchTriggerUndefined: Self = StObject.set(x, "minOverlayWidthMatchTrigger", js.undefined)
      
      inline def setMouseEnterDelay(value: Double): Self = StObject.set(x, "mouseEnterDelay", value.asInstanceOf[js.Any])
      
      inline def setMouseEnterDelayUndefined: Self = StObject.set(x, "mouseEnterDelay", js.undefined)
      
      inline def setMouseLeaveDelay(value: Double): Self = StObject.set(x, "mouseLeaveDelay", value.asInstanceOf[js.Any])
      
      inline def setMouseLeaveDelayUndefined: Self = StObject.set(x, "mouseLeaveDelay", js.undefined)
      
      inline def setOnOverlayClick(value: /* e */ Event => Unit): Self = StObject.set(x, "onOverlayClick", js.Any.fromFunction1(value))
      
      inline def setOnOverlayClickUndefined: Self = StObject.set(x, "onOverlayClick", js.undefined)
      
      inline def setOnPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): Self = StObject.set(x, "onPopupAlign", js.Any.fromFunction2(value))
      
      inline def setOnPopupAlignUndefined: Self = StObject.set(x, "onPopupAlign", js.undefined)
      
      inline def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setOpenClassName(value: String): Self = StObject.set(x, "openClassName", value.asInstanceOf[js.Any])
      
      inline def setOpenClassNameUndefined: Self = StObject.set(x, "openClassName", js.undefined)
      
      inline def setOverlay(value: js.Function0[ReactElement] | ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      inline def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      inline def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      inline def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setPlacement(value: topLeft | top | topRight | bottomLeft | bottom | bottomRight): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPlacements(value: BuildInPlacements): Self = StObject.set(x, "placements", value.asInstanceOf[js.Any])
      
      inline def setPlacementsUndefined: Self = StObject.set(x, "placements", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setShowAction(value: js.Array[ActionType]): Self = StObject.set(x, "showAction", value.asInstanceOf[js.Any])
      
      inline def setShowActionUndefined: Self = StObject.set(x, "showAction", js.undefined)
      
      inline def setShowActionVarargs(value: ActionType*): Self = StObject.set(x, "showAction", js.Array(value*))
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setTrigger(value: ActionType | js.Array[ActionType]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setTriggerVarargs(value: ActionType*): Self = StObject.set(x, "trigger", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[DropdownProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `esDropdownMod.foo` */
  override def _to: ForwardRefExoticComponent[DropdownProps & RefAttributes[Any]] = default
}
