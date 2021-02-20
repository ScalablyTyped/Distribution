package typings.sqsConsumer

import typings.sqsConsumer.consumerMod.ConsumerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqs-consumer", "Consumer")
  @js.native
  class Consumer protected ()
    extends typings.sqsConsumer.consumerMod.Consumer {
    def this(options: ConsumerOptions) = this()
  }
  /* static members */
  object Consumer {
    
    @JSImport("sqs-consumer", "Consumer.create")
    @js.native
    def create(options: ConsumerOptions): typings.sqsConsumer.consumerMod.Consumer = js.native
  }
}
