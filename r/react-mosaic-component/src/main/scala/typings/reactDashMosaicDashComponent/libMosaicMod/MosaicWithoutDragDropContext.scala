package typings.reactDashMosaicDashComponent.libMosaicMod

import typings.react.reactMod.Component
import typings.reactDashMosaicDashComponent.Anon_ClassName
import typings.reactDashMosaicDashComponent.libTypesMod.MosaicKey
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/Mosaic", "MosaicWithoutDragDropContext")
@js.native
class MosaicWithoutDragDropContext[T /* <: MosaicKey */] ()
  extends Component[MosaicProps[T], MosaicState[T], js.Any] {
  var actions: js.Any = js.native
  val childContext: js.Any = js.native
  var getRoot: js.Any = js.native
  var renderTree: js.Any = js.native
  var replaceRoot: js.Any = js.native
  var updateRoot: js.Any = js.native
  var validateTree: js.Any = js.native
}

/* static members */
@JSImport("react-mosaic-component/lib/Mosaic", "MosaicWithoutDragDropContext")
@js.native
object MosaicWithoutDragDropContext extends js.Object {
  var defaultProps: Anon_ClassName = js.native
  def getDerivedStateFromProps(nextProps: MosaicProps[MosaicKey], prevState: MosaicState[MosaicKey]): Partial[MosaicState[MosaicKey]] | Null = js.native
}

