package typings.semanticUiTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, 'noContent'> */
@js.native
trait PickImplnoContent extends js.Object {
  var noContent: String = js.native
}

object PickImplnoContent {
  @scala.inline
  def apply(noContent: String): PickImplnoContent = {
    val __obj = js.Dynamic.literal(noContent = noContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoContent]
  }
  @scala.inline
  implicit class PickImplnoContentOps[Self <: PickImplnoContent] (val x: Self) extends AnyVal {
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
    def setNoContent(value: String): Self = this.set("noContent", value.asInstanceOf[js.Any])
  }
  
}

