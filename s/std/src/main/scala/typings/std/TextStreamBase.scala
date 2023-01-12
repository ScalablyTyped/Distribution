package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStreamBase extends StObject {
  
  /**
    * Closes a text stream.
    * It is not necessary to close standard streams; they close automatically when the process ends. If
    * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
    */
  /* standard scripthost */
  def Close(): Unit
  
  /**
    * The column number of the current character position in an input stream.
    */
  /* standard scripthost */
  var Column: Double
  
  /**
    * The current line number in an input stream.
    */
  /* standard scripthost */
  var Line: Double
}
object TextStreamBase {
  
  inline def apply(Close: () => Unit, Column: Double, Line: Double): TextStreamBase = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Column = Column.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStreamBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextStreamBase] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "Close", js.Any.fromFunction0(value))
    
    inline def setColumn(value: Double): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
  }
}
