package typings.reactMdTree.anon

import typings.react.mod.ReactNode
import typings.reactMdList.listItemAddonMod.ListItemAddonPosition
import typings.reactMdList.listItemAddonMod.ListItemAddonType
import typings.reactMdTree.typesMod.TreeItemId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-md/tree.@react-md/tree/types/types.BaseTreeItem & {  visibleIndex :number} */
@js.native
trait BaseTreeItemvisibleIndexn extends js.Object {
  
  /**
    * The main content to display. When the `textChildren` prop is enabled and
    * there is child content, it will be treated as primary text and update the
    * styles automatically.
    */
  var children: js.UndefOr[ReactNode] = js.native
  
  /**
    * Boolean if the left and/or right addons should be "forcefully" wrapped in a
    * `<span>` with the spacing class names applied instead of attempting to
    * clone it into the provided icon element.
    */
  var forceAddonWrap: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the provided item is a custom element and will not be rendered
    * in a `TreeItem` component. This is useful if you want to be able to render
    * `Divider` or `ListSubheader` components within a tree since they _should_
    * be able to be rendered without any of the tree functionality.
    */
  var isCustom: js.UndefOr[Boolean] = js.native
  
  /**
    * The unique identifier for an item within the tree. This is used to be able
    * to link tree items together with parent items as well as selected/expanded
    * logic.
    */
  var itemId: TreeItemId = js.native
  
  /**
    * An optional addon to display to the left of the `primaryText` or
    * `children` and should be used with the `leftAddonType` prop to adjust
    * spacing.
    */
  var leftAddon: js.UndefOr[ReactNode] = js.native
  
  /**
    * The vertical position the left icon, avatar, media, or large media
    * should be placed.
    */
  var leftAddonPosition: js.UndefOr[ListItemAddonPosition] = js.native
  
  /**
    * The type of the addon that appears to the left of the `primaryText` or
    * `children`.
    */
  var leftAddonType: js.UndefOr[ListItemAddonType] = js.native
  
  /**
    * This id is used to be able to link tree items together with children and
    * parents. If the `parentId` is set to `null`, the tree item will appear at
    * the root of the tree. Otherwise, the tree item will appear as a child of
    * the referenced tree item by `itemId`
    */
  var parentId: Null | TreeItemId = js.native
  
  /**
    * An optional element that should be rendered as the `primaryText` within the
    * list item. It is most likely easier to use the `children` prop instead, but
    * this allows you to create more complex components with the `ListItem` since
    * you can provided `children` and have the styles for the `primaryText` still
    * applied. By default, this will only allow one line of text and add ellipsis
    * for any text overflow.
    */
  var primaryText: js.UndefOr[ReactNode] = js.native
  
  /**
    * An optional addon to display to the right of the `primaryText` or
    * `children` and should be used with the `rightAddonType` prop to adjust
    * spacing.
    */
  var rightAddon: js.UndefOr[ReactNode] = js.native
  
  /**
    * The vertical position the right icon, avatar, media, or large media
    * should be placed.
    */
  var rightAddonPosition: js.UndefOr[ListItemAddonPosition] = js.native
  
  /**
    * The type of the addon that appears to the right of the `primaryText` or
    * `children`.
    */
  var rightAddonType: js.UndefOr[ListItemAddonType] = js.native
  
  /**
    * An optional element that should be rendered as the `secondaryText` within
    * the list item. By default, this will only span one line and add ellipsis
    * for overflow.
    */
  var secondaryText: js.UndefOr[ReactNode] = js.native
  
  /**
    * An optional className to apply to the `<span>` that surrounds the
    * `secondaryText` within the list item.
    */
  var secondaryTextClassName: js.UndefOr[String] = js.native
  
  /**
    * Boolean if the children should be treated as the `primaryText` prop. This
    * will wrap them in an additional class so that they have ellipsis for text
    * overflow.
    *
    * If you want to have more "freedom" within the `ListItem`, you can disable
    * this prop so that the height will grow depending on content.
    *
    * NOTE: If the `secondaryText` prop is provided, this will always be
    * considered `true`.
    */
  var textChildren: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional className to apply to the `<span>` that surrounds the
    * `primaryText` and optionally `secondaryText` within the list item.
    */
  var textClassName: js.UndefOr[String] = js.native
  
  var visibleIndex: Double = js.native
}
object BaseTreeItemvisibleIndexn {
  
  @scala.inline
  def apply(itemId: TreeItemId, visibleIndex: Double): BaseTreeItemvisibleIndexn = {
    val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTreeItemvisibleIndexn]
  }
  
  @scala.inline
  implicit class BaseTreeItemvisibleIndexnOps[Self <: BaseTreeItemvisibleIndexn] (val x: Self) extends AnyVal {
    
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
    def setItemId(value: TreeItemId): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setForceAddonWrap(value: Boolean): Self = this.set("forceAddonWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceAddonWrap: Self = this.set("forceAddonWrap", js.undefined)
    
    @scala.inline
    def setIsCustom(value: Boolean): Self = this.set("isCustom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCustom: Self = this.set("isCustom", js.undefined)
    
    @scala.inline
    def setLeftAddon(value: ReactNode): Self = this.set("leftAddon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftAddon: Self = this.set("leftAddon", js.undefined)
    
    @scala.inline
    def setLeftAddonPosition(value: ListItemAddonPosition): Self = this.set("leftAddonPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftAddonPosition: Self = this.set("leftAddonPosition", js.undefined)
    
    @scala.inline
    def setLeftAddonType(value: ListItemAddonType): Self = this.set("leftAddonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftAddonType: Self = this.set("leftAddonType", js.undefined)
    
    @scala.inline
    def setParentId(value: TreeItemId): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdNull: Self = this.set("parentId", null)
    
    @scala.inline
    def setPrimaryText(value: ReactNode): Self = this.set("primaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryText: Self = this.set("primaryText", js.undefined)
    
    @scala.inline
    def setRightAddon(value: ReactNode): Self = this.set("rightAddon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightAddon: Self = this.set("rightAddon", js.undefined)
    
    @scala.inline
    def setRightAddonPosition(value: ListItemAddonPosition): Self = this.set("rightAddonPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightAddonPosition: Self = this.set("rightAddonPosition", js.undefined)
    
    @scala.inline
    def setRightAddonType(value: ListItemAddonType): Self = this.set("rightAddonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightAddonType: Self = this.set("rightAddonType", js.undefined)
    
    @scala.inline
    def setSecondaryText(value: ReactNode): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryText: Self = this.set("secondaryText", js.undefined)
    
    @scala.inline
    def setSecondaryTextClassName(value: String): Self = this.set("secondaryTextClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryTextClassName: Self = this.set("secondaryTextClassName", js.undefined)
    
    @scala.inline
    def setTextChildren(value: Boolean): Self = this.set("textChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextChildren: Self = this.set("textChildren", js.undefined)
    
    @scala.inline
    def setTextClassName(value: String): Self = this.set("textClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextClassName: Self = this.set("textClassName", js.undefined)
  }
}
