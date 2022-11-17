package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.Shortcut
import typings.reactNative.librariesTypesCodegenTypesMod.Int32
import typings.reactNative.librariesTypesCodegenTypesMod.WithDefault
import typings.reactNative.librariesUtilitiesCodegenNativeComponentMod.NativeComponentType
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptFabricRngesturehandlerbuttonnativecomponentMod extends Shortcut {
  
  @JSImport("react-native-gesture-handler/lib/typescript/fabric/RNGestureHandlerButtonNativeComponent", JSImport.Default)
  @js.native
  val default: NativeComponentType[NativeProps] = js.native
  
  trait NativeProps
    extends StObject
       with ViewProps {
    
    var borderless: js.UndefOr[Boolean] = js.undefined
    
    var enabled: js.UndefOr[WithDefault[Boolean, true]] = js.undefined
    
    var exclusive: js.UndefOr[WithDefault[Boolean, true]] = js.undefined
    
    var foreground: js.UndefOr[Boolean] = js.undefined
    
    var rippleColor: js.UndefOr[ColorValue] = js.undefined
    
    var rippleRadius: js.UndefOr[Int32] = js.undefined
    
    var touchSoundDisabled: js.UndefOr[WithDefault[Boolean, false]] = js.undefined
  }
  object NativeProps {
    
    inline def apply(): NativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeProps]
    }
    
    extension [Self <: NativeProps](x: Self) {
      
      inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
      
      inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
      
      inline def setEnabled(value: WithDefault[Boolean, true]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setExclusive(value: WithDefault[Boolean, true]): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveNull: Self = StObject.set(x, "exclusive", null)
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setForeground(value: Boolean): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      
      inline def setRippleColor(value: ColorValue): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
      
      inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
      
      inline def setRippleRadius(value: Int32): Self = StObject.set(x, "rippleRadius", value.asInstanceOf[js.Any])
      
      inline def setRippleRadiusUndefined: Self = StObject.set(x, "rippleRadius", js.undefined)
      
      inline def setTouchSoundDisabled(value: WithDefault[Boolean, false]): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
      
      inline def setTouchSoundDisabledNull: Self = StObject.set(x, "touchSoundDisabled", null)
      
      inline def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
    }
  }
  
  type _To = NativeComponentType[NativeProps]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptFabricRngesturehandlerbuttonnativecomponentMod.foo` */
  override def _to: NativeComponentType[NativeProps] = default
}
