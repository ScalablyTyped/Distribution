package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStreamBase extends js.Object {
  /**
    * The column number of the current character position in an input stream.
    */
  var Column: Double = js.native
  /**
    * The current line number in an input stream.
    */
  var Line: Double = js.native
  /**
    * Closes a text stream.
    * It is not necessary to close standard streams; they close automatically when the process ends. If
    * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
    */
  def Close(): Unit = js.native
}

object TextStreamBase {
  @scala.inline
  def apply(Close: () => Unit, Column: Double, Line: Double): TextStreamBase = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Column = Column.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStreamBase]
  }
  @scala.inline
  implicit class TextStreamBaseOps[Self <: TextStreamBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("Close", js.Any.fromFunction0(value))
    @scala.inline
    def setColumn(value: Double): Self = this.set("Column", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("Line", value.asInstanceOf[js.Any])
  }
  
}

