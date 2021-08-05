package typings.reactDnd

import typings.dndCore.interfacesMod.DragDropMonitor
import typings.dndCore.interfacesMod.DragSource
import typings.dndCore.interfacesMod.Identifier
import typings.react.mod.RefObject
import typings.reactDnd.interfacesMod.DragSourceSpec
import typings.reactDnd.monitorsMod.DragSourceMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSourceFactoryMod {
  
  @JSImport("react-dnd/lib/decorators/createSourceFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSourceFactory[Props, DragObject](spec: DragSourceSpec[Props, DragObject]): js.Function2[/* monitor */ DragSourceMonitor, /* ref */ RefObject[js.Any], Source] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSourceFactory")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* monitor */ DragSourceMonitor, /* ref */ RefObject[js.Any], Source]]
  
  trait Source
    extends StObject
       with DragSource {
    
    def receiveProps(props: js.Any): Unit
  }
  object Source {
    
    inline def apply(
      beginDrag: (DragDropMonitor, Identifier) => Unit,
      canDrag: (DragDropMonitor, Identifier) => Boolean,
      endDrag: (DragDropMonitor, Identifier) => Unit,
      isDragging: (DragDropMonitor, Identifier) => Boolean,
      receiveProps: js.Any => Unit
    ): Source = {
      val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction2(beginDrag), canDrag = js.Any.fromFunction2(canDrag), endDrag = js.Any.fromFunction2(endDrag), isDragging = js.Any.fromFunction2(isDragging), receiveProps = js.Any.fromFunction1(receiveProps))
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setReceiveProps(value: js.Any => Unit): Self = StObject.set(x, "receiveProps", js.Any.fromFunction1(value))
    }
  }
}
