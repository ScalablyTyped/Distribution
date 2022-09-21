package typings.reactNativeSvg

import typings.reactNativeSvg.typesMod.CommonPathProps
import typings.reactNativeSvg.typesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Path", JSImport.Default)
  @js.native
  open class default () extends Path
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Path", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Path", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Path
    extends typings.reactNativeSvg.shapeMod.default[PathProps]
  
  trait PathProps
    extends StObject
       with CommonPathProps {
    
    var d: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[NumberProp] = js.undefined
  }
  object PathProps {
    
    inline def apply(): PathProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathProps]
    }
    
    extension [Self <: PathProps](x: Self) {
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
}
