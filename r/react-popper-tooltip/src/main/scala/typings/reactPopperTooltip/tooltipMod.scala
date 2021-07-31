package typings.reactPopperTooltip

import typings.react.mod.Component
import typings.react.mod.Context
import typings.reactPopperTooltip.typesMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("react-popper-tooltip/dist/Tooltip", JSImport.Default)
  @js.native
  class default () extends Tooltip
  object default {
    
    @JSImport("react-popper-tooltip/dist/Tooltip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-popper-tooltip/dist/Tooltip", "default.contextType")
    @js.native
    def contextType: Context[js.Object] = js.native
    @scala.inline
    def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Tooltip
    extends Component[TooltipProps, js.Object, js.Any] {
    
    var addOutsideClickHandler: js.Any = js.native
    
    var addOutsideRightClickHandler: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTooltip(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTooltip(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTooltip(): Unit = js.native
    
    var contextValue: js.Any = js.native
    
    var getArrowProps: js.Any = js.native
    
    var getTooltipProps: js.Any = js.native
    
    var getTooltipRef: js.Any = js.native
    
    var handleOutsideClick: js.Any = js.native
    
    var handleOutsideRightClick: js.Any = js.native
    
    var isTriggeredBy: js.Any = js.native
    
    var observer: js.Any = js.native
    
    var removeOutsideClickHandler: js.Any = js.native
    
    var removeOutsideRightClickHandler: js.Any = js.native
    
    var tooltipRef: js.Any = js.native
  }
}
