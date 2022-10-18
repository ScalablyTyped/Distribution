package typings.reactNativeSvg

import typings.react.mod.Component
import typings.reactNativeSvg.anon.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsDefsMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Defs", JSImport.Default)
  @js.native
  open class default () extends Defs
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Defs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Defs", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Defs
    extends Component[PropsWithChildren, js.Object, Any]
}
