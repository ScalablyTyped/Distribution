package typings.rcCollapse

import org.scalablytyped.runtime.Instantiable0
import typings.rcCollapse.anon.Accordion
import typings.rcCollapse.anon.ForceRender
import typings.rcCollapse.anon.PartialCollapseState
import typings.rcCollapse.anon.TypeofCollapsePanel
import typings.rcCollapse.interfaceMod.CollapseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-collapse", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Panel ()
    extends typings.rcCollapse.panelMod.default
  @js.native
  object Panel
    extends Instantiable0[typings.rcCollapse.panelMod.default] {
    
    var defaultProps: ForceRender = js.native
  }
  
  @js.native
  class default protected ()
    extends typings.rcCollapse.collapseMod.default {
    def this(props: CollapseProps) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var Panel: TypeofCollapsePanel = js.native
    
    var defaultProps: Accordion = js.native
    
    def getDerivedStateFromProps(nextProps: CollapseProps): PartialCollapseState = js.native
  }
}
