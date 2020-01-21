package typings.rabbitJs.mod

import typings.rabbitJs.AnonCorrelationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMessage extends js.Object {
  var content: js.Any
  var properties: AnonCorrelationId
}

object RequestMessage {
  @scala.inline
  def apply(content: js.Any, properties: AnonCorrelationId): RequestMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestMessage]
  }
}

