package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraButtonProps extends StObject {
  
  var delayLongPress: Double
  
  var extraButtonProps: Exclusive
}
object ExtraButtonProps {
  
  inline def apply(delayLongPress: Double, extraButtonProps: Exclusive): ExtraButtonProps = {
    val __obj = js.Dynamic.literal(delayLongPress = delayLongPress.asInstanceOf[js.Any], extraButtonProps = extraButtonProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtraButtonProps] (val x: Self) extends AnyVal {
    
    inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    inline def setExtraButtonProps(value: Exclusive): Self = StObject.set(x, "extraButtonProps", value.asInstanceOf[js.Any])
  }
}
