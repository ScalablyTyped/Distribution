package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JumpTo extends StObject {
  
  def jumpTo(key: String): Unit
  
  var route: typings.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Route
}
object JumpTo {
  
  inline def apply(
    jumpTo: String => Unit,
    route: typings.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Route
  ): JumpTo = {
    val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1(jumpTo), route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumpTo]
  }
  
  extension [Self <: JumpTo](x: Self) {
    
    inline def setJumpTo(value: String => Unit): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1(value))
    
    inline def setRoute(value: typings.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
