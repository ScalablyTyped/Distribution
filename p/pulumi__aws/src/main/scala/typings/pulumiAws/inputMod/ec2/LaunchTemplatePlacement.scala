package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplatePlacement extends StObject {
  
  /**
    * The affinity setting for an instance on a Dedicated Host.
    */
  var affinity: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Availability Zone for the instance.
    */
  var availabilityZone: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the placement group for the instance.
    */
  var groupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the Dedicated Host for the instance.
    */
  var hostId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of the partition the instance should launch in. Valid only if the placement group strategy is set to partition.
    */
  var partitionNumber: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Reserved for future use.
    */
  var spreadDomain: js.UndefOr[Input[String]] = js.native
  
  /**
    * The tenancy of the instance (if the instance is running in a VPC). Can be `default`, `dedicated`, or `host`.
    */
  var tenancy: js.UndefOr[Input[String]] = js.native
}
object LaunchTemplatePlacement {
  
  @scala.inline
  def apply(): LaunchTemplatePlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplatePlacement]
  }
  
  @scala.inline
  implicit class LaunchTemplatePlacementMutableBuilder[Self <: LaunchTemplatePlacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffinity(value: Input[String]): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffinityUndefined: Self = StObject.set(x, "affinity", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    @scala.inline
    def setGroupName(value: Input[String]): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    @scala.inline
    def setHostId(value: Input[String]): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIdUndefined: Self = StObject.set(x, "hostId", js.undefined)
    
    @scala.inline
    def setPartitionNumber(value: Input[Double]): Self = StObject.set(x, "partitionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionNumberUndefined: Self = StObject.set(x, "partitionNumber", js.undefined)
    
    @scala.inline
    def setSpreadDomain(value: Input[String]): Self = StObject.set(x, "spreadDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadDomainUndefined: Self = StObject.set(x, "spreadDomain", js.undefined)
    
    @scala.inline
    def setTenancy(value: Input[String]): Self = StObject.set(x, "tenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenancyUndefined: Self = StObject.set(x, "tenancy", js.undefined)
  }
}
