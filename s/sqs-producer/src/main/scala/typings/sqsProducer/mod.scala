package typings.sqsProducer

import typings.sqsProducer.producerMod.ProducerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqs-producer", "Producer")
  @js.native
  open class Producer protected ()
    extends typings.sqsProducer.producerMod.Producer {
    def this(options: ProducerOptions) = this()
  }
  /* static members */
  object Producer {
    
    @JSImport("sqs-producer", "Producer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: ProducerOptions): typings.sqsProducer.producerMod.Producer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.sqsProducer.producerMod.Producer]
  }
}
