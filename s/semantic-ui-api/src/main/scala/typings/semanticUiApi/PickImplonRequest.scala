package typings.semanticUiApi

import typings.jquery.JQuery_.Deferred
import typings.jquery.JQuery_.jqXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'onRequest'> */
@js.native
trait PickImplonRequest extends js.Object {
  @JSName("onRequest")
  var onRequest_Original: js.Function2[/* promise */ Deferred[_, _, _], /* xhr */ jqXHR[_], Unit] = js.native
  def onRequest(promise: Deferred[_, _, _], xhr: jqXHR[_]): Unit = js.native
}

