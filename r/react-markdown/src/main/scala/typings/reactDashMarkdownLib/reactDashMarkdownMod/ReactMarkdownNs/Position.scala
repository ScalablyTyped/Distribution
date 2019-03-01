package typings
package reactDashMarkdownLib.reactDashMarkdownMod.ReactMarkdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  val end: Point
  val indent: js.UndefOr[js.Array[scala.Double]] = js.undefined
  val start: Point
}

object Position {
  @scala.inline
  def apply(end: Point, start: Point, indent: js.Array[scala.Double] = null): Position = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    __obj.asInstanceOf[Position]
  }
}

