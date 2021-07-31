package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget extends StObject {
  
  /**
    * The ID of the Capacity Reservation to target.
    */
  var capacityReservationId: js.UndefOr[String] = js.undefined
}
object LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget {
  
  @scala.inline
  def apply(): LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget]
  }
  
  @scala.inline
  implicit class LaunchTemplateCapacityReservationSpecificationCapacityReservationTargetMutableBuilder[Self <: LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityReservationId(value: String): Self = StObject.set(x, "capacityReservationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityReservationIdUndefined: Self = StObject.set(x, "capacityReservationId", js.undefined)
  }
}
