package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attempts extends js.Object {
  var attempts: Double
  var batch_id: String
  var response_code: Double
  var ts: String
}

object Attempts {
  @scala.inline
  def apply(attempts: Double, batch_id: String, response_code: Double, ts: String): Attempts = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], batch_id = batch_id.asInstanceOf[js.Any], response_code = response_code.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attempts]
  }
}

