package typings.reactGridLayout.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponsiveProps extends CoreProps {
  /**
    * `{name: pxVal}, e.g. {lg: 1200, md: 996, sm: 768, xs: 480}`
    *
    * Breakpoint names are arbitrary but must match in the cols and layouts objects.
    */
  var breakpoints: js.UndefOr[StringDictionary[Double]] = js.native
  /**
    * Number of cols. This is a breakpoint -> cols map, e.g. `{lg: 12, md: 10, ...}`.
    */
  var cols: js.UndefOr[StringDictionary[Double]] = js.native
  /**
    * Padding inside the container in px and formatt [x, y] or { breakpoint: [x, y] }.
    */
  var containerPadding: js.UndefOr[(js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])] = js.native
  /**
    * layouts is an object mapping breakpoints to layouts.
    *
    * e.g. `{lg: Layout[], md: Layout[], ...}`
    */
  var layouts: js.UndefOr[Layouts] = js.native
  /**
    * Margin between items in px and formatt [x, y] or { breakpoint: [x, y] }.
    */
  var margin: js.UndefOr[(js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])] = js.native
  /**
    * Calls back with breakpoint and new number pf cols.
    */
  var onBreakpointChange: js.UndefOr[js.Function2[/* newBreakpoint */ String, /* newCols */ Double, Unit]] = js.native
  /**
    * Callback so you can save the layout.
    */
  var onLayoutChange: js.UndefOr[
    js.Function2[/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts, Unit]
  ] = js.native
  /**
    * Callback when the width changes, so you can modify the layout as needed.
    */
  var onWidthChange: js.UndefOr[
    js.Function4[
      /* containerWidth */ Double, 
      /* margin */ js.Tuple2[Double, Double], 
      /* cols */ Double, 
      /* containerPadding */ js.Tuple2[Double, Double], 
      Unit
    ]
  ] = js.native
}

object ResponsiveProps {
  @scala.inline
  def apply(): ResponsiveProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveProps]
  }
  @scala.inline
  implicit class ResponsivePropsOps[Self <: ResponsiveProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBreakpoints(value: StringDictionary[Double]): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakpoints: Self = this.set("breakpoints", js.undefined)
    @scala.inline
    def setCols(value: StringDictionary[Double]): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    @scala.inline
    def setContainerPadding(value: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])): Self = this.set("containerPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerPadding: Self = this.set("containerPadding", js.undefined)
    @scala.inline
    def setLayouts(value: Layouts): Self = this.set("layouts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayouts: Self = this.set("layouts", js.undefined)
    @scala.inline
    def setMargin(value: (js.Tuple2[Double, Double]) | (StringDictionary[js.Tuple2[Double, Double]])): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOnBreakpointChange(value: (/* newBreakpoint */ String, /* newCols */ Double) => Unit): Self = this.set("onBreakpointChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBreakpointChange: Self = this.set("onBreakpointChange", js.undefined)
    @scala.inline
    def setOnLayoutChange(value: (/* currentLayout */ js.Array[Layout], /* allLayouts */ Layouts) => Unit): Self = this.set("onLayoutChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLayoutChange: Self = this.set("onLayoutChange", js.undefined)
    @scala.inline
    def setOnWidthChange(
      value: (/* containerWidth */ Double, /* margin */ js.Tuple2[Double, Double], /* cols */ Double, /* containerPadding */ js.Tuple2[Double, Double]) => Unit
    ): Self = this.set("onWidthChange", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnWidthChange: Self = this.set("onWidthChange", js.undefined)
  }
  
}

