package typings.semanticUiSticky.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ClassNameSettings._Impl, 'supported'> */
trait PickImplsupported extends StObject {
  
  var supported: String
}
object PickImplsupported {
  
  @scala.inline
  def apply(supported: String): PickImplsupported = {
    val __obj = js.Dynamic.literal(supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsupported]
  }
  
  @scala.inline
  implicit class PickImplsupportedMutableBuilder[Self <: PickImplsupported] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSupported(value: String): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
