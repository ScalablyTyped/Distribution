package typings.rabbitmqDashSchema.rabbitmqDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RabbitMQSchema extends js.Object {
  def getBindings(): js.Array[Binding] = js.native
  def getDirectBindings(): js.Array[DirectBinding] = js.native
  def getExchangeByName(name: String): Exchange | Unit = js.native
  def getExchanges(): js.Array[Exchange] = js.native
  def getQueueByName(name: String): Queue | Unit = js.native
  def getQueues(): js.Array[Queue] = js.native
  def validate(schema: js.Array[Topology]): Unit = js.native
  def validate(schema: js.Array[Topology], parentPath: String): Unit = js.native
  def validate(schema: Topology): Unit = js.native
  def validate(schema: Topology, parentPath: String): Unit = js.native
  def validateMessage[T](exchangeName: String, routingPattern: String, message: T): T = js.native
}

