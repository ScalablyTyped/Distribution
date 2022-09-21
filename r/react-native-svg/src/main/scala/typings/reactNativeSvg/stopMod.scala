package typings.reactNativeSvg

import typings.react.mod.Component
import typings.reactNative.mod.ColorValue
import typings.reactNativeSvg.typesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stopMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Stop", JSImport.Default)
  @js.native
  open class default () extends Stop
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Stop", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Stop", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Stop
    extends Component[StopProps, js.Object, Any] {
    
    def setNativeProps(): Unit = js.native
  }
  
  trait StopProps extends StObject {
    
    var offset: js.UndefOr[NumberProp] = js.undefined
    
    var parent: js.UndefOr[Component[js.Object, js.Object, Any]] = js.undefined
    
    var stopColor: js.UndefOr[ColorValue] = js.undefined
    
    var stopOpacity: js.UndefOr[NumberProp] = js.undefined
  }
  object StopProps {
    
    inline def apply(): StopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopProps]
    }
    
    extension [Self <: StopProps](x: Self) {
      
      inline def setOffset(value: NumberProp): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setParent(value: Component[js.Object, js.Object, Any]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setStopColor(value: ColorValue): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      inline def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      inline def setStopOpacity(value: NumberProp): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      inline def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
    }
  }
}
