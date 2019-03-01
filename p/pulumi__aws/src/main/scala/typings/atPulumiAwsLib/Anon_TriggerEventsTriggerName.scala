package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TriggerEventsTriggerName extends js.Object {
  var triggerEvents: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var triggerName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var triggerTargetArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_TriggerEventsTriggerName {
  @scala.inline
  def apply(
    triggerEvents: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    triggerName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    triggerTargetArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_TriggerEventsTriggerName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("triggerEvents")(triggerEvents.asInstanceOf[js.Any])
    __obj.updateDynamic("triggerName")(triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("triggerTargetArn")(triggerTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TriggerEventsTriggerName]
  }
}

