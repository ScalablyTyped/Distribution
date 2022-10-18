package typings.reactNativeSvg

import typings.react.mod.ReactElement
import typings.reactNativeSvg.anon.R
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.ColumnMajorTransformMatrix
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.Units
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsRadialGradientMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/RadialGradient", JSImport.Default)
  @js.native
  open class default () extends RadialGradient
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/RadialGradient", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/RadialGradient", "default.defaultProps")
    @js.native
    def defaultProps: R = js.native
    inline def defaultProps_=(x: R): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-svg/lib/typescript/elements/RadialGradient", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait RadialGradient
    extends typings.reactNativeSvg.libTypescriptElementsShapeMod.default[RadialGradientProps]
  
  trait RadialGradientProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactElement]] = js.undefined
    
    var cx: js.UndefOr[NumberProp] = js.undefined
    
    var cy: js.UndefOr[NumberProp] = js.undefined
    
    var fx: js.UndefOr[NumberProp] = js.undefined
    
    var fy: js.UndefOr[NumberProp] = js.undefined
    
    var gradientTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.undefined
    
    var gradientUnits: js.UndefOr[Units] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var r: js.UndefOr[NumberProp] = js.undefined
    
    var rx: js.UndefOr[NumberProp] = js.undefined
    
    var ry: js.UndefOr[NumberProp] = js.undefined
  }
  object RadialGradientProps {
    
    inline def apply(): RadialGradientProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadialGradientProps]
    }
    
    extension [Self <: RadialGradientProps](x: Self) {
      
      inline def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setCx(value: NumberProp): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      inline def setCy(value: NumberProp): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      inline def setFx(value: NumberProp): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      inline def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
      
      inline def setFy(value: NumberProp): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
      
      inline def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
      
      inline def setGradientTransform(value: ColumnMajorTransformMatrix | String): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
      
      inline def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
      
      inline def setGradientUnits(value: Units): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
      
      inline def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setR(value: NumberProp): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setRx(value: NumberProp): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: NumberProp): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    }
  }
}
