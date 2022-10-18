package typings.reactNativeSvg

import org.scalablytyped.runtime.Shortcut
import typings.reactNative.librariesTypesCodegenTypesMod.Float
import typings.reactNative.librariesTypesCodegenTypesMod.Int32
import typings.reactNative.librariesUtilitiesCodegenNativeComponentMod.NativeComponentType
import typings.reactNative.mod.ColorValue
import typings.reactNativeSvg.libTypescriptFabricUtilsMod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptFabricSvgViewNativeComponentMod extends Shortcut {
  
  @JSImport("react-native-svg/lib/typescript/fabric/SvgViewNativeComponent", JSImport.Default)
  @js.native
  val default: NativeComponentType[NativeProps] = js.native
  
  trait NativeProps
    extends StObject
       with ViewProps {
    
    var align: String
    
    var bbHeight: String
    
    var bbWidth: String
    
    var color: ColorValue
    
    var meetOrSlice: Int32
    
    var minX: Float
    
    var minY: Float
    
    var pointerEvents: js.UndefOr[String] = js.undefined
    
    var tintColor: ColorValue
    
    var vbHeight: Float
    
    var vbWidth: Float
  }
  object NativeProps {
    
    inline def apply(
      align: String,
      bbHeight: String,
      bbWidth: String,
      color: ColorValue,
      meetOrSlice: Int32,
      minX: Float,
      minY: Float,
      tintColor: ColorValue,
      vbHeight: Float,
      vbWidth: Float
    ): NativeProps = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], bbHeight = bbHeight.asInstanceOf[js.Any], bbWidth = bbWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], meetOrSlice = meetOrSlice.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], vbHeight = vbHeight.asInstanceOf[js.Any], vbWidth = vbWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeProps]
    }
    
    extension [Self <: NativeProps](x: Self) {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setBbHeight(value: String): Self = StObject.set(x, "bbHeight", value.asInstanceOf[js.Any])
      
      inline def setBbWidth(value: String): Self = StObject.set(x, "bbWidth", value.asInstanceOf[js.Any])
      
      inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setMeetOrSlice(value: Int32): Self = StObject.set(x, "meetOrSlice", value.asInstanceOf[js.Any])
      
      inline def setMinX(value: Float): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinY(value: Float): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setTintColor(value: ColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setVbHeight(value: Float): Self = StObject.set(x, "vbHeight", value.asInstanceOf[js.Any])
      
      inline def setVbWidth(value: Float): Self = StObject.set(x, "vbWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = NativeComponentType[NativeProps]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptFabricSvgViewNativeComponentMod.foo` */
  override def _to: NativeComponentType[NativeProps] = default
}
