package typings.reactDashSortableDashHoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var cancel: js.UndefOr[js.Array[Double]] = js.undefined
  var down: js.UndefOr[js.Array[Double]] = js.undefined
  var drop: js.UndefOr[js.Array[Double]] = js.undefined
  var lift: js.UndefOr[js.Array[Double]] = js.undefined
  var up: js.UndefOr[js.Array[Double]] = js.undefined
}

object Anon_Cancel {
  @scala.inline
  def apply(
    cancel: js.Array[Double] = null,
    down: js.Array[Double] = null,
    drop: js.Array[Double] = null,
    lift: js.Array[Double] = null,
    up: js.Array[Double] = null
  ): Anon_Cancel = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (down != null) __obj.updateDynamic("down")(down)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (lift != null) __obj.updateDynamic("lift")(lift)
    if (up != null) __obj.updateDynamic("up")(up)
    __obj.asInstanceOf[Anon_Cancel]
  }
}

