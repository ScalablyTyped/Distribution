package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandedColumnHeaderProps extends js.Object {
  
  var anyExpand: Boolean = js.native
}
object ExpandedColumnHeaderProps {
  
  @scala.inline
  def apply(anyExpand: Boolean): ExpandedColumnHeaderProps = {
    val __obj = js.Dynamic.literal(anyExpand = anyExpand.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandedColumnHeaderProps]
  }
  
  @scala.inline
  implicit class ExpandedColumnHeaderPropsOps[Self <: ExpandedColumnHeaderProps] (val x: Self) extends AnyVal {
    
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
    def setAnyExpand(value: Boolean): Self = this.set("anyExpand", value.asInstanceOf[js.Any])
  }
}
