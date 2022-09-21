package typings.rcResizeObserver

import typings.rcResizeObserver.mod.ResizeObserverProps
import typings.react.mod.ReactElement
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleObserverMod {
  
  @JSImport("rc-resize-observer/es/SingleObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SingleObserverProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SingleObserverProps
    extends StObject
       with ResizeObserverProps {
    
    @JSName("children")
    var children_SingleObserverProps: ReactElement | (js.Function1[/* ref */ RefObject[typings.std.Element], ReactElement])
  }
  object SingleObserverProps {
    
    inline def apply(children: ReactElement | (js.Function1[/* ref */ RefObject[typings.std.Element], ReactElement])): SingleObserverProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleObserverProps]
    }
    
    extension [Self <: SingleObserverProps](x: Self) {
      
      inline def setChildren(value: ReactElement | (js.Function1[/* ref */ RefObject[typings.std.Element], ReactElement])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* ref */ RefObject[typings.std.Element] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
}
