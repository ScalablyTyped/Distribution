package typings.semanticUiApi

import typings.jquery.JQuery_.jqXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'onAbort'> */
@js.native
trait PickImplonAbort extends js.Object {
  @JSName("onAbort")
  var onAbort_Original: js.Function3[/* errorMessage */ String, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
  def onAbort(errorMessage: String, element: JQuery, xhr: jqXHR[_]): Unit = js.native
}

