package typings.std

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
  def Read(characters: Double): java.lang.String
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
  def Skip(characters: Double): Unit
  /**
    * Skips the next line when reading from an input text stream.
    * Can only be used on a stream in reading mode, not writing or appending mode.
    */
  def SkipLine(): Unit
}

object TextStreamReader {
  @scala.inline
  def apply(
    AtEndOfLine: scala.Boolean,
    AtEndOfStream: scala.Boolean,
    Close: () => Unit,
    Column: Double,
    Line: Double,
    Read: Double => java.lang.String,
    ReadAll: () => java.lang.String,
    ReadLine: () => java.lang.String,
    Skip: Double => Unit,
    SkipLine: () => Unit
  ): TextStreamReader = {
    val __obj = js.Dynamic.literal(AtEndOfLine = AtEndOfLine.asInstanceOf[js.Any], AtEndOfStream = AtEndOfStream.asInstanceOf[js.Any], Close = js.Any.fromFunction0(Close), Column = Column.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Read = js.Any.fromFunction1(Read), ReadAll = js.Any.fromFunction0(ReadAll), ReadLine = js.Any.fromFunction0(ReadLine), Skip = js.Any.fromFunction1(Skip), SkipLine = js.Any.fromFunction0(SkipLine))
    __obj.asInstanceOf[TextStreamReader]
  }
}

