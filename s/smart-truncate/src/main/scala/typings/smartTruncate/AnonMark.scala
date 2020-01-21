package typings.smartTruncate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMark extends js.Object {
  var mark: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
}

object AnonMark {
  @scala.inline
  def apply(mark: String = null, position: Int | Double = null): AnonMark = {
    val __obj = js.Dynamic.literal()
    if (mark != null) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMark]
  }
}

