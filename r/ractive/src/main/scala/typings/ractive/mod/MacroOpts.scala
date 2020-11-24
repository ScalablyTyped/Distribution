package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MacroOpts extends js.Object {
  
  var attributes: js.UndefOr[js.Array[String]] = js.native
  
  var css: js.UndefOr[String | CssFn] = js.native
  
  var cssData: js.UndefOr[ValueMap] = js.native
  
  var cssId: js.UndefOr[String] = js.native
  
  var noCssTransform: js.UndefOr[Boolean] = js.native
  
  var partials: js.UndefOr[PartialMap] = js.native
  
  var template: js.UndefOr[Template] = js.native
}
object MacroOpts {
  
  @scala.inline
  def apply(): MacroOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacroOpts]
  }
  
  @scala.inline
  implicit class MacroOptsOps[Self <: MacroOpts] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setCssFunction1(value: /* data */ DataGetFn => String): Self = this.set("css", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCss(value: String | CssFn): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setCssData(value: ValueMap): Self = this.set("cssData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssData: Self = this.set("cssData", js.undefined)
    
    @scala.inline
    def setCssId(value: String): Self = this.set("cssId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssId: Self = this.set("cssId", js.undefined)
    
    @scala.inline
    def setNoCssTransform(value: Boolean): Self = this.set("noCssTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCssTransform: Self = this.set("noCssTransform", js.undefined)
    
    @scala.inline
    def setPartials(value: PartialMap): Self = this.set("partials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartials: Self = this.set("partials", js.undefined)
    
    @scala.inline
    def setTemplateVarargs(value: js.Any*): Self = this.set("template", js.Array(value :_*))
    
    @scala.inline
    def setTemplateFunction1(value: /* helper */ ParseHelper => String | (js.Array[js.Object | String]) | ParsedTemplate): Self = this.set("template", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemplate(value: Template): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
