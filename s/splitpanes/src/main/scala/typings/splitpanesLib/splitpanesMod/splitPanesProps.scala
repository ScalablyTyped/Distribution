package typings
package splitpanesLib.splitpanesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait splitPanesProps extends js.Object {
   // 支持添加 true
  var dblClickSplitter: scala.Boolean
   // 是否监控插槽 false
  var horizontal: scala.Boolean
   // 是否水平 false
  var pushOtherPanes: scala.Boolean
  var watchSlots: scala.Boolean
}

object splitPanesProps {
  @scala.inline
  def apply(
    dblClickSplitter: scala.Boolean,
    horizontal: scala.Boolean,
    pushOtherPanes: scala.Boolean,
    watchSlots: scala.Boolean
  ): splitPanesProps = {
    val __obj = js.Dynamic.literal(dblClickSplitter = dblClickSplitter, horizontal = horizontal, pushOtherPanes = pushOtherPanes, watchSlots = watchSlots)
  
    __obj.asInstanceOf[splitPanesProps]
  }
}

