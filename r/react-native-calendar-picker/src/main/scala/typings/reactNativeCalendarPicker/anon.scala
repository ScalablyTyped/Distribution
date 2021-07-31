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
    
    @scala.inline
    def apply(): ContainerStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerStyle]
    }
    
    @scala.inline
    implicit class ContainerStyleMutableBuilder[Self <: ContainerStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerStyle(value: ViewStyle): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    }
  }
  
  trait Style extends StObject {
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var textStyle: js.UndefOr[TextStyle] = js.undefined
  }
  object Style {
    
    @scala.inline
    def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    }
  }
}
