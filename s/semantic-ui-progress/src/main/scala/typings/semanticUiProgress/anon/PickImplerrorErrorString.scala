package typings.semanticUiProgress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-progress.SemanticUI.Progress.ClassNameSettings._Impl, 'error'> */
trait PickImplerrorErrorString extends StObject {
  
  var error: String
}
object PickImplerrorErrorString {
  
  @scala.inline
  def apply(error: String): PickImplerrorErrorString = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplerrorErrorString]
  }
  
  @scala.inline
  implicit class PickImplerrorErrorStringMutableBuilder[Self <: PickImplerrorErrorString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
