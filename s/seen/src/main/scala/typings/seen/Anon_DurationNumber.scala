package typings.seen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DurationNumber extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object Anon_DurationNumber {
  @scala.inline
  def apply(duration: Int | Double = null): Anon_DurationNumber = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DurationNumber]
  }
}

