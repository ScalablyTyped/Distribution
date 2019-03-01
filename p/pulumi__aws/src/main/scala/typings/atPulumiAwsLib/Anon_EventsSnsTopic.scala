package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventsSnsTopic extends js.Object {
  var events: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var snsTopic: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_EventsSnsTopic {
  @scala.inline
  def apply(
    events: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    snsTopic: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_EventsSnsTopic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.updateDynamic("snsTopic")(snsTopic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EventsSnsTopic]
  }
}

