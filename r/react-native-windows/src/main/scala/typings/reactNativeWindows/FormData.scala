package typings.reactNativeWindows

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormData
  extends StObject
     with _BodyInit {
  
  def append(name: String, value: Any): Unit
  
  def getParts(): js.Array[FormDataPart]
}
object FormData {
  
  inline def apply(append: (String, Any) => Unit, getParts: () => js.Array[FormDataPart]): FormData = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), getParts = js.Any.fromFunction0(getParts))
    __obj.asInstanceOf[FormData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormData] (val x: Self) extends AnyVal {
    
    inline def setAppend(value: (String, Any) => Unit): Self = StObject.set(x, "append", js.Any.fromFunction2(value))
    
    inline def setGetParts(value: () => js.Array[FormDataPart]): Self = StObject.set(x, "getParts", js.Any.fromFunction0(value))
  }
}
