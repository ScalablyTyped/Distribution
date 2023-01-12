package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Left extends StObject {
  
  var Left: String
  
  var Right: String
}
object Left {
  
  inline def apply(Left: String, Right: String): Left = {
    val __obj = js.Dynamic.literal(Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: String): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: String): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
  }
}
