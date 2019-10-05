package typings.stellarDashSdk.stellarDashSdkMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriceR extends js.Object {
  var denominator: Double
  var numerator: Double
}

object PriceR {
  @scala.inline
  def apply(denominator: Double, numerator: Double): PriceR = {
    val __obj = js.Dynamic.literal(denominator = denominator, numerator = numerator)
  
    __obj.asInstanceOf[PriceR]
  }
}

