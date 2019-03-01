package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionOnTimeoutWaitTimeInMinutes extends js.Object {
  var actionOnTimeout: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var waitTimeInMinutes: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_ActionOnTimeoutWaitTimeInMinutes {
  @scala.inline
  def apply(
    actionOnTimeout: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    waitTimeInMinutes: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_ActionOnTimeoutWaitTimeInMinutes = {
    val __obj = js.Dynamic.literal()
    if (actionOnTimeout != null) __obj.updateDynamic("actionOnTimeout")(actionOnTimeout.asInstanceOf[js.Any])
    if (waitTimeInMinutes != null) __obj.updateDynamic("waitTimeInMinutes")(waitTimeInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionOnTimeoutWaitTimeInMinutes]
  }
}

