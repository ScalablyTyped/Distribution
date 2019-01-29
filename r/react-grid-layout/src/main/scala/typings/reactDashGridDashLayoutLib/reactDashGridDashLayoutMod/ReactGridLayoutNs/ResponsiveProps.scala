package typings
package reactDashGridDashLayoutLib.reactDashGridDashLayoutMod.ReactGridLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveProps extends CoreProps {
  /**
    * `{name: pxVal}, e.g. {lg: 1200, md: 996, sm: 768, xs: 480}`
    *
    * Breakpoint names are arbitrary but must match in the cols and layouts objects.
    */
  var breakpoints: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  /**
    * Number of cols. This is a breakpoint -> cols map, e.g. `{lg: 12, md: 10, ...}`.
    */
  var cols: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  /**
    * layouts is an object mapping breakpoints to layouts.
    *
    * e.g. `{lg: Layout[], md: Layout[], ...}`
    */
  var layouts: js.UndefOr[Layouts] = js.undefined
  /**
    * Calls back with breakpoint and new number pf cols.
    */
  var onBreakpointChange: js.UndefOr[
    js.Function2[/* newBreakpoint */ java.lang.String, /* newCols */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
    * Callback so you can save the layout.
    */
  var onLayoutChange: js.UndefOr[js.Function2[/* currentLayout */ Layout, /* allLayouts */ Layouts, scala.Unit]] = js.undefined
  /**
    * Callback when the width changes, so you can modify the layout as needed.
    */
  var onWidthChange: js.UndefOr[
    js.Function4[
      /* containerWidth */ scala.Double, 
      /* margin */ js.Tuple2[scala.Double, scala.Double], 
      /* cols */ scala.Double, 
      /* containerPadding */ js.Tuple2[scala.Double, scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
}

