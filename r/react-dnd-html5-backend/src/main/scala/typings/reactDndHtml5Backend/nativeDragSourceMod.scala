package typings.reactDndHtml5Backend

import typings.dndCore.interfacesMod.DragDropMonitor
import typings.reactDndHtml5Backend.nativeTypesConfigMod.NativeItemConfig
import typings.std.DataTransfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDragSourceMod {
  
  @JSImport("react-dnd-html5-backend/dist/NativeDragSources/NativeDragSource", "NativeDragSource")
  @js.native
  open class NativeDragSource protected () extends StObject {
    def this(config: NativeItemConfig) = this()
    
    def beginDrag(): Any = js.native
    
    def canDrag(): Boolean = js.native
    
    /* private */ var config: Any = js.native
    
    def endDrag(): Unit = js.native
    
    /* private */ var initializeExposedProperties: Any = js.native
    
    def isDragging(monitor: DragDropMonitor, handle: String): Boolean = js.native
    
    var item: Any = js.native
    
    def loadDataTransfer(): Unit = js.native
    def loadDataTransfer(dataTransfer: DataTransfer): Unit = js.native
  }
}
