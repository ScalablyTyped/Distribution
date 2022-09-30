package typings.reactNativeReanimated.anon

import typings.reactNativeReanimated.mod.Animated.EasingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def factory(): EasingFunction
}
object `0` {
  
  inline def apply(factory: () => EasingFunction): `0` = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setFactory(value: () => EasingFunction): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
  }
}
