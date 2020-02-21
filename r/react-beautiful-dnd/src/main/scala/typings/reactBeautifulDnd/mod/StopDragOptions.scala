package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopDragOptions extends js.Object {
  var shouldBlockNextClick: Boolean
}

object StopDragOptions {
  @scala.inline
  def apply(shouldBlockNextClick: Boolean): StopDragOptions = {
    val __obj = js.Dynamic.literal(shouldBlockNextClick = shouldBlockNextClick.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopDragOptions]
  }
}

