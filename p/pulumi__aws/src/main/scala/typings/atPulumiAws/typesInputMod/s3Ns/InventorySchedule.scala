package typings.atPulumiAws.typesInputMod.s3Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventorySchedule extends js.Object {
  /**
    * Specifies how frequently inventory results are produced. Can be `Daily` or `Weekly`.
    */
  var frequency: Input[String]
}

object InventorySchedule {
  @scala.inline
  def apply(frequency: Input[String]): InventorySchedule = {
    val __obj = js.Dynamic.literal(frequency = frequency.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InventorySchedule]
  }
}

