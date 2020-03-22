package typings.semanticUiApi

import typings.jquery.JQuery_.jqXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'onError'> */
@js.native
trait PickImplonError extends js.Object {
  @JSName("onError")
  var onError_Original: js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
  def onError(errorMessage: String, element: JQuery, xhr: jqXHR[_]): Unit = js.native
}

