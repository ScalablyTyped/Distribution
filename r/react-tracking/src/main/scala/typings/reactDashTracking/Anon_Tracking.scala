package typings.reactDashTracking

import typings.reactDashTracking.reactDashTrackingMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tracking[T] extends js.Object {
  var tracking: Options[T] with Anon_Data
}

object Anon_Tracking {
  @scala.inline
  def apply[T](tracking: Options[T] with Anon_Data): Anon_Tracking[T] = {
    val __obj = js.Dynamic.literal(tracking = tracking)
  
    __obj.asInstanceOf[Anon_Tracking[T]]
  }
}

