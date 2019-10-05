package typings.atPulumiAws.typesOutputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableTtl extends js.Object {
  var attributeName: String
  var enabled: Boolean
}

object GetTableTtl {
  @scala.inline
  def apply(attributeName: String, enabled: Boolean): GetTableTtl = {
    val __obj = js.Dynamic.literal(attributeName = attributeName, enabled = enabled)
  
    __obj.asInstanceOf[GetTableTtl]
  }
}

