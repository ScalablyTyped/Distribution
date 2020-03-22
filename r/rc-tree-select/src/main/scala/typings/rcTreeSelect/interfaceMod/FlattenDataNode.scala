package typings.rcTreeSelect.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlattenDataNode extends js.Object {
  var data: DataNode
  var key: Key
}

object FlattenDataNode {
  @scala.inline
  def apply(data: DataNode, key: Key): FlattenDataNode = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FlattenDataNode]
  }
}

