package typings.reactMdTree.typesMod

import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdList.listMod.ListProps
import typings.reactMdTree.anon.VisibleIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeProps[T /* <: BaseTreeItem */]
  extends ListProps
     with TreeItemExpansionIcon
     with TreeItemExpansion
     with TreeItemSelection {
  
  /**
    * The data to render within the tree.
    */
  var data: TreeData[T] = js.native
  
  /**
    * A function to extract the renderable label from each tree item. The default
    * behavior will be to just return `item[labelKey]`.
    */
  var getItemLabel: js.UndefOr[js.Function2[/* item */ T, /* labelKey */ String, ReactNode]] = js.native
  
  /**
    * @see GetItemProps
    */
  var getItemProps: js.UndefOr[GetItemProps[T]] = js.native
  
  /**
    * A function to extract the text string from each tree item. The default
    * behavior will be to return the `item[valueKey]` and stringify it.
    */
  var getItemValue: js.UndefOr[js.Function2[/* item */ T, /* valueKey */ String, String]] = js.native
  
  /**
    * The id for the tree element. This is required for a lot of accessibility features.
    */
  @JSName("id")
  var id_TreeProps: String = js.native
  
  /**
    * A function that gets called to render each `TreeItem` within the tree. This
    * can be overridden if you need to add additional functionality around the
    * `TreeItem` (such as drag and drop). The default behavior is to extract the
    * `ListItem` props:
    *
    * - `leftAddon`
    * - `leftAddonType`
    * - `leftAddonPosition`
    * - `rightAddon`
    * - `rightAddonType`
    * - `rightAddonPosition`
    * - `children`
    * - `to` / `href`
    * - `isLink`
    *
    * and try to render as a `TreeItem` with those props. It will also override
    * the `expanderLeft` and `expanderIcon` on the `TreeItem` with whatever was
    * provided to the `Tree` component.
    */
  var itemRenderer: js.UndefOr[TreeItemRenderer[T]] = js.native
  
  /**
    * The key to use to extract a renderable label from each tree item. This will
    * be displayed in the DOM as the `children` in each tree item.
    */
  var labelKey: js.UndefOr[String] = js.native
  
  /**
    * The component to use for any treeitem that has a `to`, `href`, or `isLink`
    * attribute. This is a nice way to be able to update treeitems to be links
    * instead of storing the `contentComponent` in the tree's data.
    */
  var linkComponent: js.UndefOr[ElementType[_]] = js.native
  
  /**
    * An optional id to use to determine the root items within the tree. You'll
    * most likely want to keep this as the default of `null`, but it can also be
    * used if you have a different identifier for root items.
    */
  var rootId: js.UndefOr[Null | TreeItemId] = js.native
  
  /**
    * @see TreeItemSorter
    */
  var sort: js.UndefOr[TreeItemSorter[T]] = js.native
  
  /**
    * The key to use to extract a text string from each tree item. This is used
    * for keyboard accessibility and being able to "search" the tree for items
    * starting with the typed letters.
    */
  var valueKey: js.UndefOr[String] = js.native
}
object TreeProps {
  
  @scala.inline
  def apply[T /* <: BaseTreeItem */](
    data: TreeData[T],
    expandedIds: ExpandedIds,
    id: String,
    onItemExpansion: (TreeItemId, Boolean) => Unit,
    onItemSelect: TreeItemId => Unit,
    onMultiItemExpansion: ExpandedIds => Unit,
    onMultiItemSelect: SelectedIds => Unit,
    selectedIds: SelectedIds
  ): TreeProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], expandedIds = expandedIds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onItemExpansion = js.Any.fromFunction2(onItemExpansion), onItemSelect = js.Any.fromFunction1(onItemSelect), onMultiItemExpansion = js.Any.fromFunction1(onMultiItemExpansion), onMultiItemSelect = js.Any.fromFunction1(onMultiItemSelect), selectedIds = selectedIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeProps[T]]
  }
  
  @scala.inline
  implicit class TreePropsOps[Self <: TreeProps[_], T /* <: BaseTreeItem */] (val x: Self with TreeProps[T]) extends AnyVal {
    
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
    def setData(value: TreeData[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetItemLabel(value: (/* item */ T, /* labelKey */ String) => ReactNode): Self = this.set("getItemLabel", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetItemLabel: Self = this.set("getItemLabel", js.undefined)
    
    @scala.inline
    def setGetItemProps(value: /* item */ T with TreeItemStates => js.UndefOr[ConfigurableTreeItemProps]): Self = this.set("getItemProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetItemProps: Self = this.set("getItemProps", js.undefined)
    
    @scala.inline
    def setGetItemValue(value: (/* item */ T, /* valueKey */ String) => String): Self = this.set("getItemValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetItemValue: Self = this.set("getItemValue", js.undefined)
    
    @scala.inline
    def setItemRenderer(
      value: (/* providedProps */ ProvidedTreeItemProps, /* item */ T with VisibleIndex, /* treeProps */ ProvidedTreeProps) => ReactElement | Null
    ): Self = this.set("itemRenderer", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteItemRenderer: Self = this.set("itemRenderer", js.undefined)
    
    @scala.inline
    def setLabelKey(value: String): Self = this.set("labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelKey: Self = this.set("labelKey", js.undefined)
    
    @scala.inline
    def setLinkComponent(value: ElementType[_]): Self = this.set("linkComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkComponent: Self = this.set("linkComponent", js.undefined)
    
    @scala.inline
    def setRootId(value: TreeItemId): Self = this.set("rootId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootId: Self = this.set("rootId", js.undefined)
    
    @scala.inline
    def setRootIdNull: Self = this.set("rootId", null)
    
    @scala.inline
    def setSort(value: /* items */ js.Array[T] => js.Array[T]): Self = this.set("sort", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueKey: Self = this.set("valueKey", js.undefined)
  }
}
