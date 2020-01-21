package typings.simpleStatistics.chiSquaredDistributionTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionTable extends js.Object {
  @JSName("0.005")
  var `0Dot005`: Double
  @JSName("0.01")
  var `0Dot01`: Double
  @JSName("0.025")
  var `0Dot025`: Double
  @JSName("0.05")
  var `0Dot05`: Double
  @JSName("0.1")
  var `0Dot1`: Double
  @JSName("0.5")
  var `0Dot5`: Double
  @JSName("0.9")
  var `0Dot9`: Double
  @JSName("0.95")
  var `0Dot95`: Double
  @JSName("0.975")
  var `0Dot975`: Double
  @JSName("0.99")
  var `0Dot99`: Double
  @JSName("0.995")
  var `0Dot995`: Double
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
}

