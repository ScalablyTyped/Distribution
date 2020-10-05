package typings.rcTree.anon

import typings.rcTree.interfaceMod.DataNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index extends js.Object {
  var index: Double = js.native
  var key: typings.rcTree.interfaceMod.Key = js.native
  var level: Double = js.native
  var node: DataNode = js.native
  var parentPos: String | Double = js.native
  var pos: String = js.native
}

object Index {
  @scala.inline
  def apply(
    index: Double,
    key: typings.rcTree.interfaceMod.Key,
    level: Double,
    node: DataNode,
    parentPos: String | Double,
    pos: String
  ): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], parentPos = parentPos.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  @scala.inline
  implicit class IndexOps[Self <: Index] (val x: Self) extends AnyVal {
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
    def setKey(value: typings.rcTree.interfaceMod.Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: DataNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentPos(value: String | Double): Self = this.set("parentPos", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: String): Self = this.set("pos", value.asInstanceOf[js.Any])
  }
  
}

