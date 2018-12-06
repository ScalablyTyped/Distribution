package typings
package rabbitmqDashSchemaLib.rabbitmqDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RabbitMQSchema extends js.Object {
  def getBindings(): js.Array[Binding] = js.native
  def getDirectBindings(): js.Array[DirectBinding] = js.native
  def getExchangeByName(name: java.lang.String): Exchange | scala.Unit = js.native
  def getExchanges(): js.Array[Exchange] = js.native
  def getQueueByName(name: java.lang.String): Queue | scala.Unit = js.native
  def getQueues(): js.Array[Queue] = js.native
  def validate(schema: js.Array[Topology]): scala.Unit = js.native
  def validate(schema: js.Array[Topology], parentPath: java.lang.String): scala.Unit = js.native
  def validate(schema: Topology): scala.Unit = js.native
  def validate(schema: Topology, parentPath: java.lang.String): scala.Unit = js.native
  def validateMessage[T](exchangeName: java.lang.String, routingPattern: java.lang.String, message: T): T = js.native
}

