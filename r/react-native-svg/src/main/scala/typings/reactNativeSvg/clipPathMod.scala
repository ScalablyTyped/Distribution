package typings.reactNativeSvg

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipPathMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/ClipPath", JSImport.Default)
  @js.native
  open class default () extends ClipPath
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/ClipPath", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/ClipPath", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ClipPath
    extends typings.reactNativeSvg.shapeMod.default[ClipPathProps]
  
  trait ClipPathProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
  }
  object ClipPathProps {
    
    inline def apply(): ClipPathProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClipPathProps]
    }
    
    extension [Self <: ClipPathProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
