package typings.rcResizeObserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeObserverState extends js.Object {
  var height: Double
  var width: Double
}

object ResizeObserverState {
  @scala.inline
  def apply(height: Double, width: Double): ResizeObserverState = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResizeObserverState]
  }
}

