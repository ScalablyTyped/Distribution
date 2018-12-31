package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrioritySourceSelectionCriteria extends js.Object {
  var destination: atPulumiPulumiLib.resourceMod.Input[Anon_AccountId]
  var filter: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_Prefix]] = js.undefined
  var id: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var prefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var priority: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var sourceSelectionCriteria: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_SseKmsEncryptedObjects]] = js.undefined
  var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

