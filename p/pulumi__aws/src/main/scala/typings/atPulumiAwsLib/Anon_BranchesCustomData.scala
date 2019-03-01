package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BranchesCustomData extends js.Object {
  var branches: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var customData: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var destinationArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var events: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var name: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_BranchesCustomData {
  @scala.inline
  def apply(
    destinationArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    events: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    branches: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    customData: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_BranchesCustomData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destinationArn")(destinationArn.asInstanceOf[js.Any])
    __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (branches != null) __obj.updateDynamic("branches")(branches.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BranchesCustomData]
  }
}

