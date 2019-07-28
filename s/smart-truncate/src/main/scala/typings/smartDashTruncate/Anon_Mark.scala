package typings.smartDashTruncate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mark extends js.Object {
  var mark: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
}

object Anon_Mark {
  @scala.inline
  def apply(mark: String = null, position: Int | Double = null): Anon_Mark = {
    val __obj = js.Dynamic.literal()
    if (mark != null) __obj.updateDynamic("mark")(mark)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Mark]
  }
}

