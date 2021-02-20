package typings.reactVirtualized

import typings.reactVirtualized.anon.Ariareadonly
import typings.reactVirtualized.esGridMod.GridCellRangeRenderer
import typings.reactVirtualized.esGridMod.GridProps
import typings.reactVirtualized.esGridMod.OverscanIndicesGetter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  @JSImport("react-virtualized/dist/commonjs/Grid", "DEFAULT_SCROLLING_RESET_TIME_INTERVAL")
  @js.native
  val DEFAULT_SCROLLING_RESET_TIME_INTERVAL: /* 150 */ Double = js.native
  
  @JSImport("react-virtualized/dist/commonjs/Grid", "Grid")
  @js.native
  class Grid protected ()
    extends typings.reactVirtualized.esGridMod.Grid {
    def this(props: GridProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GridProps, context: js.Any) = this()
  }
  /* static members */
  object Grid {
    
    @JSImport("react-virtualized/dist/commonjs/Grid", "Grid")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/Grid", "Grid.defaultProps")
    @js.native
    def defaultProps: Ariareadonly = js.native
    @scala.inline
    def defaultProps_=(x: Ariareadonly): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-virtualized/dist/commonjs/Grid", "accessibilityOverscanIndicesGetter")
  @js.native
  val accessibilityOverscanIndicesGetter: OverscanIndicesGetter = js.native
  
  @JSImport("react-virtualized/dist/commonjs/Grid", "defaultCellRangeRenderer")
  @js.native
  val defaultCellRangeRenderer: GridCellRangeRenderer = js.native
  
  @JSImport("react-virtualized/dist/commonjs/Grid", "defaultOverscanIndicesGetter")
  @js.native
  val defaultOverscanIndicesGetter: OverscanIndicesGetter = js.native
}
