package typings.reactVirtualized.anon

import typings.react.mod.CSSProperties
import typings.react.mod.Requireable
import typings.react.mod.Validator
import typings.reactVirtualized.esTableMod.TableCellDataGetter
import typings.reactVirtualized.esTableMod.TableCellRenderer
import typings.reactVirtualized.esTableMod.TableHeaderRowRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellDataGetter extends StObject {
  
  var `aria-label`: Requireable[String]
  
  var cellDataGetter: Requireable[TableCellDataGetter]
  
  var cellRenderer: Requireable[TableCellRenderer]
  
  var className: Requireable[String]
  
  var columnData: Requireable[js.Object]
  
  var dataKey: Validator[String]
  
  var disableSort: Requireable[Boolean]
  
  var flexGrow: Requireable[Double]
  
  var flexShrink: Requireable[Double]
  
  var headerClassName: Requireable[String]
  
  var headerRenderer: Validator[TableHeaderRowRenderer]
  
  var id: Requireable[String]
  
  var label: Requireable[String]
  
  var maxWidth: Requireable[Double]
  
  var minWidth: Requireable[Double]
  
  var style: Requireable[CSSProperties]
  
  var width: Validator[Double]
}
object CellDataGetter {
  
  @scala.inline
  def apply(
    `aria-label`: Requireable[String],
    cellDataGetter: Requireable[TableCellDataGetter],
    cellRenderer: Requireable[TableCellRenderer],
    className: Requireable[String],
    columnData: Requireable[js.Object],
    dataKey: Validator[String],
    disableSort: Requireable[Boolean],
    flexGrow: Requireable[Double],
    flexShrink: Requireable[Double],
    headerClassName: Requireable[String],
    headerRenderer: Validator[TableHeaderRowRenderer],
    id: Requireable[String],
    label: Requireable[String],
    maxWidth: Requireable[Double],
    minWidth: Requireable[Double],
    style: Requireable[CSSProperties],
    width: Validator[Double]
  ): CellDataGetter = {
    val __obj = js.Dynamic.literal(cellDataGetter = cellDataGetter.asInstanceOf[js.Any], cellRenderer = cellRenderer.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], columnData = columnData.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], disableSort = disableSort.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any], flexShrink = flexShrink.asInstanceOf[js.Any], headerClassName = headerClassName.asInstanceOf[js.Any], headerRenderer = headerRenderer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellDataGetter]
  }
  
  @scala.inline
  implicit class CellDataGetterMutableBuilder[Self <: CellDataGetter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAria-label`(value: Requireable[String]): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellDataGetter(value: Requireable[TableCellDataGetter]): Self = StObject.set(x, "cellDataGetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellRenderer(value: Requireable[TableCellRenderer]): Self = StObject.set(x, "cellRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: Requireable[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnData(value: Requireable[js.Object]): Self = StObject.set(x, "columnData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataKey(value: Validator[String]): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSort(value: Requireable[Boolean]): Self = StObject.set(x, "disableSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexGrow(value: Requireable[Double]): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexShrink(value: Requireable[Double]): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderClassName(value: Requireable[String]): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderRenderer(value: Validator[TableHeaderRowRenderer]): Self = StObject.set(x, "headerRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Requireable[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Requireable[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: Requireable[Double]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidth(value: Requireable[Double]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Requireable[CSSProperties]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Validator[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
