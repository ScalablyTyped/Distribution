package typings.reactDashVirtualized.distEsMasonryMod

import typings.react.reactMod.PureComponent
import typings.reactDashVirtualized.Anon_0150
import typings.reactDashVirtualized.Anon_RowIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/Masonry", "Masonry")
@js.native
class Masonry ()
  extends PureComponent[MasonryProps, MasonryState, js.Any] {
  def clearCellPositions(): Unit = js.native
  // HACK This method signature was intended for Grid
  def invalidateCellSizeAfterRender(params: Anon_RowIndex): Unit = js.native
  def recomputeCellPositions(): Unit = js.native
}

/* static members */
@JSImport("react-virtualized/dist/es/Masonry", "Masonry")
@js.native
object Masonry extends js.Object {
  var defaultProps: Anon_0150 = js.native
  def getDerivedStateFromProps(nextProps: MasonryProps, prevState: MasonryState): MasonryState | Null = js.native
}

