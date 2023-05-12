package typings.reactBeautifulDnd.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragDropContextProps
  extends StObject
     with Responders {
  
  var children: ReactNode | Null
  
  var dragHandleUsageInstructions: js.UndefOr[String] = js.undefined
  
  var enableDefaultSensors: js.UndefOr[Boolean] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var sensors: js.UndefOr[js.Array[Sensor]] = js.undefined
}
object DragDropContextProps {
  
  inline def apply(onDragEnd: (/* result */ DropResult, /* provided */ ResponderProvided) => Unit): DragDropContextProps = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    __obj.asInstanceOf[DragDropContextProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragDropContextProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDragHandleUsageInstructions(value: String): Self = StObject.set(x, "dragHandleUsageInstructions", value.asInstanceOf[js.Any])
    
    inline def setDragHandleUsageInstructionsUndefined: Self = StObject.set(x, "dragHandleUsageInstructions", js.undefined)
    
    inline def setEnableDefaultSensors(value: Boolean): Self = StObject.set(x, "enableDefaultSensors", value.asInstanceOf[js.Any])
    
    inline def setEnableDefaultSensorsUndefined: Self = StObject.set(x, "enableDefaultSensors", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setSensors(value: js.Array[Sensor]): Self = StObject.set(x, "sensors", value.asInstanceOf[js.Any])
    
    inline def setSensorsUndefined: Self = StObject.set(x, "sensors", js.undefined)
    
    inline def setSensorsVarargs(value: Sensor*): Self = StObject.set(x, "sensors", js.Array(value*))
  }
}
