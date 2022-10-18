package typings.reactNativeWindows

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object librariesComponentsGlyphGlyphPropsMod {
  
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
    
    inline def apply(fontUri: String, glyph: String): GlyphProps = {
      val __obj = js.Dynamic.literal(fontUri = fontUri.asInstanceOf[js.Any], glyph = glyph.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlyphProps]
    }
    
    extension [Self <: GlyphProps](x: Self) {
      
      inline def setColorEnabled(value: Boolean): Self = StObject.set(x, "colorEnabled", value.asInstanceOf[js.Any])
      
      inline def setColorEnabledUndefined: Self = StObject.set(x, "colorEnabled", js.undefined)
      
      inline def setEmSize(value: Double): Self = StObject.set(x, "emSize", value.asInstanceOf[js.Any])
      
      inline def setEmSizeUndefined: Self = StObject.set(x, "emSize", js.undefined)
      
      inline def setFontUri(value: String): Self = StObject.set(x, "fontUri", value.asInstanceOf[js.Any])
      
      inline def setGlyph(value: String): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: StyleProp[GlyphStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait GlyphStyle
    extends StObject
       with ViewStyle {
    
    var color: js.UndefOr[String] = js.undefined
  }
  object GlyphStyle {
    
    inline def apply(): GlyphStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlyphStyle]
    }
    
    extension [Self <: GlyphStyle](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
}
