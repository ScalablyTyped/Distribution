package typings.semanticUiTab.anon

import typings.semanticUiTab.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'onRequest'> */
trait PickImplonRequest extends StObject {
  
  def onRequest(tabPath: String): Unit
  @JSName("onRequest")
  var onRequest_Original: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
}
object PickImplonRequest {
  
  @scala.inline
  def apply(onRequest: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]): PickImplonRequest = {
    val __obj = js.Dynamic.literal(onRequest = onRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonRequest]
  }
  
  @scala.inline
  implicit class PickImplonRequestMutableBuilder[Self <: PickImplonRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnRequest(value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]): Self = StObject.set(x, "onRequest", value.asInstanceOf[js.Any])
  }
}
