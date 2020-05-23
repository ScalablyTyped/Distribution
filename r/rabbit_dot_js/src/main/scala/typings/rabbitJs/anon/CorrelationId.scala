package typings.rabbitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorrelationId extends js.Object {
  var correlationId: Double
}

object CorrelationId {
  @scala.inline
  def apply(correlationId: Double): CorrelationId = {
    val __obj = js.Dynamic.literal(correlationId = correlationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrelationId]
  }
}

