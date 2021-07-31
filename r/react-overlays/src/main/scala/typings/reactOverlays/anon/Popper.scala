package typings.reactOverlays.anon

import typings.popperjsCore.typesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Popper extends StObject {
  
  var placement: typings.reactOverlays.esmUsePopperMod.Placement
  
  var popper: Rect
  
  var reference: Rect
}
object Popper {
  
  @scala.inline
  def apply(placement: typings.reactOverlays.esmUsePopperMod.Placement, popper: Rect, reference: Rect): Popper = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Popper]
  }
  
  @scala.inline
  implicit class PopperMutableBuilder[Self <: Popper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlacement(value: typings.reactOverlays.esmUsePopperMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopper(value: Rect): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: Rect): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
