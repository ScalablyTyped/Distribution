package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataIdNegated extends js.Object {
  var dataId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var negated: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
  var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_DataIdNegated {
  @scala.inline
  def apply(
    dataId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    negated: atPulumiPulumiLib.outputMod.Input[scala.Boolean],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_DataIdNegated = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataIdNegated]
  }
}

