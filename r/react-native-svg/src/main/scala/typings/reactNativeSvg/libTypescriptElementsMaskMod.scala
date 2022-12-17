package typings.reactNativeSvg

import typings.react.mod.ReactNode
import typings.reactNativeSvg.anon.X
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.CommonPathProps
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsMaskMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Mask", JSImport.Default)
  @js.native
  open class default () extends Mask
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Mask", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Mask", "default.defaultProps")
    @js.native
    def defaultProps: X = js.native
    inline def defaultProps_=(x: X): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-svg/lib/typescript/elements/Mask", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Mask
    extends typings.reactNativeSvg.libTypescriptElementsShapeMod.default[MaskProps]
  
  trait MaskProps
    extends StObject
       with CommonPathProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var height: js.UndefOr[NumberProp] = js.undefined
    
    var maskContentUnits: js.UndefOr[TMaskUnits] = js.undefined
    
    var maskUnits: js.UndefOr[TMaskUnits] = js.undefined
    
    var width: js.UndefOr[NumberProp] = js.undefined
    
    @JSName("x")
    var x_MaskProps: js.UndefOr[NumberProp] = js.undefined
    
    @JSName("y")
    var y_MaskProps: js.UndefOr[NumberProp] = js.undefined
  }
  object MaskProps {
    
    inline def apply(): MaskProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaskProps]
    }
    
    extension [Self <: MaskProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMaskContentUnits(value: TMaskUnits): Self = StObject.set(x, "maskContentUnits", value.asInstanceOf[js.Any])
      
      inline def setMaskContentUnitsUndefined: Self = StObject.set(x, "maskContentUnits", js.undefined)
      
      inline def setMaskUnits(value: TMaskUnits): Self = StObject.set(x, "maskUnits", value.asInstanceOf[js.Any])
      
      inline def setMaskUnitsUndefined: Self = StObject.set(x, "maskUnits", js.undefined)
      
      inline def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeSvg.reactNativeSvgStrings.userSpaceOnUse
    - typings.reactNativeSvg.reactNativeSvgStrings.objectBoundingBox
  */
  trait TMaskUnits extends StObject
  object TMaskUnits {
    
    inline def objectBoundingBox: typings.reactNativeSvg.reactNativeSvgStrings.objectBoundingBox = "objectBoundingBox".asInstanceOf[typings.reactNativeSvg.reactNativeSvgStrings.objectBoundingBox]
    
    inline def userSpaceOnUse: typings.reactNativeSvg.reactNativeSvgStrings.userSpaceOnUse = "userSpaceOnUse".asInstanceOf[typings.reactNativeSvg.reactNativeSvgStrings.userSpaceOnUse]
  }
}
