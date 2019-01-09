package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProdTrafficRouteTargetGroups extends js.Object {
  var prodTrafficRoute: atPulumiPulumiLib.resourceMod.Input[Anon_ListenerArnsArray]
  var targetGroups: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_NameInputString]]]
  var testTrafficRoute: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_ListenerArnsArray]] = js.undefined
}

