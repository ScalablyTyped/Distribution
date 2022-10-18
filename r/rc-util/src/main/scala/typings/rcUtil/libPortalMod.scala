package typings.rcUtil

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPortalMod extends Shortcut {
  
  @JSImport("rc-util/lib/Portal", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PortalProps & RefAttributes[PortalRef]] = js.native
  
  trait PortalProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var didUpdate: js.UndefOr[js.Function1[/* prevProps */ this.type, Unit]] = js.undefined
    
    def getContainer(): HTMLElement
  }
  object PortalProps {
    
    inline def apply(getContainer: () => HTMLElement): PortalProps = {
      val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction0(getContainer))
      __obj.asInstanceOf[PortalProps]
    }
    
    extension [Self <: PortalProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDidUpdate(value: PortalProps => Unit): Self = StObject.set(x, "didUpdate", js.Any.fromFunction1(value))
      
      inline def setDidUpdateUndefined: Self = StObject.set(x, "didUpdate", js.undefined)
      
      inline def setGetContainer(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
    }
  }
  
  type PortalRef = js.Object
  
  type _To = ForwardRefExoticComponent[PortalProps & RefAttributes[PortalRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libPortalMod.foo` */
  override def _to: ForwardRefExoticComponent[PortalProps & RefAttributes[PortalRef]] = default
}
