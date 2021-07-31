package typings.reactVirtualized.esGridMod

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridCellProps extends StObject {
  
  var columnIndex: Double
  
  var isScrolling: Boolean
  
  var isVisible: Boolean
  
  var key: String
  
  var parent: (Component[GridCoreProps, js.Object, js.Any]) & MeasuredCellParent
  
  var rowIndex: Double
  
  var style: CSSProperties
}
object GridCellProps {
  
  @scala.inline
  def apply(
    columnIndex: Double,
    isScrolling: Boolean,
    isVisible: Boolean,
    key: String,
    parent: (Component[GridCoreProps, js.Object, js.Any]) & MeasuredCellParent,
    rowIndex: Double,
    style: CSSProperties
  ): GridCellProps = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridCellProps]
  }
  
  @scala.inline
  implicit class GridCellPropsMutableBuilder[Self <: GridCellProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: (Component[GridCoreProps, js.Object, js.Any]) & MeasuredCellParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
