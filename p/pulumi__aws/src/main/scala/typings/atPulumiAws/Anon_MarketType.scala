package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MarketType extends js.Object {
  var marketType: String
  var spotOptions: js.Array[Anon_BlockDurationMinutes]
}

object Anon_MarketType {
  @scala.inline
  def apply(marketType: String, spotOptions: js.Array[Anon_BlockDurationMinutes]): Anon_MarketType = {
    val __obj = js.Dynamic.literal(marketType = marketType, spotOptions = spotOptions)
  
    __obj.asInstanceOf[Anon_MarketType]
  }
}

