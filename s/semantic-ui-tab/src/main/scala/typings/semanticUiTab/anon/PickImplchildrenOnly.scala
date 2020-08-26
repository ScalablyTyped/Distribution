package typings.semanticUiTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'childrenOnly'> */
@js.native
trait PickImplchildrenOnly extends js.Object {
  var childrenOnly: Boolean = js.native
}

object PickImplchildrenOnly {
  @scala.inline
  def apply(childrenOnly: Boolean): PickImplchildrenOnly = {
    val __obj = js.Dynamic.literal(childrenOnly = childrenOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplchildrenOnly]
  }
  @scala.inline
  implicit class PickImplchildrenOnlyOps[Self <: PickImplchildrenOnly] (val x: Self) extends AnyVal {
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
    def setChildrenOnly(value: Boolean): Self = this.set("childrenOnly", value.asInstanceOf[js.Any])
  }
  
}

