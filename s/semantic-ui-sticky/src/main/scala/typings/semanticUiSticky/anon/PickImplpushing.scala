package typings.semanticUiSticky.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'pushing'> */
trait PickImplpushing extends StObject {
  
  var pushing: Boolean
}
object PickImplpushing {
  
  inline def apply(pushing: Boolean): PickImplpushing = {
    val __obj = js.Dynamic.literal(pushing = pushing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpushing]
  }
  
  extension [Self <: PickImplpushing](x: Self) {
    
    inline def setPushing(value: Boolean): Self = StObject.set(x, "pushing", value.asInstanceOf[js.Any])
  }
}
