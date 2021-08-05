package typings.semanticUiDimmer.anon

import typings.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'template'> */
trait PickImpltemplate extends StObject {
  
  var template: TemplateSettings
}
object PickImpltemplate {
  
  inline def apply(template: TemplateSettings): PickImpltemplate = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltemplate]
  }
  
  extension [Self <: PickImpltemplate](x: Self) {
    
    inline def setTemplate(value: TemplateSettings): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
