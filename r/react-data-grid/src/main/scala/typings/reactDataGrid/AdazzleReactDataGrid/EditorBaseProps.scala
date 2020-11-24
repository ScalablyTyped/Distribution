package typings.reactDataGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorBaseProps extends js.Object {
  
  var column: ExcelColumn = js.native
  
  var height: Double = js.native
  
  def onBlur(): Unit = js.native
  
  def onCommit(): Unit = js.native
  
  def onCommitCancel(): Unit = js.native
  
  var rowData: js.Any = js.native
  
  var rowMetaData: js.Any = js.native
  
  var value: js.Any = js.native
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
  implicit class EditorBasePropsOps[Self <: EditorBaseProps] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: ExcelColumn): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCommit(value: () => Unit): Self = this.set("onCommit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCommitCancel(value: () => Unit): Self = this.set("onCommitCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRowData(value: js.Any): Self = this.set("rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowMetaData(value: js.Any): Self = this.set("rowMetaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
