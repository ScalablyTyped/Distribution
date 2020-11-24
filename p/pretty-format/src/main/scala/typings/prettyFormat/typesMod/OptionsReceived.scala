package typings.prettyFormat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsReceived extends js.Object {
  
  var callToJSON: js.UndefOr[Boolean] = js.native
  
  var escapeRegex: js.UndefOr[Boolean] = js.native
  
  var escapeString: js.UndefOr[Boolean] = js.native
  
  var highlight: js.UndefOr[Boolean] = js.native
  
  var indent: js.UndefOr[Double] = js.native
  
  var maxDepth: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Boolean] = js.native
  
  var plugins: js.UndefOr[Plugins] = js.native
  
  var printFunctionName: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[ThemeReceived] = js.native
}
object OptionsReceived {
  
  @scala.inline
  def apply(): OptionsReceived = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsReceived]
  }
  
  @scala.inline
  implicit class OptionsReceivedOps[Self <: OptionsReceived] (val x: Self) extends AnyVal {
    
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
    def setCallToJSON(value: Boolean): Self = this.set("callToJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallToJSON: Self = this.set("callToJSON", js.undefined)
    
    @scala.inline
    def setEscapeRegex(value: Boolean): Self = this.set("escapeRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeRegex: Self = this.set("escapeRegex", js.undefined)
    
    @scala.inline
    def setEscapeString(value: Boolean): Self = this.set("escapeString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeString: Self = this.set("escapeString", js.undefined)
    
    @scala.inline
    def setHighlight(value: Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDepth: Self = this.set("maxDepth", js.undefined)
    
    @scala.inline
    def setMin(value: Boolean): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setPlugins(value: Plugins): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPrintFunctionName(value: Boolean): Self = this.set("printFunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintFunctionName: Self = this.set("printFunctionName", js.undefined)
    
    @scala.inline
    def setTheme(value: ThemeReceived): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
