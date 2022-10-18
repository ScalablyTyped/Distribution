package typings.reactPopperTooltip

import typings.react.mod.Component
import typings.react.mod.Context
import typings.reactPopperTooltip.distTypesMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTooltipMod {
  
  @JSImport("react-popper-tooltip/dist/Tooltip", JSImport.Default)
  @js.native
  open class default () extends Tooltip
  object default {
    
    @JSImport("react-popper-tooltip/dist/Tooltip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-popper-tooltip/dist/Tooltip", "default.contextType")
    @js.native
    def contextType: Context[js.Object] = js.native
    inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Tooltip
    extends Component[TooltipProps, js.Object, Any] {
    
    /* private */ var addOutsideClickHandler: Any = js.native
    
    /* private */ var addOutsideRightClickHandler: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTooltip(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTooltip(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTooltip(): Unit = js.native
    
    /* private */ var contextValue: Any = js.native
    
    /* private */ var getArrowProps: Any = js.native
    
    /* private */ var getTooltipProps: Any = js.native
    
    /* private */ var getTooltipRef: Any = js.native
    
    /* private */ var handleOutsideClick: Any = js.native
    
    /* private */ var handleOutsideRightClick: Any = js.native
    
    /* private */ var isTriggeredBy: Any = js.native
    
    /* private */ var observer: Any = js.native
    
    /* private */ var removeOutsideClickHandler: Any = js.native
    
    /* private */ var removeOutsideRightClickHandler: Any = js.native
    
    /* private */ var tooltipRef: Any = js.native
  }
}
