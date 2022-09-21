package typings.reactNativeKeepAwake

import typings.react.mod.Component
import typings.reactNativeKeepAwake.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-keep-awake", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Children, js.Object, Any]
  object default {
    
    @JSImport("react-native-keep-awake", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def activate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("activate")().asInstanceOf[Unit]
    
    /* static member */
    inline def deactivate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deactivate")().asInstanceOf[Unit]
  }
  
  type KeepAwake = Component[Children, js.Object, Any]
}
