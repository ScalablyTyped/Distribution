package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationFilter extends js.Object {
  var destination: atPulumiPulumiLib.resourceMod.Input[Anon_AccessControlTranslationAccountId]
  var filter: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_KeyPrefixTags]] = js.undefined
  var id: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var prefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var priority: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var sourceSelectionCriteria: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput1219541886]
  ] = js.undefined
  var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

