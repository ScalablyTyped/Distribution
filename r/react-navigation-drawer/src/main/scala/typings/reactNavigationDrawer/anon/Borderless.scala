package typings.reactNavigationDrawer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Borderless extends StObject {
  
  var borderless: Boolean
  
  var pressColor: String
}
object Borderless {
  
  @scala.inline
  def apply(borderless: Boolean, pressColor: String): Borderless = {
    val __obj = js.Dynamic.literal(borderless = borderless.asInstanceOf[js.Any], pressColor = pressColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borderless]
  }
  
  @scala.inline
  implicit class BorderlessMutableBuilder[Self <: Borderless] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressColor(value: String): Self = StObject.set(x, "pressColor", value.asInstanceOf[js.Any])
  }
}
