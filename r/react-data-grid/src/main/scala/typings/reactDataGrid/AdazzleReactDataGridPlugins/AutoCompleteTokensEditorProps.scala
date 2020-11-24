package typings.reactDataGrid.AdazzleReactDataGridPlugins

import typings.reactDataGrid.AdazzleReactDataGrid.ExcelColumn
import typings.reactDataGrid.anon.Caption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoCompleteTokensEditorProps extends js.Object {
  
  var column: js.UndefOr[ExcelColumn] = js.native
  
  var options: js.Array[String | Caption] = js.native
  
  var value: js.UndefOr[js.Array[_]] = js.native
}
object AutoCompleteTokensEditorProps {
  
  @scala.inline
  def apply(options: js.Array[String | Caption]): AutoCompleteTokensEditorProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteTokensEditorProps]
  }
  
  @scala.inline
  implicit class AutoCompleteTokensEditorPropsOps[Self <: AutoCompleteTokensEditorProps] (val x: Self) extends AnyVal {
    
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
    def setOptionsVarargs(value: (String | Caption)*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[String | Caption]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: ExcelColumn): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
