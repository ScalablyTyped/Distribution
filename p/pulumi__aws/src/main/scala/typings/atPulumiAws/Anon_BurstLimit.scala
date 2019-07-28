package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BurstLimit extends js.Object {
  var burstLimit: Double
  var rateLimit: Double
}

object Anon_BurstLimit {
  @scala.inline
  def apply(burstLimit: Double, rateLimit: Double): Anon_BurstLimit = {
    val __obj = js.Dynamic.literal(burstLimit = burstLimit, rateLimit = rateLimit)
  
    __obj.asInstanceOf[Anon_BurstLimit]
  }
}

