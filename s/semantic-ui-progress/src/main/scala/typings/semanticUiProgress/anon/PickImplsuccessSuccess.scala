package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl, 'success'> */
trait PickImplsuccessSuccess extends StObject {
  
  var success: String
}
object PickImplsuccessSuccess {
  
  @scala.inline
  def apply(success: String): PickImplsuccessSuccess = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsuccessSuccess]
  }
  
  @scala.inline
  implicit class PickImplsuccessSuccessMutableBuilder[Self <: PickImplsuccessSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
