package typings
package reactDashVirtualizedLib.distEsMasonryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/es/Masonry", "Masonry")
@js.native
class Masonry ()
  extends reactLib.reactMod.PureComponent[MasonryProps, MasonryState, js.Any] {
  def clearCellPositions(): scala.Unit = js.native
  // HACK This method signature was intended for Grid
  def invalidateCellSizeAfterRender(params: reactDashVirtualizedLib.Anon_RowIndex): scala.Unit = js.native
  def recomputeCellPositions(): scala.Unit = js.native
}

@JSImport("react-virtualized/dist/es/Masonry", "Masonry")
@js.native
object Masonry extends js.Object {
  var defaultProps: reactDashVirtualizedLib.Anon_TabIndex = js.native
  def getDerivedStateFromProps(
    nextProps: reactDashVirtualizedLib.distEsMasonryMod.MasonryProps,
    prevState: reactDashVirtualizedLib.distEsMasonryMod.MasonryState
  ): reactDashVirtualizedLib.distEsMasonryMod.MasonryState | scala.Null = js.native
}

