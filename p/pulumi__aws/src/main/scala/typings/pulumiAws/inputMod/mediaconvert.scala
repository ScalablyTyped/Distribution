package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaconvert {
  
  trait QueueReservationPlanSettings extends StObject {
    
    /**
      * The length of the term of your reserved queue pricing plan commitment. Valid value is `ONE_YEAR`.
      */
    var commitment: Input[String]
    
    /**
      * Specifies whether the term of your reserved queue pricing plan. Valid values are `AUTO_RENEW` or `EXPIRE`.
      */
    var renewalType: Input[String]
    
    /**
      * Specifies the number of reserved transcode slots (RTS) for queue.
      */
    var reservedSlots: Input[Double]
  }
  object QueueReservationPlanSettings {
    
    inline def apply(commitment: Input[String], renewalType: Input[String], reservedSlots: Input[Double]): QueueReservationPlanSettings = {
      val __obj = js.Dynamic.literal(commitment = commitment.asInstanceOf[js.Any], renewalType = renewalType.asInstanceOf[js.Any], reservedSlots = reservedSlots.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueReservationPlanSettings]
    }
    
    extension [Self <: QueueReservationPlanSettings](x: Self) {
      
      inline def setCommitment(value: Input[String]): Self = StObject.set(x, "commitment", value.asInstanceOf[js.Any])
      
      inline def setRenewalType(value: Input[String]): Self = StObject.set(x, "renewalType", value.asInstanceOf[js.Any])
      
      inline def setReservedSlots(value: Input[Double]): Self = StObject.set(x, "reservedSlots", value.asInstanceOf[js.Any])
    }
  }
}
