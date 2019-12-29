package typings.reactDashVirtualized

import typings.reactDashVirtualized.reactDashVirtualizedBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisableHeight extends js.Object {
  var disableHeight: `false`
  var disableWidth: `false`
  def onResize(): Unit
}

object Anon_DisableHeight {
  @scala.inline
  def apply(disableHeight: `false`, disableWidth: `false`, onResize: () => Unit): Anon_DisableHeight = {
    val __obj = js.Dynamic.literal(disableHeight = disableHeight.asInstanceOf[js.Any], disableWidth = disableWidth.asInstanceOf[js.Any], onResize = js.Any.fromFunction0(onResize))
  
    __obj.asInstanceOf[Anon_DisableHeight]
  }
}

