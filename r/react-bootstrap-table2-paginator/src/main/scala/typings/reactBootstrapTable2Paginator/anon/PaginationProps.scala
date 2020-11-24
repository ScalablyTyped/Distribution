package typings.reactBootstrapTable2Paginator.anon

import typings.reactBootstrapTable2Paginator.mod.PaginationChildProps
import typings.reactBootstrapTableNext.mod.BootstrapTableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationProps extends js.Object {
  
  var paginationProps: PaginationChildProps = js.native
  
  var paginationTableProps: BootstrapTableProps[_, Double] = js.native
}
object PaginationProps {
  
  @scala.inline
  def apply(paginationProps: PaginationChildProps, paginationTableProps: BootstrapTableProps[_, Double]): PaginationProps = {
    val __obj = js.Dynamic.literal(paginationProps = paginationProps.asInstanceOf[js.Any], paginationTableProps = paginationTableProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
  
  @scala.inline
  implicit class PaginationPropsOps[Self <: PaginationProps] (val x: Self) extends AnyVal {
    
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
    def setPaginationProps(value: PaginationChildProps): Self = this.set("paginationProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationTableProps(value: BootstrapTableProps[_, Double]): Self = this.set("paginationTableProps", value.asInstanceOf[js.Any])
  }
}
