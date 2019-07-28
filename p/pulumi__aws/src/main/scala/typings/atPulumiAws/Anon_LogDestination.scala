package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LogDestination extends js.Object {
  var logDestination: String
  var redactedFields: js.UndefOr[Anon_FieldToMatches] = js.undefined
}

object Anon_LogDestination {
  @scala.inline
  def apply(logDestination: String, redactedFields: Anon_FieldToMatches = null): Anon_LogDestination = {
    val __obj = js.Dynamic.literal(logDestination = logDestination)
    if (redactedFields != null) __obj.updateDynamic("redactedFields")(redactedFields)
    __obj.asInstanceOf[Anon_LogDestination]
  }
}

