package typings.raml1Parser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserAstDotcoreLinterApiMod {
  
  trait ErrorFactory[T] extends StObject {
    
    def error(w: T, message: String): Any
    
    def errorOnProperty(w: T, property: String, message: String): Any
    
    def warning(w: T, message: String): Any
    
    def warningOnProperty(w: T, property: String, message: String): Any
  }
  object ErrorFactory {
    
    inline def apply[T](
      error: (T, String) => Any,
      errorOnProperty: (T, String, String) => Any,
      warning: (T, String) => Any,
      warningOnProperty: (T, String, String) => Any
    ): ErrorFactory[T] = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction2(error), errorOnProperty = js.Any.fromFunction3(errorOnProperty), warning = js.Any.fromFunction2(warning), warningOnProperty = js.Any.fromFunction3(warningOnProperty))
      __obj.asInstanceOf[ErrorFactory[T]]
    }
    
    extension [Self <: ErrorFactory[?], T](x: Self & ErrorFactory[T]) {
      
      inline def setError(value: (T, String) => Any): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setErrorOnProperty(value: (T, String, String) => Any): Self = StObject.set(x, "errorOnProperty", js.Any.fromFunction3(value))
      
      inline def setWarning(value: (T, String) => Any): Self = StObject.set(x, "warning", js.Any.fromFunction2(value))
      
      inline def setWarningOnProperty(value: (T, String, String) => Any): Self = StObject.set(x, "warningOnProperty", js.Any.fromFunction3(value))
    }
  }
  
  trait Linter extends StObject {
    
    def registerRule(nodeType: String, rule: LinterRule[Any]): Any
  }
  object Linter {
    
    inline def apply(registerRule: (String, LinterRule[Any]) => Any): Linter = {
      val __obj = js.Dynamic.literal(registerRule = js.Any.fromFunction2(registerRule))
      __obj.asInstanceOf[Linter]
    }
    
    extension [Self <: Linter](x: Self) {
      
      inline def setRegisterRule(value: (String, LinterRule[Any]) => Any): Self = StObject.set(x, "registerRule", js.Any.fromFunction2(value))
    }
  }
  
  type LinterRule[T] = js.Function2[/* wrapper */ T, /* errorFactory */ ErrorFactory[T], Any]
}
