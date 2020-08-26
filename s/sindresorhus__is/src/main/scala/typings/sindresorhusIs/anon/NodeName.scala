package typings.sindresorhusIs.anon

import typings.sindresorhusIs.sindresorhusIsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeName extends js.Object {
  var nodeName: String = js.native
  var nodeType: `1` = js.native
}

object NodeName {
  @scala.inline
  def apply(nodeName: String, nodeType: `1`): NodeName = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeName]
  }
  @scala.inline
  implicit class NodeNameOps[Self <: NodeName] (val x: Self) extends AnyVal {
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
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeType(value: `1`): Self = this.set("nodeType", value.asInstanceOf[js.Any])
  }
  
}

