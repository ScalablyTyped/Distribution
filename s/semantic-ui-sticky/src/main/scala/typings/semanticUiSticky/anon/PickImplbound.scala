package typings.semanticUiSticky.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, 'bound'> */
trait PickImplbound extends StObject {
  
  var bound: String
}
object PickImplbound {
  
  inline def apply(bound: String): PickImplbound = {
    val __obj = js.Dynamic.literal(bound = bound.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbound]
  }
  
  extension [Self <: PickImplbound](x: Self) {
    
    inline def setBound(value: String): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
  }
}
