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
  
  inline def apply(): PartialMenuState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMenuState]
  }
  
  extension [Self <: PartialMenuState](x: Self) {
    
    inline def setInlineOpenKeys(value: js.Array[String]): Self = StObject.set(x, "inlineOpenKeys", value.asInstanceOf[js.Any])
    
    inline def setInlineOpenKeysUndefined: Self = StObject.set(x, "inlineOpenKeys", js.undefined)
    
    inline def setInlineOpenKeysVarargs(value: String*): Self = StObject.set(x, "inlineOpenKeys", js.Array(value :_*))
    
    inline def setPrevProps(value: MenuProps): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
    
    inline def setPrevPropsUndefined: Self = StObject.set(x, "prevProps", js.undefined)
    
    inline def setStore(value: MiniStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setSwitchingModeFromInline(value: Boolean): Self = StObject.set(x, "switchingModeFromInline", value.asInstanceOf[js.Any])
    
    inline def setSwitchingModeFromInlineUndefined: Self = StObject.set(x, "switchingModeFromInline", js.undefined)
  }
}
