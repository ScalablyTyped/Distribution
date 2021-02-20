package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatterFactory[T /* <: SlickData */] extends StObject {
  
  def getFormatter(column: Column[T]): Formatter[_] = js.native
}
object FormatterFactory {
  
  @scala.inline
  def apply[T /* <: SlickData */](getFormatter: Column[T] => Formatter[_]): FormatterFactory[T] = {
    val __obj = js.Dynamic.literal(getFormatter = js.Any.fromFunction1(getFormatter))
    __obj.asInstanceOf[FormatterFactory[T]]
  }
  
  @scala.inline
  implicit class FormatterFactoryMutableBuilder[Self <: FormatterFactory[_], T /* <: SlickData */] (val x: Self with FormatterFactory[T]) extends AnyVal {
    
    @scala.inline
    def setGetFormatter(value: Column[T] => Formatter[_]): Self = StObject.set(x, "getFormatter", js.Any.fromFunction1(value))
  }
}
