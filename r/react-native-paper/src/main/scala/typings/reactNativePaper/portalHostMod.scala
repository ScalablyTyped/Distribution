package typings.reactNativePaper

import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalHostMod {
  
  @JSImport("react-native-paper/lib/typescript/components/Portal/PortalHost", JSImport.Default)
  @js.native
  open class default () extends PortalHost
  /* static members */
  object default {
    
    @JSImport("react-native-paper/lib/typescript/components/Portal/PortalHost", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/Portal/PortalHost", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-paper/lib/typescript/components/Portal/PortalHost", "PortalContext")
  @js.native
  val PortalContext: Context[PortalMethods] = js.native
  
  @js.native
  trait PortalHost
    extends Component[Props, js.Object, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MPortalHost(): Unit = js.native
    
    /* private */ var manager: Any = js.native
    
    /* private */ var mount: Any = js.native
    
    /* private */ var nextKey: Any = js.native
    
    /* private */ var queue: Any = js.native
    
    /* private */ var setManager: Any = js.native
    
    /* private */ var unmount: Any = js.native
    
    /* private */ var update: Any = js.native
  }
  
  trait PortalMethods extends StObject {
    
    def mount(children: ReactNode): Double
    
    def unmount(key: Double): Unit
    
    def update(key: Double, children: ReactNode): Unit
  }
  object PortalMethods {
    
    inline def apply(mount: ReactNode => Double, unmount: Double => Unit, update: (Double, ReactNode) => Unit): PortalMethods = {
      val __obj = js.Dynamic.literal(mount = js.Any.fromFunction1(mount), unmount = js.Any.fromFunction1(unmount), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[PortalMethods]
    }
    
    extension [Self <: PortalMethods](x: Self) {
      
      inline def setMount(value: ReactNode => Double): Self = StObject.set(x, "mount", js.Any.fromFunction1(value))
      
      inline def setUnmount(value: Double => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: (Double, ReactNode) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
  
  trait Props extends StObject {
    
    var children: ReactNode
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
