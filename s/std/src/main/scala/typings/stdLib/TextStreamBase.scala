package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStreamBase extends js.Object {
  /**
    * The column number of the current character position in an input stream.
    */
  var Column: scala.Double
  /**
    * The current line number in an input stream.
    */
  var Line: scala.Double
  /**
    * Closes a text stream.
    * It is not necessary to close standard streams; they close automatically when the process ends. If
    * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
    */
  def Close(): scala.Unit
}

object TextStreamBase {
  @scala.inline
  def apply(Close: js.Function0[scala.Unit], Column: scala.Double, Line: scala.Double): TextStreamBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Close")(Close)
    __obj.updateDynamic("Column")(Column)
    __obj.updateDynamic("Line")(Line)
    __obj.asInstanceOf[TextStreamBase]
  }
}

