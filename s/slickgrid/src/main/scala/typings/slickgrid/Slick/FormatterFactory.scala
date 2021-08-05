package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatterFactory[T /* <: SlickData */] extends StObject {
  
  def getFormatter(column: Column[T]): Formatter[js.Any]
}
object FormatterFactory {
  
  inline def apply[T /* <: SlickData */](getFormatter: Column[T] => Formatter[js.Any]): FormatterFactory[T] = {
    val __obj = js.Dynamic.literal(getFormatter = js.Any.fromFunction1(getFormatter))
    __obj.asInstanceOf[FormatterFactory[T]]
  }
  
  extension [Self <: FormatterFactory[?], T /* <: SlickData */](x: Self & FormatterFactory[T]) {
    
    inline def setGetFormatter(value: Column[T] => Formatter[js.Any]): Self = StObject.set(x, "getFormatter", js.Any.fromFunction1(value))
  }
}
