package typings.rcTable.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentTarget extends js.Object {
  var currentTarget: js.UndefOr[HTMLElement] = js.undefined
  var scrollLeft: js.UndefOr[Double] = js.undefined
}

object CurrentTarget {
  @scala.inline
  def apply(currentTarget: HTMLElement = null, scrollLeft: js.UndefOr[Double] = js.undefined): CurrentTarget = {
    val __obj = js.Dynamic.literal()
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollLeft)) __obj.updateDynamic("scrollLeft")(scrollLeft.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTarget]
  }
}

