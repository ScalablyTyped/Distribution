package typings.reactNativeDrawer.mod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerStyles extends NestedViewStyles {
  
  var drawer: js.UndefOr[ViewStyle] = js.native
}
object DrawerStyles {
  
  @scala.inline
  def apply(): DrawerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawerStyles]
  }
  
  @scala.inline
  implicit class DrawerStylesOps[Self <: DrawerStyles] (val x: Self) extends AnyVal {
    
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
    def setDrawer(value: ViewStyle): Self = this.set("drawer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawer: Self = this.set("drawer", js.undefined)
  }
}
