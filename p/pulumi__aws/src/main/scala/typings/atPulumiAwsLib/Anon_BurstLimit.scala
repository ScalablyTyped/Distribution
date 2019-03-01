package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BurstLimit extends js.Object {
  var burstLimit: scala.Double
  var rateLimit: scala.Double
}

object Anon_BurstLimit {
  @scala.inline
  def apply(burstLimit: scala.Double, rateLimit: scala.Double): Anon_BurstLimit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("burstLimit")(burstLimit)
    __obj.updateDynamic("rateLimit")(rateLimit)
    __obj.asInstanceOf[Anon_BurstLimit]
  }
}

