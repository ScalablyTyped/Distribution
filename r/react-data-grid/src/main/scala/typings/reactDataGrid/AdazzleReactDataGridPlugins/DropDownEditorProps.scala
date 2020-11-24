package typings.reactDataGrid.AdazzleReactDataGridPlugins

import typings.reactDataGrid.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDownEditorProps extends js.Object {
  
  var options: js.Array[String | Text] = js.native
}
object DropDownEditorProps {
  
  @scala.inline
  def apply(options: js.Array[String | Text]): DropDownEditorProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownEditorProps]
  }
  
  @scala.inline
  implicit class DropDownEditorPropsOps[Self <: DropDownEditorProps] (val x: Self) extends AnyVal {
    
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
    def setOptionsVarargs(value: (String | Text)*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[String | Text]): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
