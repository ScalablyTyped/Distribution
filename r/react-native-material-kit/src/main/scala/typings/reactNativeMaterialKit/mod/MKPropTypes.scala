package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`100`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`200`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`300`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`400`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`500`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`600`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`700`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`800`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`900`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.bold
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.italic
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MKPropTypes {
  
  @js.native
  trait dimen extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object dimen {
    
    @scala.inline
    def apply(): dimen = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[dimen]
    }
    
    @scala.inline
    implicit class dimenMutableBuilder[Self <: dimen] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait font extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var fontFamily: js.UndefOr[String] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var fontStyle: js.UndefOr[normal | italic] = js.native
    
    var fontWeight: js.UndefOr[
        normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
      ] = js.native
  }
  object font {
    
    @scala.inline
    def apply(): font = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[font]
    }
    
    @scala.inline
    implicit class fontMutableBuilder[Self <: font] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStyle(value: normal | italic): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.tapLocation
    - typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.center
  */
  trait rippleLocation extends StObject
  object rippleLocation {
    
    @scala.inline
    def center: typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.center = "center".asInstanceOf[typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.center]
    
    @scala.inline
    def tapLocation: typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.tapLocation = "tapLocation".asInstanceOf[typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.tapLocation]
  }
}
