package typings.semanticUiApi

import typings.jquery.JQuery_.jqXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'onSuccess'> */
@js.native
trait PickImplonSuccess extends js.Object {
  @JSName("onSuccess")
  var onSuccess_Original: js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
  def onSuccess(response: js.Any, element: JQuery, xhr: jqXHR[_]): Unit = js.native
}

