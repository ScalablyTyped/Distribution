package typings.smoothScrollbar.scrollbarMod

import typings.smoothScrollbar.data2dMod.Data2d
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollStatus extends js.Object {
  var limit: Data2d
  var offset: Data2d
}

object ScrollStatus {
  @scala.inline
  def apply(limit: Data2d, offset: Data2d): ScrollStatus = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScrollStatus]
  }
}

