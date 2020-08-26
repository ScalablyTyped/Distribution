package typings.semanticUiTab.anon

import typings.semanticUiTab.JQuery
import typings.semanticUiTab.semanticUiTabBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'context'> */
@js.native
trait PickImplcontext extends js.Object {
  var context: `false` | String | JQuery = js.native
}

object PickImplcontext {
  @scala.inline
  def apply(context: `false` | String | JQuery): PickImplcontext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcontext]
  }
  @scala.inline
  implicit class PickImplcontextOps[Self <: PickImplcontext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: `false` | String | JQuery): Self = this.set("context", value.asInstanceOf[js.Any])
  }
  
}

