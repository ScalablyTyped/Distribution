package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionTerminationWaitTimeInMinutes extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var terminationWaitTimeInMinutes: js.UndefOr[Double] = js.undefined
}

object Anon_ActionTerminationWaitTimeInMinutes {
  @scala.inline
  def apply(action: String = null, terminationWaitTimeInMinutes: Int | Double = null): Anon_ActionTerminationWaitTimeInMinutes = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (terminationWaitTimeInMinutes != null) __obj.updateDynamic("terminationWaitTimeInMinutes")(terminationWaitTimeInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionTerminationWaitTimeInMinutes]
  }
}

