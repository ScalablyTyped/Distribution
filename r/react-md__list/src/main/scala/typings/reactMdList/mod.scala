package typings.reactMdList

import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactMdList.anon.PickListItemLinkWithCompo
import typings.reactMdList.getListItemHeightMod.ListItemHeight
import typings.reactMdList.getListItemHeightMod.SimpleListItemProps
import typings.reactMdList.listItemAddonMod.ListItemAddonProps
import typings.reactMdList.listItemChildrenMod.ListItemChildrenProps
import typings.reactMdList.listItemLinkMod.ListItemLinkProps
import typings.reactMdList.listItemMod.ListItemProps
import typings.reactMdList.listItemTextMod.ListItemTextProps
import typings.reactMdList.listMod.ListElement
import typings.reactMdList.listMod.ListProps
import typings.reactMdList.listSubheaderMod.ListSubheaderProps
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
  
  inline def ListItemAddon(hasClassNameChildrenAddonAddonAfterTypePositionForceAddonWrapProps: ListItemAddonProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemAddon")(hasClassNameChildrenAddonAddonAfterTypePositionForceAddonWrapProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def ListItemChildren(
    hasTextClassNameSecondaryTextClassNameTextChildrenPrimaryTextSecondaryTextLeftAddonLeftAddonTypeLeftAddonPositionRightAddonRightAddonTypeRightAddonPositionForceAddonWrapPropChildren: ListItemChildrenProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemChildren")(hasTextClassNameSecondaryTextClassNameTextChildrenPrimaryTextSecondaryTextLeftAddonLeftAddonTypeLeftAddonPositionRightAddonRightAddonTypeRightAddonPositionForceAddonWrapPropChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/list", "ListItemLink")
  @js.native
  val ListItemLink: ForwardRefExoticComponent[
    (ListItemLinkProps & (RefAttributes[HTMLAnchorElement | ElementType[Any]])) | PickListItemLinkWithCompo
  ] = js.native
  
  inline def ListItemText(hasClassNameSecondaryTextClassNameSecondaryTextChildren: ListItemTextProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemText")(hasClassNameSecondaryTextClassNameSecondaryTextChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/list", "ListSubheader")
  @js.native
  val ListSubheader: ForwardRefExoticComponent[ListSubheaderProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/list", "SimpleListItem")
  @js.native
  val SimpleListItem: ForwardRefExoticComponent[SimpleListItemProps & RefAttributes[HTMLLIElement]] = js.native
  
  inline def getListItemHeight(hasHeightLeftAddonLeftAddonTypeRightAddonRightAddonTypeSecondaryText: SimpleListItemProps): ListItemHeight = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemHeight")(hasHeightLeftAddonLeftAddonTypeRightAddonRightAddonTypeSecondaryText.asInstanceOf[js.Any]).asInstanceOf[ListItemHeight]
}
