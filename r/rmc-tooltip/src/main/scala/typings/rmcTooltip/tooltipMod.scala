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
      inline def arrowContent_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrowContent")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-tooltip/es/Tooltip", "default.defaultProps.destroyTooltipOnHide")
      @js.native
      def destroyTooltipOnHide: Boolean = js.native
      inline def destroyTooltipOnHide_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroyTooltipOnHide")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-tooltip/es/Tooltip", "default.defaultProps.placement")
      @js.native
      def placement: String = js.native
      inline def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("rmc-tooltip/es/Tooltip", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
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
    
    inline def apply(): ITooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITooltipProps]
    }
    
    extension [Self <: ITooltipProps](x: Self) {
      
      inline def setAfterVisibleChange(value: js.Function): Self = StObject.set(x, "afterVisibleChange", value.asInstanceOf[js.Any])
      
      inline def setAfterVisibleChangeUndefined: Self = StObject.set(x, "afterVisibleChange", js.undefined)
      
      inline def setAlign(value: js.Object): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAnimation(value: js.Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setArrowContent(value: js.Any): Self = StObject.set(x, "arrowContent", value.asInstanceOf[js.Any])
      
      inline def setArrowContentUndefined: Self = StObject.set(x, "arrowContent", js.undefined)
      
      inline def setDefaultVisible(value: Boolean): Self = StObject.set(x, "defaultVisible", value.asInstanceOf[js.Any])
      
      inline def setDefaultVisibleUndefined: Self = StObject.set(x, "defaultVisible", js.undefined)
      
      inline def setDestroyTooltipOnHide(value: Boolean): Self = StObject.set(x, "destroyTooltipOnHide", value.asInstanceOf[js.Any])
      
      inline def setDestroyTooltipOnHideUndefined: Self = StObject.set(x, "destroyTooltipOnHide", js.undefined)
      
      inline def setGetTooltipContainer(value: js.Function): Self = StObject.set(x, "getTooltipContainer", value.asInstanceOf[js.Any])
      
      inline def setGetTooltipContainerUndefined: Self = StObject.set(x, "getTooltipContainer", js.undefined)
      
      inline def setOnVisibleChange(value: js.Function): Self = StObject.set(x, "onVisibleChange", value.asInstanceOf[js.Any])
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setOverlay(value: ReactNode | js.Function): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      inline def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      inline def setOverlayStyle(value: js.Object): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setTrigger(value: js.Any): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
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
