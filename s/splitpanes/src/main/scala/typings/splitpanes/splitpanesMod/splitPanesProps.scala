package typings.splitpanes.splitpanesMod

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
    val __obj = js.Dynamic.literal(dblClickSplitter = dblClickSplitter, horizontal = horizontal, pushOtherPanes = pushOtherPanes, watchSlots = watchSlots)
  
    __obj.asInstanceOf[splitPanesProps]
  }
}

