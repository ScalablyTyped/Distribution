package typings.semanticUiApi.anon

import typings.semanticUiApi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'onFailure'> */
trait PickImplonFailure extends StObject {
  
  def onFailure(response: js.Any, element: JQuery): Unit
  @JSName("onFailure")
  var onFailure_Original: js.Function2[/* response */ js.Any, /* element */ JQuery, Unit]
}
object PickImplonFailure {
  
  @scala.inline
  def apply(onFailure: (/* response */ js.Any, /* element */ JQuery) => Unit): PickImplonFailure = {
    val __obj = js.Dynamic.literal(onFailure = js.Any.fromFunction2(onFailure))
    __obj.asInstanceOf[PickImplonFailure]
  }
  
  @scala.inline
  implicit class PickImplonFailureMutableBuilder[Self <: PickImplonFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnFailure(value: (/* response */ js.Any, /* element */ JQuery) => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction2(value))
  }
}
