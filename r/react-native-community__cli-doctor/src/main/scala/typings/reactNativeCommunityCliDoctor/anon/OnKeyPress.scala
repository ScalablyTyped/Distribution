package typings.reactNativeCommunityCliDoctor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnKeyPress extends StObject {
  
  def onKeyPress(args: Any*): Unit
}
object OnKeyPress {
  
  inline def apply(onKeyPress: /* repeated */ Any => Unit): OnKeyPress = {
    val __obj = js.Dynamic.literal(onKeyPress = js.Any.fromFunction1(onKeyPress))
    __obj.asInstanceOf[OnKeyPress]
  }
  
  extension [Self <: OnKeyPress](x: Self) {
    
    inline def setOnKeyPress(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
  }
}
