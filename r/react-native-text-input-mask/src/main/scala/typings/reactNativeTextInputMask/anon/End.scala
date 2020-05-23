package typings.reactNativeTextInputMask.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var start: Double
}

object End {
  @scala.inline
  def apply(start: Double, end: js.UndefOr[Double] = js.undefined): End = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

