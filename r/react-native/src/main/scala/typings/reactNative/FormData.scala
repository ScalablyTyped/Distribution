package typings.reactNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormData
  extends StObject
     with _BodyInit {
  
  def append(name: String, value: Any): Unit
  
  def getAll(): js.Array[FormDataValue]
  
  def getParts(): js.Array[FormDataPart]
}
object FormData {
  
  inline def apply(
    append: (String, Any) => Unit,
    getAll: () => js.Array[FormDataValue],
    getParts: () => js.Array[FormDataPart]
  ): FormData = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), getAll = js.Any.fromFunction0(getAll), getParts = js.Any.fromFunction0(getParts))
    __obj.asInstanceOf[FormData]
  }
  
  extension [Self <: FormData](x: Self) {
    
    inline def setAppend(value: (String, Any) => Unit): Self = StObject.set(x, "append", js.Any.fromFunction2(value))
    
    inline def setGetAll(value: () => js.Array[FormDataValue]): Self = StObject.set(x, "getAll", js.Any.fromFunction0(value))
    
    inline def setGetParts(value: () => js.Array[FormDataPart]): Self = StObject.set(x, "getParts", js.Any.fromFunction0(value))
  }
}
