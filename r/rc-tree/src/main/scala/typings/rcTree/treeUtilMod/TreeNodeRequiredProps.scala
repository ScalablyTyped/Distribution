package typings.rcTree.treeUtilMod

import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.Key
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeNodeRequiredProps extends js.Object {
  var checkedKeys: js.Array[Key] = js.native
  var dragOverNodeKey: Key = js.native
  var dropPosition: Double = js.native
  var expandedKeys: js.Array[Key] = js.native
  var halfCheckedKeys: js.Array[Key] = js.native
  var keyEntities: Record[Key, DataEntity] = js.native
  var loadedKeys: js.Array[Key] = js.native
  var loadingKeys: js.Array[Key] = js.native
  var selectedKeys: js.Array[Key] = js.native
}

object TreeNodeRequiredProps {
  @scala.inline
  def apply(
    checkedKeys: js.Array[Key],
    dragOverNodeKey: Key,
    dropPosition: Double,
    expandedKeys: js.Array[Key],
    halfCheckedKeys: js.Array[Key],
    keyEntities: Record[Key, DataEntity],
    loadedKeys: js.Array[Key],
    loadingKeys: js.Array[Key],
    selectedKeys: js.Array[Key]
  ): TreeNodeRequiredProps = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeRequiredProps]
  }
  @scala.inline
  implicit class TreeNodeRequiredPropsOps[Self <: TreeNodeRequiredProps] (val x: Self) extends AnyVal {
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
    def setCheckedKeysVarargs(value: Key*): Self = this.set("checkedKeys", js.Array(value :_*))
    @scala.inline
    def setCheckedKeys(value: js.Array[Key]): Self = this.set("checkedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragOverNodeKey(value: Key): Self = this.set("dragOverNodeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropPosition(value: Double): Self = this.set("dropPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedKeysVarargs(value: Key*): Self = this.set("expandedKeys", js.Array(value :_*))
    @scala.inline
    def setExpandedKeys(value: js.Array[Key]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setHalfCheckedKeysVarargs(value: Key*): Self = this.set("halfCheckedKeys", js.Array(value :_*))
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[Key]): Self = this.set("halfCheckedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyEntities(value: Record[Key, DataEntity]): Self = this.set("keyEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadedKeysVarargs(value: Key*): Self = this.set("loadedKeys", js.Array(value :_*))
    @scala.inline
    def setLoadedKeys(value: js.Array[Key]): Self = this.set("loadedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadingKeysVarargs(value: Key*): Self = this.set("loadingKeys", js.Array(value :_*))
    @scala.inline
    def setLoadingKeys(value: js.Array[Key]): Self = this.set("loadingKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedKeysVarargs(value: Key*): Self = this.set("selectedKeys", js.Array(value :_*))
    @scala.inline
    def setSelectedKeys(value: js.Array[Key]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
  }
  
}

