package typings.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait splitPanesProps extends js.Object {
   // 支持添加 true
  var dblClickSplitter: Boolean = js.native
   // 是否监控插槽 false
  var horizontal: Boolean = js.native
   // 是否水平 false
  var pushOtherPanes: Boolean = js.native
  var watchSlots: Boolean = js.native
}

object splitPanesProps {
  @scala.inline
  def apply(dblClickSplitter: Boolean, horizontal: Boolean, pushOtherPanes: Boolean, watchSlots: Boolean): splitPanesProps = {
    val __obj = js.Dynamic.literal(dblClickSplitter = dblClickSplitter.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], pushOtherPanes = pushOtherPanes.asInstanceOf[js.Any], watchSlots = watchSlots.asInstanceOf[js.Any])
    __obj.asInstanceOf[splitPanesProps]
  }
  @scala.inline
  implicit class splitPanesPropsOps[Self <: splitPanesProps] (val x: Self) extends AnyVal {
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
    def setDblClickSplitter(value: Boolean): Self = this.set("dblClickSplitter", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setPushOtherPanes(value: Boolean): Self = this.set("pushOtherPanes", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatchSlots(value: Boolean): Self = this.set("watchSlots", value.asInstanceOf[js.Any])
  }
  
}

