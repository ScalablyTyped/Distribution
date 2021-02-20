package typings.reactBeautifulDnd.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragDropContextProps extends StObject {
  
  var children: ReactNode | Null = js.native
  
  var dragHandleUsageInstructions: js.UndefOr[String] = js.native
  
  var enableDefaultSensors: js.UndefOr[Boolean] = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var onBeforeCapture: js.UndefOr[js.Function1[/* before */ BeforeCapture, Unit]] = js.native
  
  var onBeforeDragStart: js.UndefOr[js.Function1[/* initial */ DragStart, Unit]] = js.native
  
  def onDragEnd(result: DropResult, provided: ResponderProvided): Unit = js.native
  
  var onDragStart: js.UndefOr[js.Function2[/* initial */ DragStart, /* provided */ ResponderProvided, Unit]] = js.native
  
  var onDragUpdate: js.UndefOr[js.Function2[/* initial */ DragUpdate, /* provided */ ResponderProvided, Unit]] = js.native
  
  var sensors: js.UndefOr[js.Array[Sensor]] = js.native
}
object DragDropContextProps {
  
  @scala.inline
  def apply(onDragEnd: (DropResult, ResponderProvided) => Unit): DragDropContextProps = {
    val __obj = js.Dynamic.literal(onDragEnd = js.Any.fromFunction2(onDragEnd))
    __obj.asInstanceOf[DragDropContextProps]
  }
  
  @scala.inline
  implicit class DragDropContextPropsMutableBuilder[Self <: DragDropContextProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDragHandleUsageInstructions(value: String): Self = StObject.set(x, "dragHandleUsageInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragHandleUsageInstructionsUndefined: Self = StObject.set(x, "dragHandleUsageInstructions", js.undefined)
    
    @scala.inline
    def setEnableDefaultSensors(value: Boolean): Self = StObject.set(x, "enableDefaultSensors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDefaultSensorsUndefined: Self = StObject.set(x, "enableDefaultSensors", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    @scala.inline
    def setOnBeforeCapture(value: /* before */ BeforeCapture => Unit): Self = StObject.set(x, "onBeforeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBeforeCaptureUndefined: Self = StObject.set(x, "onBeforeCapture", js.undefined)
    
    @scala.inline
    def setOnBeforeDragStart(value: /* initial */ DragStart => Unit): Self = StObject.set(x, "onBeforeDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBeforeDragStartUndefined: Self = StObject.set(x, "onBeforeDragStart", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: (DropResult, ResponderProvided) => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDragStart(value: (/* initial */ DragStart, /* provided */ ResponderProvided) => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragUpdate(value: (/* initial */ DragUpdate, /* provided */ ResponderProvided) => Unit): Self = StObject.set(x, "onDragUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDragUpdateUndefined: Self = StObject.set(x, "onDragUpdate", js.undefined)
    
    @scala.inline
    def setSensors(value: js.Array[Sensor]): Self = StObject.set(x, "sensors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensorsUndefined: Self = StObject.set(x, "sensors", js.undefined)
    
    @scala.inline
    def setSensorsVarargs(value: Sensor*): Self = StObject.set(x, "sensors", js.Array(value :_*))
  }
}
