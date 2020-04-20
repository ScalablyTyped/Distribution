package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventorySchedule extends js.Object {
  /**
    * Specifies how frequently inventory results are produced. Valid values: `Daily`, `Weekly`.
    */
  var frequency: String = js.native
}

object InventorySchedule {
  @scala.inline
  def apply(frequency: String): InventorySchedule = {
    val __obj = js.Dynamic.literal(frequency = frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventorySchedule]
  }
}

