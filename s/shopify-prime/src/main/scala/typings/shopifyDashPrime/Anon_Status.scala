package typings.shopifyDashPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Status extends js.Object {
  var status: Double
  var statusText: String
}

object Anon_Status {
  @scala.inline
  def apply(status: Double, statusText: String): Anon_Status = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Status]
  }
}

