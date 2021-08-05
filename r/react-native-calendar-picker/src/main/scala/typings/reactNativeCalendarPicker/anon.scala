package typings.reactNativeCalendarPicker

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ContainerStyle extends StObject {
    
    var containerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var textStyle: js.UndefOr[TextStyle] = js.undefined
  }
  object ContainerStyle {
    
    inline def apply(): ContainerStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerStyle]
    }
    
    extension [Self <: ContainerStyle](x: Self) {
      
      inline def setContainerStyle(value: ViewStyle): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    }
  }
  
  trait Style extends StObject {
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var textStyle: js.UndefOr[TextStyle] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    }
  }
}
