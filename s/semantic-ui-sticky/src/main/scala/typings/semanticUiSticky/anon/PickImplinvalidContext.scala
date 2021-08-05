package typings.semanticUiSticky.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl, 'invalidContext'> */
trait PickImplinvalidContext extends StObject {
  
  var invalidContext: String
}
object PickImplinvalidContext {
  
  inline def apply(invalidContext: String): PickImplinvalidContext = {
    val __obj = js.Dynamic.literal(invalidContext = invalidContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinvalidContext]
  }
  
  extension [Self <: PickImplinvalidContext](x: Self) {
    
    inline def setInvalidContext(value: String): Self = StObject.set(x, "invalidContext", value.asInstanceOf[js.Any])
  }
}
