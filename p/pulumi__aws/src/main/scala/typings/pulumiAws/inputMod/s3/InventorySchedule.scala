package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventorySchedule extends StObject {
  
  /**
    * Specifies how frequently inventory results are produced. Valid values: `Daily`, `Weekly`.
    */
  var frequency: Input[String]
}
object InventorySchedule {
  
  inline def apply(frequency: Input[String]): InventorySchedule = {
    val __obj = js.Dynamic.literal(frequency = frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventorySchedule]
  }
  
  extension [Self <: InventorySchedule](x: Self) {
    
    inline def setFrequency(value: Input[String]): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
  }
}
