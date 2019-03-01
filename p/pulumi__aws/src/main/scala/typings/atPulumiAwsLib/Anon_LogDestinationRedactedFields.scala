package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LogDestinationRedactedFields extends js.Object {
  var logDestination: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var redactedFields: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_FieldToMatchesAnonDataTypeInput]] = js.undefined
}

object Anon_LogDestinationRedactedFields {
  @scala.inline
  def apply(
    logDestination: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    redactedFields: atPulumiPulumiLib.outputMod.Input[Anon_FieldToMatchesAnonDataTypeInput] = null
  ): Anon_LogDestinationRedactedFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logDestination")(logDestination.asInstanceOf[js.Any])
    if (redactedFields != null) __obj.updateDynamic("redactedFields")(redactedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LogDestinationRedactedFields]
  }
}

