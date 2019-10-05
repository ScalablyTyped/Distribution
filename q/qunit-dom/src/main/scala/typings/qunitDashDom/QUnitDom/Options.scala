package typings.qunitDashDom.QUnitDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(count: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

