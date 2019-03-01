package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutomatedSnapshotStartHourInput extends js.Object {
  var automatedSnapshotStartHour: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object Anon_AutomatedSnapshotStartHourInput {
  @scala.inline
  def apply(automatedSnapshotStartHour: atPulumiPulumiLib.outputMod.Input[scala.Double]): Anon_AutomatedSnapshotStartHourInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("automatedSnapshotStartHour")(automatedSnapshotStartHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutomatedSnapshotStartHourInput]
  }
}

