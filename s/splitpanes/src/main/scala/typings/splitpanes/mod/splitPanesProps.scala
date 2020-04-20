package typings.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait splitPanesProps extends js.Object {
   // 支持添加 true
  var dblClickSplitter: Boolean
   // 是否监控插槽 false
  var horizontal: Boolean
   // 是否水平 false
  var pushOtherPanes: Boolean
  var watchSlots: Boolean
}

object splitPanesProps {
  @scala.inline
  def apply(dblClickSplitter: Boolean, horizontal: Boolean, pushOtherPanes: Boolean, watchSlots: Boolean): splitPanesProps = {
    val __obj = js.Dynamic.literal(dblClickSplitter = dblClickSplitter.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], pushOtherPanes = pushOtherPanes.asInstanceOf[js.Any], watchSlots = watchSlots.asInstanceOf[js.Any])
    __obj.asInstanceOf[splitPanesProps]
  }
}

