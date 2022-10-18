package typings.reactNativeSvg

import typings.reactNativeSvg.anon.X1
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.CommonPathProps
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsLineMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Line", JSImport.Default)
  @js.native
  open class default () extends Line
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Line", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Line", "default.defaultProps")
    @js.native
    def defaultProps: X1 = js.native
    inline def defaultProps_=(x: X1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-svg/lib/typescript/elements/Line", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Line
    extends typings.reactNativeSvg.libTypescriptElementsShapeMod.default[LineProps]
  
  trait LineProps
    extends StObject
       with CommonPathProps {
    
    var opacity: js.UndefOr[NumberProp] = js.undefined
    
    var x1: js.UndefOr[NumberProp] = js.undefined
    
    var x2: js.UndefOr[NumberProp] = js.undefined
    
    var y1: js.UndefOr[NumberProp] = js.undefined
    
    var y2: js.UndefOr[NumberProp] = js.undefined
  }
  object LineProps {
    
    inline def apply(): LineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineProps]
    }
    
    extension [Self <: LineProps](x: Self) {
      
      inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setX1(value: NumberProp): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      inline def setX2(value: NumberProp): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      inline def setY1(value: NumberProp): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      inline def setY2(value: NumberProp): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    }
  }
}
