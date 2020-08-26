package typings.simpleStatistics.chiSquaredDistributionTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionTable extends js.Object {
  @JSName("0.005")
  var `0Dot005`: Double = js.native
  @JSName("0.01")
  var `0Dot01`: Double = js.native
  @JSName("0.025")
  var `0Dot025`: Double = js.native
  @JSName("0.05")
  var `0Dot05`: Double = js.native
  @JSName("0.1")
  var `0Dot1`: Double = js.native
  @JSName("0.5")
  var `0Dot5`: Double = js.native
  @JSName("0.9")
  var `0Dot9`: Double = js.native
  @JSName("0.95")
  var `0Dot95`: Double = js.native
  @JSName("0.975")
  var `0Dot975`: Double = js.native
  @JSName("0.99")
  var `0Dot99`: Double = js.native
  @JSName("0.995")
  var `0Dot995`: Double = js.native
}

object DistributionTable {
  @scala.inline
  def apply(
    `0Dot005`: Double,
    `0Dot01`: Double,
    `0Dot025`: Double,
    `0Dot05`: Double,
    `0Dot1`: Double,
    `0Dot5`: Double,
    `0Dot9`: Double,
    `0Dot95`: Double,
    `0Dot975`: Double,
    `0Dot99`: Double,
    `0Dot995`: Double
  ): DistributionTable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0.005")(`0Dot005`.asInstanceOf[js.Any])
    __obj.updateDynamic("0.01")(`0Dot01`.asInstanceOf[js.Any])
    __obj.updateDynamic("0.025")(`0Dot025`.asInstanceOf[js.Any])
    __obj.updateDynamic("0.05")(`0Dot05`.asInstanceOf[js.Any])
    __obj.updateDynamic("0.1")(`0Dot1`.asInstanceOf[js.Any])
    __obj.updateDynamic("0.5")(`0Dot5`.asInstanceOf[js.Any])
    __obj.updateDynamic("0.9")(`0Dot9`.asInstanceOf[js.Any])
    __obj.updateDynamic("0.95")(`0Dot95`.asInstanceOf[js.Any])
    __obj.updateDynamic("0.975")(`0Dot975`.asInstanceOf[js.Any])
    __obj.updateDynamic("0.99")(`0Dot99`.asInstanceOf[js.Any])
    __obj.updateDynamic("0.995")(`0Dot995`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionTable]
  }
  @scala.inline
  implicit class DistributionTableOps[Self <: DistributionTable] (val x: Self) extends AnyVal {
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
    def set0Dot005(value: Double): Self = this.set("0.005", value.asInstanceOf[js.Any])
    @scala.inline
    def set0Dot01(value: Double): Self = this.set("0.01", value.asInstanceOf[js.Any])
    @scala.inline
    def set0Dot025(value: Double): Self = this.set("0.025", value.asInstanceOf[js.Any])
    @scala.inline
    def set0Dot05(value: Double): Self = this.set("0.05", value.asInstanceOf[js.Any])
    @scala.inline
    def set0Dot1(value: Double): Self = this.set("0.1", value.asInstanceOf[js.Any])
    @scala.inline
    def set0Dot5(value: Double): Self = this.set("0.5", value.asInstanceOf[js.Any])
    @scala.inline
    def set0Dot9(value: Double): Self = this.set("0.9", value.asInstanceOf[js.Any])
    @scala.inline
    def set0Dot95(value: Double): Self = this.set("0.95", value.asInstanceOf[js.Any])
    @scala.inline
    def set0Dot975(value: Double): Self = this.set("0.975", value.asInstanceOf[js.Any])
    @scala.inline
    def set0Dot99(value: Double): Self = this.set("0.99", value.asInstanceOf[js.Any])
    @scala.inline
    def set0Dot995(value: Double): Self = this.set("0.995", value.asInstanceOf[js.Any])
  }
  
}

