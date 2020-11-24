package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusBarPropsAndroid extends js.Object {
  
  /**
    * The background color of the status bar.
    *
    * @platform android
    */
  var backgroundColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * If the status bar is translucent. When translucent is set to true,
    * the app will draw under the status bar. This is useful when using a
    * semi transparent status bar color.
    */
  var translucent: js.UndefOr[Boolean] = js.native
}
object StatusBarPropsAndroid {
  
  @scala.inline
  def apply(): StatusBarPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusBarPropsAndroid]
  }
  
  @scala.inline
  implicit class StatusBarPropsAndroidOps[Self <: StatusBarPropsAndroid] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: ColorValue): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = this.set("translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslucent: Self = this.set("translucent", js.undefined)
  }
}
