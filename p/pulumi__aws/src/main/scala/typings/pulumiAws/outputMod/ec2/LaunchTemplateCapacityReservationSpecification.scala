package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateCapacityReservationSpecification extends StObject {
  
  /**
    * Indicates the instance's Capacity Reservation preferences. Can be `open` or `none`. (Default `none`).
    */
  var capacityReservationPreference: js.UndefOr[String] = js.undefined
  
  /**
    * Used to target a specific Capacity Reservation:
    */
  var capacityReservationTarget: js.UndefOr[LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget] = js.undefined
}
object LaunchTemplateCapacityReservationSpecification {
  
  inline def apply(): LaunchTemplateCapacityReservationSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateCapacityReservationSpecification]
  }
  
  extension [Self <: LaunchTemplateCapacityReservationSpecification](x: Self) {
    
    inline def setCapacityReservationPreference(value: String): Self = StObject.set(x, "capacityReservationPreference", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationPreferenceUndefined: Self = StObject.set(x, "capacityReservationPreference", js.undefined)
    
    inline def setCapacityReservationTarget(value: LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget): Self = StObject.set(x, "capacityReservationTarget", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationTargetUndefined: Self = StObject.set(x, "capacityReservationTarget", js.undefined)
  }
}
