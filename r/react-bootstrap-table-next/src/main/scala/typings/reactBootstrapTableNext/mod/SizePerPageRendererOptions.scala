package typings.reactBootstrapTableNext.mod

import typings.reactBootstrapTableNext.anon.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizePerPageRendererOptions extends StObject {
  
  /**
    * current size per page
    */
  var currSizePerPage: String
  
  /**
    * call it when you need to change size per page
    */
  def onSizePerPageChange(page: Double): Unit
  
  /**
    * dropdown options
    */
  var options: js.Array[Page]
}
object SizePerPageRendererOptions {
  
  inline def apply(currSizePerPage: String, onSizePerPageChange: Double => Unit, options: js.Array[Page]): SizePerPageRendererOptions = {
    val __obj = js.Dynamic.literal(currSizePerPage = currSizePerPage.asInstanceOf[js.Any], onSizePerPageChange = js.Any.fromFunction1(onSizePerPageChange), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizePerPageRendererOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SizePerPageRendererOptions] (val x: Self) extends AnyVal {
    
    inline def setCurrSizePerPage(value: String): Self = StObject.set(x, "currSizePerPage", value.asInstanceOf[js.Any])
    
    inline def setOnSizePerPageChange(value: Double => Unit): Self = StObject.set(x, "onSizePerPageChange", js.Any.fromFunction1(value))
    
    inline def setOptions(value: js.Array[Page]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: Page*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
