package typings.reactNativeScreens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosingBoolean extends StObject {
  
  var closing: Boolean
}
object ClosingBoolean {
  
  inline def apply(closing: Boolean): ClosingBoolean = {
    val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosingBoolean]
  }
  
  extension [Self <: ClosingBoolean](x: Self) {
    
    inline def setClosing(value: Boolean): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
  }
}
