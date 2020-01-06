package typings.atPulumiAws.typesOutputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTableAttribute extends js.Object {
  /**
    * The name of the DynamoDB table.
    */
  var name: String = js.native
  var `type`: String = js.native
}

object GetTableAttribute {
  @scala.inline
  def apply(name: String, `type`: String): GetTableAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableAttribute]
  }
}

