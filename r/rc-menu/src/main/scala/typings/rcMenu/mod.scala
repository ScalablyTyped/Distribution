package typings.rcMenu

import typings.rcMenu.esDividerMod.DividerProps
import typings.rcMenu.esInterfaceMod.MenuRef
import typings.rcMenu.esMenuItemGroupMod.MenuItemGroupProps
import typings.rcMenu.esMenuItemMod.MenuItemProps
import typings.rcMenu.esMenuMod.MenuProps
import typings.rcMenu.esSubMenuMod.SubMenuProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-menu", JSImport.Default)
  @js.native
  val default: MenuType = js.native
  
  inline def Divider(param0: DividerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Divider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Item(props: MenuItemProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Item")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def ItemGroup(param0: MenuItemGroupProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ItemGroup")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def MenuItem(props: MenuItemProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItem")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def MenuItemGroup(param0: MenuItemGroupProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItemGroup")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def SubMenu(props: SubMenuProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SubMenu")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useFullPath(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFullPath")().asInstanceOf[js.Array[String]]
  inline def useFullPath(eventKey: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFullPath")(eventKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @js.native
  trait MenuType
    extends StObject
       with ForwardRefExoticComponent[MenuProps & RefAttributes[MenuRef]] {
    
    var Divider: js.Function1[/* param0 */ DividerProps, Element] = js.native
    
    var Item: js.Function1[/* props */ MenuItemProps, ReactElement] = js.native
    
    var ItemGroup: js.Function1[/* param0 */ MenuItemGroupProps, ReactElement] = js.native
    
    var SubMenu: js.Function1[/* props */ SubMenuProps, Element] = js.native
  }
}
