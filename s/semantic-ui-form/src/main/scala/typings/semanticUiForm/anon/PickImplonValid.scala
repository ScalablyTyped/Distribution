package typings.semanticUiForm.anon

import typings.semanticUiForm.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'onValid'> */
trait PickImplonValid extends StObject {
  
  def onValid(): Unit
  @JSName("onValid")
  var onValid_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonValid {
  
  inline def apply(onValid: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonValid = {
    val __obj = js.Dynamic.literal(onValid = onValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonValid]
  }
  
  extension [Self <: PickImplonValid](x: Self) {
    
    inline def setOnValid(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onValid", value.asInstanceOf[js.Any])
  }
}
