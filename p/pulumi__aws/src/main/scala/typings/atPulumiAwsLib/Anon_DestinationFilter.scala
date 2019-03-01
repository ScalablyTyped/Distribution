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

object Anon_DestinationFilter {
  @scala.inline
  def apply(
    destination: atPulumiPulumiLib.outputMod.Input[Anon_AccessControlTranslationAccountId],
    status: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    filter: atPulumiPulumiLib.outputMod.Input[Anon_KeyPrefixTags] = null,
    id: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    prefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    priority: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    sourceSelectionCriteria: atPulumiPulumiLib.outputMod.Input[Anon_SseKmsEncryptedObjectsAnonEnabledBooleanInput654448986] = null
  ): Anon_DestinationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (sourceSelectionCriteria != null) __obj.updateDynamic("sourceSelectionCriteria")(sourceSelectionCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DestinationFilter]
  }
}

