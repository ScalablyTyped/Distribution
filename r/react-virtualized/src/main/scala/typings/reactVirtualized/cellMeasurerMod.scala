package typings.reactVirtualized

import typings.reactVirtualized.esCellMeasurerMod.CellMeasurerCacheParams
import typings.reactVirtualized.esCellMeasurerMod.CellMeasurerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellMeasurerMod {
  
  @JSImport("react-virtualized/dist/commonjs/CellMeasurer", "CellMeasurer")
  @js.native
  class CellMeasurer protected ()
    extends typings.reactVirtualized.esCellMeasurerMod.CellMeasurer {
    def this(props: CellMeasurerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CellMeasurerProps, context: js.Any) = this()
  }
  
  @JSImport("react-virtualized/dist/commonjs/CellMeasurer", "CellMeasurerCache")
  @js.native
  class CellMeasurerCache ()
    extends typings.reactVirtualized.esCellMeasurerMod.CellMeasurerCache {
    def this(params: CellMeasurerCacheParams) = this()
  }
}
