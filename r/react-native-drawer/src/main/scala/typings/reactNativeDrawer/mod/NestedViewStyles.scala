package typings.reactNativeDrawer.mod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestedViewStyles extends js.Object {
  
  var drawerOverlay: js.UndefOr[ViewStyle] = js.native
  
  var main: js.UndefOr[ViewStyle] = js.native
  
  var mainOverlay: js.UndefOr[ViewStyle] = js.native
}
object NestedViewStyles {
  
  @scala.inline
  def apply(): NestedViewStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestedViewStyles]
  }
  
  @scala.inline
  implicit class NestedViewStylesOps[Self <: NestedViewStyles] (val x: Self) extends AnyVal {
    
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
    def setDrawerOverlay(value: ViewStyle): Self = this.set("drawerOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawerOverlay: Self = this.set("drawerOverlay", js.undefined)
    
    @scala.inline
    def setMain(value: ViewStyle): Self = this.set("main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    
    @scala.inline
    def setMainOverlay(value: ViewStyle): Self = this.set("mainOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainOverlay: Self = this.set("mainOverlay", js.undefined)
  }
}
