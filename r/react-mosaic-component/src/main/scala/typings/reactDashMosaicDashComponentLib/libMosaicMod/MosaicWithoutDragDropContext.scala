package typings
package reactDashMosaicDashComponentLib.libMosaicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mosaic-component/lib/Mosaic", "MosaicWithoutDragDropContext")
@js.native
class MosaicWithoutDragDropContext[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */] ()
  extends reactLib.reactMod.PureComponent[MosaicProps[T], MosaicState[T], js.Any] {
  var actions: js.Any = js.native
  val childContext: js.Any = js.native
  var getRoot: js.Any = js.native
  var renderTree: js.Any = js.native
  var replaceRoot: js.Any = js.native
  @JSName("state")
  var state_MosaicWithoutDragDropContext: MosaicState[T] = js.native
  var updateRoot: js.Any = js.native
  var validateTree: js.Any = js.native
  @JSName("componentWillMount")
  def componentWillMount_MMosaicWithoutDragDropContext(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MMosaicWithoutDragDropContext(nextProps: MosaicProps[T]): scala.Unit = js.native
  def getChildContext(): reactDashMosaicDashComponentLib.libContextTypesMod.MosaicContext[T] = js.native
}

/* static members */
@JSImport("react-mosaic-component/lib/Mosaic", "MosaicWithoutDragDropContext")
@js.native
object MosaicWithoutDragDropContext extends js.Object {
  var childContextTypes: reactDashMosaicDashComponentLib.Anon_MosaicActions = js.native
  var defaultProps: reactDashMosaicDashComponentLib.Anon_ClassName = js.native
  def ofType[T /* <: reactDashMosaicDashComponentLib.libTypesMod.MosaicKey */](): org.scalablytyped.runtime.Instantiable2[
    /* props */ reactDashMosaicDashComponentLib.libMosaicMod.MosaicProps[T], 
    /* context */ js.UndefOr[/* context */ js.Any], 
    reactDashMosaicDashComponentLib.libMosaicMod.MosaicWithoutDragDropContext[T]
  ] = js.native
}

