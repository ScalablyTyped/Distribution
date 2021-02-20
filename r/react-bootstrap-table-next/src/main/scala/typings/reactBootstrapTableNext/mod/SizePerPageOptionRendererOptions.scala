package typings.reactBootstrapTableNext.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizePerPageOptionRendererOptions extends StObject {
  
  /**
    * call it when you need to change size per page
    */
  def onSizePerPageChange(page: Double, sizePerPage: Double): Unit = js.native
  
  /**
    * size of per page option
    */
  var page: Double = js.native
  
  /**
    * text of the option
    */
  var text: String = js.native
}
object SizePerPageOptionRendererOptions {
  
  @scala.inline
  def apply(onSizePerPageChange: (Double, Double) => Unit, page: Double, text: String): SizePerPageOptionRendererOptions = {
    val __obj = js.Dynamic.literal(onSizePerPageChange = js.Any.fromFunction2(onSizePerPageChange), page = page.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizePerPageOptionRendererOptions]
  }
  
  @scala.inline
  implicit class SizePerPageOptionRendererOptionsMutableBuilder[Self <: SizePerPageOptionRendererOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnSizePerPageChange(value: (Double, Double) => Unit): Self = StObject.set(x, "onSizePerPageChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
