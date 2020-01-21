package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSemantics extends js.Object {
  var semantics: String
  var ssrcs: String
}

object AnonSemantics {
  @scala.inline
  def apply(semantics: String, ssrcs: String): AnonSemantics = {
    val __obj = js.Dynamic.literal(semantics = semantics.asInstanceOf[js.Any], ssrcs = ssrcs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSemantics]
  }
}

