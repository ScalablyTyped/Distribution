package typings.reactNativeReanimated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def factory(t: Any): Any
}
object `1` {
  
  inline def apply(factory: Any => Any): `1` = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction1(factory))
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setFactory(value: Any => Any): Self = StObject.set(x, "factory", js.Any.fromFunction1(value))
  }
}
