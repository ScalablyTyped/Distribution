package typings.rabbitJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCorrelationId extends js.Object {
  var correlationId: Double
}

object AnonCorrelationId {
  @scala.inline
  def apply(correlationId: Double): AnonCorrelationId = {
    val __obj = js.Dynamic.literal(correlationId = correlationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCorrelationId]
  }
}

