package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.TemplatesSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'templates'> */
trait PickImpltemplates extends StObject {
  
  var templates: TemplatesSettings
}
object PickImpltemplates {
  
  inline def apply(templates: TemplatesSettings): PickImpltemplates = {
    val __obj = js.Dynamic.literal(templates = templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltemplates]
  }
  
  extension [Self <: PickImpltemplates](x: Self) {
    
    inline def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
  }
}
