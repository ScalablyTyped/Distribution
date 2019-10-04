package typings.atPulumiAws.typesOutputMod.dynamodbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableAttribute extends js.Object {
  /**
    * The name of the index
    */
  var name: String
  /**
    * Attribute type, which must be a scalar type: `S`, `N`, or `B` for (S)tring, (N)umber or (B)inary data
    */
  var `type`: String
}

object TableAttribute {
  @scala.inline
  def apply(name: String, `type`: String): TableAttribute = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableAttribute]
  }
}

