package typings.atStardustDashUiReactDashComponentDashRef.distEsRefFindNodeMod

import typings.atStardustDashUiReactDashComponentDashRef.distEsTypesMod.RefProps
import typings.react.reactMod.Component
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

