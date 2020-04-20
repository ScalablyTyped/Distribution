package typings.rcTreeSelect.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlattenDataNode extends js.Object {
  var data: DataNode
  var key: Key
  var level: Double
}

object FlattenDataNode {
  @scala.inline
  def apply(data: DataNode, key: Key, level: Double): FlattenDataNode = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenDataNode]
  }
}

