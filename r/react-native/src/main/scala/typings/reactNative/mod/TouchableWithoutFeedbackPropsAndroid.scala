package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchableWithoutFeedbackPropsAndroid extends StObject {
  
  /**
    * If true, doesn't play a system sound on touch.
    *
    * @platform android
    */
  var touchSoundDisabled: js.UndefOr[Boolean] = js.undefined
}
object TouchableWithoutFeedbackPropsAndroid {
  
  inline def apply(): TouchableWithoutFeedbackPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchableWithoutFeedbackPropsAndroid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchableWithoutFeedbackPropsAndroid] (val x: Self) extends AnyVal {
    
    inline def setTouchSoundDisabled(value: Boolean): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
    
    inline def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
  }
}
