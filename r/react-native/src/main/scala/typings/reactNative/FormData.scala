package typings.reactNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormData extends StObject {
  
  def append(name: String, value: js.Any): Unit
}
object FormData {
  
  inline def apply(append: (String, js.Any) => Unit): FormData = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append))
    __obj.asInstanceOf[FormData]
  }
  
  extension [Self <: FormData](x: Self) {
    
    inline def setAppend(value: (String, js.Any) => Unit): Self = StObject.set(x, "append", js.Any.fromFunction2(value))
  }
}
