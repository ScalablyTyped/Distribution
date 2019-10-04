package typings.atPulumiAws.typesOutputMod.dynamodbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTableAttribute extends js.Object {
  /**
    * The name of the DynamoDB table.
    */
  var name: String
  var `type`: String
}

object GetTableAttribute {
  @scala.inline
  def apply(name: String, `type`: String): GetTableAttribute = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GetTableAttribute]
  }
}

