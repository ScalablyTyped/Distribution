package typings.reactFullScreen

import typings.react.mod.FC
import typings.react.mod.MutableRefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-full-screen/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-full-screen/dist", "FullScreen")
  @js.native
  val FullScreen: FC[FullScreenProps] = js.native
  
  inline def useFullScreenHandle(): FullScreenHandle = ^.asInstanceOf[js.Dynamic].applyDynamic("useFullScreenHandle")().asInstanceOf[FullScreenHandle]
  
  trait FullScreenHandle extends StObject {
    
    var active: Boolean
    
    def enter(): js.Promise[Unit]
    
    def exit(): js.Promise[Unit]
    
    var node: MutableRefObject[HTMLDivElement | Null]
  }
  object FullScreenHandle {
    
    inline def apply(
      active: Boolean,
      enter: () => js.Promise[Unit],
      exit: () => js.Promise[Unit],
      node: MutableRefObject[HTMLDivElement | Null]
    ): FullScreenHandle = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], enter = js.Any.fromFunction0(enter), exit = js.Any.fromFunction0(exit), node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullScreenHandle]
    }
    
    extension [Self <: FullScreenHandle](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setEnter(value: () => js.Promise[Unit]): Self = StObject.set(x, "enter", js.Any.fromFunction0(value))
      
      inline def setExit(value: () => js.Promise[Unit]): Self = StObject.set(x, "exit", js.Any.fromFunction0(value))
      
      inline def setNode(value: MutableRefObject[HTMLDivElement | Null]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait FullScreenProps extends StObject {
    
    var children: Any
    
    var className: js.UndefOr[String] = js.undefined
    
    var handle: FullScreenHandle
    
    var onChange: js.UndefOr[js.Function2[/* state */ Boolean, /* handle */ FullScreenHandle, Unit]] = js.undefined
  }
  object FullScreenProps {
    
    inline def apply(children: Any, handle: FullScreenHandle): FullScreenProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullScreenProps]
    }
    
    extension [Self <: FullScreenProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHandle(value: FullScreenHandle): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: (/* state */ Boolean, /* handle */ FullScreenHandle) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
