package typings.rabbitDotJs.rabbitDotJsMod

import typings.rabbitDotJs.Anon_CorrelationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMessage extends js.Object {
  var content: js.Any
  var properties: Anon_CorrelationId
}

object RequestMessage {
  @scala.inline
  def apply(content: js.Any, properties: Anon_CorrelationId): RequestMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestMessage]
  }
}

