package typings.reactBootstrapTableNext.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageButtonRendererOptions extends StObject {
  
  /**
    * is this page the current page or not
    */
  var active: Boolean
  
  /**
    *  is this page disabled or not
    */
  var disabled: Boolean
  
  /**
    * call it when you need to change page
    */
  def onPageChange(page: Double, sizePerPage: Double): Unit
  
  /**
    * page number
    */
  var page: Double | String
  
  /**
    * page title
    */
  var title: String
}
object PageButtonRendererOptions {
  
  @scala.inline
  def apply(
    active: Boolean,
    disabled: Boolean,
    onPageChange: (Double, Double) => Unit,
    page: Double | String,
    title: String
  ): PageButtonRendererOptions = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onPageChange = js.Any.fromFunction2(onPageChange), page = page.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageButtonRendererOptions]
  }
  
  @scala.inline
  implicit class PageButtonRendererOptionsMutableBuilder[Self <: PageButtonRendererOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPageChange(value: (Double, Double) => Unit): Self = StObject.set(x, "onPageChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPage(value: Double | String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
