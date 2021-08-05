package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'keyboardShortcuts'> */
trait PickImplkeyboardShortcuts extends StObject {
  
  var keyboardShortcuts: Boolean
}
object PickImplkeyboardShortcuts {
  
  inline def apply(keyboardShortcuts: Boolean): PickImplkeyboardShortcuts = {
    val __obj = js.Dynamic.literal(keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplkeyboardShortcuts]
  }
  
  extension [Self <: PickImplkeyboardShortcuts](x: Self) {
    
    inline def setKeyboardShortcuts(value: Boolean): Self = StObject.set(x, "keyboardShortcuts", value.asInstanceOf[js.Any])
  }
}
