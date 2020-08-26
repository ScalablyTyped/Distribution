package typings.pulumiAws.inputMod.dynamodb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TablePointInTimeRecovery extends js.Object {
  /**
    * Indicates whether ttl is enabled (true) or disabled (false).
    */
  var enabled: Input[Boolean] = js.native
}

object TablePointInTimeRecovery {
  @scala.inline
  def apply(enabled: Input[Boolean]): TablePointInTimeRecovery = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablePointInTimeRecovery]
  }
  @scala.inline
  implicit class TablePointInTimeRecoveryOps[Self <: TablePointInTimeRecovery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
  }
  
}

