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
  
  inline def Divider(hasClassNameStyle: DividerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Divider")(hasClassNameStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Item(props: MenuItemProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Item")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def ItemGroup(hasChildrenProps: MenuItemGroupProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ItemGroup")(hasChildrenProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def MenuItem(props: MenuItemProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItem")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def MenuItemGroup(hasChildrenProps: MenuItemGroupProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItemGroup")(hasChildrenProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def SubMenu(props: SubMenuProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SubMenu")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useFullPath(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFullPath")().asInstanceOf[js.Array[String]]
  inline def useFullPath(eventKey: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFullPath")(eventKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @js.native
  trait MenuType
    extends StObject
       with ForwardRefExoticComponent[MenuProps & RefAttributes[MenuRef]] {
    
    var Divider: js.Function1[/* hasClassNameStyle */ DividerProps, Element] = js.native
    
    var Item: js.Function1[/* props */ MenuItemProps, ReactElement] = js.native
    
    var ItemGroup: js.Function1[/* hasChildrenProps */ MenuItemGroupProps, ReactElement] = js.native
    
    var SubMenu: js.Function1[/* props */ SubMenuProps, Element] = js.native
  }
}
