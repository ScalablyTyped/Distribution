package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base64EncodedByteArray extends StObject {
  
  def append(b: js.Any): Unit
  
  def getByteAt(index: Double): js.Any
  
  def get_length(): Double
  
  def setByteAt(index: Double, b: js.Any): Unit
  
  def toBase64String(): String
}
object Base64EncodedByteArray {
  
  @scala.inline
  def apply(
    append: js.Any => Unit,
    getByteAt: Double => js.Any,
    get_length: () => Double,
    setByteAt: (Double, js.Any) => Unit,
    toBase64String: () => String
  ): Base64EncodedByteArray = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), getByteAt = js.Any.fromFunction1(getByteAt), get_length = js.Any.fromFunction0(get_length), setByteAt = js.Any.fromFunction2(setByteAt), toBase64String = js.Any.fromFunction0(toBase64String))
    __obj.asInstanceOf[Base64EncodedByteArray]
  }
  
  @scala.inline
  implicit class Base64EncodedByteArrayMutableBuilder[Self <: Base64EncodedByteArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppend(value: js.Any => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetByteAt(value: Double => js.Any): Self = StObject.set(x, "getByteAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_length(value: () => Double): Self = StObject.set(x, "get_length", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetByteAt(value: (Double, js.Any) => Unit): Self = StObject.set(x, "setByteAt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToBase64String(value: () => String): Self = StObject.set(x, "toBase64String", js.Any.fromFunction0(value))
  }
}
