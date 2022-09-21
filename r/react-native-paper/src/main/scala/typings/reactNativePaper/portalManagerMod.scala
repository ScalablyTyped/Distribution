package typings.reactNativePaper

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactNativePaper.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalManagerMod {
  
  @JSImport("react-native-paper/lib/typescript/components/Portal/PortalManager", JSImport.Default)
  @js.native
  open class default () extends PortalManager
  
  @js.native
  trait PortalManager
    extends PureComponent[js.Object, State, Any] {
    
    def mount(key: Double, children: ReactNode): Unit = js.native
    
    def unmount(key: Double): Unit = js.native
    
    def update(key: Double, children: ReactNode): Unit = js.native
  }
  
  trait State extends StObject {
    
    var portals: js.Array[Key]
  }
  object State {
    
    inline def apply(portals: js.Array[Key]): State = {
      val __obj = js.Dynamic.literal(portals = portals.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setPortals(value: js.Array[Key]): Self = StObject.set(x, "portals", value.asInstanceOf[js.Any])
      
      inline def setPortalsVarargs(value: Key*): Self = StObject.set(x, "portals", js.Array(value*))
    }
  }
}
