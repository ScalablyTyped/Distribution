package typings.rcTree.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<rc-tree.rc-tree/es/interface.Entity, 'node' | 'parent' | 'children'> */
@js.native
trait DataEntity extends js.Object {
  var children: js.UndefOr[js.Array[DataEntity]] = js.native
  var index: Double = js.native
  var key: Key = js.native
  var level: Double = js.native
  var node: DataNode = js.native
  var parent: js.UndefOr[DataEntity] = js.native
  var pos: String = js.native
}

object DataEntity {
  @scala.inline
  def apply(index: Double, key: Key, level: Double, node: DataNode, pos: String): DataEntity = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEntity]
  }
  @scala.inline
  implicit class DataEntityOps[Self <: DataEntity] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: DataNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: String): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: DataEntity*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[DataEntity]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setParent(value: DataEntity): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
  
}

