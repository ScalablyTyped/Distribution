package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorBaseProps extends StObject {
  
  var column: ExcelColumn
  
  var height: Double
  
  def onBlur(): Unit
  
  def onCommit(): Unit
  
  def onCommitCancel(): Unit
  
  var rowData: js.Any
  
  var rowMetaData: js.Any
  
  var value: js.Any
}
object EditorBaseProps {
  
  @scala.inline
  def apply(
    column: ExcelColumn,
    height: Double,
    onBlur: () => Unit,
    onCommit: () => Unit,
    onCommitCancel: () => Unit,
    rowData: js.Any,
    rowMetaData: js.Any,
    value: js.Any
  ): EditorBaseProps = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onCommit = js.Any.fromFunction0(onCommit), onCommitCancel = js.Any.fromFunction0(onCommitCancel), rowData = rowData.asInstanceOf[js.Any], rowMetaData = rowMetaData.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorBaseProps]
  }
  
  @scala.inline
  implicit class EditorBasePropsMutableBuilder[Self <: EditorBaseProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: ExcelColumn): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCommit(value: () => Unit): Self = StObject.set(x, "onCommit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCommitCancel(value: () => Unit): Self = StObject.set(x, "onCommitCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRowData(value: js.Any): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowMetaData(value: js.Any): Self = StObject.set(x, "rowMetaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
