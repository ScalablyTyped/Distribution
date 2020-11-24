package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandColumnComponentProps extends js.Object {
  
  /**
    * True if the current row is able to be expanded.
    */
  var isExpandableRow: Boolean = js.native
  
  /**
    * True if the current row is currently expanded.
    */
  var isExpanded: Boolean = js.native
}
object ExpandColumnComponentProps {
  
  @scala.inline
  def apply(isExpandableRow: Boolean, isExpanded: Boolean): ExpandColumnComponentProps = {
    val __obj = js.Dynamic.literal(isExpandableRow = isExpandableRow.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandColumnComponentProps]
  }
  
  @scala.inline
  implicit class ExpandColumnComponentPropsOps[Self <: ExpandColumnComponentProps] (val x: Self) extends AnyVal {
    
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
    def setIsExpandableRow(value: Boolean): Self = this.set("isExpandableRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
  }
}
