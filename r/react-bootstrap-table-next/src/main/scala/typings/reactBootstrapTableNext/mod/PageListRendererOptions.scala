package typings.reactBootstrapTableNext.mod

import typings.reactBootstrapTableNext.anon.Active
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageListRendererOptions extends StObject {
  
  /**
    * call it when you need to change page
    */
  def onPageChange(page: Double, sizePerPage: Double): Unit
  
  /**
    * current page
    */
  var pages: js.Array[Active]
}
object PageListRendererOptions {
  
  @scala.inline
  def apply(onPageChange: (Double, Double) => Unit, pages: js.Array[Active]): PageListRendererOptions = {
    val __obj = js.Dynamic.literal(onPageChange = js.Any.fromFunction2(onPageChange), pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageListRendererOptions]
  }
  
  @scala.inline
  implicit class PageListRendererOptionsMutableBuilder[Self <: PageListRendererOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnPageChange(value: (Double, Double) => Unit): Self = StObject.set(x, "onPageChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPages(value: js.Array[Active]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesVarargs(value: Active*): Self = StObject.set(x, "pages", js.Array(value :_*))
  }
}
