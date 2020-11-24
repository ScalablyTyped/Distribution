package typings.reactStonecutter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonGridProps extends js.Object {
  
  /**
    * The angle unit. Affects transform-functions such as rotate. Default: 'deg'.
    */
  var angleUnit: js.UndefOr[AngleUnit] = js.native
  
  /**
    * Width of a single column, by default in px units. Required.
    */
  var columnWidth: Double = js.native
  
  /**
    * Number of columns. Required.
    * You can wrap the Grid component in the `makeResponsive` higher-order component to set this dynamically.
    */
  var columns: Double = js.native
  
  /**
    * Change the HTML tagName of the Grid element, for example to 'ul' or 'ol' for a list. Default: 'div'.
    */
  var component: js.UndefOr[String] = js.native
  
  /**
    * These allow you to change how items animate as they appear and disappear from the grid.
    * Supply functions that return objects with the opacity and transform values for an item's start and end states.
    * By default the item's scale and opacity go from 0 to 1 and back to 0 on exit
    */
  var enter: js.UndefOr[
    js.Function3[/* itemProps */ js.Array[_], /* gridProps */ js.Array[_], /* gridState */ js.Any, _]
  ] = js.native
  
  var entered: js.UndefOr[
    js.Function3[/* itemProps */ js.Array[_], /* gridProps */ js.Array[_], /* gridState */ js.Any, _]
  ] = js.native
  
  var exit: js.UndefOr[
    js.Function3[/* itemProps */ js.Array[_], /* gridProps */ js.Array[_], /* gridState */ js.Any, _]
  ] = js.native
  
  /**
    * Height of vertical space between items. Default: 0.
    */
  var gutterHeight: js.UndefOr[Double] = js.native
  
  /**
    * Width of space between columns. Default: 0.
    */
  var gutterWidth: js.UndefOr[Double] = js.native
  
  /**
    * Use one of the included layouts, or create your own. Defaults to a 'simple' layout with items of fixed height.
    */
  var layout: js.UndefOr[LayoutFunction] = js.native
  
  /**
    * The length unit used throughout.
    * Default: 'px'. Experimental.
    * You could try using 'em' or 'rem' and then adjust the font-size for a fluid layout,
    * but it may not work well with the measureItems and makeResponsive higher-order components.
    * `%` does not work well due to the way CSS transforms work.
    */
  var lengthUnit: js.UndefOr[LengthUnit] = js.native
  
  /**
    * The perspective distance used for 3D transforms.
    * If you are using a transform function like rotateX, use this to strengthen the effect.
    * Default is no perspective applied.
    */
  var perspective: js.UndefOr[Double] = js.native
}
object CommonGridProps {
  
  @scala.inline
  def apply(columnWidth: Double, columns: Double): CommonGridProps = {
    val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonGridProps]
  }
  
  @scala.inline
  implicit class CommonGridPropsOps[Self <: CommonGridProps] (val x: Self) extends AnyVal {
    
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
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUnit(value: AngleUnit): Self = this.set("angleUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleUnit: Self = this.set("angleUnit", js.undefined)
    
    @scala.inline
    def setComponent(value: String): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setEnter(value: (/* itemProps */ js.Array[_], /* gridProps */ js.Array[_], /* gridState */ js.Any) => _): Self = this.set("enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setEntered(value: (/* itemProps */ js.Array[_], /* gridProps */ js.Array[_], /* gridState */ js.Any) => _): Self = this.set("entered", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEntered: Self = this.set("entered", js.undefined)
    
    @scala.inline
    def setExit(value: (/* itemProps */ js.Array[_], /* gridProps */ js.Array[_], /* gridState */ js.Any) => _): Self = this.set("exit", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
    
    @scala.inline
    def setGutterHeight(value: Double): Self = this.set("gutterHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutterHeight: Self = this.set("gutterHeight", js.undefined)
    
    @scala.inline
    def setGutterWidth(value: Double): Self = this.set("gutterWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutterWidth: Self = this.set("gutterWidth", js.undefined)
    
    @scala.inline
    def setLayout(value: (/* itemProps */ js.Array[js.Any], /* gridProps */ js.Array[js.Any]) => Layout_): Self = this.set("layout", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setLengthUnit(value: LengthUnit): Self = this.set("lengthUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLengthUnit: Self = this.set("lengthUnit", js.undefined)
    
    @scala.inline
    def setPerspective(value: Double): Self = this.set("perspective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerspective: Self = this.set("perspective", js.undefined)
  }
}
