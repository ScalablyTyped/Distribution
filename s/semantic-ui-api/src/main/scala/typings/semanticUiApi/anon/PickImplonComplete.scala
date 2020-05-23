package typings.semanticUiApi.anon

import typings.jquery.JQuery.jqXHR
import typings.semanticUiApi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'onComplete'> */
@js.native
trait PickImplonComplete extends js.Object {
  @JSName("onComplete")
  var onComplete_Original: js.Function3[/* response */ js.Any, /* element */ JQuery, /* xhr */ jqXHR[_], Unit] = js.native
  def onComplete(response: js.Any, element: JQuery, xhr: jqXHR[_]): Unit = js.native
}

