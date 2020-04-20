package typings.pulumiAws.outputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableTtl extends js.Object {
  var attributeName: String = js.native
  var enabled: Boolean = js.native
}

object GetTableTtl {
  @scala.inline
  def apply(attributeName: String, enabled: Boolean): GetTableTtl = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableTtl]
  }
}

