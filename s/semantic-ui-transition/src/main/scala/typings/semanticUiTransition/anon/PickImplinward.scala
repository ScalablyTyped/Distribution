package typings.semanticUiTransition.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl, 'inward'> */
trait PickImplinward extends StObject {
  
  var inward: String
}
object PickImplinward {
  
  @scala.inline
  def apply(inward: String): PickImplinward = {
    val __obj = js.Dynamic.literal(inward = inward.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinward]
  }
  
  @scala.inline
  implicit class PickImplinwardMutableBuilder[Self <: PickImplinward] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInward(value: String): Self = StObject.set(x, "inward", value.asInstanceOf[js.Any])
  }
}
