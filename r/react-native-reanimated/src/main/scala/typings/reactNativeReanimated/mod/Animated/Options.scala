package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options[P] extends StObject {
  
  def setNativeProps(ref: Any, props: P): Unit
}
object Options {
  
  inline def apply[P](setNativeProps: (Any, P) => Unit): Options[P] = {
    val __obj = js.Dynamic.literal(setNativeProps = js.Any.fromFunction2(setNativeProps))
    __obj.asInstanceOf[Options[P]]
  }
  
  extension [Self <: Options[?], P](x: Self & Options[P]) {
    
    inline def setSetNativeProps(value: (Any, P) => Unit): Self = StObject.set(x, "setNativeProps", js.Any.fromFunction2(value))
  }
}
