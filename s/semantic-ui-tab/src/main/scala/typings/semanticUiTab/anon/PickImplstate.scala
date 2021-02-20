package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, 'state'> */
@js.native
trait PickImplstate extends StObject {
  
  var state: String = js.native
}
object PickImplstate {
  
  @scala.inline
  def apply(state: String): PickImplstate = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplstate]
  }
  
  @scala.inline
  implicit class PickImplstateMutableBuilder[Self <: PickImplstate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
