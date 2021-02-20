package typings.reactJoyride.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloaterProps extends StObject {
  
  var disableAnimation: js.UndefOr[Boolean] = js.native
  
  var options: js.UndefOr[GenericObject] = js.native
  
  var styles: js.UndefOr[GenericObject] = js.native
  
  var wrapperOptions: js.UndefOr[GenericObject] = js.native
}
object FloaterProps {
  
  @scala.inline
  def apply(): FloaterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloaterProps]
  }
  
  @scala.inline
  implicit class FloaterPropsMutableBuilder[Self <: FloaterProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
    
    @scala.inline
    def setOptions(value: GenericObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setStyles(value: GenericObject): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setWrapperOptions(value: GenericObject): Self = StObject.set(x, "wrapperOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperOptionsUndefined: Self = StObject.set(x, "wrapperOptions", js.undefined)
  }
}
