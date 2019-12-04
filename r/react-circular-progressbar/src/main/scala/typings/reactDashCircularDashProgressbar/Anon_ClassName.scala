package typings.reactDashCircularDashProgressbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var counterClockwise: Boolean
  var dashRatio: Double
  var pathRadius: Double
  var strokeWidth: Double
  var style: js.UndefOr[js.Object] = js.undefined
}

object Anon_ClassName {
  @scala.inline
  def apply(
    counterClockwise: Boolean,
    dashRatio: Double,
    pathRadius: Double,
    strokeWidth: Double,
    className: String = null,
    style: js.Object = null
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal(counterClockwise = counterClockwise.asInstanceOf[js.Any], dashRatio = dashRatio.asInstanceOf[js.Any], pathRadius = pathRadius.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassName]
  }
}

