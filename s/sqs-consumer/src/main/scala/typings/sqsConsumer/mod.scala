package typings.sqsConsumer

import typings.sqsConsumer.distConsumerMod.ConsumerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqs-consumer", "Consumer")
  @js.native
  open class Consumer protected ()
    extends typings.sqsConsumer.distConsumerMod.Consumer {
    def this(options: ConsumerOptions) = this()
  }
  /* static members */
  object Consumer {
    
    @JSImport("sqs-consumer", "Consumer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: ConsumerOptions): typings.sqsConsumer.distConsumerMod.Consumer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.sqsConsumer.distConsumerMod.Consumer]
  }
}
