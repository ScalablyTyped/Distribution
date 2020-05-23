package typings.sindresorhusIs.anon

import typings.sindresorhusIs.sindresorhusIsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeName extends js.Object {
  var nodeName: String
  var nodeType: `1`
}

object NodeName {
  @scala.inline
  def apply(nodeName: String, nodeType: `1`): NodeName = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeName]
  }
}

