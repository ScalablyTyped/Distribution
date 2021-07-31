package typings.rmcTooltip

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("rmc-tooltip/es/Tooltip", JSImport.Default)
  @js.native
  class default () extends Tooltip
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rmc-tooltip/es/Tooltip", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rmc-tooltip/es/Tooltip", "default.defaultProps.arrowContent")
      @js.native
      def arrowContent: /* is `Null`, but independent javascript fields cannot be in scala 3 */ js.Any = js.native
      @scala.inline
      def arrowContent_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrowContent")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-tooltip/es/Tooltip", "default.defaultProps.destroyTooltipOnHide")
      @js.native
      def destroyTooltipOnHide: Boolean = js.native
      @scala.inline
      def destroyTooltipOnHide_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroyTooltipOnHide")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-tooltip/es/Tooltip", "default.defaultProps.placement")
      @js.native
      def placement: String = js.native
      @scala.inline
      def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-tooltip/es/Tooltip", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
    }
  }
  
  trait ITooltipProps extends StObject {
    
    var afterVisibleChange: js.UndefOr[js.Function] = js.undefined
    
    var align: js.UndefOr[js.Object] = js.undefined
    
    var animation: js.UndefOr[js.Any] = js.undefined
    
    var arrowContent: js.UndefOr[js.Any] = js.undefined
    
    var defaultVisible: js.UndefOr[Boolean] = js.undefined
    
    var destroyTooltipOnHide: js.UndefOr[Boolean] = js.undefined
    
    var getTooltipContainer: js.UndefOr[js.Function] = js.undefined
    
    var onVisibleChange: js.UndefOr[js.Function] = js.undefined
    
    var overlay: ReactNode | js.Function
    
    var overlayClassName: js.UndefOr[String] = js.undefined
    
    var overlayStyle: js.UndefOr[js.Object] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[js.Any] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ITooltipProps {
    
    @scala.inline
    def apply(): ITooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITooltipProps]
    }
    
    @scala.inline
    implicit class ITooltipPropsMutableBuilder[Self <: ITooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterVisibleChange(value: js.Function): Self = StObject.set(x, "afterVisibleChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterVisibleChangeUndefined: Self = StObject.set(x, "afterVisibleChange", js.undefined)
      
      @scala.inline
      def setAlign(value: js.Object): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAnimation(value: js.Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setArrowContent(value: js.Any): Self = StObject.set(x, "arrowContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowContentUndefined: Self = StObject.set(x, "arrowContent", js.undefined)
      
      @scala.inline
      def setDefaultVisible(value: Boolean): Self = StObject.set(x, "defaultVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultVisibleUndefined: Self = StObject.set(x, "defaultVisible", js.undefined)
      
      @scala.inline
      def setDestroyTooltipOnHide(value: Boolean): Self = StObject.set(x, "destroyTooltipOnHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyTooltipOnHideUndefined: Self = StObject.set(x, "destroyTooltipOnHide", js.undefined)
      
      @scala.inline
      def setGetTooltipContainer(value: js.Function): Self = StObject.set(x, "getTooltipContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetTooltipContainerUndefined: Self = StObject.set(x, "getTooltipContainer", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(value: js.Function): Self = StObject.set(x, "onVisibleChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setOverlay(value: ReactNode | js.Function): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      @scala.inline
      def setOverlayStyle(value: js.Object): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setTrigger(value: js.Any): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait Tooltip
    extends Component[ITooltipProps, js.Any, js.Any] {
    
    def getPopupDomNode(): js.Any = js.native
    
    def getPopupElement(): js.Array[Element] = js.native
    
    def saveTrigger(node: js.Any): Unit = js.native
    
    var trigger: js.Any = js.native
  }
}
