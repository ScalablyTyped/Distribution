package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStreamWriter extends TextStreamBase {
  /**
    * Sends a string to an output stream.
    */
  def Write(s: java.lang.String): scala.Unit
  /**
    * Sends a specified number of blank lines (newline characters) to an output stream.
    */
  def WriteBlankLines(intLines: scala.Double): scala.Unit
  /**
    * Sends a string followed by a newline character to an output stream.
    */
  def WriteLine(s: java.lang.String): scala.Unit
}

object TextStreamWriter {
  @scala.inline
  def apply(
    Close: () => scala.Unit,
    Column: scala.Double,
    Line: scala.Double,
    Write: java.lang.String => scala.Unit,
    WriteBlankLines: scala.Double => scala.Unit,
    WriteLine: java.lang.String => scala.Unit
  ): TextStreamWriter = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Column = Column, Line = Line, Write = js.Any.fromFunction1(Write), WriteBlankLines = js.Any.fromFunction1(WriteBlankLines), WriteLine = js.Any.fromFunction1(WriteLine))
  
    __obj.asInstanceOf[TextStreamWriter]
  }
}

