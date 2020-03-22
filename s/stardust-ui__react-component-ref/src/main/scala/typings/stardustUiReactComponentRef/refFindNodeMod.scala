package typings.stardustUiReactComponentRef

import typings.react.mod.Component
import typings.stardustUiReactComponentRef.typesMod.RefProps
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@stardust-ui/react-component-ref/dist/es/RefFindNode", JSImport.Namespace)
@js.native
object refFindNodeMod extends js.Object {
  @js.native
  trait RefFindNode
    extends Component[RefProps, js.Object, js.Any] {
    var prevNode: Node | Null = js.native
    @JSName("componentDidMount")
    def componentDidMount_MRefFindNode(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MRefFindNode(prevProps: RefProps): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MRefFindNode(): Unit = js.native
  }
  
  @js.native
  class default () extends RefFindNode
  
  /* static members */
  @js.native
  object default extends js.Object {
    var displayName: String = js.native
    var propTypes: AnonChildren | AnonInnerRef = js.native
  }
  
}

