package typings.reactNativeSvg

import typings.react.mod.ReactElement
import typings.reactNativeSvg.anon.X2
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.ColumnMajorTransformMatrix
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.Units
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsLinearGradientMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/LinearGradient", JSImport.Default)
  @js.native
  open class default () extends LinearGradient
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/LinearGradient", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/LinearGradient", "default.defaultProps")
    @js.native
    def defaultProps: X2 = js.native
    inline def defaultProps_=(x: X2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-svg/lib/typescript/elements/LinearGradient", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LinearGradient
    extends typings.reactNativeSvg.libTypescriptElementsShapeMod.default[LinearGradientProps]
  
  trait LinearGradientProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactElement]] = js.undefined
    
    var gradientTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.undefined
    
    var gradientUnits: js.UndefOr[Units] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var x1: js.UndefOr[NumberProp] = js.undefined
    
    var x2: js.UndefOr[NumberProp] = js.undefined
    
    var y1: js.UndefOr[NumberProp] = js.undefined
    
    var y2: js.UndefOr[NumberProp] = js.undefined
  }
  object LinearGradientProps {
    
    inline def apply(): LinearGradientProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinearGradientProps]
    }
    
    extension [Self <: LinearGradientProps](x: Self) {
      
      inline def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setGradientTransform(value: ColumnMajorTransformMatrix | String): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
      
      inline def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
      
      inline def setGradientUnits(value: Units): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
      
      inline def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
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
