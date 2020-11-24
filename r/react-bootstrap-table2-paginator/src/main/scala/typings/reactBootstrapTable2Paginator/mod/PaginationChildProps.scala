package typings.reactBootstrapTable2Paginator.mod

import typings.reactBootstrapTableNext.mod.PaginationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationChildProps extends PaginationOptions {
  
  var bootstrap4: js.UndefOr[Boolean] = js.native
  
  var tableId: js.UndefOr[String] = js.native
}
object PaginationChildProps {
  
  @scala.inline
  def apply(): PaginationChildProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationChildProps]
  }
  
  @scala.inline
  implicit class PaginationChildPropsOps[Self <: PaginationChildProps] (val x: Self) extends AnyVal {
    
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
    def setBootstrap4(value: Boolean): Self = this.set("bootstrap4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrap4: Self = this.set("bootstrap4", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = this.set("tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableId: Self = this.set("tableId", js.undefined)
  }
}
