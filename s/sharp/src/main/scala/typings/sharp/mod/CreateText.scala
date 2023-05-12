package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateText extends StObject {
  
  /** Text alignment ('left', 'centre', 'center', 'right'). (optional, default 'left') */
  var align: js.UndefOr[TextAlign] = js.undefined
  
  /** The resolution (size) at which to render the text. Does not take effect if `height` is specified. (optional, default `72`) */
  var dpi: js.UndefOr[Double] = js.undefined
  
  /** Font name to render with. */
  var font: js.UndefOr[String] = js.undefined
  
  /** Absolute filesystem path to a font file that can be used by `font`. */
  var fontfile: js.UndefOr[String] = js.undefined
  
  /**
    * Integral number of pixels high. When defined, `dpi` will be ignored and the text will automatically fit the pixel resolution
    * defined by `width` and `height`. Will be ignored if `width` is not specified or set to 0. (optional, default `0`)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /** Set this to true to apply justification to the text. (optional, default `false`) */
  var justify: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set this to true to enable RGBA output. This is useful for colour emoji rendering,
    * or support for pango markup features like `<span foreground="red">Red!</span>`. (optional, default `false`)
    */
  var rgba: js.UndefOr[Boolean] = js.undefined
  
  /** Text line height in points. Will use the font line height if none is specified. (optional, default `0`) */
  var spacing: js.UndefOr[Double] = js.undefined
  
  /** Text to render as a UTF-8 string. It can contain Pango markup, for example `<i>Le</i>Monde`. */
  var text: String
  
  /** Integral number of pixels to word-wrap at. Lines of text wider than this will be broken at word boundaries. (optional, default `0`) */
  var width: js.UndefOr[Double] = js.undefined
  
  /** Word wrapping style when width is provided, one of: 'word', 'char', 'charWord' (prefer char, fallback to word) or 'none' */
  var wrap: js.UndefOr[TextWrap] = js.undefined
}
object CreateText {
  
  inline def apply(text: String): CreateText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateText] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: TextAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setDpi(value: Double): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    inline def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFontfile(value: String): Self = StObject.set(x, "fontfile", value.asInstanceOf[js.Any])
    
    inline def setFontfileUndefined: Self = StObject.set(x, "fontfile", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setJustify(value: Boolean): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
    
    inline def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
    
    inline def setRgba(value: Boolean): Self = StObject.set(x, "rgba", value.asInstanceOf[js.Any])
    
    inline def setRgbaUndefined: Self = StObject.set(x, "rgba", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWrap(value: TextWrap): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
