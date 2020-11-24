package typings.reactBootstrapTableNext.mod

import typings.reactBootstrapTableNext.anon.Active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageListRendererOptions extends js.Object {
  
  /**
    * call it when you need to change page
    */
  def onPageChange(page: Double, sizePerPage: Double): Unit = js.native
  
  /**
    * current page
    */
  var pages: js.Array[Active] = js.native
}
object PageListRendererOptions {
  
  @scala.inline
  def apply(onPageChange: (Double, Double) => Unit, pages: js.Array[Active]): PageListRendererOptions = {
    val __obj = js.Dynamic.literal(onPageChange = js.Any.fromFunction2(onPageChange), pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageListRendererOptions]
  }
  
  @scala.inline
  implicit class PageListRendererOptionsOps[Self <: PageListRendererOptions] (val x: Self) extends AnyVal {
    
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
    def setOnPageChange(value: (Double, Double) => Unit): Self = this.set("onPageChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPagesVarargs(value: Active*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[Active]): Self = this.set("pages", value.asInstanceOf[js.Any])
  }
}
