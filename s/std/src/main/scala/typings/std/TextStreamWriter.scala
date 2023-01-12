package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStreamWriter
  extends StObject
     with TextStreamBase {
  
  /**
    * Sends a string to an output stream.
    */
  /* standard scripthost */
  def Write(s: java.lang.String): Unit
  
  /**
    * Sends a specified number of blank lines (newline characters) to an output stream.
    */
  /* standard scripthost */
  def WriteBlankLines(intLines: Double): Unit
  
  /**
    * Sends a string followed by a newline character to an output stream.
    */
  /* standard scripthost */
  def WriteLine(s: java.lang.String): Unit
}
object TextStreamWriter {
  
  inline def apply(
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextStreamWriter] (val x: Self) extends AnyVal {
    
    inline def setWrite(value: java.lang.String => Unit): Self = StObject.set(x, "Write", js.Any.fromFunction1(value))
    
    inline def setWriteBlankLines(value: Double => Unit): Self = StObject.set(x, "WriteBlankLines", js.Any.fromFunction1(value))
    
    inline def setWriteLine(value: java.lang.String => Unit): Self = StObject.set(x, "WriteLine", js.Any.fromFunction1(value))
  }
}
