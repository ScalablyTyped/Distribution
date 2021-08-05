package typings.reactMd.mod

import typings.react.mod.ReactElement
import typings.reactMdTooltip.tooltipHoverModeConfigMod.TooltipHoverModeConfigProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TooltipHoverModeConfig {
  
  inline def apply(hasDefaultDelayDelayTimeoutEnabledChildren: TooltipHoverModeConfigProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasDefaultDelayDelayTimeoutEnabledChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("react-md", "TooltipHoverModeConfig")
  @js.native
  val ^ : js.Any = js.native
  
  object propTypes {
    
    @JSImport("react-md", "TooltipHoverModeConfig.propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-md", "TooltipHoverModeConfig.propTypes.children")
    @js.native
    def children: js.Any = js.native
    inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "TooltipHoverModeConfig.propTypes.defaultDelay")
    @js.native
    def defaultDelay: js.Any = js.native
    inline def defaultDelay_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDelay")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "TooltipHoverModeConfig.propTypes.delayTimeout")
    @js.native
    def delayTimeout: js.Any = js.native
    inline def delayTimeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delayTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "TooltipHoverModeConfig.propTypes.enabled")
    @js.native
    def enabled: js.Any = js.native
    inline def enabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
  }
}
