package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacroOpts extends StObject {
  
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  
  var css: js.UndefOr[String | CssFn] = js.undefined
  
  var cssData: js.UndefOr[ValueMap] = js.undefined
  
  var cssId: js.UndefOr[String] = js.undefined
  
  var noCssTransform: js.UndefOr[Boolean] = js.undefined
  
  var partials: js.UndefOr[PartialMap] = js.undefined
  
  var template: js.UndefOr[Template] = js.undefined
}
object MacroOpts {
  
  @scala.inline
  def apply(): MacroOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacroOpts]
  }
  
  @scala.inline
  implicit class MacroOptsMutableBuilder[Self <: MacroOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setCss(value: String | CssFn): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssData(value: ValueMap): Self = StObject.set(x, "cssData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssDataUndefined: Self = StObject.set(x, "cssData", js.undefined)
    
    @scala.inline
    def setCssFunction1(value: /* data */ DataGetFn => String): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCssId(value: String): Self = StObject.set(x, "cssId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssIdUndefined: Self = StObject.set(x, "cssId", js.undefined)
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setNoCssTransform(value: Boolean): Self = StObject.set(x, "noCssTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoCssTransformUndefined: Self = StObject.set(x, "noCssTransform", js.undefined)
    
    @scala.inline
    def setPartials(value: PartialMap): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialsUndefined: Self = StObject.set(x, "partials", js.undefined)
    
    @scala.inline
    def setTemplate(value: Template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateFunction1(value: /* helper */ ParseHelper => String | (js.Array[js.Object | String]) | ParsedTemplate): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTemplateVarargs(value: js.Any*): Self = StObject.set(x, "template", js.Array(value :_*))
  }
}
