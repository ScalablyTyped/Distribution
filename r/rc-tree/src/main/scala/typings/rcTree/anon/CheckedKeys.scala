package typings.rcTree.anon

import typings.rcTree.interfaceMod.DataEntity
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckedKeys extends js.Object {
  var checkedKeys: js.Array[String | Double] = js.native
  var dragOverNodeKey: String | Double = js.native
  var dropPosition: Double = js.native
  var expandedKeys: js.Array[String | Double] = js.native
  var halfCheckedKeys: js.Array[String | Double] = js.native
  var keyEntities: Record[String | Double, DataEntity] = js.native
  var loadedKeys: js.Array[String | Double] = js.native
  var loadingKeys: js.Array[String | Double] = js.native
  var selectedKeys: js.Array[String | Double] = js.native
}

object CheckedKeys {
  @scala.inline
  def apply(
    checkedKeys: js.Array[String | Double],
    dragOverNodeKey: String | Double,
    dropPosition: Double,
    expandedKeys: js.Array[String | Double],
    halfCheckedKeys: js.Array[String | Double],
    keyEntities: Record[String | Double, DataEntity],
    loadedKeys: js.Array[String | Double],
    loadingKeys: js.Array[String | Double],
    selectedKeys: js.Array[String | Double]
  ): CheckedKeys = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedKeys]
  }
  @scala.inline
  implicit class CheckedKeysOps[Self <: CheckedKeys] (val x: Self) extends AnyVal {
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
    def setCheckedKeysVarargs(value: (String | Double)*): Self = this.set("checkedKeys", js.Array(value :_*))
    @scala.inline
    def setCheckedKeys(value: js.Array[String | Double]): Self = this.set("checkedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragOverNodeKey(value: String | Double): Self = this.set("dragOverNodeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropPosition(value: Double): Self = this.set("dropPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedKeysVarargs(value: (String | Double)*): Self = this.set("expandedKeys", js.Array(value :_*))
    @scala.inline
    def setExpandedKeys(value: js.Array[String | Double]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setHalfCheckedKeysVarargs(value: (String | Double)*): Self = this.set("halfCheckedKeys", js.Array(value :_*))
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[String | Double]): Self = this.set("halfCheckedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyEntities(value: Record[String | Double, DataEntity]): Self = this.set("keyEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadedKeysVarargs(value: (String | Double)*): Self = this.set("loadedKeys", js.Array(value :_*))
    @scala.inline
    def setLoadedKeys(value: js.Array[String | Double]): Self = this.set("loadedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadingKeysVarargs(value: (String | Double)*): Self = this.set("loadingKeys", js.Array(value :_*))
    @scala.inline
    def setLoadingKeys(value: js.Array[String | Double]): Self = this.set("loadingKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedKeysVarargs(value: (String | Double)*): Self = this.set("selectedKeys", js.Array(value :_*))
    @scala.inline
    def setSelectedKeys(value: js.Array[String | Double]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
  }
  
}

