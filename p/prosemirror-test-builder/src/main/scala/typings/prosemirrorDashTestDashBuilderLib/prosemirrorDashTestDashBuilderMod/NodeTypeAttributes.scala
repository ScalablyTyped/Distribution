package typings
package prosemirrorDashTestDashBuilderLib.prosemirrorDashTestDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ trait NodeTypeAttributes extends js.Object {
  var nodeType: java.lang.String
}

object NodeTypeAttributes {
  @scala.inline
  def apply(nodeType: java.lang.String): NodeTypeAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nodeType")(nodeType)
    __obj.asInstanceOf[NodeTypeAttributes]
  }
}

