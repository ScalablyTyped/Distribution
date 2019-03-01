package typings
package rabbitDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CorrelationId extends js.Object {
  var correlationId: scala.Double
}

object Anon_CorrelationId {
  @scala.inline
  def apply(correlationId: scala.Double): Anon_CorrelationId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("correlationId")(correlationId)
    __obj.asInstanceOf[Anon_CorrelationId]
  }
}

