package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedScalingPolicyComputeLimit extends StObject {
  
  /**
    * The upper boundary of EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
    */
  var maximumCapacityUnits: Double
  
  /**
    * The upper boundary of EC2 units for core node type in a cluster. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. The core units are not allowed to scale beyond this boundary. The parameter is used to split capacity allocation between core and task nodes.
    */
  var maximumCoreCapacityUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * The upper boundary of On-Demand EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. The On-Demand units are not allowed to scale beyond this boundary. The parameter is used to split capacity allocation between On-Demand and Spot instances.
    */
  var maximumOndemandCapacityUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * The lower boundary of EC2 units. It is measured through VCPU cores or instances for instance groups and measured through units for instance fleets. Managed scaling activities are not allowed beyond this boundary. The limit only applies to the core and task nodes. The master node cannot be scaled after initial configuration.
    */
  var minimumCapacityUnits: Double
  
  /**
    * The unit type used for specifying a managed scaling policy. Valid Values: `InstanceFleetUnits` | `Instances` | `VCPU`
    */
  var unitType: String
}
object ManagedScalingPolicyComputeLimit {
  
  @scala.inline
  def apply(maximumCapacityUnits: Double, minimumCapacityUnits: Double, unitType: String): ManagedScalingPolicyComputeLimit = {
    val __obj = js.Dynamic.literal(maximumCapacityUnits = maximumCapacityUnits.asInstanceOf[js.Any], minimumCapacityUnits = minimumCapacityUnits.asInstanceOf[js.Any], unitType = unitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedScalingPolicyComputeLimit]
  }
  
  @scala.inline
  implicit class ManagedScalingPolicyComputeLimitMutableBuilder[Self <: ManagedScalingPolicyComputeLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumCapacityUnits(value: Double): Self = StObject.set(x, "maximumCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumCoreCapacityUnits(value: Double): Self = StObject.set(x, "maximumCoreCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumCoreCapacityUnitsUndefined: Self = StObject.set(x, "maximumCoreCapacityUnits", js.undefined)
    
    @scala.inline
    def setMaximumOndemandCapacityUnits(value: Double): Self = StObject.set(x, "maximumOndemandCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumOndemandCapacityUnitsUndefined: Self = StObject.set(x, "maximumOndemandCapacityUnits", js.undefined)
    
    @scala.inline
    def setMinimumCapacityUnits(value: Double): Self = StObject.set(x, "minimumCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitType(value: String): Self = StObject.set(x, "unitType", value.asInstanceOf[js.Any])
  }
}
