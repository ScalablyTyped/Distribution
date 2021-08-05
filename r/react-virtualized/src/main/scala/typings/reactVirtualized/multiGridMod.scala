package typings.reactVirtualized

import typings.reactVirtualized.anon.ClassNameBottomLeftGrid
import typings.reactVirtualized.anon.ClassNameBottomRightGrid
import typings.reactVirtualized.esMultiGridMod.MultiGridProps
import typings.reactVirtualized.esMultiGridMod.MultiGridState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiGridMod {
  
  @JSImport("react-virtualized/dist/commonjs/MultiGrid", "MultiGrid")
  @js.native
  class MultiGrid protected ()
    extends typings.reactVirtualized.esMultiGridMod.MultiGrid {
    def this(props: MultiGridProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MultiGridProps, context: js.Any) = this()
  }
  /* static members */
  object MultiGrid {
    
    @JSImport("react-virtualized/dist/commonjs/MultiGrid", "MultiGrid")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/MultiGrid", "MultiGrid.defaultProps")
    @js.native
    def defaultProps: ClassNameBottomRightGrid = js.native
    inline def defaultProps_=(x: ClassNameBottomRightGrid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: MultiGridProps, prevState: MultiGridState): MultiGridState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[MultiGridState | Null]
    
    @JSImport("react-virtualized/dist/commonjs/MultiGrid", "MultiGrid.propTypes")
    @js.native
    def propTypes: ClassNameBottomLeftGrid = js.native
    inline def propTypes_=(x: ClassNameBottomLeftGrid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
