package typings.semanticUiAccordion.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-accordion.SemanticUI.Accordion.SelectorSettings._Impl, 'content'> */
trait PickImplcontent extends StObject {
  
  var content: String
}
object PickImplcontent {
  
  inline def apply(content: String): PickImplcontent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcontent]
  }
  
  extension [Self <: PickImplcontent](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
