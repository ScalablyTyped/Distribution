package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaSourceEventMap extends js.Object {
  var sourceclose: Event
  var sourceended: Event
  var sourceopen: Event
}

object MediaSourceEventMap {
  @scala.inline
  def apply(sourceclose: Event, sourceended: Event, sourceopen: Event): MediaSourceEventMap = {
    val __obj = js.Dynamic.literal(sourceclose = sourceclose, sourceended = sourceended, sourceopen = sourceopen)
  
    __obj.asInstanceOf[MediaSourceEventMap]
  }
}

