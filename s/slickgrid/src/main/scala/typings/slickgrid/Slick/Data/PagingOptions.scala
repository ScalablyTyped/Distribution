package typings.slickgrid.Slick.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagingOptions extends js.Object {
  
  var pageNum: js.UndefOr[Double] = js.native
  
  var pageSize: js.UndefOr[Double] = js.native
  
  var totalPages: js.UndefOr[Double] = js.native
  
  var totalRows: js.UndefOr[Double] = js.native
}
object PagingOptions {
  
  @scala.inline
  def apply(): PagingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PagingOptions]
  }
  
  @scala.inline
  implicit class PagingOptionsOps[Self <: PagingOptions] (val x: Self) extends AnyVal {
    
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
    def setPageNum(value: Double): Self = this.set("pageNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageNum: Self = this.set("pageNum", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setTotalPages(value: Double): Self = this.set("totalPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalPages: Self = this.set("totalPages", js.undefined)
    
    @scala.inline
    def setTotalRows(value: Double): Self = this.set("totalRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalRows: Self = this.set("totalRows", js.undefined)
  }
}
