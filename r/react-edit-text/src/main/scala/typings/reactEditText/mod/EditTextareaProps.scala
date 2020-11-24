package typings.reactEditText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditTextareaProps extends SharedProps {
  
  /**
    * the number of visible rows,
    * default: 3
    */
  var rows: js.UndefOr[Double] = js.native
}
object EditTextareaProps {
  
  @scala.inline
  def apply(): EditTextareaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditTextareaProps]
  }
  
  @scala.inline
  implicit class EditTextareaPropsOps[Self <: EditTextareaProps] (val x: Self) extends AnyVal {
    
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
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
}
