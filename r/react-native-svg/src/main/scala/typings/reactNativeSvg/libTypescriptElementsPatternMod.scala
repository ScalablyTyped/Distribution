package typings.reactNativeSvg

import typings.react.mod.ReactNode
import typings.reactNativeSvg.anon.X
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.ColumnMajorTransformMatrix
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.TransformProps
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.Units
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsPatternMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Pattern", JSImport.Default)
  @js.native
  open class default () extends Pattern
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Pattern", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Pattern", "default.defaultProps")
    @js.native
    def defaultProps: X = js.native
    inline def defaultProps_=(x: X): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-svg/lib/typescript/elements/Pattern", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Pattern
    extends typings.reactNativeSvg.libTypescriptElementsShapeMod.default[PatternProps]
  
  trait PatternProps
    extends StObject
       with TransformProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var height: js.UndefOr[NumberProp] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var patternContentUnits: js.UndefOr[Units] = js.undefined
    
    var patternTransform: js.UndefOr[
        ColumnMajorTransformMatrix | String | (/* import warning: importer.ImportType#apply Failed type conversion: react-native.react-native.TransformsStyle['transform'] */ js.Any)
      ] = js.undefined
    
    var patternUnits: js.UndefOr[Units] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[NumberProp] = js.undefined
    
    @JSName("x")
    var x_PatternProps: js.UndefOr[NumberProp] = js.undefined
    
    @JSName("y")
    var y_PatternProps: js.UndefOr[NumberProp] = js.undefined
  }
  object PatternProps {
    
    inline def apply(): PatternProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PatternProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPatternContentUnits(value: Units): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
      
      inline def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
      
      inline def setPatternTransform(
        value: ColumnMajorTransformMatrix | String | (/* import warning: importer.ImportType#apply Failed type conversion: react-native.react-native.TransformsStyle['transform'] */ js.Any)
      ): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
      
      inline def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
      
      inline def setPatternUnits(value: Units): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
      
      inline def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      inline def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
