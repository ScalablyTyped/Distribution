package typings.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typings.reactNativeElements.anon.Android
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorsMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/config/colors", JSImport.Default)
  @js.native
  val default: Colors = js.native
  
  trait Colors extends StObject {
    
    val black: String
    
    val disabled: String
    
    val divider: String
    
    val error: String
    
    val grey0: String
    
    val grey1: String
    
    val grey2: String
    
    val grey3: String
    
    val grey4: String
    
    val grey5: String
    
    val greyOutline: String
    
    val platform: Android
    
    val primary: String
    
    val searchBg: String
    
    val secondary: String
    
    val success: String
    
    val warning: String
    
    val white: String
  }
  object Colors {
    
    inline def apply(
      black: String,
      disabled: String,
      divider: String,
      error: String,
      grey0: String,
      grey1: String,
      grey2: String,
      grey3: String,
      grey4: String,
      grey5: String,
      greyOutline: String,
      platform: Android,
      primary: String,
      searchBg: String,
      secondary: String,
      success: String,
      warning: String,
      white: String
    ): Colors = {
      val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], grey0 = grey0.asInstanceOf[js.Any], grey1 = grey1.asInstanceOf[js.Any], grey2 = grey2.asInstanceOf[js.Any], grey3 = grey3.asInstanceOf[js.Any], grey4 = grey4.asInstanceOf[js.Any], grey5 = grey5.asInstanceOf[js.Any], greyOutline = greyOutline.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], searchBg = searchBg.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors]
    }
    
    extension [Self <: Colors](x: Self) {
      
      inline def setBlack(value: String): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setGrey0(value: String): Self = StObject.set(x, "grey0", value.asInstanceOf[js.Any])
      
      inline def setGrey1(value: String): Self = StObject.set(x, "grey1", value.asInstanceOf[js.Any])
      
      inline def setGrey2(value: String): Self = StObject.set(x, "grey2", value.asInstanceOf[js.Any])
      
      inline def setGrey3(value: String): Self = StObject.set(x, "grey3", value.asInstanceOf[js.Any])
      
      inline def setGrey4(value: String): Self = StObject.set(x, "grey4", value.asInstanceOf[js.Any])
      
      inline def setGrey5(value: String): Self = StObject.set(x, "grey5", value.asInstanceOf[js.Any])
      
      inline def setGreyOutline(value: String): Self = StObject.set(x, "greyOutline", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: Android): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setSearchBg(value: String): Self = StObject.set(x, "searchBg", value.asInstanceOf[js.Any])
      
      inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWhite(value: String): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlatformColors extends StObject {
    
    var error: String
    
    var grey: String
    
    var primary: String
    
    var searchBg: String
    
    var secondary: String
    
    var success: String
    
    var warning: String
  }
  object PlatformColors {
    
    inline def apply(
      error: String,
      grey: String,
      primary: String,
      searchBg: String,
      secondary: String,
      success: String,
      warning: String
    ): PlatformColors = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], grey = grey.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], searchBg = searchBg.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformColors]
    }
    
    extension [Self <: PlatformColors](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setGrey(value: String): Self = StObject.set(x, "grey", value.asInstanceOf[js.Any])
      
      inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setSearchBg(value: String): Self = StObject.set(x, "searchBg", value.asInstanceOf[js.Any])
      
      inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Colors
  
  /* This means you don't have to write `default`, but can instead just say `colorsMod.foo` */
  override def _to: Colors = default
}
