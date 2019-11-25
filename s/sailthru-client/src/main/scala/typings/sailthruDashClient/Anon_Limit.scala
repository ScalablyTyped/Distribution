package typings.sailthruDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Limit extends js.Object {
  var limit: Double
  var remaining: Double
  var reset: Double
}

object Anon_Limit {
  @scala.inline
  def apply(limit: Double, remaining: Double, reset: Double): Anon_Limit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Limit]
  }
}

