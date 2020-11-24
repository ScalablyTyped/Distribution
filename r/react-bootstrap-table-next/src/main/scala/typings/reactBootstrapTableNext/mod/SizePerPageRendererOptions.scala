package typings.reactBootstrapTableNext.mod

import typings.reactBootstrapTableNext.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizePerPageRendererOptions extends js.Object {
  
  /**
    * current size per page
    */
  var currentSizePerPage: Double = js.native
  
  /**
    * call it when you need to change size per page
    */
  def onSizePerPageChange(page: Double, sizePerPage: Double): Unit = js.native
  
  /**
    * dropdown options
    */
  var options: js.Array[Text] = js.native
}
object SizePerPageRendererOptions {
  
  @scala.inline
  def apply(currentSizePerPage: Double, onSizePerPageChange: (Double, Double) => Unit, options: js.Array[Text]): SizePerPageRendererOptions = {
    val __obj = js.Dynamic.literal(currentSizePerPage = currentSizePerPage.asInstanceOf[js.Any], onSizePerPageChange = js.Any.fromFunction2(onSizePerPageChange), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizePerPageRendererOptions]
  }
  
  @scala.inline
  implicit class SizePerPageRendererOptionsOps[Self <: SizePerPageRendererOptions] (val x: Self) extends AnyVal {
    
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
    def setCurrentSizePerPage(value: Double): Self = this.set("currentSizePerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSizePerPageChange(value: (Double, Double) => Unit): Self = this.set("onSizePerPageChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptionsVarargs(value: Text*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[Text]): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
