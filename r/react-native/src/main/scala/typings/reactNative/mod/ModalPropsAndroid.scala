package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalPropsAndroid extends js.Object {
  
  /**
    *  Controls whether to force hardware acceleration for the underlying window.
    */
  var hardwareAccelerated: js.UndefOr[Boolean] = js.native
  
  /**
    *  Determines whether your modal should go under the system statusbar.
    */
  var statusBarTranslucent: js.UndefOr[Boolean] = js.native
}
object ModalPropsAndroid {
  
  @scala.inline
  def apply(): ModalPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalPropsAndroid]
  }
  
  @scala.inline
  implicit class ModalPropsAndroidOps[Self <: ModalPropsAndroid] (val x: Self) extends AnyVal {
    
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
    def setHardwareAccelerated(value: Boolean): Self = this.set("hardwareAccelerated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardwareAccelerated: Self = this.set("hardwareAccelerated", js.undefined)
    
    @scala.inline
    def setStatusBarTranslucent(value: Boolean): Self = this.set("statusBarTranslucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusBarTranslucent: Self = this.set("statusBarTranslucent", js.undefined)
  }
}
