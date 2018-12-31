package typings
package rabbitmqDashSchemaLib.rabbitmqDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicExchange extends Exchange {
  @JSName("bindings")
  var bindings_TopicExchange: js.Array[TopicBinding]
  @JSName("type")
  var type_TopicExchange: rabbitmqDashSchemaLib.rabbitmqDashSchemaLibStrings.topic
}

