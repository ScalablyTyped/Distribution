package typings.reactVirtualized

import typings.reactVirtualized.esMasonryMod.MasonryProps
import typings.reactVirtualized.esMasonryMod.MasonryState
import typings.reactVirtualized.esMasonryMod.Positioner
import typings.reactVirtualized.esMasonryMod.createCellPositionerParams
import typings.reactVirtualized.reactVirtualizedNumbers.`150`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/Masonry", JSImport.Namespace)
@js.native
object masonryMod extends js.Object {
  @js.native
  class Masonry ()
    extends typings.reactVirtualized.esMasonryMod.Masonry
  
  val DEFAULT_SCROLLING_RESET_TIME_INTERVAL: `150` = js.native
  def createCellPositioner(params: createCellPositionerParams): Positioner = js.native
  /* static members */
  @js.native
  object Masonry extends js.Object {
    var defaultProps: Anon0150 = js.native
    def getDerivedStateFromProps(nextProps: MasonryProps, prevState: MasonryState): MasonryState | Null = js.native
  }
  
}

