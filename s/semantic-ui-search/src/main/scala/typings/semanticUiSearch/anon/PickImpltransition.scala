package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'transition'> */
@js.native
trait PickImpltransition extends StObject {
  
  var transition: String = js.native
}
object PickImpltransition {
  
  @scala.inline
  def apply(transition: String): PickImpltransition = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltransition]
  }
  
  @scala.inline
  implicit class PickImpltransitionMutableBuilder[Self <: PickImpltransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
  }
}
