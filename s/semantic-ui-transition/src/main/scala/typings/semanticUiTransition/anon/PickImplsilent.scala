package typings.semanticUiTransition.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'silent'> */
trait PickImplsilent extends StObject {
  
  var silent: Boolean
}
object PickImplsilent {
  
  @scala.inline
  def apply(silent: Boolean): PickImplsilent = {
    val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsilent]
  }
  
  @scala.inline
  implicit class PickImplsilentMutableBuilder[Self <: PickImplsilent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
  }
}
