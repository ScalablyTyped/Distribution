package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl, 'noTemplate'> */
trait PickImplnoTemplate extends StObject {
  
  var noTemplate: String
}
object PickImplnoTemplate {
  
  inline def apply(noTemplate: String): PickImplnoTemplate = {
    val __obj = js.Dynamic.literal(noTemplate = noTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoTemplate]
  }
  
  extension [Self <: PickImplnoTemplate](x: Self) {
    
    inline def setNoTemplate(value: String): Self = StObject.set(x, "noTemplate", value.asInstanceOf[js.Any])
  }
}
