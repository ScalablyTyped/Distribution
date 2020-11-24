package typings.rcMenu.anon

import typings.rcMenu.interfaceMod.MiniStore
import typings.rcMenu.menuMod.MenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rc-menu.rc-menu/es/Menu.MenuState> */
@js.native
trait PartialMenuState extends js.Object {
  
  var inlineOpenKeys: js.UndefOr[js.Array[String]] = js.native
  
  var prevProps: js.UndefOr[MenuProps] = js.native
  
  var store: js.UndefOr[MiniStore] = js.native
  
  var switchingModeFromInline: js.UndefOr[Boolean] = js.native
}
object PartialMenuState {
  
  @scala.inline
  def apply(): PartialMenuState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMenuState]
  }
  
  @scala.inline
  implicit class PartialMenuStateOps[Self <: PartialMenuState] (val x: Self) extends AnyVal {
    
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
    def deleteInlineOpenKeys: Self = this.set("inlineOpenKeys", js.undefined)
    
    @scala.inline
    def setPrevProps(value: MenuProps): Self = this.set("prevProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevProps: Self = this.set("prevProps", js.undefined)
    
    @scala.inline
    def setStore(value: MiniStore): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setSwitchingModeFromInline(value: Boolean): Self = this.set("switchingModeFromInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitchingModeFromInline: Self = this.set("switchingModeFromInline", js.undefined)
  }
}
