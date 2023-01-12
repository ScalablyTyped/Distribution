package typings.reactNativeReanimated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Factory extends StObject {
  
  def factory(): js.Function1[/* x */ Double, Double]
}
object Factory {
  
  inline def apply(factory: () => js.Function1[/* x */ Double, Double]): Factory = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    __obj.asInstanceOf[Factory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Factory] (val x: Self) extends AnyVal {
    
    inline def setFactory(value: () => js.Function1[/* x */ Double, Double]): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
  }
}
