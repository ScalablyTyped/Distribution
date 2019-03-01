package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionTerminationWaitTimeInMinutes extends js.Object {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var terminationWaitTimeInMinutes: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ActionTerminationWaitTimeInMinutes {
  @scala.inline
  def apply(action: java.lang.String = null, terminationWaitTimeInMinutes: scala.Int | scala.Double = null): Anon_ActionTerminationWaitTimeInMinutes = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (terminationWaitTimeInMinutes != null) __obj.updateDynamic("terminationWaitTimeInMinutes")(terminationWaitTimeInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionTerminationWaitTimeInMinutes]
  }
}

