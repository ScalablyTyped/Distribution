package typings.reactDashMarkdown.reactDashMarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  val end: Point
  val indent: js.UndefOr[js.Array[Double]] = js.undefined
  val start: Point
}

object Position {
  @scala.inline
  def apply(end: Point, start: Point, indent: js.Array[Double] = null): Position = {
    val __obj = js.Dynamic.literal(end = end, start = start)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    __obj.asInstanceOf[Position]
  }
}

