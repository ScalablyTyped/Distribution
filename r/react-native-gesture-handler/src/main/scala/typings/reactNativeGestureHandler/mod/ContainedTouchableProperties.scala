package typings.reactNativeGestureHandler.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainedTouchableProperties extends StObject {
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object ContainedTouchableProperties {
  
  @scala.inline
  def apply(): ContainedTouchableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainedTouchableProperties]
  }
  
  @scala.inline
  implicit class ContainedTouchablePropertiesMutableBuilder[Self <: ContainedTouchableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
  }
}
