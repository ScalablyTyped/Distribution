package typings.reactMdTree.typesMod

import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@react-md/tree.@react-md/tree/types/types.TreeProps<@react-md/tree.@react-md/tree/types/types.UnknownTreeItem>, 'linkComponent' | 'id'> & std.Required<std.Pick<@react-md/tree.@react-md/tree/types/types.TreeProps<@react-md/tree.@react-md/tree/types/types.UnknownTreeItem>, 'rootId' | 'multiSelect' | 'labelKey' | 'valueKey' | 'getItemLabel' | 'getItemValue' | 'getItemProps' | 'expanderLeft' | 'expanderIcon'>> */
@js.native
trait ProvidedTreeProps extends js.Object {
  var expanderIcon: ReactNode = js.native
  var expanderLeft: Boolean = js.native
  var getItemLabel: js.Function2[/* item */ UnknownTreeItem, /* labelKey */ String, ReactNode] = js.native
  var getItemProps: GetItemProps[UnknownTreeItem] = js.native
  var getItemValue: js.Function2[/* item */ UnknownTreeItem, /* valueKey */ String, String] = js.native
  var id: String = js.native
  var labelKey: String = js.native
  var linkComponent: js.UndefOr[ElementType[_]] = js.native
  var multiSelect: Boolean = js.native
  var rootId: TreeItemId = js.native
  var valueKey: String = js.native
}

object ProvidedTreeProps {
  @scala.inline
  def apply(
    expanderLeft: Boolean,
    getItemLabel: (/* item */ UnknownTreeItem, /* labelKey */ String) => ReactNode,
    getItemProps: /* item */ UnknownTreeItem with TreeItemStates => js.UndefOr[ConfigurableTreeItemProps],
    getItemValue: (/* item */ UnknownTreeItem, /* valueKey */ String) => String,
    id: String,
    labelKey: String,
    multiSelect: Boolean,
    rootId: TreeItemId,
    valueKey: String
  ): ProvidedTreeProps = {
    val __obj = js.Dynamic.literal(expanderLeft = expanderLeft.asInstanceOf[js.Any], getItemLabel = js.Any.fromFunction2(getItemLabel), getItemProps = js.Any.fromFunction1(getItemProps), getItemValue = js.Any.fromFunction2(getItemValue), id = id.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], multiSelect = multiSelect.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvidedTreeProps]
  }
  @scala.inline
  implicit class ProvidedTreePropsOps[Self <: ProvidedTreeProps] (val x: Self) extends AnyVal {
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
    def setExpanderLeft(value: Boolean): Self = this.set("expanderLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetItemLabel(value: (/* item */ UnknownTreeItem, /* labelKey */ String) => ReactNode): Self = this.set("getItemLabel", js.Any.fromFunction2(value))
    @scala.inline
    def setGetItemProps(value: /* item */ UnknownTreeItem with TreeItemStates => js.UndefOr[ConfigurableTreeItemProps]): Self = this.set("getItemProps", js.Any.fromFunction1(value))
    @scala.inline
    def setGetItemValue(value: (/* item */ UnknownTreeItem, /* valueKey */ String) => String): Self = this.set("getItemValue", js.Any.fromFunction2(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelKey(value: String): Self = this.set("labelKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiSelect(value: Boolean): Self = this.set("multiSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootId(value: TreeItemId): Self = this.set("rootId", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpanderIcon(value: ReactNode): Self = this.set("expanderIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanderIcon: Self = this.set("expanderIcon", js.undefined)
    @scala.inline
    def setLinkComponent(value: ElementType[_]): Self = this.set("linkComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkComponent: Self = this.set("linkComponent", js.undefined)
  }
  
}

