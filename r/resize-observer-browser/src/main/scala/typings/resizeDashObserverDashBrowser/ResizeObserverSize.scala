package typings.resizeDashObserverDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeObserverSize extends js.Object {
  var blockSize: Double
  var inlineSize: Double
}

object ResizeObserverSize {
  @scala.inline
  def apply(blockSize: Double, inlineSize: Double): ResizeObserverSize = {
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], inlineSize = inlineSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResizeObserverSize]
  }
}

