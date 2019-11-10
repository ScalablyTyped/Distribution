package typings.sqsDashConsumer

import typings.sqsDashConsumer.distConsumerMod.ConsumerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqs-consumer", JSImport.Namespace)
@js.native
object sqsDashConsumerMod extends js.Object {
  @js.native
  class Consumer protected ()
    extends typings.sqsDashConsumer.distConsumerMod.Consumer {
    def this(options: ConsumerOptions) = this()
  }
  
  /* static members */
  @js.native
  object Consumer extends js.Object {
    def create(options: ConsumerOptions): typings.sqsDashConsumer.distConsumerMod.Consumer = js.native
  }
  
}

