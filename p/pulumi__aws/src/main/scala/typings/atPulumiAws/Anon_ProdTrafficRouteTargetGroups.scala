package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProdTrafficRouteTargetGroups extends js.Object {
  var prodTrafficRoute: Input[Anon_ListenerArnsArray]
  var targetGroups: Input[js.Array[Input[Anon_NameInputString]]]
  var testTrafficRoute: js.UndefOr[Input[Anon_ListenerArnsArray]] = js.undefined
}

object Anon_ProdTrafficRouteTargetGroups {
  @scala.inline
  def apply(
    prodTrafficRoute: Input[Anon_ListenerArnsArray],
    targetGroups: Input[js.Array[Input[Anon_NameInputString]]],
    testTrafficRoute: Input[Anon_ListenerArnsArray] = null
  ): Anon_ProdTrafficRouteTargetGroups = {
    val __obj = js.Dynamic.literal(prodTrafficRoute = prodTrafficRoute.asInstanceOf[js.Any], targetGroups = targetGroups.asInstanceOf[js.Any])
    if (testTrafficRoute != null) __obj.updateDynamic("testTrafficRoute")(testTrafficRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ProdTrafficRouteTargetGroups]
  }
}

