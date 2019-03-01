package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProdTrafficRouteTargetGroups extends js.Object {
  var prodTrafficRoute: atPulumiPulumiLib.outputMod.Input[Anon_ListenerArnsArray]
  var targetGroups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_NameInputString]]]
  var testTrafficRoute: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_ListenerArnsArray]] = js.undefined
}

object Anon_ProdTrafficRouteTargetGroups {
  @scala.inline
  def apply(
    prodTrafficRoute: atPulumiPulumiLib.outputMod.Input[Anon_ListenerArnsArray],
    targetGroups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_NameInputString]]],
    testTrafficRoute: atPulumiPulumiLib.outputMod.Input[Anon_ListenerArnsArray] = null
  ): Anon_ProdTrafficRouteTargetGroups = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("prodTrafficRoute")(prodTrafficRoute.asInstanceOf[js.Any])
    __obj.updateDynamic("targetGroups")(targetGroups.asInstanceOf[js.Any])
    if (testTrafficRoute != null) __obj.updateDynamic("testTrafficRoute")(testTrafficRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ProdTrafficRouteTargetGroups]
  }
}

