package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySchedule extends StObject {
  
  /**
    * Specifies how frequently inventory results are produced. Valid values: `Daily`, `Weekly`.
    */
  var frequency: String = js.native
}
object InventorySchedule {
  
  @scala.inline
  def apply(frequency: String): InventorySchedule = {
    val __obj = js.Dynamic.literal(frequency = frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventorySchedule]
  }
  
  @scala.inline
  implicit class InventoryScheduleMutableBuilder[Self <: InventorySchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrequency(value: String): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
  }
}
