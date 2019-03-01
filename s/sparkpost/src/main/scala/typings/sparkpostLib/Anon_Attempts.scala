package typings
package sparkpostLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attempts extends js.Object {
  var attempts: scala.Double
  var batch_id: java.lang.String
  var response_code: scala.Double
  var ts: java.lang.String
}

object Anon_Attempts {
  @scala.inline
  def apply(
    attempts: scala.Double,
    batch_id: java.lang.String,
    response_code: scala.Double,
    ts: java.lang.String
  ): Anon_Attempts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attempts")(attempts)
    __obj.updateDynamic("batch_id")(batch_id)
    __obj.updateDynamic("response_code")(response_code)
    __obj.updateDynamic("ts")(ts)
    __obj.asInstanceOf[Anon_Attempts]
  }
}

