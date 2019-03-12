package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisableHeight extends js.Object {
  var disableHeight: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false`
  var disableWidth: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false`
  def onResize(): scala.Unit
}

object Anon_DisableHeight {
  @scala.inline
  def apply(
    disableHeight: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false`,
    disableWidth: reactDashVirtualizedLib.reactDashVirtualizedLibNumbers.`false`,
    onResize: () => scala.Unit
  ): Anon_DisableHeight = {
    val __obj = js.Dynamic.literal(disableHeight = disableHeight, disableWidth = disableWidth, onResize = js.Any.fromFunction0(onResize))
  
    __obj.asInstanceOf[Anon_DisableHeight]
  }
}

