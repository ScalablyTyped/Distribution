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
    Close: js.Function0[scala.Unit],
    Column: scala.Double,
    Line: scala.Double,
    Write: js.Function1[java.lang.String, scala.Unit],
    WriteBlankLines: js.Function1[scala.Double, scala.Unit],
    WriteLine: js.Function1[java.lang.String, scala.Unit]
  ): TextStreamWriter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Close")(Close)
    __obj.updateDynamic("Column")(Column)
    __obj.updateDynamic("Line")(Line)
    __obj.updateDynamic("Write")(Write)
    __obj.updateDynamic("WriteBlankLines")(WriteBlankLines)
    __obj.updateDynamic("WriteLine")(WriteLine)
    __obj.asInstanceOf[TextStreamWriter]
  }
}

