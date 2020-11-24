package typings.rbx.tableTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableModifierProps extends js.Object {
  
  var bordered: js.UndefOr[Boolean] = js.native
  
  var fullwidth: js.UndefOr[Boolean] = js.native
  
  var hoverable: js.UndefOr[Boolean] = js.native
  
  var narrow: js.UndefOr[Boolean] = js.native
  
  var striped: js.UndefOr[Boolean] = js.native
}
object TableModifierProps {
  
  @scala.inline
  def apply(): TableModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableModifierProps]
  }
  
  @scala.inline
  implicit class TableModifierPropsOps[Self <: TableModifierProps] (val x: Self) extends AnyVal {
    
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
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    
    @scala.inline
    def setFullwidth(value: Boolean): Self = this.set("fullwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullwidth: Self = this.set("fullwidth", js.undefined)
    
    @scala.inline
    def setHoverable(value: Boolean): Self = this.set("hoverable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverable: Self = this.set("hoverable", js.undefined)
    
    @scala.inline
    def setNarrow(value: Boolean): Self = this.set("narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNarrow: Self = this.set("narrow", js.undefined)
    
    @scala.inline
    def setStriped(value: Boolean): Self = this.set("striped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStriped: Self = this.set("striped", js.undefined)
  }
}
