package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slottable extends StObject {
  
  /* standard dom */
  val assignedSlot: HTMLSlotElement | Null
}
object Slottable {
  
  inline def apply(): Slottable = {
    val __obj = js.Dynamic.literal(assignedSlot = null)
    __obj.asInstanceOf[Slottable]
  }
  
  extension [Self <: Slottable](x: Self) {
    
    inline def setAssignedSlot(value: HTMLSlotElement): Self = StObject.set(x, "assignedSlot", value.asInstanceOf[js.Any])
    
    inline def setAssignedSlotNull: Self = StObject.set(x, "assignedSlot", null)
  }
}
