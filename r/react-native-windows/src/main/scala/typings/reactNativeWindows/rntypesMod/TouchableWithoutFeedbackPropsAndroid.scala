package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchableWithoutFeedbackPropsAndroid extends StObject {
  
  /**
    * If true, doesn't play a system sound on touch.
    *
    * @platform android
    */
  var touchSoundDisabled: js.UndefOr[Boolean | Null] = js.undefined
}
object TouchableWithoutFeedbackPropsAndroid {
  
  inline def apply(): TouchableWithoutFeedbackPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchableWithoutFeedbackPropsAndroid]
  }
  
  extension [Self <: TouchableWithoutFeedbackPropsAndroid](x: Self) {
    
    inline def setTouchSoundDisabled(value: Boolean): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
    
    inline def setTouchSoundDisabledNull: Self = StObject.set(x, "touchSoundDisabled", null)
    
    inline def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
  }
}
