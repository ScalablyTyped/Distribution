package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LogDestination extends js.Object {
  var logDestination: java.lang.String
  var redactedFields: js.UndefOr[Anon_FieldToMatches] = js.undefined
}

object Anon_LogDestination {
  @scala.inline
  def apply(logDestination: java.lang.String, redactedFields: Anon_FieldToMatches = null): Anon_LogDestination = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("logDestination")(logDestination)
    if (redactedFields != null) __obj.updateDynamic("redactedFields")(redactedFields)
    __obj.asInstanceOf[Anon_LogDestination]
  }
}

