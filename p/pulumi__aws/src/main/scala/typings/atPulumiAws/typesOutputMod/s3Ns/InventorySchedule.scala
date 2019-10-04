package typings.atPulumiAws.typesOutputMod.s3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventorySchedule extends js.Object {
  /**
    * Specifies how frequently inventory results are produced. Can be `Daily` or `Weekly`.
    */
  var frequency: String
}

object InventorySchedule {
  @scala.inline
  def apply(frequency: String): InventorySchedule = {
    val __obj = js.Dynamic.literal(frequency = frequency)
  
    __obj.asInstanceOf[InventorySchedule]
  }
}

