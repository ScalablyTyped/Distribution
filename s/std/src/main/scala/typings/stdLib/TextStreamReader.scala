package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStreamReader extends TextStreamBase {
  /**
    * Indicates whether the stream pointer position is at the end of a line.
    */
  var AtEndOfLine: scala.Boolean
  /**
    * Indicates whether the stream pointer position is at the end of a stream.
    */
  var AtEndOfStream: scala.Boolean
  /**
    * Returns a specified number of characters from an input stream, starting at the current pointer position.
    * Does not return until the ENTER key is pressed.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    */
  def Read(characters: scala.Double): java.lang.String
  /**
    * Returns all characters from an input stream.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    */
  def ReadAll(): java.lang.String
  /**
    * Returns an entire line from an input stream.
    * Although this method extracts the newline character, it does not add it to the returned string.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    */
  def ReadLine(): java.lang.String
  /**
    * Skips a specified number of characters when reading from an input text stream.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    * @param characters Positive number of characters to skip forward. (Backward skipping is not supported.)
    */
  def Skip(characters: scala.Double): scala.Unit
  /**
    * Skips the next line when reading from an input text stream.
    * Can only be used on a stream in reading mode, not writing or appending mode.
    */
  def SkipLine(): scala.Unit
}

object TextStreamReader {
  @scala.inline
  def apply(
    AtEndOfLine: scala.Boolean,
    AtEndOfStream: scala.Boolean,
    Close: js.Function0[scala.Unit],
    Column: scala.Double,
    Line: scala.Double,
    Read: js.Function1[scala.Double, java.lang.String],
    ReadAll: js.Function0[java.lang.String],
    ReadLine: js.Function0[java.lang.String],
    Skip: js.Function1[scala.Double, scala.Unit],
    SkipLine: js.Function0[scala.Unit]
  ): TextStreamReader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AtEndOfLine")(AtEndOfLine)
    __obj.updateDynamic("AtEndOfStream")(AtEndOfStream)
    __obj.updateDynamic("Close")(Close)
    __obj.updateDynamic("Column")(Column)
    __obj.updateDynamic("Line")(Line)
    __obj.updateDynamic("Read")(Read)
    __obj.updateDynamic("ReadAll")(ReadAll)
    __obj.updateDynamic("ReadLine")(ReadLine)
    __obj.updateDynamic("Skip")(Skip)
    __obj.updateDynamic("SkipLine")(SkipLine)
    __obj.asInstanceOf[TextStreamReader]
  }
}

