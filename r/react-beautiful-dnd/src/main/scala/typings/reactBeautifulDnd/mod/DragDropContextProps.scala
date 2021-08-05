package typings.reactBeautifulDnd.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragDropContextProps extends StObject {
  
  var children: ReactNode | Null
  
  var dragHandleUsageInstructions: js.UndefOr[String] = js.undefined
  
  var enableDefaultSensors: js.UndefOr[Boolean] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var onBeforeCapture: js.UndefOr[js.Function1[/* before */ BeforeCapture, Unit]] = js.undefined
  
  var onBeforeDragStart: js.UndefOr[js.Function1[/* initial */ DragStart, Unit]] = js.undefined
  
  def onDragEnd(result: DropResult, provided: ResponderProvided): Unit
  
  var onDragStart: js.UndefOr[js.Function2[/* initial */ DragStart, /* provided */ ResponderProvided, Unit]] = js.undefined
  
  var onDragUpdate: js.UndefOr[js.Function2[/* initial */ DragUpdate, /* provided */ ResponderProvided, Unit]] = js.undefined
  
  var sensors: js.UndefOr[js.Array[Sensor]] = js.undefined
}
object DragDropContextProps {
  
  inline def apply(onDragEnd: (DropResult, ResponderProvided) => Unit): DragDropContextProps = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    __obj.asInstanceOf[DragDropContextProps]
  }
  
  extension [Self <: DragDropContextProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDragHandleUsageInstructions(value: String): Self = StObject.set(x, "dragHandleUsageInstructions", value.asInstanceOf[js.Any])
    
    inline def setDragHandleUsageInstructionsUndefined: Self = StObject.set(x, "dragHandleUsageInstructions", js.undefined)
    
    inline def setEnableDefaultSensors(value: Boolean): Self = StObject.set(x, "enableDefaultSensors", value.asInstanceOf[js.Any])
    
    inline def setEnableDefaultSensorsUndefined: Self = StObject.set(x, "enableDefaultSensors", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setOnBeforeCapture(value: /* before */ BeforeCapture => Unit): Self = StObject.set(x, "onBeforeCapture", js.Any.fromFunction1(value))
    
    inline def setOnBeforeCaptureUndefined: Self = StObject.set(x, "onBeforeCapture", js.undefined)
    
    inline def setOnBeforeDragStart(value: /* initial */ DragStart => Unit): Self = StObject.set(x, "onBeforeDragStart", js.Any.fromFunction1(value))
    
    inline def setOnBeforeDragStartUndefined: Self = StObject.set(x, "onBeforeDragStart", js.undefined)
    
    inline def setOnDragEnd(value: (DropResult, ResponderProvided) => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction2(value))
    
    inline def setOnDragStart(value: (/* initial */ DragStart, /* provided */ ResponderProvided) => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction2(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUpdate(value: (/* initial */ DragUpdate, /* provided */ ResponderProvided) => Unit): Self = StObject.set(x, "onDragUpdate", js.Any.fromFunction2(value))
    
    inline def setOnDragUpdateUndefined: Self = StObject.set(x, "onDragUpdate", js.undefined)
    
    inline def setSensors(value: js.Array[Sensor]): Self = StObject.set(x, "sensors", value.asInstanceOf[js.Any])
    
    inline def setSensorsUndefined: Self = StObject.set(x, "sensors", js.undefined)
    
    inline def setSensorsVarargs(value: Sensor*): Self = StObject.set(x, "sensors", js.Array(value :_*))
  }
}
