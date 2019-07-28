package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LogDestinationRedactedFields extends js.Object {
  var logDestination: Input[String]
  var redactedFields: js.UndefOr[Input[Anon_FieldToMatchesAnonDataTypeInput]] = js.undefined
}

object Anon_LogDestinationRedactedFields {
  @scala.inline
  def apply(logDestination: Input[String], redactedFields: Input[Anon_FieldToMatchesAnonDataTypeInput] = null): Anon_LogDestinationRedactedFields = {
    val __obj = js.Dynamic.literal(logDestination = logDestination.asInstanceOf[js.Any])
    if (redactedFields != null) __obj.updateDynamic("redactedFields")(redactedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LogDestinationRedactedFields]
  }
}

