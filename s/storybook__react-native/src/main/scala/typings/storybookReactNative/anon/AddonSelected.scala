package typings.storybookReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddonSelected extends js.Object {
  
  var addonSelected: String = js.native
}
object AddonSelected {
  
  @scala.inline
  def apply(addonSelected: String): AddonSelected = {
    val __obj = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonSelected]
  }
  
  @scala.inline
  implicit class AddonSelectedOps[Self <: AddonSelected] (val x: Self) extends AnyVal {
    
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
    def setAddonSelected(value: String): Self = this.set("addonSelected", value.asInstanceOf[js.Any])
  }
}
