package typings.reactMdList

import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactMdList.anon.PickListItemLinkWithCompo
import typings.reactMdList.typesGetListItemHeightMod.ListItemHeight
import typings.reactMdList.typesGetListItemHeightMod.SimpleListItemProps
import typings.reactMdList.typesListItemAddonMod.ListItemAddonProps
import typings.reactMdList.typesListItemChildrenMod.ListItemChildrenProps
import typings.reactMdList.typesListItemLinkMod.ListItemLinkProps
import typings.reactMdList.typesListItemMod.ListItemProps
import typings.reactMdList.typesListItemTextMod.ListItemTextProps
import typings.reactMdList.typesListMod.ListElement
import typings.reactMdList.typesListMod.ListProps
import typings.reactMdList.typesListSubheaderMod.ListSubheaderProps
import typings.std.HTMLAnchorElement
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/list", "List")
  @js.native
  val List: ForwardRefExoticComponent[ListProps & RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/list", "ListItem")
  @js.native
  val ListItem: ForwardRefExoticComponent[ListItemProps & RefAttributes[HTMLLIElement]] = js.native
  
  inline def ListItemAddon(param0: ListItemAddonProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemAddon")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def ListItemChildren(param0: ListItemChildrenProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemChildren")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/list", "ListItemLink")
  @js.native
  val ListItemLink: ForwardRefExoticComponent[
    (ListItemLinkProps & (RefAttributes[HTMLAnchorElement | ElementType[Any]])) | PickListItemLinkWithCompo
  ] = js.native
  
  inline def ListItemText(param0: ListItemTextProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemText")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/list", "ListSubheader")
  @js.native
  val ListSubheader: ForwardRefExoticComponent[ListSubheaderProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/list", "SimpleListItem")
  @js.native
  val SimpleListItem: ForwardRefExoticComponent[SimpleListItemProps & RefAttributes[HTMLLIElement]] = js.native
  
  inline def getListItemHeight(param0: SimpleListItemProps): ListItemHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemHeight")(param0.asInstanceOf[js.Any]).asInstanceOf[ListItemHeight]
}
