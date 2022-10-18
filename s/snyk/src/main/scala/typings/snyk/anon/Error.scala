package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  def error(text: String): String
  
  def success(text: String): String
  
  def warn(text: String): String
}
object Error {
  
  inline def apply(error: String => String, success: String => String, warn: String => String): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), success = js.Any.fromFunction1(success), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: String => String): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: String => String): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setWarn(value: String => String): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
