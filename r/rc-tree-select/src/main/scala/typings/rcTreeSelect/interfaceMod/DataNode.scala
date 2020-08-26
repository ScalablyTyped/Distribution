package typings.rcTreeSelect.interfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataNode
  extends /** Customize data info */
/* prop */ StringDictionary[js.Any] {
  var checkable: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[js.Array[DataNode]] = js.native
  var disableCheckbox: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[Key] = js.native
  var label: js.UndefOr[ReactNode] = js.native
  var title: js.UndefOr[ReactNode] = js.native
  var value: js.UndefOr[RawValueType] = js.native
}

object DataNode {
  @scala.inline
  def apply(): DataNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataNode]
  }
  @scala.inline
  implicit class DataNodeOps[Self <: DataNode] (val x: Self) extends AnyVal {
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
    def setCheckable(value: Boolean): Self = this.set("checkable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckable: Self = this.set("checkable", js.undefined)
    @scala.inline
    def setChildrenVarargs(value: DataNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[DataNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisableCheckbox(value: Boolean): Self = this.set("disableCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCheckbox: Self = this.set("disableCheckbox", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setValue(value: RawValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

