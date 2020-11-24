package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchableWithoutFeedbackPropsAndroid extends js.Object {
  
  /**
    * If true, doesn't play a system sound on touch.
    *
    * @platform android
    */
  var touchSoundDisabled: js.UndefOr[Boolean | Null] = js.native
}
object TouchableWithoutFeedbackPropsAndroid {
  
  @scala.inline
  def apply(): TouchableWithoutFeedbackPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchableWithoutFeedbackPropsAndroid]
  }
  
  @scala.inline
  implicit class TouchableWithoutFeedbackPropsAndroidOps[Self <: TouchableWithoutFeedbackPropsAndroid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTouchSoundDisabled(value: Boolean): Self = this.set("touchSoundDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchSoundDisabled: Self = this.set("touchSoundDisabled", js.undefined)
    
    @scala.inline
    def setTouchSoundDisabledNull: Self = this.set("touchSoundDisabled", null)
  }
}
