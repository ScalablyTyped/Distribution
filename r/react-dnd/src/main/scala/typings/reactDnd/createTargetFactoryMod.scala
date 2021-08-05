package typings.reactDnd

import typings.dndCore.interfacesMod.DragDropMonitor
import typings.dndCore.interfacesMod.DropTarget
import typings.dndCore.interfacesMod.Identifier
import typings.react.mod.RefObject
import typings.reactDnd.interfacesMod.DropTargetSpec
import typings.reactDnd.monitorsMod.DropTargetMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createTargetFactoryMod {
  
  @JSImport("react-dnd/lib/decorators/createTargetFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTargetFactory[Props](spec: DropTargetSpec[Props]): js.Function2[/* monitor */ DropTargetMonitor, /* ref */ RefObject[js.Any], Target] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTargetFactory")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* monitor */ DropTargetMonitor, /* ref */ RefObject[js.Any], Target]]
  
  trait Target
    extends StObject
       with DropTarget {
    
    def receiveMonitor(monitor: js.Any): Unit
    
    def receiveProps(props: js.Any): Unit
  }
  object Target {
    
    inline def apply(
      canDrop: (DragDropMonitor, Identifier) => Boolean,
      drop: (DragDropMonitor, Identifier) => js.Any,
      hover: (DragDropMonitor, Identifier) => Unit,
      receiveMonitor: js.Any => Unit,
      receiveProps: js.Any => Unit
    ): Target = {
      val __obj = js.Dynamic.literal(canDrop = js.Any.fromFunction2(canDrop), drop = js.Any.fromFunction2(drop), hover = js.Any.fromFunction2(hover), receiveMonitor = js.Any.fromFunction1(receiveMonitor), receiveProps = js.Any.fromFunction1(receiveProps))
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setReceiveMonitor(value: js.Any => Unit): Self = StObject.set(x, "receiveMonitor", js.Any.fromFunction1(value))
      
      inline def setReceiveProps(value: js.Any => Unit): Self = StObject.set(x, "receiveProps", js.Any.fromFunction1(value))
    }
  }
}
