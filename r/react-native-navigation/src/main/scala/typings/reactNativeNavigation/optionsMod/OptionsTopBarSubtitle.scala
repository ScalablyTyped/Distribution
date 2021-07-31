package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.center
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsTopBarSubtitle extends StObject {
  
  /**
    * Set subtitle alignment
    */
  var alignment: js.UndefOr[center] = js.undefined
  
  /**
    * Set subtitle color
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * Set the font family for the subtitle
    */
  var fontFamily: js.UndefOr[FontFamily] = js.undefined
  
  /**
    * Set subtitle font size
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Set the font style for a text
    */
  var fontStyle: js.UndefOr[FontStyle] = js.undefined
  
  /**
    * Specifies font weight. The values 'normal' and 'bold' are supported
    * for most fonts. Not all fonts have a variant for each of the numeric
    * values, in that case the closest one is chosen.
    */
  var fontWeight: js.UndefOr[FontWeight] = js.undefined
  
  /**
    * Set subtitle text
    */
  var text: js.UndefOr[String] = js.undefined
}
object OptionsTopBarSubtitle {
  
  @scala.inline
  def apply(): OptionsTopBarSubtitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsTopBarSubtitle]
  }
  
  @scala.inline
  implicit class OptionsTopBarSubtitleMutableBuilder[Self <: OptionsTopBarSubtitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: center): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: FontFamily): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
