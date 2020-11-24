package typings.rcCollapse.collapseMod

import typings.rcCollapse.anon.Accordion
import typings.rcCollapse.anon.PartialCollapseState
import typings.rcCollapse.anon.TypeofCollapsePanel
import typings.rcCollapse.interfaceMod.CollapseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-collapse/es/Collapse", JSImport.Default)
@js.native
class default protected () extends Collapse {
  def this(props: CollapseProps) = this()
}
/* static members */
@JSImport("rc-collapse/es/Collapse", JSImport.Default)
@js.native
object default extends js.Object {
  
  var Panel: TypeofCollapsePanel = js.native
  
  var defaultProps: Accordion = js.native
  
  def getDerivedStateFromProps(nextProps: CollapseProps): PartialCollapseState = js.native
}
