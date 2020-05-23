package typings.reactTracking.anon

import typings.reactTracking.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tracking[T] extends js.Object {
  var tracking: Options[T] with Data
}

object Tracking {
  @scala.inline
  def apply[T](tracking: Options[T] with Data): Tracking[T] = {
    val __obj = js.Dynamic.literal(tracking = tracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracking[T]]
  }
}

