package typings.stormReactDiagrams.nodeWidgetMod

import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/widgets/NodeWidget", "NodeWidget")
@js.native
class NodeWidget protected () extends BaseWidget[NodeProps, NodeState] {
  def this(props: NodeProps) = this()
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MNodeWidget(): Boolean = js.native
}
