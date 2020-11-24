package typings.reactNativeGoogleSignin.mod

import typings.reactNative.mod.ViewProps
import typings.reactNativeGoogleSignin.mod.GoogleSigninButton.Color
import typings.reactNativeGoogleSignin.mod.GoogleSigninButton.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleSigninButtonProps extends ViewProps {
  
  var color: js.UndefOr[Color] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  var size: js.UndefOr[Size] = js.native
}
object GoogleSigninButtonProps {
  
  @scala.inline
  def apply(): GoogleSigninButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSigninButtonProps]
  }
  
  @scala.inline
  implicit class GoogleSigninButtonPropsOps[Self <: GoogleSigninButtonProps] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
