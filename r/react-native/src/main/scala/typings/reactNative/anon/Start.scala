package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Start extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var start: Double
}

object Start {
  @scala.inline
  def apply(start: Double, end: js.UndefOr[Double] = js.undefined): Start = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
}

