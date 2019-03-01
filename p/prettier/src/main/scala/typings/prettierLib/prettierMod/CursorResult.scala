package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorResult extends js.Object {
  var cursorOffset: scala.Double
  var formatted: java.lang.String
}

object CursorResult {
  @scala.inline
  def apply(cursorOffset: scala.Double, formatted: java.lang.String): CursorResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cursorOffset")(cursorOffset)
    __obj.updateDynamic("formatted")(formatted)
    __obj.asInstanceOf[CursorResult]
  }
}

