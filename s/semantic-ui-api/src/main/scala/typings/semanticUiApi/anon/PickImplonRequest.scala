package typings.semanticUiApi.anon

import typings.jquery.JQuery.Deferred
import typings.jquery.JQuery.jqXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'onRequest'> */
@js.native
trait PickImplonRequest extends js.Object {
  
  def onRequest(promise: Deferred[_, _, _], xhr: jqXHR[_]): Unit = js.native
  @JSName("onRequest")
  var onRequest_Original: js.Function2[/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_], Unit] = js.native
}
