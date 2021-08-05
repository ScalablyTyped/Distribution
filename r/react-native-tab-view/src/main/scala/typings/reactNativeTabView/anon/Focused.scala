package typings.reactNativeTabView.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focused[T /* <: typings.reactNativeTabView.typesMod.Route */] extends StObject {
  
  var color: String
  
  var focused: Boolean
  
  var route: T
}
object Focused {
  
  inline def apply[T /* <: typings.reactNativeTabView.typesMod.Route */](color: String, focused: Boolean, route: T): Focused[T] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused[T]]
  }
  
  extension [Self <: Focused[?], T /* <: typings.reactNativeTabView.typesMod.Route */](x: Self & Focused[T]) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: T): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
