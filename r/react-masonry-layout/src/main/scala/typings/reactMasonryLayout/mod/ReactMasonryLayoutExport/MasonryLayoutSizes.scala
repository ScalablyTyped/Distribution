package typings.reactMasonryLayout.mod.ReactMasonryLayoutExport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasonryLayoutSizes extends js.Object {
  /**
    * the number of vertical columns
    */
  var columns: Double
  /**
    * the space (in px) between the columns and grid items
    */
  var gutter: Double
  /**
    * the minimum viewport width (String CSS unit: em, px, rem)
    */
  var mq: js.UndefOr[String] = js.undefined
}

object MasonryLayoutSizes {
  @scala.inline
  def apply(columns: Double, gutter: Double, mq: String = null): MasonryLayoutSizes = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], gutter = gutter.asInstanceOf[js.Any])
    if (mq != null) __obj.updateDynamic("mq")(mq.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryLayoutSizes]
  }
}

