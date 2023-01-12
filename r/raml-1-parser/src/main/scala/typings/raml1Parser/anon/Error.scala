package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  def error(x: Any): Unit
  
  def fatalError(x: Any): Unit
  
  def warning(x: Any): Unit
}
object Error {
  
  inline def apply(error: Any => Unit, fatalError: Any => Unit, warning: Any => Unit): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), fatalError = js.Any.fromFunction1(fatalError), warning = js.Any.fromFunction1(warning))
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    inline def setError(value: Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setFatalError(value: Any => Unit): Self = StObject.set(x, "fatalError", js.Any.fromFunction1(value))
    
    inline def setWarning(value: Any => Unit): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
  }
}
