package typings.semanticUiForm.anon

import typings.semanticUiForm.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'onInvalid'> */
trait PickImplonInvalid extends StObject {
  
  def onInvalid(): Unit
  @JSName("onInvalid")
  var onInvalid_Original: js.ThisFunction0[/* this */ JQuery, Unit]
}
object PickImplonInvalid {
  
  inline def apply(onInvalid: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonInvalid = {
    val __obj = js.Dynamic.literal(onInvalid = onInvalid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonInvalid]
  }
  
  extension [Self <: PickImplonInvalid](x: Self) {
    
    inline def setOnInvalid(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onInvalid", value.asInstanceOf[js.Any])
  }
}
