package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveIcon extends StObject {
  
  var active: Boolean
  
  var icon: Boolean
  
  var label: String
}
object ActiveIcon {
  
  @scala.inline
  def apply(active: Boolean, icon: Boolean, label: String): ActiveIcon = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveIcon]
  }
  
  @scala.inline
  implicit class ActiveIconMutableBuilder[Self <: ActiveIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: Boolean): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
