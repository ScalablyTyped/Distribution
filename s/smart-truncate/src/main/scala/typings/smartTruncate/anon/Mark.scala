package typings.smartTruncate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mark extends js.Object {
  var mark: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
}

object Mark {
  @scala.inline
  def apply(mark: String = null, position: js.UndefOr[Double] = js.undefined): Mark = {
    val __obj = js.Dynamic.literal()
    if (mark != null) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mark]
  }
}

