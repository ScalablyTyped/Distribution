package typings.reactNativeReanimated.mod

import typings.reactNative.mod.EasingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EasingFunctionFactory extends StObject {
  
  def factory(): EasingFunction
}
object EasingFunctionFactory {
  
  inline def apply(factory: () => EasingFunction): EasingFunctionFactory = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    __obj.asInstanceOf[EasingFunctionFactory]
  }
  
  extension [Self <: EasingFunctionFactory](x: Self) {
    
    inline def setFactory(value: () => EasingFunction): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
  }
}
