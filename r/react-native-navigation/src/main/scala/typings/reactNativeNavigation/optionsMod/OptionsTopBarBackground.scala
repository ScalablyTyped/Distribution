package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsTopBarBackground extends StObject {
  
  /**
    * Enable background blur
    * #### (iOS specific)
    */
  var blur: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Clip the top bar background to bounds if set to true.
    * #### (iOS specific)
    */
  var clipToBounds: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Background color of the top bar
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * Set a custom component for the Top Bar background
    */
  var component: js.UndefOr[Name] = js.undefined
  
  /**
    * Allows the NavBar to be translucent (blurred)
    * #### (iOS specific)
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}
object OptionsTopBarBackground {
  
  @scala.inline
  def apply(): OptionsTopBarBackground = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsTopBarBackground]
  }
  
  @scala.inline
  implicit class OptionsTopBarBackgroundMutableBuilder[Self <: OptionsTopBarBackground] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlur(value: Boolean): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    @scala.inline
    def setClipToBounds(value: Boolean): Self = StObject.set(x, "clipToBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipToBoundsUndefined: Self = StObject.set(x, "clipToBounds", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setComponent(value: Name): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
