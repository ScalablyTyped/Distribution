package typings.reactOnsenui.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expandable extends StObject {
  
  var expandable: js.UndefOr[Boolean] = js.undefined
  
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  var lockOnDrag: js.UndefOr[Boolean] = js.undefined
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[js.Any]] = js.undefined
  
  var tapBackgroundColor: js.UndefOr[String] = js.undefined
  
  var tappable: js.UndefOr[Boolean] = js.undefined
}
object Expandable {
  
  inline def apply(): Expandable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expandable]
  }
  
  extension [Self <: Expandable](x: Self) {
    
    inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setLockOnDrag(value: Boolean): Self = StObject.set(x, "lockOnDrag", value.asInstanceOf[js.Any])
    
    inline def setLockOnDragUndefined: Self = StObject.set(x, "lockOnDrag", js.undefined)
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setOnClick(value: MouseEvent[js.Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTapBackgroundColor(value: String): Self = StObject.set(x, "tapBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setTapBackgroundColorUndefined: Self = StObject.set(x, "tapBackgroundColor", js.undefined)
    
    inline def setTappable(value: Boolean): Self = StObject.set(x, "tappable", value.asInstanceOf[js.Any])
    
    inline def setTappableUndefined: Self = StObject.set(x, "tappable", js.undefined)
  }
}
