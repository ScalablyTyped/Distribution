package typings.reactNavigationDrawer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveBackgroundColor extends StObject {
  
  var activeBackgroundColor: Dark
  
  var activeTintColor: Dark
  
  var inactiveBackgroundColor: Dark
  
  var inactiveTintColor: Dark
}
object ActiveBackgroundColor {
  
  inline def apply(
    activeBackgroundColor: Dark,
    activeTintColor: Dark,
    inactiveBackgroundColor: Dark,
    inactiveTintColor: Dark
  ): ActiveBackgroundColor = {
    val __obj = js.Dynamic.literal(activeBackgroundColor = activeBackgroundColor.asInstanceOf[js.Any], activeTintColor = activeTintColor.asInstanceOf[js.Any], inactiveBackgroundColor = inactiveBackgroundColor.asInstanceOf[js.Any], inactiveTintColor = inactiveTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveBackgroundColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveBackgroundColor] (val x: Self) extends AnyVal {
    
    inline def setActiveBackgroundColor(value: Dark): Self = StObject.set(x, "activeBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setActiveTintColor(value: Dark): Self = StObject.set(x, "activeTintColor", value.asInstanceOf[js.Any])
    
    inline def setInactiveBackgroundColor(value: Dark): Self = StObject.set(x, "inactiveBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setInactiveTintColor(value: Dark): Self = StObject.set(x, "inactiveTintColor", value.asInstanceOf[js.Any])
  }
}
