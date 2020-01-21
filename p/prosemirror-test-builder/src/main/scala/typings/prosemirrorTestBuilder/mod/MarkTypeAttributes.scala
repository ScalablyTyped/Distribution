package typings.prosemirrorTestBuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ trait MarkTypeAttributes extends js.Object {
  var markType: String
}

object MarkTypeAttributes {
  @scala.inline
  def apply(markType: String): MarkTypeAttributes = {
    val __obj = js.Dynamic.literal(markType = markType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MarkTypeAttributes]
  }
}

