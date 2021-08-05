package typings.pulumiAws

import typings.pulumiAws.arnMod.ARN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redriveMod {
  
  trait RedrivePolicy extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the dead-letter queue to which Amazon SQS moves messages after the value of
      * `maxReceiveCount` is exceeded.
      */
    var deadLetterTargetArn: ARN
    
    /**
      * The number of times a message is delivered to the source queue before being moved to the dead-letter queue.
      *
      * Note: The dead-letter queue of a FIFO queue must also be a FIFO queue. Similarly, the dead-letter queue of a
      * standard queue must also be a standard queue.
      */
    var maxReceiveCount: Double
  }
  object RedrivePolicy {
    
    inline def apply(deadLetterTargetArn: ARN, maxReceiveCount: Double): RedrivePolicy = {
      val __obj = js.Dynamic.literal(deadLetterTargetArn = deadLetterTargetArn.asInstanceOf[js.Any], maxReceiveCount = maxReceiveCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedrivePolicy]
    }
    
    extension [Self <: RedrivePolicy](x: Self) {
      
      inline def setDeadLetterTargetArn(value: ARN): Self = StObject.set(x, "deadLetterTargetArn", value.asInstanceOf[js.Any])
      
      inline def setMaxReceiveCount(value: Double): Self = StObject.set(x, "maxReceiveCount", value.asInstanceOf[js.Any])
    }
  }
}
