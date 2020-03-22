package typings.rcAlign.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetPoint extends js.Object {
  var clientX: js.UndefOr[Double] = js.undefined
  var clientY: js.UndefOr[Double] = js.undefined
  var pageX: js.UndefOr[Double] = js.undefined
  var pageY: js.UndefOr[Double] = js.undefined
}

object TargetPoint {
  @scala.inline
  def apply(
    clientX: Int | Double = null,
    clientY: Int | Double = null,
    pageX: Int | Double = null,
    pageY: Int | Double = null
  ): TargetPoint = {
    val __obj = js.Dynamic.literal()
    if (clientX != null) __obj.updateDynamic("clientX")(clientX.asInstanceOf[js.Any])
    if (clientY != null) __obj.updateDynamic("clientY")(clientY.asInstanceOf[js.Any])
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetPoint]
  }
}

