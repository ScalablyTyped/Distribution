package typings.rcMenu.menuMod

import typings.rcMenu.interfaceMod.MiniStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuState extends js.Object {
  
  var inlineOpenKeys: js.Array[String] = js.native
  
  var prevProps: MenuProps = js.native
  
  var store: MiniStore = js.native
  
  var switchingModeFromInline: Boolean = js.native
}
object MenuState {
  
  @scala.inline
  def apply(
    inlineOpenKeys: js.Array[String],
    prevProps: MenuProps,
    store: MiniStore,
    switchingModeFromInline: Boolean
  ): MenuState = {
    val __obj = js.Dynamic.literal(inlineOpenKeys = inlineOpenKeys.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], switchingModeFromInline = switchingModeFromInline.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuState]
  }
  
  @scala.inline
  implicit class MenuStateOps[Self <: MenuState] (val x: Self) extends AnyVal {
    
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
    def setInlineOpenKeysVarargs(value: String*): Self = this.set("inlineOpenKeys", js.Array(value :_*))
    
    @scala.inline
    def setInlineOpenKeys(value: js.Array[String]): Self = this.set("inlineOpenKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevProps(value: MenuProps): Self = this.set("prevProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: MiniStore): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchingModeFromInline(value: Boolean): Self = this.set("switchingModeFromInline", value.asInstanceOf[js.Any])
  }
}
