package typings.storybookComponents.anon

import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placement extends StObject {
  
  var placement: typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibEnumsMod`.Placement
  
  var popper: Rect
  
  var reference: Rect
}
object Placement {
  
  inline def apply(
    placement: typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibEnumsMod`.Placement,
    popper: Rect,
    reference: Rect
  ): Placement = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
  
  extension [Self <: Placement](x: Self) {
    
    inline def setPlacement(value: typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibEnumsMod`.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPopper(value: Rect): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setReference(value: Rect): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
