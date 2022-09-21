package typings.reactNativeSvg

import typings.reactNativeSvg.anon.Cx
import typings.reactNativeSvg.typesMod.CommonPathProps
import typings.reactNativeSvg.typesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Circle", JSImport.Default)
  @js.native
  open class default () extends Circle
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Circle", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Circle", "default.defaultProps")
    @js.native
    def defaultProps: Cx = js.native
    inline def defaultProps_=(x: Cx): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-svg/lib/typescript/elements/Circle", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Circle
    extends typings.reactNativeSvg.shapeMod.default[CircleProps]
  
  trait CircleProps
    extends StObject
       with CommonPathProps {
    
    var cx: js.UndefOr[NumberProp] = js.undefined
    
    var cy: js.UndefOr[NumberProp] = js.undefined
    
    var opacity: js.UndefOr[NumberProp] = js.undefined
    
    var r: js.UndefOr[NumberProp] = js.undefined
  }
  object CircleProps {
    
    inline def apply(): CircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleProps]
    }
    
    extension [Self <: CircleProps](x: Self) {
      
      inline def setCx(value: NumberProp): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      inline def setCy(value: NumberProp): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setR(value: NumberProp): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    }
  }
}
