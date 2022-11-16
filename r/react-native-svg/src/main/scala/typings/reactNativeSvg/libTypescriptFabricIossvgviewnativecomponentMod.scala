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

object libTypescriptFabricIossvgviewnativecomponentMod extends Shortcut {
  
  @JSImport("react-native-svg/lib/typescript/fabric/IOSSvgViewNativeComponent", JSImport.Default)
  @js.native
  val default: NativeComponentType[NativeProps] = js.native
  
  trait NativeProps
    extends StObject
       with ViewProps {
    
    var align: js.UndefOr[String] = js.undefined
    
    var bbHeight: js.UndefOr[String] = js.undefined
    
    var bbWidth: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[ColorValue] = js.undefined
    
    var meetOrSlice: js.UndefOr[Int32] = js.undefined
    
    var minX: js.UndefOr[Float] = js.undefined
    
    var minY: js.UndefOr[Float] = js.undefined
    
    var pointerEvents: js.UndefOr[String] = js.undefined
    
    var tintColor: js.UndefOr[ColorValue] = js.undefined
    
    var vbHeight: js.UndefOr[Float] = js.undefined
    
    var vbWidth: js.UndefOr[Float] = js.undefined
  }
  object NativeProps {
    
    inline def apply(): NativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeProps]
    }
    
    extension [Self <: NativeProps](x: Self) {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBbHeight(value: String): Self = StObject.set(x, "bbHeight", value.asInstanceOf[js.Any])
      
      inline def setBbHeightUndefined: Self = StObject.set(x, "bbHeight", js.undefined)
      
      inline def setBbWidth(value: String): Self = StObject.set(x, "bbWidth", value.asInstanceOf[js.Any])
      
      inline def setBbWidthUndefined: Self = StObject.set(x, "bbWidth", js.undefined)
      
      inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setMeetOrSlice(value: Int32): Self = StObject.set(x, "meetOrSlice", value.asInstanceOf[js.Any])
      
      inline def setMeetOrSliceUndefined: Self = StObject.set(x, "meetOrSlice", js.undefined)
      
      inline def setMinX(value: Float): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinXUndefined: Self = StObject.set(x, "minX", js.undefined)
      
      inline def setMinY(value: Float): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setMinYUndefined: Self = StObject.set(x, "minY", js.undefined)
      
      inline def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setTintColor(value: ColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      inline def setVbHeight(value: Float): Self = StObject.set(x, "vbHeight", value.asInstanceOf[js.Any])
      
      inline def setVbHeightUndefined: Self = StObject.set(x, "vbHeight", js.undefined)
      
      inline def setVbWidth(value: Float): Self = StObject.set(x, "vbWidth", value.asInstanceOf[js.Any])
      
      inline def setVbWidthUndefined: Self = StObject.set(x, "vbWidth", js.undefined)
    }
  }
  
  type _To = NativeComponentType[NativeProps]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptFabricIossvgviewnativecomponentMod.foo` */
  override def _to: NativeComponentType[NativeProps] = default
}
