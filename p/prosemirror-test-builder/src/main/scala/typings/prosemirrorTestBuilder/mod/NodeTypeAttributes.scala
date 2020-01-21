package typings.prosemirrorTestBuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ trait NodeTypeAttributes extends js.Object {
  var nodeType: String
}

object NodeTypeAttributes {
  @scala.inline
  def apply(nodeType: String): NodeTypeAttributes = {
    val __obj = js.Dynamic.literal(nodeType = nodeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeTypeAttributes]
  }
}

