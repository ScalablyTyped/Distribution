package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, 'recursion'> */
trait PickImplrecursion extends StObject {
  
  var recursion: String
}
object PickImplrecursion {
  
  inline def apply(recursion: String): PickImplrecursion = {
    val __obj = js.Dynamic.literal(recursion = recursion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrecursion]
  }
  
  extension [Self <: PickImplrecursion](x: Self) {
    
    inline def setRecursion(value: String): Self = StObject.set(x, "recursion", value.asInstanceOf[js.Any])
  }
}
