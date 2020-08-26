package typings.semanticUiTab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'maxDepth'> */
@js.native
trait PickImplmaxDepth extends js.Object {
  var maxDepth: Double = js.native
}

object PickImplmaxDepth {
  @scala.inline
  def apply(maxDepth: Double): PickImplmaxDepth = {
    val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxDepth]
  }
  @scala.inline
  implicit class PickImplmaxDepthOps[Self <: PickImplmaxDepth] (val x: Self) extends AnyVal {
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
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
  }
  
}

