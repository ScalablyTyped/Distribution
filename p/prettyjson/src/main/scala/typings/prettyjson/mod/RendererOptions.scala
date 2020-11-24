package typings.prettyjson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RendererOptions extends js.Object {
  
  var dashColor: js.UndefOr[String] = js.native
  
  var defaultIndentation: js.UndefOr[Double] = js.native
  
  /**
    * Define behavior for Array objects
    */
  var emptyArrayMsg: js.UndefOr[String] = js.native
  
    // default: (empty)
  var inlineArrays: js.UndefOr[Boolean] = js.native
  
  var keysColor: js.UndefOr[String] = js.native
  
  var noAlign: js.UndefOr[Boolean] = js.native
  
  /**
    * Color definition
    */
  var noColor: js.UndefOr[Boolean] = js.native
  
  var numberColor: js.UndefOr[String] = js.native
  
  var stringColor: js.UndefOr[String] = js.native
}
object RendererOptions {
  
  @scala.inline
  def apply(): RendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererOptions]
  }
  
  @scala.inline
  implicit class RendererOptionsOps[Self <: RendererOptions] (val x: Self) extends AnyVal {
    
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
    def setDashColor(value: String): Self = this.set("dashColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashColor: Self = this.set("dashColor", js.undefined)
    
    @scala.inline
    def setDefaultIndentation(value: Double): Self = this.set("defaultIndentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultIndentation: Self = this.set("defaultIndentation", js.undefined)
    
    @scala.inline
    def setEmptyArrayMsg(value: String): Self = this.set("emptyArrayMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyArrayMsg: Self = this.set("emptyArrayMsg", js.undefined)
    
    @scala.inline
    def setInlineArrays(value: Boolean): Self = this.set("inlineArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineArrays: Self = this.set("inlineArrays", js.undefined)
    
    @scala.inline
    def setKeysColor(value: String): Self = this.set("keysColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeysColor: Self = this.set("keysColor", js.undefined)
    
    @scala.inline
    def setNoAlign(value: Boolean): Self = this.set("noAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoAlign: Self = this.set("noAlign", js.undefined)
    
    @scala.inline
    def setNoColor(value: Boolean): Self = this.set("noColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoColor: Self = this.set("noColor", js.undefined)
    
    @scala.inline
    def setNumberColor(value: String): Self = this.set("numberColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberColor: Self = this.set("numberColor", js.undefined)
    
    @scala.inline
    def setStringColor(value: String): Self = this.set("stringColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringColor: Self = this.set("stringColor", js.undefined)
  }
}
