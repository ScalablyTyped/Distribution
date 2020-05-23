package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Left extends js.Object {
  var left: js.UndefOr[Max] = js.undefined
  var right: js.UndefOr[Max] = js.undefined
}

object Left {
  @scala.inline
  def apply(left: Max = null, right: Max = null): Left = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
}

