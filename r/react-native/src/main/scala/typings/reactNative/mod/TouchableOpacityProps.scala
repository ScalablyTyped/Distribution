package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchableOpacityProps extends TouchableWithoutFeedbackProps {
  
  /**
    * Determines what the opacity of the wrapped view should be when touch is active.
    * Defaults to 0.2
    */
  var activeOpacity: js.UndefOr[Double] = js.native
}
object TouchableOpacityProps {
  
  @scala.inline
  def apply(): TouchableOpacityProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchableOpacityProps]
  }
  
  @scala.inline
  implicit class TouchableOpacityPropsMutableBuilder[Self <: TouchableOpacityProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
  }
}
