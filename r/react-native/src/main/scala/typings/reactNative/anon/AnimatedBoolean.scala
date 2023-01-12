package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedBoolean extends StObject {
  
  var animated: Boolean
}
object AnimatedBoolean {
  
  inline def apply(animated: Boolean): AnimatedBoolean = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimatedBoolean] (val x: Self) extends AnyVal {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
  }
}
