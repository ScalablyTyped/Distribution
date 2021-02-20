package typings.semanticUiTransition.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl, 'disabled'> */
@js.native
trait PickImpldisabled extends StObject {
  
  var disabled: String = js.native
}
object PickImpldisabled {
  
  @scala.inline
  def apply(disabled: String): PickImpldisabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldisabled]
  }
  
  @scala.inline
  implicit class PickImpldisabledMutableBuilder[Self <: PickImpldisabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
  }
}
