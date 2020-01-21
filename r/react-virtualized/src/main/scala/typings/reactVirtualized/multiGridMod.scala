package typings.reactVirtualized

import typings.reactVirtualized.esMultiGridMod.MultiGridProps
import typings.reactVirtualized.esMultiGridMod.MultiGridState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/MultiGrid", JSImport.Namespace)
@js.native
object multiGridMod extends js.Object {
  @js.native
  class MultiGrid ()
    extends typings.reactVirtualized.esMultiGridMod.MultiGrid
  
  /* static members */
  @js.native
  object MultiGrid extends js.Object {
    var defaultProps: Anon = js.native
    var propTypes: AnonClassNameBottomLeftGrid = js.native
    def getDerivedStateFromProps(nextProps: MultiGridProps, prevState: MultiGridState): MultiGridState | Null = js.native
  }
  
}

