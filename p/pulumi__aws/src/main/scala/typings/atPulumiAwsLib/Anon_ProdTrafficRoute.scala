package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProdTrafficRoute extends js.Object {
  var prodTrafficRoute: Anon_ListenerArns
  var targetGroups: js.Array[Anon_NameString_201725593]
  var testTrafficRoute: js.UndefOr[Anon_ListenerArns] = js.undefined
}

object Anon_ProdTrafficRoute {
  @scala.inline
  def apply(
    prodTrafficRoute: Anon_ListenerArns,
    targetGroups: js.Array[Anon_NameString_201725593],
    testTrafficRoute: Anon_ListenerArns = null
  ): Anon_ProdTrafficRoute = {
    val __obj = js.Dynamic.literal(prodTrafficRoute = prodTrafficRoute, targetGroups = targetGroups)
    if (testTrafficRoute != null) __obj.updateDynamic("testTrafficRoute")(testTrafficRoute)
    __obj.asInstanceOf[Anon_ProdTrafficRoute]
  }
}

