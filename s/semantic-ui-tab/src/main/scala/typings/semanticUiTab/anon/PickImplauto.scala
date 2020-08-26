package typings.semanticUiTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'auto'> */
@js.native
trait PickImplauto extends js.Object {
  var auto: Boolean = js.native
}

object PickImplauto {
  @scala.inline
  def apply(auto: Boolean): PickImplauto = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplauto]
  }
  @scala.inline
  implicit class PickImplautoOps[Self <: PickImplauto] (val x: Self) extends AnyVal {
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
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
  }
  
}

