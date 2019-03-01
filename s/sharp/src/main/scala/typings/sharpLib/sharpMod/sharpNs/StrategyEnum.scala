package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyEnum extends js.Object {
  var attention: scala.Double
  var entropy: scala.Double
}

object StrategyEnum {
  @scala.inline
  def apply(attention: scala.Double, entropy: scala.Double): StrategyEnum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attention")(attention)
    __obj.updateDynamic("entropy")(entropy)
    __obj.asInstanceOf[StrategyEnum]
  }
}

