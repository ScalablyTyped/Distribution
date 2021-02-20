package typings.reactBase16Styling

import org.scalablytyped.runtime.StringDictionary
import typings.base16.mod.Base16Theme
import typings.csstype.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Base16Themes extends StObject {
    
    var base16Themes: js.UndefOr[StringDictionary[Base16Theme]] = js.native
    
    var defaultBase16: js.UndefOr[Base16Theme] = js.native
  }
  object Base16Themes {
    
    @scala.inline
    def apply(): Base16Themes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Base16Themes]
    }
    
    @scala.inline
    implicit class Base16ThemesMutableBuilder[Self <: Base16Themes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase16Themes(value: StringDictionary[Base16Theme]): Self = StObject.set(x, "base16Themes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase16ThemesUndefined: Self = StObject.set(x, "base16Themes", js.undefined)
      
      @scala.inline
      def setDefaultBase16(value: Base16Theme): Self = StObject.set(x, "defaultBase16", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultBase16Undefined: Self = StObject.set(x, "defaultBase16", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-base16-styling.react-base16-styling/lib/types.Styling> */
  @js.native
  trait PartialStyling extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[Properties[String | Double]] = js.native
  }
  object PartialStyling {
    
    @scala.inline
    def apply(): PartialStyling = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStyling]
    }
    
    @scala.inline
    implicit class PartialStylingMutableBuilder[Self <: PartialStyling] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setStyle(value: Properties[String | Double]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
