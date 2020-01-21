package typings.pulumiAws.inputMod.dynamodb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableAttribute extends js.Object {
  /**
    * The name of the index
    */
  var name: Input[String] = js.native
  /**
    * Attribute type, which must be a scalar type: `S`, `N`, or `B` for (S)tring, (N)umber or (B)inary data
    */
  var `type`: Input[String] = js.native
}

object TableAttribute {
  @scala.inline
  def apply(name: Input[String], `type`: Input[String]): TableAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableAttribute]
  }
}

