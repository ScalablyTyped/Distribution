package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, 'recursion'> */
@js.native
trait PickImplrecursion extends StObject {
  
  var recursion: String = js.native
}
object PickImplrecursion {
  
  @scala.inline
  def apply(recursion: String): PickImplrecursion = {
    val __obj = js.Dynamic.literal(recursion = recursion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrecursion]
  }
  
  @scala.inline
  implicit class PickImplrecursionMutableBuilder[Self <: PickImplrecursion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecursion(value: String): Self = StObject.set(x, "recursion", value.asInstanceOf[js.Any])
  }
}
