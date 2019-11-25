package typings.ranjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rate extends js.Object {
  var rate: Double
  var weight: Double
}

object Anon_Rate {
  @scala.inline
  def apply(rate: Double, weight: Double): Anon_Rate = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Rate]
  }
}

