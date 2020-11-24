package typings.storybookReactNative.listMod

import typings.storybookAddons.distMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var addonSelected: String = js.native
  
  def onPressAddon(id: String): Unit = js.native
  
  var panels: Collection = js.native
}
object Props {
  
  @scala.inline
  def apply(addonSelected: String, onPressAddon: String => Unit, panels: Collection): Props = {
    val __obj = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any], onPressAddon = js.Any.fromFunction1(onPressAddon), panels = panels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setOnPressAddon(value: String => Unit): Self = this.set("onPressAddon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPanels(value: Collection): Self = this.set("panels", value.asInstanceOf[js.Any])
  }
}
