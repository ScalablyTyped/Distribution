package typings.rcCollapse

import typings.rcCollapse.anon.ForceRender
import typings.rcCollapse.interfaceMod.CollapsePanelProps
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-collapse/es/Panel", JSImport.Namespace)
@js.native
object panelMod extends js.Object {
  
  @js.native
  trait CollapsePanel
    extends Component[CollapsePanelProps, js.Any, js.Any] {
    
    def handleItemClick(): Unit = js.native
    
    def handleKeyPress(e: KeyboardEvent[Element]): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MCollapsePanel(nextProps: CollapsePanelProps): Boolean = js.native
  }
  
  @js.native
  class default () extends CollapsePanel
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: ForceRender = js.native
  }
}
