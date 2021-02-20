package typings.rcDropdown

import org.scalablytyped.runtime.Shortcut
import typings.rcTrigger.interfaceMod.ActionType
import typings.rcTrigger.interfaceMod.AlignType
import typings.rcTrigger.interfaceMod.AnimationType
import typings.rcTrigger.interfaceMod.BuildInPlacements
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMod extends Shortcut {
  
  @JSImport("rc-dropdown/es/Dropdown", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[DropdownProps with RefAttributes[_]] = js.native
  
  /* Inlined parent std.Pick<rc-trigger.rc-trigger.TriggerProps, 'getPopupContainer' | 'children' | 'mouseEnterDelay' | 'mouseLeaveDelay'> */
  @js.native
  trait DropdownProps extends StObject {
    
    var align: js.UndefOr[AlignType] = js.native
    
    var alignPoint: js.UndefOr[Boolean] = js.native
    
    var animation: js.UndefOr[AnimationType] = js.native
    
    var arrow: js.UndefOr[Boolean] = js.native
    
    var children: ReactElement = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var hideAction: js.UndefOr[js.Array[ActionType]] = js.native
    
    var minOverlayWidthMatchTrigger: js.UndefOr[Boolean] = js.native
    
    var mouseEnterDelay: js.UndefOr[Double] = js.native
    
    var mouseLeaveDelay: js.UndefOr[Double] = js.native
    
    var onOverlayClick: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var openClassName: js.UndefOr[String] = js.native
    
    var overlay: js.UndefOr[js.Function0[ReactElement] | ReactElement] = js.native
    
    var overlayClassName: js.UndefOr[String] = js.native
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.native
    
    var placement: js.UndefOr[String] = js.native
    
    var placements: js.UndefOr[BuildInPlacements] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var showAction: js.UndefOr[js.Array[ActionType]] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var trigger: js.UndefOr[ActionType | js.Array[ActionType]] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object DropdownProps {
    
    @scala.inline
    def apply(children: ReactElement): DropdownProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownProps]
    }
    
    @scala.inline
    implicit class DropdownPropsMutableBuilder[Self <: DropdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignPoint(value: Boolean): Self = StObject.set(x, "alignPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignPointUndefined: Self = StObject.set(x, "alignPoint", js.undefined)
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setHideAction(value: js.Array[ActionType]): Self = StObject.set(x, "hideAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideActionUndefined: Self = StObject.set(x, "hideAction", js.undefined)
      
      @scala.inline
      def setHideActionVarargs(value: ActionType*): Self = StObject.set(x, "hideAction", js.Array(value :_*))
      
      @scala.inline
      def setMinOverlayWidthMatchTrigger(value: Boolean): Self = StObject.set(x, "minOverlayWidthMatchTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinOverlayWidthMatchTriggerUndefined: Self = StObject.set(x, "minOverlayWidthMatchTrigger", js.undefined)
      
      @scala.inline
      def setMouseEnterDelay(value: Double): Self = StObject.set(x, "mouseEnterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseEnterDelayUndefined: Self = StObject.set(x, "mouseEnterDelay", js.undefined)
      
      @scala.inline
      def setMouseLeaveDelay(value: Double): Self = StObject.set(x, "mouseLeaveDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseLeaveDelayUndefined: Self = StObject.set(x, "mouseLeaveDelay", js.undefined)
      
      @scala.inline
      def setOnOverlayClick(value: /* e */ Event => Unit): Self = StObject.set(x, "onOverlayClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOverlayClickUndefined: Self = StObject.set(x, "onOverlayClick", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setOpenClassName(value: String): Self = StObject.set(x, "openClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenClassNameUndefined: Self = StObject.set(x, "openClassName", js.undefined)
      
      @scala.inline
      def setOverlay(value: js.Function0[ReactElement] | ReactElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      @scala.inline
      def setOverlayFunction0(value: () => ReactElement): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPlacements(value: BuildInPlacements): Self = StObject.set(x, "placements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementsUndefined: Self = StObject.set(x, "placements", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setShowAction(value: js.Array[ActionType]): Self = StObject.set(x, "showAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowActionUndefined: Self = StObject.set(x, "showAction", js.undefined)
      
      @scala.inline
      def setShowActionVarargs(value: ActionType*): Self = StObject.set(x, "showAction", js.Array(value :_*))
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setTrigger(value: ActionType | js.Array[ActionType]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setTriggerVarargs(value: ActionType*): Self = StObject.set(x, "trigger", js.Array(value :_*))
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[DropdownProps with RefAttributes[_]]
  
  /* This means you don't have to write `default`, but can instead just say `dropdownMod.foo` */
  override def _to: ForwardRefExoticComponent[DropdownProps with RefAttributes[_]] = default
}
