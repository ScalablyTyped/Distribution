package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventorySchedule extends js.Object {
  /**
    * Specifies how frequently inventory results are produced. Valid values: `Daily`, `Weekly`.
    */
  var frequency: Input[String] = js.native
}

object InventorySchedule {
  @scala.inline
  def apply(frequency: Input[String]): InventorySchedule = {
    val __obj = js.Dynamic.literal(frequency = frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventorySchedule]
  }
}

