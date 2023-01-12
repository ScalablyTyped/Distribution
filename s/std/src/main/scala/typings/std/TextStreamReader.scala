package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStreamReader
  extends StObject
     with TextStreamBase {
  
  /**
    * Indicates whether the stream pointer position is at the end of a line.
    */
  /* standard scripthost */
  var AtEndOfLine: scala.Boolean
  
  /**
    * Indicates whether the stream pointer position is at the end of a stream.
    */
  /* standard scripthost */
  var AtEndOfStream: scala.Boolean
  
  /**
    * Returns a specified number of characters from an input stream, starting at the current pointer position.
    * Does not return until the ENTER key is pressed.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    */
  /* standard scripthost */
  def Read(characters: Double): java.lang.String
  
  /**
    * Returns all characters from an input stream.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    */
  /* standard scripthost */
  def ReadAll(): java.lang.String
  
  /**
    * Returns an entire line from an input stream.
    * Although this method extracts the newline character, it does not add it to the returned string.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    */
  /* standard scripthost */
  def ReadLine(): java.lang.String
  
  /**
    * Skips a specified number of characters when reading from an input text stream.
    * Can only be used on a stream in reading mode; causes an error in writing or appending mode.
    * @param characters Positive number of characters to skip forward. (Backward skipping is not supported.)
    */
  /* standard scripthost */
  def Skip(characters: Double): Unit
  
  /**
    * Skips the next line when reading from an input text stream.
    * Can only be used on a stream in reading mode, not writing or appending mode.
    */
  /* standard scripthost */
  def SkipLine(): Unit
}
object TextStreamReader {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: TextStreamReader] (val x: Self) extends AnyVal {
    
    inline def setAtEndOfLine(value: scala.Boolean): Self = StObject.set(x, "AtEndOfLine", value.asInstanceOf[js.Any])
    
    inline def setAtEndOfStream(value: scala.Boolean): Self = StObject.set(x, "AtEndOfStream", value.asInstanceOf[js.Any])
    
    inline def setRead(value: Double => java.lang.String): Self = StObject.set(x, "Read", js.Any.fromFunction1(value))
    
    inline def setReadAll(value: () => java.lang.String): Self = StObject.set(x, "ReadAll", js.Any.fromFunction0(value))
    
    inline def setReadLine(value: () => java.lang.String): Self = StObject.set(x, "ReadLine", js.Any.fromFunction0(value))
    
    inline def setSkip(value: Double => Unit): Self = StObject.set(x, "Skip", js.Any.fromFunction1(value))
    
    inline def setSkipLine(value: () => Unit): Self = StObject.set(x, "SkipLine", js.Any.fromFunction0(value))
  }
}
