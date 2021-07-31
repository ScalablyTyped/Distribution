package typings.semanticUiTransition.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'allowRepeats'> */
trait PickImplallowRepeats extends StObject {
  
  var allowRepeats: Boolean
}
object PickImplallowRepeats {
  
  @scala.inline
  def apply(allowRepeats: Boolean): PickImplallowRepeats = {
    val __obj = js.Dynamic.literal(allowRepeats = allowRepeats.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplallowRepeats]
  }
  
  @scala.inline
  implicit class PickImplallowRepeatsMutableBuilder[Self <: PickImplallowRepeats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowRepeats(value: Boolean): Self = StObject.set(x, "allowRepeats", value.asInstanceOf[js.Any])
  }
}
