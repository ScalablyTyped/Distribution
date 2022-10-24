package typings.reactTypesShared.srcDndMod

import typings.reactTypesShared.reactTypesSharedStrings.dropenter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropEnterEvent
  extends StObject
     with DragDropEvent {
  
  /** The event type. */
  var `type`: dropenter
}
object DropEnterEvent {
  
  inline def apply(x: Double, y: Double): DropEnterEvent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dropenter")
    __obj.asInstanceOf[DropEnterEvent]
  }
  
  extension [Self <: DropEnterEvent](x: Self) {
    
    inline def setType(value: dropenter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
