package typings.prettier.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorResult extends js.Object {
  var cursorOffset: Double
  var formatted: String
}

object CursorResult {
  @scala.inline
  def apply(cursorOffset: Double, formatted: String): CursorResult = {
    val __obj = js.Dynamic.literal(cursorOffset = cursorOffset, formatted = formatted)
  
    __obj.asInstanceOf[CursorResult]
  }
}

