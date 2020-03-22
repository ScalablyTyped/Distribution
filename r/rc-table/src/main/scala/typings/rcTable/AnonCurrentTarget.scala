package typings.rcTable

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentTarget extends js.Object {
  var currentTarget: js.UndefOr[HTMLElement] = js.undefined
  var scrollLeft: js.UndefOr[Double] = js.undefined
}

object AnonCurrentTarget {
  @scala.inline
  def apply(currentTarget: HTMLElement = null, scrollLeft: Int | Double = null): AnonCurrentTarget = {
    val __obj = js.Dynamic.literal()
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentTarget]
  }
}

