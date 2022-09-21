package typings.reactNativeSvg

import typings.react.mod.ReactNode
import typings.reactNativeSvg.anon.ObjectmatrixArraynumberun
import typings.reactNativeSvg.typesMod.CommonPathProps
import typings.reactNativeSvg.typesMod.FontProps
import typings.reactNativeSvg.typesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/G", JSImport.Default)
  @js.native
  open class default[P] () extends G[P]
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/G", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/G", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait G[P]
    extends typings.reactNativeSvg.shapeMod.default[GProps & P] {
    
    def setNativeProps(props: ObjectmatrixArraynumberun): Unit = js.native
  }
  
  trait GProps
    extends StObject
       with CommonPathProps
       with FontProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var opacity: js.UndefOr[NumberProp] = js.undefined
  }
  object GProps {
    
    inline def apply(): GProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GProps]
    }
    
    extension [Self <: GProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
}
