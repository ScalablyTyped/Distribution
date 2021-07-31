package typings.rcMenu.anon

import typings.rcMenu.interfaceMod.MiniStore
import typings.rcMenu.menuMod.MenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rc-menu.rc-menu/es/Menu.MenuState> */
trait PartialMenuState extends StObject {
  
  var inlineOpenKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  var prevProps: js.UndefOr[MenuProps] = js.undefined
  
  var store: js.UndefOr[MiniStore] = js.undefined
  
  var switchingModeFromInline: js.UndefOr[Boolean] = js.undefined
}
object PartialMenuState {
  
  @scala.inline
  def apply(): PartialMenuState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMenuState]
  }
  
  @scala.inline
  implicit class PartialMenuStateMutableBuilder[Self <: PartialMenuState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInlineOpenKeys(value: js.Array[String]): Self = StObject.set(x, "inlineOpenKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineOpenKeysUndefined: Self = StObject.set(x, "inlineOpenKeys", js.undefined)
    
    @scala.inline
    def setInlineOpenKeysVarargs(value: String*): Self = StObject.set(x, "inlineOpenKeys", js.Array(value :_*))
    
    @scala.inline
    def setPrevProps(value: MenuProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevPropsUndefined: Self = StObject.set(x, "prevProps", js.undefined)
    
    @scala.inline
    def setStore(value: MiniStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    @scala.inline
    def setSwitchingModeFromInline(value: Boolean): Self = StObject.set(x, "switchingModeFromInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchingModeFromInlineUndefined: Self = StObject.set(x, "switchingModeFromInline", js.undefined)
  }
}
