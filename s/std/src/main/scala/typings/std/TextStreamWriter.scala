package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStreamWriter extends TextStreamBase {
  /**
    * Sends a string to an output stream.
    */
  def Write(s: java.lang.String): Unit
  /**
    * Sends a specified number of blank lines (newline characters) to an output stream.
    */
  def WriteBlankLines(intLines: Double): Unit
  /**
    * Sends a string followed by a newline character to an output stream.
    */
  def WriteLine(s: java.lang.String): Unit
}

object TextStreamWriter {
  @scala.inline
  def apply(
    Close: () => Unit,
    Column: Double,
    Line: Double,
    Write: java.lang.String => Unit,
    WriteBlankLines: Double => Unit,
    WriteLine: java.lang.String => Unit
  ): TextStreamWriter = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Column = Column.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Write = js.Any.fromFunction1(Write), WriteBlankLines = js.Any.fromFunction1(WriteBlankLines), WriteLine = js.Any.fromFunction1(WriteLine))
    __obj.asInstanceOf[TextStreamWriter]
  }
}

