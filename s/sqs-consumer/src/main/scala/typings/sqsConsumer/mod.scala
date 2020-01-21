package typings.sqsConsumer

import typings.sqsConsumer.consumerMod.ConsumerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqs-consumer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Consumer protected ()
    extends typings.sqsConsumer.consumerMod.Consumer {
    def this(options: ConsumerOptions) = this()
  }
  
  /* static members */
  @js.native
  object Consumer extends js.Object {
    def create(options: ConsumerOptions): typings.sqsConsumer.consumerMod.Consumer = js.native
  }
  
}

