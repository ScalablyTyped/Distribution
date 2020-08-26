package typings.reactTracking.anon

import typings.reactTracking.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracking[T] extends js.Object {
  var tracking: Options[T] with Data = js.native
}

object Tracking {
  @scala.inline
  def apply[T](tracking: Options[T] with Data): Tracking[T] = {
    val __obj = js.Dynamic.literal(tracking = tracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracking[T]]
  }
  @scala.inline
  implicit class TrackingOps[Self <: Tracking[_], T] (val x: Self with Tracking[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTracking(value: Options[T] with Data): Self = this.set("tracking", value.asInstanceOf[js.Any])
  }
  
}

