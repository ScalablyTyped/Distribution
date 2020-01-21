package typings.reactTracking

import typings.reactTracking.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTracking[T] extends js.Object {
  var tracking: Options[T] with AnonData
}

object AnonTracking {
  @scala.inline
  def apply[T](tracking: Options[T] with AnonData): AnonTracking[T] = {
    val __obj = js.Dynamic.literal(tracking = tracking.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTracking[T]]
  }
}

