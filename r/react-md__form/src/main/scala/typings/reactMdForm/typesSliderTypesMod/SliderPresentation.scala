package typings.reactMdForm.typesSliderTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderPresentation extends StObject {
  
  /**
    * Boolean if the slider is disabled and the values cannot be changed.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean if the slider is rendered vertically instead of horizontally.
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object SliderPresentation {
  
  inline def apply(): SliderPresentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderPresentation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderPresentation] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
