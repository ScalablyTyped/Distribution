package typings
package rabbitDotJsLib.rabbitDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMessage extends js.Object {
  var content: js.Any
  var properties: rabbitDotJsLib.Anon_CorrelationId
}

object RequestMessage {
  @scala.inline
  def apply(content: js.Any, properties: rabbitDotJsLib.Anon_CorrelationId): RequestMessage = {
    val __obj = js.Dynamic.literal(content = content, properties = properties)
  
    __obj.asInstanceOf[RequestMessage]
  }
}

