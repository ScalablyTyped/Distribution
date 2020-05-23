package typings.reactSortableHoc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  var cancel: js.UndefOr[js.Array[Double]] = js.undefined
  var down: js.UndefOr[js.Array[Double]] = js.undefined
  var drop: js.UndefOr[js.Array[Double]] = js.undefined
  var lift: js.UndefOr[js.Array[Double]] = js.undefined
  var up: js.UndefOr[js.Array[Double]] = js.undefined
}

object Cancel {
  @scala.inline
  def apply(
    cancel: js.Array[Double] = null,
    down: js.Array[Double] = null,
    drop: js.Array[Double] = null,
    lift: js.Array[Double] = null,
    up: js.Array[Double] = null
  ): Cancel = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    if (drop != null) __obj.updateDynamic("drop")(drop.asInstanceOf[js.Any])
    if (lift != null) __obj.updateDynamic("lift")(lift.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
}

