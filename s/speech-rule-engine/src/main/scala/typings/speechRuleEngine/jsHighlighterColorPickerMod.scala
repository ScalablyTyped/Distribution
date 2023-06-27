package typings.speechRuleEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsHighlighterColorPickerMod {
  
  @JSImport("speech-rule-engine/js/highlighter/color_picker", "ColorPicker")
  @js.native
  open class ColorPicker protected () extends StObject {
    def this(background: Color) = this()
    def this(background: Color, foreground: Color) = this()
    
    var background: ChannelColor = js.native
    
    var foreground: ChannelColor = js.native
    
    def hex(): StringColor = js.native
    
    def rgb(): StringColor = js.native
    
    def rgba(): StringColor = js.native
  }
  /* static members */
  object ColorPicker {
    
    @JSImport("speech-rule-engine/js/highlighter/color_picker", "ColorPicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/highlighter/color_picker", "ColorPicker.DEFAULT_BACKGROUND_")
    @js.native
    def DEFAULT_BACKGROUND_ : Any = js.native
    inline def DEFAULT_BACKGROUND__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_BACKGROUND_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/highlighter/color_picker", "ColorPicker.DEFAULT_FOREGROUND_")
    @js.native
    def DEFAULT_FOREGROUND_ : Any = js.native
    inline def DEFAULT_FOREGROUND__=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_FOREGROUND_")(x.asInstanceOf[js.Any])
    
    @JSImport("speech-rule-engine/js/highlighter/color_picker", "ColorPicker.toHex")
    @js.native
    def toHex: Any = js.native
    inline def toHex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toHex")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("speech-rule-engine/js/highlighter/color_picker", "ContrastPicker")
  @js.native
  open class ContrastPicker () extends StObject {
    
    def generate(): String = js.native
    
    var hue: Double = js.native
    
    var incr: Double = js.native
    
    def increment(): Unit = js.native
    
    var light: Double = js.native
    
    var sat: Double = js.native
  }
  
  trait ChannelColor
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var blue: Double
    
    var green: Double
    
    var red: Double
  }
  object ChannelColor {
    
    inline def apply(blue: Double, green: Double, red: Double): ChannelColor = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChannelColor] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.speechRuleEngine.jsHighlighterColorPickerMod.ChannelColor
    - typings.speechRuleEngine.jsHighlighterColorPickerMod.NamedColor
  */
  trait Color extends StObject
  object Color {
    
    inline def ChannelColor(blue: Double, green: Double, red: Double): typings.speechRuleEngine.jsHighlighterColorPickerMod.ChannelColor = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.speechRuleEngine.jsHighlighterColorPickerMod.ChannelColor]
    }
    
    inline def NamedColor(color: String): typings.speechRuleEngine.jsHighlighterColorPickerMod.NamedColor = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.speechRuleEngine.jsHighlighterColorPickerMod.NamedColor]
    }
  }
  
  trait NamedColor
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var color: String
  }
  object NamedColor {
    
    inline def apply(color: String): NamedColor = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[NamedColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NamedColor] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringColor extends StObject {
    
    var alphaback: js.UndefOr[String] = js.undefined
    
    var alphafore: js.UndefOr[String] = js.undefined
    
    var background: String
    
    var foreground: String
  }
  object StringColor {
    
    inline def apply(background: String, foreground: String): StringColor = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringColor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringColor] (val x: Self) extends AnyVal {
      
      inline def setAlphaback(value: String): Self = StObject.set(x, "alphaback", value.asInstanceOf[js.Any])
      
      inline def setAlphabackUndefined: Self = StObject.set(x, "alphaback", js.undefined)
      
      inline def setAlphafore(value: String): Self = StObject.set(x, "alphafore", value.asInstanceOf[js.Any])
      
      inline def setAlphaforeUndefined: Self = StObject.set(x, "alphafore", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    }
  }
}
