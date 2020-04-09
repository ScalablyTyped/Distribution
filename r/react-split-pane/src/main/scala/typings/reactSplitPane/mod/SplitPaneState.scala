package typings.reactSplitPane.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitPaneState extends js.Object {
  var active: Boolean
  var resized: Boolean
}

object SplitPaneState {
  @scala.inline
  def apply(active: Boolean, resized: Boolean): SplitPaneState = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], resized = resized.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SplitPaneState]
  }
}

