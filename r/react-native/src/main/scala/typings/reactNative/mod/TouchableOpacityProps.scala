package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchableOpacityProps
  extends StObject
     with TouchableWithoutFeedbackProps {
  
  /**
    * Determines what the opacity of the wrapped view should be when touch is active.
    * Defaults to 0.2
    */
  var activeOpacity: js.UndefOr[Double] = js.undefined
}
object TouchableOpacityProps {
  
  inline def apply(): TouchableOpacityProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchableOpacityProps]
  }
  
  extension [Self <: TouchableOpacityProps](x: Self) {
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
  }
}
