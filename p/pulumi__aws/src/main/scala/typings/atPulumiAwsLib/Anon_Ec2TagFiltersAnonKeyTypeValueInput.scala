package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ec2TagFiltersAnonKeyTypeValueInput extends js.Object {
  var ec2TagFilters: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_KeyTypeValueInput]]]
  ] = js.undefined
}

object Anon_Ec2TagFiltersAnonKeyTypeValueInput {
  @scala.inline
  def apply(
    ec2TagFilters: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_KeyTypeValueInput]]] = null
  ): Anon_Ec2TagFiltersAnonKeyTypeValueInput = {
    val __obj = js.Dynamic.literal()
    if (ec2TagFilters != null) __obj.updateDynamic("ec2TagFilters")(ec2TagFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Ec2TagFiltersAnonKeyTypeValueInput]
  }
}

