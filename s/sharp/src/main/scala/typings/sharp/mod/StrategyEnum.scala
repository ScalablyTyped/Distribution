package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyEnum extends js.Object {
  var attention: Double
  var entropy: Double
}

object StrategyEnum {
  @scala.inline
  def apply(attention: Double, entropy: Double): StrategyEnum = {
    val __obj = js.Dynamic.literal(attention = attention.asInstanceOf[js.Any], entropy = entropy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StrategyEnum]
  }
}

