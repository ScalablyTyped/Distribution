package typings.reactNativeReanimated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAttribute extends StObject {
  
  def setAttribute(key: String, props: Any): Unit
}
object SetAttribute {
  
  inline def apply(setAttribute: (String, Any) => Unit): SetAttribute = {
    val __obj = js.Dynamic.literal(setAttribute = js.Any.fromFunction2(setAttribute))
    __obj.asInstanceOf[SetAttribute]
  }
  
  extension [Self <: SetAttribute](x: Self) {
    
    inline def setSetAttribute(value: (String, Any) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
  }
}
