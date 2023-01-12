package typings.reachDropdown.anon

import typings.reachDropdown.mod.TriggerRef
import typings.reachPopover.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsExpanded extends StObject {
  
  var isExpanded: Boolean
  
  var portal: Boolean
  
  var position: js.UndefOr[Position] = js.undefined
  
  var targetRef: TriggerRef
}
object IsExpanded {
  
  inline def apply(isExpanded: Boolean, portal: Boolean, targetRef: TriggerRef): IsExpanded = {
    val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any], portal = portal.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsExpanded]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsExpanded] (val x: Self) extends AnyVal {
    
    inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    inline def setPortal(value: Boolean): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTargetRef(value: TriggerRef): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
  }
}
