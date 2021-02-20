package typings.semanticUiModal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'allowMultiple'> */
@js.native
trait PickImplallowMultiple extends StObject {
  
  var allowMultiple: Boolean = js.native
}
object PickImplallowMultiple {
  
  @scala.inline
  def apply(allowMultiple: Boolean): PickImplallowMultiple = {
    val __obj = js.Dynamic.literal(allowMultiple = allowMultiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplallowMultiple]
  }
  
  @scala.inline
  implicit class PickImplallowMultipleMutableBuilder[Self <: PickImplallowMultiple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
  }
}
