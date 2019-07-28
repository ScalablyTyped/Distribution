package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndStart extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var start: Double
}

object Anon_EndStart {
  @scala.inline
  def apply(start: Double, end: Int | Double = null): Anon_EndStart = {
    val __obj = js.Dynamic.literal(start = start)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndStart]
  }
}

