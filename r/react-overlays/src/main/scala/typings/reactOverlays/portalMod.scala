package typings.reactOverlays

import typings.react.mod.ReactElement
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactOverlays.anon.Container
import typings.reactOverlays.useWaitForDOMRefMod.DOMContainer
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalMod {
  
  /**
    * @public
    */
  object default {
    
    inline def apply(hasContainerChildrenOnRendered: PortalProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(hasContainerChildrenOnRendered.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("react-overlays/cjs/Portal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-overlays/cjs/Portal", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/cjs/Portal", "default.propTypes")
    @js.native
    def propTypes: Container = js.native
    inline def propTypes_=(x: Container): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait PortalProps extends StObject {
    
    var children: ReactElement
    
    var container: DOMContainer[HTMLElement]
    
    var onRendered: js.UndefOr[js.Function1[/* element */ js.Any, Unit]] = js.undefined
  }
  object PortalProps {
    
    inline def apply(children: ReactElement): PortalProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], container = null)
      __obj.asInstanceOf[PortalProps]
    }
    
    extension [Self <: PortalProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: DOMContainer[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerFunction0(value: () => HTMLElement | RefObject[HTMLElement] | Null): Self = StObject.set(x, "container", js.Any.fromFunction0(value))
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setOnRendered(value: /* element */ js.Any => Unit): Self = StObject.set(x, "onRendered", js.Any.fromFunction1(value))
      
      inline def setOnRenderedUndefined: Self = StObject.set(x, "onRendered", js.undefined)
    }
  }
}
