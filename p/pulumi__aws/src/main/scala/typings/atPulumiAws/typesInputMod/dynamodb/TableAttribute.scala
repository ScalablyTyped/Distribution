package typings.atPulumiAws.typesInputMod.dynamodb

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableAttribute extends js.Object {
  /**
    * The name of the index
    */
  var name: Input[String]
  /**
    * Attribute type, which must be a scalar type: `S`, `N`, or `B` for (S)tring, (N)umber or (B)inary data
    */
  var `type`: Input[String]
}

object TableAttribute {
  @scala.inline
  def apply(name: Input[String], `type`: Input[String]): TableAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableAttribute]
  }
}

