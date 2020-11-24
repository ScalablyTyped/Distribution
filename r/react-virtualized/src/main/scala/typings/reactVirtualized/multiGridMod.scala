package typings.reactVirtualized

import typings.reactVirtualized.anon.ClassNameBottomLeftGrid
import typings.reactVirtualized.anon.ClassNameBottomRightGrid
import typings.reactVirtualized.esMultiGridMod.MultiGridProps
import typings.reactVirtualized.esMultiGridMod.MultiGridState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/commonjs/MultiGrid", JSImport.Namespace)
@js.native
object multiGridMod extends js.Object {
  
  @js.native
  class MultiGrid ()
    extends typings.reactVirtualized.esMultiGridMod.MultiGrid
  /* static members */
  @js.native
  object MultiGrid extends js.Object {
    
    var defaultProps: ClassNameBottomRightGrid = js.native
    
    def getDerivedStateFromProps(nextProps: MultiGridProps, prevState: MultiGridState): MultiGridState | Null = js.native
    
    var propTypes: ClassNameBottomLeftGrid = js.native
  }
}
