package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStreamBase extends js.Object {
  /**
    * The column number of the current character position in an input stream.
    */
  var Column: Double
  /**
    * The current line number in an input stream.
    */
  var Line: Double
  /**
    * Closes a text stream.
    * It is not necessary to close standard streams; they close automatically when the process ends. If
    * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
    */
  def Close(): Unit
}

object TextStreamBase {
  @scala.inline
  def apply(Close: () => Unit, Column: Double, Line: Double): TextStreamBase = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Column = Column.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStreamBase]
  }
}

