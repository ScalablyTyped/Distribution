package typings.reactDashVirtualized

import typings.reactDashVirtualized.distEsMasonryMod.MasonryProps
import typings.reactDashVirtualized.distEsMasonryMod.MasonryState
import typings.reactDashVirtualized.distEsMasonryMod.Positioner
import typings.reactDashVirtualized.distEsMasonryMod.createCellPositionerParams
import typings.reactDashVirtualized.reactDashVirtualizedNumbers.`150`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/Masonry", JSImport.Namespace)
@js.native
object distCommonjsMasonryMod extends js.Object {
  @js.native
  class Masonry ()
    extends typings.reactDashVirtualized.distEsMasonryMod.Masonry
  
  val DEFAULT_SCROLLING_RESET_TIME_INTERVAL: `150` = js.native
  def createCellPositioner(params: createCellPositionerParams): Positioner = js.native
  /* static members */
  @js.native
  object Masonry extends js.Object {
    var defaultProps: Anon_0150 = js.native
    def getDerivedStateFromProps(nextProps: MasonryProps, prevState: MasonryState): MasonryState | Null = js.native
  }
  
}

