package typings.reactMdTooltip

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipHoverModeConfigMod {
  
  object TooltipHoverModeConfig {
    
    inline def apply(hasDefaultDelayDelayTimeoutEnabledChildren: TooltipHoverModeConfigProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasDefaultDelayDelayTimeoutEnabledChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/tooltip/types/TooltipHoverModeConfig", "TooltipHoverModeConfig")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/tooltip/types/TooltipHoverModeConfig", "TooltipHoverModeConfig.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/tooltip/types/TooltipHoverModeConfig", "TooltipHoverModeConfig.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/TooltipHoverModeConfig", "TooltipHoverModeConfig.propTypes.defaultDelay")
      @js.native
      def defaultDelay: js.Any = js.native
      inline def defaultDelay_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/TooltipHoverModeConfig", "TooltipHoverModeConfig.propTypes.delayTimeout")
      @js.native
      def delayTimeout: js.Any = js.native
      inline def delayTimeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delayTimeout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/tooltip/types/TooltipHoverModeConfig", "TooltipHoverModeConfig.propTypes.enabled")
      @js.native
      def enabled: js.Any = js.native
      inline def enabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
    }
  }
  
  trait TooltipHoverModeConfigProps extends StObject {
    
    var children: ReactNode
    
    var defaultDelay: js.UndefOr[Double] = js.undefined
    
    var delayTimeout: js.UndefOr[Double] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
  }
  object TooltipHoverModeConfigProps {
    
    inline def apply(): TooltipHoverModeConfigProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipHoverModeConfigProps]
    }
    
    extension [Self <: TooltipHoverModeConfigProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultDelay(value: Double): Self = StObject.set(x, "defaultDelay", value.asInstanceOf[js.Any])
      
      inline def setDefaultDelayUndefined: Self = StObject.set(x, "defaultDelay", js.undefined)
      
      inline def setDelayTimeout(value: Double): Self = StObject.set(x, "delayTimeout", value.asInstanceOf[js.Any])
      
      inline def setDelayTimeoutUndefined: Self = StObject.set(x, "delayTimeout", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
}
