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
  var touchSoundDisabled: js.UndefOr[Boolean | Null] = js.undefined
}
object TouchableWithoutFeedbackPropsAndroid {
  
  @scala.inline
  def apply(): TouchableWithoutFeedbackPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchableWithoutFeedbackPropsAndroid]
  }
  
  @scala.inline
  implicit class TouchableWithoutFeedbackPropsAndroidMutableBuilder[Self <: TouchableWithoutFeedbackPropsAndroid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTouchSoundDisabled(value: Boolean): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchSoundDisabledNull: Self = StObject.set(x, "touchSoundDisabled", null)
    
    @scala.inline
    def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
  }
}
