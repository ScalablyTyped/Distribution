package typings.reactNativeWindows

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glyphPropsMod {
  
  trait GlyphProps
    extends StObject
       with ViewProps {
    
    var colorEnabled: js.UndefOr[Boolean] = js.undefined
    
    var emSize: js.UndefOr[Double] = js.undefined
    
    var fontUri: String
    
    var glyph: String
    
    @JSName("style")
    var style_GlyphProps: js.UndefOr[StyleProp[GlyphStyle]] = js.undefined
  }
  object GlyphProps {
    
    @scala.inline
    def apply(fontUri: String, glyph: String): GlyphProps = {
      val __obj = js.Dynamic.literal(fontUri = fontUri.asInstanceOf[js.Any], glyph = glyph.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlyphProps]
    }
    
    @scala.inline
    implicit class GlyphPropsMutableBuilder[Self <: GlyphProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorEnabled(value: Boolean): Self = StObject.set(x, "colorEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorEnabledUndefined: Self = StObject.set(x, "colorEnabled", js.undefined)
      
      @scala.inline
      def setEmSize(value: Double): Self = StObject.set(x, "emSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmSizeUndefined: Self = StObject.set(x, "emSize", js.undefined)
      
      @scala.inline
      def setFontUri(value: String): Self = StObject.set(x, "fontUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: StyleProp[GlyphStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait GlyphStyle
    extends StObject
       with ViewStyle {
    
    var color: js.UndefOr[String] = js.undefined
  }
  object GlyphStyle {
    
    @scala.inline
    def apply(): GlyphStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlyphStyle]
    }
    
    @scala.inline
    implicit class GlyphStyleMutableBuilder[Self <: GlyphStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
}
