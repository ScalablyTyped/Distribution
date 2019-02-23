package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestinationFilter extends js.Object {
  var destination: atPulumiPulumiLib.outputMod.Input[Anon_AccessControlTranslationAccountId]
  var filter: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_KeyPrefixTags]] = js.undefined
  var id: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var prefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var priority: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var sourceSelectionCriteria: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput654448986]
  ] = js.undefined
  var status: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

