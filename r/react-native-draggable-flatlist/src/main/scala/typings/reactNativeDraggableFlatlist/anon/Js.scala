package typings.reactNativeDraggableFlatlist.anon

import typings.reactNativeReanimated.mod.Animated.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Js extends StObject {
  
  @JSName("js")
  var js_ : Boolean
  
  var native: Value
}
object Js {
  
  inline def apply(js_ : Boolean, native: Value): Js = {
    val __obj = js.Dynamic.literal(native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Js]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Js] (val x: Self) extends AnyVal {
    
    inline def setJs_(value: Boolean): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
    
    inline def setNative(value: Value): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
  }
}
