package typings.reactNativeReanimated.mod

import typings.reactNativeReanimated.reactNativeReanimatedStrings.`slide-bottom`
import typings.reactNativeReanimated.reactNativeReanimatedStrings.`slide-left`
import typings.reactNativeReanimated.reactNativeReanimatedStrings.`slide-right`
import typings.reactNativeReanimated.reactNativeReanimatedStrings.`slide-top`
import typings.reactNativeReanimated.reactNativeReanimatedStrings.fade
import typings.reactNativeReanimated.reactNativeReanimatedStrings.scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionInOutProps
  extends StObject
     with TransitionProps {
  
  var `type`: js.UndefOr[fade | scale | `slide-top` | `slide-bottom` | `slide-right` | `slide-left`] = js.undefined
}
object TransitionInOutProps {
  
  inline def apply(): TransitionInOutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionInOutProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionInOutProps] (val x: Self) extends AnyVal {
    
    inline def setType(value: fade | scale | `slide-top` | `slide-bottom` | `slide-right` | `slide-left`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
