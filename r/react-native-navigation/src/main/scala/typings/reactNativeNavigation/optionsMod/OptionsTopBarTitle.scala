package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.anon.Alignment
import typings.reactNativeNavigation.reactNativeNavigationStrings.center
import typings.reactNativeNavigation.reactNativeNavigationStrings.fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsTopBarTitle extends StObject {
  
  /**
    * Title alignment
    * #### (Android specific)
    */
  var alignment: js.UndefOr[center | fill] = js.native
  
  /**
    * Text color
    */
  var color: js.UndefOr[Color] = js.native
  
  /**
    * Custom component as the title view
    */
  var component: js.UndefOr[Alignment] = js.native
  
  /**
    * Set the font family for the title
    */
  var fontFamily: js.UndefOr[FontFamily] = js.native
  
  /**
    * Font size
    */
  var fontSize: js.UndefOr[Double] = js.native
  
  /**
    * Set the font style for the title
    */
  var fontStyle: js.UndefOr[FontStyle] = js.native
  
  /**
    * Specifies font weight. The values 'normal' and 'bold' are supported
    * for most fonts. Not all fonts have a variant for each of the numeric
    * values, in that case the closest one is chosen.
    */
  var fontWeight: js.UndefOr[FontWeight] = js.native
  
  /**
    * Top Bar title height in densitiy pixels
    * #### (Android specific)
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Text to display in the title area
    */
  var text: js.UndefOr[String] = js.native
}
object OptionsTopBarTitle {
  
  @scala.inline
  def apply(): OptionsTopBarTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsTopBarTitle]
  }
  
  @scala.inline
  implicit class OptionsTopBarTitleMutableBuilder[Self <: OptionsTopBarTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: center | fill): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setComponent(value: Alignment): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
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
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
