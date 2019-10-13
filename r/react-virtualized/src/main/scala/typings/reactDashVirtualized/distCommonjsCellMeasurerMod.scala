package typings.reactDashVirtualized

import typings.react.reactMod.Component
import typings.reactDashVirtualized.distEsCellMeasurerMod.CellMeasurerCacheParams
import typings.reactDashVirtualized.distEsCellMeasurerMod.CellMeasurerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-virtualized/dist/commonjs/CellMeasurer", JSImport.Namespace)
@js.native
object distCommonjsCellMeasurerMod extends js.Object {
  @js.native
  class CellMeasurer ()
    extends Component[CellMeasurerProps, js.Object, js.Any]
  
  @js.native
  class CellMeasurerCache ()
    extends typings.reactDashVirtualized.distEsCellMeasurerMod.CellMeasurerCache {
    def this(params: CellMeasurerCacheParams) = this()
  }
  
}

