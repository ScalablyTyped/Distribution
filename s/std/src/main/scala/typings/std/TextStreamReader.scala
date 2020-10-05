package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStreamReader extends TextStreamBase {
  /**
    * Indicates whether the stream pointer position is at the end of a line.
    */
  var AtEndOfLine: scala.Boolean = js.native
  /**
    * Indicates whether the stream pointer position is at the end of a stream.
    */
  var AtEndOfStream: scala.Boolean = js.native
  /**
    * Returns a specified number of characters from an input stream, starting at the current pointer position.
    * Does not return until the ENTER key is pressed.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    */
  def Read(characters: Double): java.lang.String = js.native
  /**
    * Returns all characters from an input stream.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    */
  def ReadAll(): java.lang.String = js.native
  /**
    * Returns an entire line from an input stream.
    * Although this method extracts the newline character, it does not add it to the returned string.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    */
  def ReadLine(): java.lang.String = js.native
  /**
    * Skips a specified number of characters when reading from an input text stream.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    * @param characters Positive number of characters to skip forward. (Backward skipping is not supported.)
    */
  def Skip(characters: Double): Unit = js.native
  /**
    * Skips the next line when reading from an input text stream.
    * Can only be used on a stream in reading mode, not writing or appending mode.
    */
  def SkipLine(): Unit = js.native
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
  @scala.inline
  implicit class TextStreamReaderOps[Self <: TextStreamReader] (val x: Self) extends AnyVal {
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
    def setAtEndOfLine(value: scala.Boolean): Self = this.set("AtEndOfLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setAtEndOfStream(value: scala.Boolean): Self = this.set("AtEndOfStream", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: Double => java.lang.String): Self = this.set("Read", js.Any.fromFunction1(value))
    @scala.inline
    def setReadAll(value: () => java.lang.String): Self = this.set("ReadAll", js.Any.fromFunction0(value))
    @scala.inline
    def setReadLine(value: () => java.lang.String): Self = this.set("ReadLine", js.Any.fromFunction0(value))
    @scala.inline
    def setSkip(value: Double => Unit): Self = this.set("Skip", js.Any.fromFunction1(value))
    @scala.inline
    def setSkipLine(value: () => Unit): Self = this.set("SkipLine", js.Any.fromFunction0(value))
  }
  
}

