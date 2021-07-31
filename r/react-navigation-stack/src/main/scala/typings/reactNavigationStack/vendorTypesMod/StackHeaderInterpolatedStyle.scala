package typings.reactNavigationStack.vendorTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackHeaderInterpolatedStyle extends StObject {
  
  /**
    * Interpolated style for the header background.
    */
  var backgroundStyle: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Interpolated style for the left button (usually the back button).
    */
  var leftButtonStyle: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Interpolated style for the label of the left button (back button label).
    */
  var leftLabelStyle: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Interpolated style for the right button.
    */
  var rightButtonStyle: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Interpolated style for the header title text.
    */
  var titleStyle: js.UndefOr[js.Any] = js.undefined
}
object StackHeaderInterpolatedStyle {
  
  @scala.inline
  def apply(): StackHeaderInterpolatedStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackHeaderInterpolatedStyle]
  }
  
  @scala.inline
  implicit class StackHeaderInterpolatedStyleMutableBuilder[Self <: StackHeaderInterpolatedStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundStyle(value: js.Any): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
    
    @scala.inline
    def setLeftButtonStyle(value: js.Any): Self = StObject.set(x, "leftButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftButtonStyleUndefined: Self = StObject.set(x, "leftButtonStyle", js.undefined)
    
    @scala.inline
    def setLeftLabelStyle(value: js.Any): Self = StObject.set(x, "leftLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftLabelStyleUndefined: Self = StObject.set(x, "leftLabelStyle", js.undefined)
    
    @scala.inline
    def setRightButtonStyle(value: js.Any): Self = StObject.set(x, "rightButtonStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightButtonStyleUndefined: Self = StObject.set(x, "rightButtonStyle", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: js.Any): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
  }
}
