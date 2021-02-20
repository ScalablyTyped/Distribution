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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/list", "List")
  @js.native
  val List: ForwardRefExoticComponent[ListProps with RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/list", "ListItem")
  @js.native
  val ListItem: ForwardRefExoticComponent[ListItemProps with RefAttributes[HTMLLIElement]] = js.native
  
  object ListItemAddon {
    
    @JSImport("@react-md/list", "ListItemAddon")
    @js.native
    def apply(hasClassNameChildrenAddonAddonAfterTypePositionForceAddonWrapProps: ListItemAddonProps): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/list", "ListItemAddon.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/list", "ListItemAddon.propTypes.addon")
      @js.native
      def addon: js.Any = js.native
      
      @JSImport("@react-md/list", "ListItemAddon.propTypes.addonAfter")
      @js.native
      def addonAfter: js.Any = js.native
      @scala.inline
      def addonAfter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addonAfter")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def addon_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addon")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list", "ListItemAddon.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list", "ListItemAddon.propTypes.className")
      @js.native
      def className: js.Any = js.native
      @scala.inline
      def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list", "ListItemAddon.propTypes.forceAddonWrap")
      @js.native
      def forceAddonWrap: js.Any = js.native
      @scala.inline
      def forceAddonWrap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceAddonWrap")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list", "ListItemAddon.propTypes.position")
      @js.native
      def position: js.Any = js.native
      @scala.inline
      def position_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("position")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list", "ListItemAddon.propTypes.type")
      @js.native
      val `type`: js.Any = js.native
    }
  }
  
  object ListItemChildren {
    
    @JSImport("@react-md/list", "ListItemChildren")
    @js.native
    def apply(
      hasTextClassNameSecondaryTextClassNameTextChildrenPrimaryTextSecondaryTextLeftAddonLeftAddonTypeLeftAddonPositionRightAddonRightAddonTypeRightAddonPositionForceAddonWrapChildren: ListItemChildrenProps
    ): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/list", "ListItemChildren.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/list", "ListItemChildren.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list", "ListItemChildren.propTypes.forceAddonWrap")
      @js.native
      def forceAddonWrap: js.Any = js.native
      @scala.inline
      def forceAddonWrap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceAddonWrap")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list", "ListItemChildren.propTypes.leftAddon")
      @js.native
      def leftAddon: js.Any = js.native
      
      @JSImport("@react-md/list", "ListItemChildren.propTypes.leftAddonPosition")
      @js.native
      def leftAddonPosition: js.Any = js.native
      @scala.inline
      def leftAddonPosition_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftAddonPosition")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list", "ListItemChildren.propTypes.leftAddonType")
      @js.native
      def leftAddonType: js.Any = js.native
      @scala.inline
      def leftAddonType_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftAddonType")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def leftAddon_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftAddon")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list", "ListItemChildren.propTypes.primaryText")
      @js.native
      def primaryText: js.Any = js.native
      @scala.inline
      def primaryText_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list", "ListItemChildren.propTypes.rightAddon")
      @js.native
      def rightAddon: js.Any = js.native
      
      @JSImport("@react-md/list", "ListItemChildren.propTypes.rightAddonPosition")
      @js.native
      def rightAddonPosition: js.Any = js.native
      @scala.inline
      def rightAddonPosition_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightAddonPosition")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list", "ListItemChildren.propTypes.rightAddonType")
      @js.native
      def rightAddonType: js.Any = js.native
      @scala.inline
      def rightAddonType_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightAddonType")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def rightAddon_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightAddon")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list", "ListItemChildren.propTypes.secondaryText")
      @js.native
      def secondaryText: js.Any = js.native
      
      @JSImport("@react-md/list", "ListItemChildren.propTypes.secondaryTextClassName")
      @js.native
      def secondaryTextClassName: js.Any = js.native
      @scala.inline
      def secondaryTextClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondaryTextClassName")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def secondaryText_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list", "ListItemChildren.propTypes.textChildren")
      @js.native
      def textChildren: js.Any = js.native
      @scala.inline
      def textChildren_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textChildren")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list", "ListItemChildren.propTypes.textClassName")
      @js.native
      def textClassName: js.Any = js.native
      @scala.inline
      def textClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textClassName")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/list", "ListItemLink")
  @js.native
  val ListItemLink: ForwardRefExoticComponent[
    (ListItemLinkProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ])) | (ListItemLinkWithComponentProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ]))
  ] = js.native
  
  object ListItemText {
    
    @JSImport("@react-md/list", "ListItemText")
    @js.native
    def apply(hasClassNameSecondaryTextClassNameSecondaryTextChildren: ListItemTextProps): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/list", "ListItemText.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/list", "ListItemText.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list", "ListItemText.propTypes.className")
      @js.native
      def className: js.Any = js.native
      @scala.inline
      def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list", "ListItemText.propTypes.secondaryText")
      @js.native
      def secondaryText: js.Any = js.native
      
      @JSImport("@react-md/list", "ListItemText.propTypes.secondaryTextClassName")
      @js.native
      def secondaryTextClassName: js.Any = js.native
      @scala.inline
      def secondaryTextClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondaryTextClassName")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def secondaryText_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/list", "ListSubheader")
  @js.native
  val ListSubheader: ForwardRefExoticComponent[ListSubheaderProps with RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/list", "SimpleListItem")
  @js.native
  val SimpleListItem: ForwardRefExoticComponent[SimpleListItemProps with RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/list", "getListItemHeight")
  @js.native
  def getListItemHeight(hasHeightLeftAddonLeftAddonTypeRightAddonRightAddonTypeSecondaryText: SimpleListItemProps): ListItemHeight = js.native
}
