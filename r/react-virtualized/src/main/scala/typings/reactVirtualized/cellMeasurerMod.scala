package typings.reactVirtualized

import typings.react.mod.Component
import typings.reactVirtualized.esCellMeasurerMod.CellMeasurerCacheParams
import typings.reactVirtualized.esCellMeasurerMod.CellMeasurerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/CellMeasurer", JSImport.Namespace)
@js.native
object cellMeasurerMod extends js.Object {
  @js.native
  class CellMeasurer ()
    extends Component[CellMeasurerProps, js.Object, js.Any]
  
  @js.native
  class CellMeasurerCache ()
    extends typings.reactVirtualized.esCellMeasurerMod.CellMeasurerCache {
    def this(params: CellMeasurerCacheParams) = this()
  }
  
}

