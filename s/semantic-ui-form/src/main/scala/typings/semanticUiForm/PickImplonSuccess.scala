package typings.semanticUiForm

import typings.jquery.JQuery_.TriggeredEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'onSuccess'> */
@js.native
trait PickImplonSuccess extends js.Object {
  @JSName("onSuccess")
  var onSuccess_Original: js.ThisFunction2[
    /* this */ JQuery, 
    /* event */ TriggeredEvent[HTMLElement, _, _, _], 
    /* fields */ js.Any, 
    Unit
  ] = js.native
  def onSuccess(event: TriggeredEvent[HTMLElement, _, _, _], fields: js.Any): Unit = js.native
}

