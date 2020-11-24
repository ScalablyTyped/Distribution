package typings.reactMdList

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactMdList.getListItemHeightMod.ListItemHeight
import typings.reactMdList.getListItemHeightMod.SimpleListItemProps
import typings.reactMdList.listItemAddonMod.ListItemAddonProps
import typings.reactMdList.listItemChildrenMod.ListItemChildrenProps
import typings.reactMdList.listItemLinkMod.ListItemLinkProps
import typings.reactMdList.listItemLinkMod.ListItemLinkWithComponentProps
import typings.reactMdList.listItemMod.ListItemProps
import typings.reactMdList.listItemTextMod.ListItemTextProps
import typings.reactMdList.listMod.ListElement
import typings.reactMdList.listMod.ListProps
import typings.reactMdList.listSubheaderMod.ListSubheaderProps
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/list", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val List: ForwardRefExoticComponent[ListProps with RefAttributes[ListElement]] = js.native
  
  val ListItem: ForwardRefExoticComponent[ListItemProps with RefAttributes[HTMLLIElement]] = js.native
  
  val ListItemLink: ForwardRefExoticComponent[
    (ListItemLinkProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ])) | (ListItemLinkWithComponentProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ]))
  ] = js.native
  
  val ListSubheader: ForwardRefExoticComponent[ListSubheaderProps with RefAttributes[HTMLLIElement]] = js.native
  
  val SimpleListItem: ForwardRefExoticComponent[SimpleListItemProps with RefAttributes[HTMLLIElement]] = js.native
  
  def getListItemHeight(hasHeightLeftAddonLeftAddonTypeRightAddonRightAddonTypeSecondaryText: SimpleListItemProps): ListItemHeight = js.native
  
  @js.native
  object ListItemAddon extends js.Object {
    
    def apply(hasClassNameChildrenAddonAddonAfterTypePositionForceAddonWrapProps: ListItemAddonProps): ReactElement = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var addon: js.Any = js.native
      
      var addonAfter: js.Any = js.native
      
      var children: js.Any = js.native
      
      var className: js.Any = js.native
      
      var forceAddonWrap: js.Any = js.native
      
      var position: js.Any = js.native
      
      var `type`: js.Any = js.native
    }
  }
  
  @js.native
  object ListItemChildren extends js.Object {
    
    def apply(
      hasTextClassNameSecondaryTextClassNameTextChildrenPrimaryTextSecondaryTextLeftAddonLeftAddonTypeLeftAddonPositionRightAddonRightAddonTypeRightAddonPositionForceAddonWrapChildren: ListItemChildrenProps
    ): ReactElement = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var children: js.Any = js.native
      
      var forceAddonWrap: js.Any = js.native
      
      var leftAddon: js.Any = js.native
      
      var leftAddonPosition: js.Any = js.native
      
      var leftAddonType: js.Any = js.native
      
      var primaryText: js.Any = js.native
      
      var rightAddon: js.Any = js.native
      
      var rightAddonPosition: js.Any = js.native
      
      var rightAddonType: js.Any = js.native
      
      var secondaryText: js.Any = js.native
      
      var secondaryTextClassName: js.Any = js.native
      
      var textChildren: js.Any = js.native
      
      var textClassName: js.Any = js.native
    }
  }
  
  @js.native
  object ListItemText extends js.Object {
    
    def apply(hasClassNameSecondaryTextClassNameSecondaryTextChildren: ListItemTextProps): ReactElement = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var children: js.Any = js.native
      
      var className: js.Any = js.native
      
      var secondaryText: js.Any = js.native
      
      var secondaryTextClassName: js.Any = js.native
    }
  }
}
