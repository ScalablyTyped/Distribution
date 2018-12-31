package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProdTrafficRoute extends js.Object {
  var prodTrafficRoute: atPulumiPulumiLib.resourceMod.Input[Anon_ListenerArns]
  var targetGroups: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_NameInputString]]]
  var testTrafficRoute: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_ListenerArns]] = js.undefined
}

