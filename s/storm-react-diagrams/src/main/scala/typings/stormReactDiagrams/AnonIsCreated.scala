package typings.stormReactDiagrams

import typings.stormReactDiagrams.nodeModelMod.NodeModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsCreated extends js.Object {
  var isCreated: Boolean
  var node: NodeModel
}

object AnonIsCreated {
  @scala.inline
  def apply(isCreated: Boolean, node: NodeModel): AnonIsCreated = {
    val __obj = js.Dynamic.literal(isCreated = isCreated.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsCreated]
  }
}

