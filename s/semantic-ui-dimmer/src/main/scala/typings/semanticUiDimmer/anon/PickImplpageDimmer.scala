package typings.semanticUiDimmer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl, 'pageDimmer'> */
trait PickImplpageDimmer extends StObject {
  
  var pageDimmer: String
}
object PickImplpageDimmer {
  
  inline def apply(pageDimmer: String): PickImplpageDimmer = {
    val __obj = js.Dynamic.literal(pageDimmer = pageDimmer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpageDimmer]
  }
  
  extension [Self <: PickImplpageDimmer](x: Self) {
    
    inline def setPageDimmer(value: String): Self = StObject.set(x, "pageDimmer", value.asInstanceOf[js.Any])
  }
}
