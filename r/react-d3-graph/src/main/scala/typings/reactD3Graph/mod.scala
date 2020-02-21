package typings.reactD3Graph

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-d3-graph", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Graph protected ()
    extends Component[js.Any, js.Any, js.Any] {
    def this(props: js.Any, args: js.Any*) = this()
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MGraph(nextProps: js.Any): js.Any = js.native
    @JSName("componentDidMount")
    def componentDidMount_MGraph(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MGraph(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MGraph(): Unit = js.native
  }
  
  @js.native
  class Link protected ()
    extends Component[js.Any, js.Any, js.Any] {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class Node protected ()
    extends Component[js.Any, js.Any, js.Any] {
    def this(args: js.Any*) = this()
  }
  
}

