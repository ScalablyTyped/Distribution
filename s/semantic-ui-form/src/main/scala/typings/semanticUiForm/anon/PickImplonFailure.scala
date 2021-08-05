package typings.semanticUiForm.anon

import typings.semanticUiForm.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'onFailure'> */
trait PickImplonFailure extends StObject {
  
  def onFailure(formErrors: js.Array[String], fields: js.Any): Unit
  @JSName("onFailure")
  var onFailure_Original: js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit]
}
object PickImplonFailure {
  
  inline def apply(
    onFailure: js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit]
  ): PickImplonFailure = {
    val __obj = js.Dynamic.literal(onFailure = onFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonFailure]
  }
  
  extension [Self <: PickImplonFailure](x: Self) {
    
    inline def setOnFailure(
      value: js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ js.Any, Unit]
    ): Self = StObject.set(x, "onFailure", value.asInstanceOf[js.Any])
  }
}
