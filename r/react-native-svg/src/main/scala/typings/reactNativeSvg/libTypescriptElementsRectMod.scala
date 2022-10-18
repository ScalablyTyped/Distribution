package typings.reactNativeSvg

import typings.reactNativeSvg.anon.Width
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.CommonPathProps
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsRectMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Rect", JSImport.Default)
  @js.native
  open class default () extends Rect
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Rect", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Rect", "default.defaultProps")
    @js.native
    def defaultProps: Width = js.native
    inline def defaultProps_=(x: Width): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-svg/lib/typescript/elements/Rect", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Rect
    extends typings.reactNativeSvg.libTypescriptElementsShapeMod.default[RectProps]
  
  trait RectProps
    extends StObject
       with CommonPathProps {
    
    var height: js.UndefOr[NumberProp] = js.undefined
    
    var opacity: js.UndefOr[NumberProp] = js.undefined
    
    var rx: js.UndefOr[NumberProp] = js.undefined
    
    var ry: js.UndefOr[NumberProp] = js.undefined
    
    var width: js.UndefOr[NumberProp] = js.undefined
    
    @JSName("x")
    var x_RectProps: js.UndefOr[NumberProp] = js.undefined
    
    @JSName("y")
    var y_RectProps: js.UndefOr[NumberProp] = js.undefined
  }
  object RectProps {
    
    inline def apply(): RectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RectProps]
    }
    
    extension [Self <: RectProps](x: Self) {
      
      inline def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRx(value: NumberProp): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: NumberProp): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      inline def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
