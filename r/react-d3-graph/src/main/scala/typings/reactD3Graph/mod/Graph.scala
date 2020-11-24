package typings.reactD3Graph.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-d3-graph", "Graph")
@js.native
class Graph[N /* <: GraphNode */, L /* <: GraphLink */] protected ()
  extends Component[GraphProps[N, L], js.Any, js.Any] {
  def this(props: GraphProps[N, L], args: js.Any*) = this()
  
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MGraph(nextProps: js.Any): js.Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MGraph(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MGraph(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MGraph(): Unit = js.native
}
