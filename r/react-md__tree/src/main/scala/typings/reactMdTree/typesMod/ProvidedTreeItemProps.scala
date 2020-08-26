package typings.reactMdTree.typesMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.MutableRefObject
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@react-md/tree.@react-md/tree/types/types.TreeItemProps, @react-md/tree.@react-md/tree/types/types.TreeItemKeys> */
@js.native
trait ProvidedTreeItemProps extends js.Object {
  var depth: Double = js.native
  var expanded: Boolean = js.native
  var focused: Boolean = js.native
  var id: String = js.native
  var itemIndex: Double = js.native
  /**
    * React `key`s aren't really "props", but it will be provided to each
    * `TreeItem` automatically.
    */
  var key: String = js.native
  /**
    * A ref that **must** be passed down to each `TreeItem` so that keyboard
    * accessibility works.  This will be omitted when the `isCustom` key is
    * enabled on the item.
    */
  var liRef: js.UndefOr[MutableRefObject[HTMLLIElement | Null]] = js.native
  var listSize: Double = js.native
  /**
    * A click handler that allows for the item to be selected or expanded. This
    * will be omitted when the `isCustom` key is enabled on the item.
    */
  var onClick: js.UndefOr[MouseEventHandler[HTMLLIElement]] = js.native
  var renderChildItems: js.UndefOr[js.Function0[ReactNode]] = js.native
  var selected: Boolean = js.native
}

object ProvidedTreeItemProps {
  @scala.inline
  def apply(
    depth: Double,
    expanded: Boolean,
    focused: Boolean,
    id: String,
    itemIndex: Double,
    key: String,
    listSize: Double,
    selected: Boolean
  ): ProvidedTreeItemProps = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], listSize = listSize.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvidedTreeItemProps]
  }
  @scala.inline
  implicit class ProvidedTreeItemPropsOps[Self <: ProvidedTreeItemProps] (val x: Self) extends AnyVal {
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setListSize(value: Double): Self = this.set("listSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setLiRef(value: MutableRefObject[HTMLLIElement | Null]): Self = this.set("liRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiRef: Self = this.set("liRef", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setRenderChildItems(value: () => ReactNode): Self = this.set("renderChildItems", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderChildItems: Self = this.set("renderChildItems", js.undefined)
  }
  
}

