package typings
package prettierLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CursorNodeStart extends js.Object {
  var cursorNodeStart: js.UndefOr[scala.Double] = js.undefined
  var cursorNodeText: js.UndefOr[java.lang.String] = js.undefined
  var formatted: java.lang.String
}

object Anon_CursorNodeStart {
  @scala.inline
  def apply(
    formatted: java.lang.String,
    cursorNodeStart: scala.Int | scala.Double = null,
    cursorNodeText: java.lang.String = null
  ): Anon_CursorNodeStart = {
    val __obj = js.Dynamic.literal(formatted = formatted)
    if (cursorNodeStart != null) __obj.updateDynamic("cursorNodeStart")(cursorNodeStart.asInstanceOf[js.Any])
    if (cursorNodeText != null) __obj.updateDynamic("cursorNodeText")(cursorNodeText)
    __obj.asInstanceOf[Anon_CursorNodeStart]
  }
}

