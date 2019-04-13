package typings
package reactDashMarkdownLib.reactDashMarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  val column: scala.Double
  val line: scala.Double
  val offset: js.UndefOr[scala.Double] = js.undefined
}

object Point {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double, offset: scala.Int | scala.Double = null): Point = {
    val __obj = js.Dynamic.literal(column = column, line = line)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

