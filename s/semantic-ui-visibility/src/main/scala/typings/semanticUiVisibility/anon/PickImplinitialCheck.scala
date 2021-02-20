package typings.semanticUiVisibility.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'initialCheck'> */
@js.native
trait PickImplinitialCheck extends StObject {
  
  var initialCheck: Boolean = js.native
}
object PickImplinitialCheck {
  
  @scala.inline
  def apply(initialCheck: Boolean): PickImplinitialCheck = {
    val __obj = js.Dynamic.literal(initialCheck = initialCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinitialCheck]
  }
  
  @scala.inline
  implicit class PickImplinitialCheckMutableBuilder[Self <: PickImplinitialCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialCheck(value: Boolean): Self = StObject.set(x, "initialCheck", value.asInstanceOf[js.Any])
  }
}
