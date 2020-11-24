package typings.reactPdf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageNumber extends js.Object {
  
  var pageNumber: String = js.native
}
object PageNumber {
  
  @scala.inline
  def apply(pageNumber: String): PageNumber = {
    val __obj = js.Dynamic.literal(pageNumber = pageNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageNumber]
  }
  
  @scala.inline
  implicit class PageNumberOps[Self <: PageNumber] (val x: Self) extends AnyVal {
    
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
    def setPageNumber(value: String): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
  }
}
