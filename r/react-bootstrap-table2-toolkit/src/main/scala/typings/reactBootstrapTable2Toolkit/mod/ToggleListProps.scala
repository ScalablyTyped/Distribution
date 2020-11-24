package typings.reactBootstrapTable2Toolkit.mod

import typings.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToggleListProps extends js.Object {
  
  var btnClassName: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var columns: js.Array[ColumnDescription[_, _]] = js.native
  
  var contextual: js.UndefOr[String] = js.native
  
  def onColumnToggle(dataField: String): Unit = js.native
  
  /**
    * array of toggled columns
    */
  var toggles: js.Array[Boolean] = js.native
}
object ToggleListProps {
  
  @scala.inline
  def apply(
    columns: js.Array[ColumnDescription[_, _]],
    onColumnToggle: String => Unit,
    toggles: js.Array[Boolean]
  ): ToggleListProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnToggle = js.Any.fromFunction1(onColumnToggle), toggles = toggles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleListProps]
  }
  
  @scala.inline
  implicit class ToggleListPropsOps[Self <: ToggleListProps] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: (ColumnDescription[js.Any, js.Any])*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[ColumnDescription[_, _]]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnColumnToggle(value: String => Unit): Self = this.set("onColumnToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTogglesVarargs(value: Boolean*): Self = this.set("toggles", js.Array(value :_*))
    
    @scala.inline
    def setToggles(value: js.Array[Boolean]): Self = this.set("toggles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBtnClassName(value: String): Self = this.set("btnClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBtnClassName: Self = this.set("btnClassName", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContextual(value: String): Self = this.set("contextual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextual: Self = this.set("contextual", js.undefined)
  }
}
