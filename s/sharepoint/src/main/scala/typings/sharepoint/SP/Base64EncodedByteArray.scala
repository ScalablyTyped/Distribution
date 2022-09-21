package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base64EncodedByteArray extends StObject {
  
  def append(b: Any): Unit
  
  def getByteAt(index: Double): Any
  
  def get_length(): Double
  
  def setByteAt(index: Double, b: Any): Unit
  
  def toBase64String(): String
}
object Base64EncodedByteArray {
  
  inline def apply(
    append: Any => Unit,
    getByteAt: Double => Any,
    get_length: () => Double,
    setByteAt: (Double, Any) => Unit,
    toBase64String: () => String
  ): Base64EncodedByteArray = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), getByteAt = js.Any.fromFunction1(getByteAt), get_length = js.Any.fromFunction0(get_length), setByteAt = js.Any.fromFunction2(setByteAt), toBase64String = js.Any.fromFunction0(toBase64String))
    __obj.asInstanceOf[Base64EncodedByteArray]
  }
  
  extension [Self <: Base64EncodedByteArray](x: Self) {
    
    inline def setAppend(value: Any => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    inline def setGetByteAt(value: Double => Any): Self = StObject.set(x, "getByteAt", js.Any.fromFunction1(value))
    
    inline def setGet_length(value: () => Double): Self = StObject.set(x, "get_length", js.Any.fromFunction0(value))
    
    inline def setSetByteAt(value: (Double, Any) => Unit): Self = StObject.set(x, "setByteAt", js.Any.fromFunction2(value))
    
    inline def setToBase64String(value: () => String): Self = StObject.set(x, "toBase64String", js.Any.fromFunction0(value))
  }
}
