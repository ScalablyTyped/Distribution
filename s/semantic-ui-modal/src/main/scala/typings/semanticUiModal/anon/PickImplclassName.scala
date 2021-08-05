package typings.semanticUiModal.anon

import typings.semanticUiModal.SemanticUI.Modal.ClassNameSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'className'> */
trait PickImplclassName extends StObject {
  
  var className: ClassNameSettings
}
object PickImplclassName {
  
  inline def apply(className: ClassNameSettings): PickImplclassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplclassName]
  }
  
  extension [Self <: PickImplclassName](x: Self) {
    
    inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
  }
}
