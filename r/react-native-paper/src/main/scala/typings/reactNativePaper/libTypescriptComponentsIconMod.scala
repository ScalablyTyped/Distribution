package typings.reactNativePaper

import typings.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNativePaper.anon.IconPropscolorstring
import typings.reactNativePaper.anon.IconPropscolorstringundef
import typings.reactNativePaper.anon.PickIconPropscolorstringu
import typings.reactNativePaper.anon.ReadonlysourceIconSourceB
import typings.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsIconMod {
  
  @JSImport("react-native-paper/lib/typescript/components/Icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/Icon", JSImport.Default)
  @js.native
  val default: ComponentType[PickIconPropscolorstringu] & (NonReactStatics[
    ComponentType[IconPropscolorstringundef] & (js.Function1[/* param0 */ Props, Any]), 
    js.Object
  ]) = js.native
  
  inline def isEqualIcon(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqualIcon")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidIcon(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidIcon")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait IconProps extends StObject {
    
    var allowFontScaling: js.UndefOr[Boolean] = js.undefined
    
    var size: Double
  }
  object IconProps {
    
    inline def apply(size: Double): IconProps = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
      
      inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type IconSource = IconSourceBase | ReadonlysourceIconSourceB | (js.Function1[/* props */ IconPropscolorstring, ReactNode])
  
  type IconSourceBase = String | ImageSourcePropType
  
  trait Props
    extends StObject
       with IconProps {
    
    var color: js.UndefOr[String] = js.undefined
    
    var source: Any
    
    /**
      * @optional
      */
    var theme: Theme
  }
  object Props {
    
    inline def apply(size: Double, source: Any, theme: Theme): Props = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
