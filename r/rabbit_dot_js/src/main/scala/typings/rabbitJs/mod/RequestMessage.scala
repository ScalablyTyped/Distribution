package typings.rabbitJs.mod

import typings.rabbitJs.anon.CorrelationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMessage extends js.Object {
  var content: js.Any
  var properties: CorrelationId
}

object RequestMessage {
  @scala.inline
  def apply(content: js.Any, properties: CorrelationId): RequestMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMessage]
  }
}

