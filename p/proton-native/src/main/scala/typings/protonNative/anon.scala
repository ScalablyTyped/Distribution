package typings.protonNative

import typings.protonNative.protonNativeStrings.auxiliary
import typings.protonNative.protonNativeStrings.bold
import typings.protonNative.protonNativeStrings.book
import typings.protonNative.protonNativeStrings.center
import typings.protonNative.protonNativeStrings.condensed
import typings.protonNative.protonNativeStrings.double
import typings.protonNative.protonNativeStrings.expanded
import typings.protonNative.protonNativeStrings.extraCondensed
import typings.protonNative.protonNativeStrings.extraExpanded
import typings.protonNative.protonNativeStrings.grammar
import typings.protonNative.protonNativeStrings.heavy
import typings.protonNative.protonNativeStrings.italic
import typings.protonNative.protonNativeStrings.left
import typings.protonNative.protonNativeStrings.light
import typings.protonNative.protonNativeStrings.maximum
import typings.protonNative.protonNativeStrings.medium
import typings.protonNative.protonNativeStrings.minimum
import typings.protonNative.protonNativeStrings.none
import typings.protonNative.protonNativeStrings.normal
import typings.protonNative.protonNativeStrings.oblique
import typings.protonNative.protonNativeStrings.right
import typings.protonNative.protonNativeStrings.semiBold
import typings.protonNative.protonNativeStrings.semiCondensed
import typings.protonNative.protonNativeStrings.semiExpanded
import typings.protonNative.protonNativeStrings.single
import typings.protonNative.protonNativeStrings.spelling
import typings.protonNative.protonNativeStrings.suggestion
import typings.protonNative.protonNativeStrings.thin
import typings.protonNative.protonNativeStrings.ultraBold
import typings.protonNative.protonNativeStrings.ultraCondensed
import typings.protonNative.protonNativeStrings.ultraExpanded
import typings.protonNative.protonNativeStrings.ultraHeavy
import typings.protonNative.protonNativeStrings.ultraLight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait A extends StObject {
    
    var a: Double
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object A {
    
    inline def apply(a: Double, b: Double, g: Double, r: Double): A = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[A]
    }
    
    extension [Self <: A](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait BackgroundColor extends StObject {
    
    /**
      * The background color, specified as a CSS color string.
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * The text color, specified as a CSS color string.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * The font family (only if available on the system).
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * The font size (in pt).
      */
    var fontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether an italic font should be used.
      */
    var fontStyle: js.UndefOr[normal | oblique | italic] = js.undefined
    
    /**
      * Whether a bold font should be used (and the amount).
      */
    var fontWeight: js.UndefOr[
        minimum | thin | ultraLight | light | book | normal | medium | semiBold | bold | ultraBold | heavy | ultraHeavy | maximum | Double
      ] = js.undefined
    
    /**
      * Wheter the text should be aligned to the left, center or right.
      *
      * **Works only on a top level text component, not it's children!**
      */
    var textAlign: js.UndefOr[left | center | right] = js.undefined
    
    /**
      * How wide or narrow the characters should be.
      */
    var textStretch: js.UndefOr[
        ultraCondensed | extraCondensed | condensed | semiCondensed | normal | semiExpanded | expanded | extraExpanded | ultraExpanded
      ] = js.undefined
    
    /**
      * The text underline style.
      */
    var textUnderline: js.UndefOr[none | single | double | suggestion] = js.undefined
    
    /**
      * The text underline color.
      *
      * A color string | 'spelling' | 'grammar' | 'auxiliary'
      */
    var textUnderlineColor: js.UndefOr[spelling | grammar | auxiliary | String] = js.undefined
  }
  object BackgroundColor {
    
    inline def apply(): BackgroundColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundColor]
    }
    
    extension [Self <: BackgroundColor](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: normal | oblique | italic): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(
        value: minimum | thin | ultraLight | light | book | normal | medium | semiBold | bold | ultraBold | heavy | ultraHeavy | maximum | Double
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setTextAlign(value: left | center | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextStretch(
        value: ultraCondensed | extraCondensed | condensed | semiCondensed | normal | semiExpanded | expanded | extraExpanded | ultraExpanded
      ): Self = StObject.set(x, "textStretch", value.asInstanceOf[js.Any])
      
      inline def setTextStretchUndefined: Self = StObject.set(x, "textStretch", js.undefined)
      
      inline def setTextUnderline(value: none | single | double | suggestion): Self = StObject.set(x, "textUnderline", value.asInstanceOf[js.Any])
      
      inline def setTextUnderlineColor(value: spelling | grammar | auxiliary | String): Self = StObject.set(x, "textUnderlineColor", value.asInstanceOf[js.Any])
      
      inline def setTextUnderlineColorUndefined: Self = StObject.set(x, "textUnderlineColor", js.undefined)
      
      inline def setTextUnderlineUndefined: Self = StObject.set(x, "textUnderline", js.undefined)
    }
  }
  
  trait Buttons extends StObject {
    
    var buttons: js.Array[String]
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Buttons {
    
    inline def apply(buttons: js.Array[String], height: Double, width: Double, x: Double, y: Double): Buttons = {
      val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buttons]
    }
    
    extension [Self <: Buttons](x: Self) {
      
      inline def setButtons(value: js.Array[String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsVarargs(value: String*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Description extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var title: String
  }
  object Description {
    
    inline def apply(title: String): Description = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait H extends StObject {
    
    var h: Boolean
    
    var v: Boolean
  }
  object H {
    
    inline def apply(h: Boolean, v: Boolean): H = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[H]
    }
    
    extension [Self <: H](x: Self) {
      
      inline def setH(value: Boolean): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setV(value: Boolean): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait Title extends StObject {
    
    var description: String
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Title {
    
    inline def apply(description: String): Title = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[Title]
    }
    
    extension [Self <: Title](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait W extends StObject {
    
    var h: Double
    
    var w: Double
  }
  object W {
    
    inline def apply(h: Double, w: Double): W = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[W]
    }
    
    extension [Self <: W](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Y extends StObject {
    
    var h: Double
    
    var y: Double
  }
  object Y {
    
    inline def apply(h: Double, y: Double): Y = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    extension [Self <: Y](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
