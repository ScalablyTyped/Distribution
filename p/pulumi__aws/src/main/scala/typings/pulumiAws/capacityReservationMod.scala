package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.enumsEc2Mod.InstancePlatform
import typings.pulumiAws.enumsEc2Mod.InstanceType
import typings.pulumiAws.enumsEc2Mod.Tenancy
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object capacityReservationMod {
  
  @JSImport("@pulumi/aws/ec2/capacityReservation", "CapacityReservation")
  @js.native
  class CapacityReservation protected () extends CustomResource {
    /**
      * Create a CapacityReservation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CapacityReservationArgs) = this()
    def this(name: String, args: CapacityReservationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the Capacity Reservation.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The Availability Zone in which to create the Capacity Reservation.
      */
    val availabilityZone: Output_[String] = js.native
    
    /**
      * Indicates whether the Capacity Reservation supports EBS-optimized instances.
      */
    val ebsOptimized: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
      */
    val endDate: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
      */
    val endDateType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
      */
    val ephemeralStorage: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The number of instances for which to reserve capacity.
      */
    val instanceCount: Output_[Double] = js.native
    
    /**
      * Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
      */
    val instanceMatchCriteria: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
      */
    val instancePlatform: Output_[InstancePlatform] = js.native
    
    /**
      * The instance type for which to reserve capacity.
      */
    val instanceType: Output_[InstanceType] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
      */
    val tenancy: Output_[js.UndefOr[Tenancy]] = js.native
  }
  /* static members */
  object CapacityReservation {
    
    @JSImport("@pulumi/aws/ec2/capacityReservation", "CapacityReservation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing CapacityReservation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): CapacityReservation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[CapacityReservation]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): CapacityReservation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[CapacityReservation]
    inline def get(name: String, id: Input[ID], state: CapacityReservationState): CapacityReservation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[CapacityReservation]
    inline def get(name: String, id: Input[ID], state: CapacityReservationState, opts: CustomResourceOptions): CapacityReservation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[CapacityReservation]
    
    /**
      * Returns true if the given object is an instance of CapacityReservation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/capacityReservation.CapacityReservation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/capacityReservation.CapacityReservation */ Boolean]
  }
  
  trait CapacityReservationArgs extends StObject {
    
    /**
      * The Availability Zone in which to create the Capacity Reservation.
      */
    val availabilityZone: Input[String]
    
    /**
      * Indicates whether the Capacity Reservation supports EBS-optimized instances.
      */
    val ebsOptimized: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
      */
    val endDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
      */
    val endDateType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
      */
    val ephemeralStorage: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The number of instances for which to reserve capacity.
      */
    val instanceCount: Input[Double]
    
    /**
      * Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
      */
    val instanceMatchCriteria: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
      */
    val instancePlatform: Input[InstancePlatform]
    
    /**
      * The instance type for which to reserve capacity.
      */
    val instanceType: Input[InstanceType]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
      */
    val tenancy: js.UndefOr[Input[Tenancy]] = js.undefined
  }
  object CapacityReservationArgs {
    
    inline def apply(
      availabilityZone: Input[String],
      instanceCount: Input[Double],
      instancePlatform: Input[InstancePlatform],
      instanceType: Input[InstanceType]
    ): CapacityReservationArgs = {
      val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], instanceCount = instanceCount.asInstanceOf[js.Any], instancePlatform = instancePlatform.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[CapacityReservationArgs]
    }
    
    extension [Self <: CapacityReservationArgs](x: Self) {
      
      inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setEbsOptimized(value: Input[Boolean]): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
      
      inline def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
      
      inline def setEndDate(value: Input[String]): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateType(value: Input[String]): Self = StObject.set(x, "endDateType", value.asInstanceOf[js.Any])
      
      inline def setEndDateTypeUndefined: Self = StObject.set(x, "endDateType", js.undefined)
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setEphemeralStorage(value: Input[Boolean]): Self = StObject.set(x, "ephemeralStorage", value.asInstanceOf[js.Any])
      
      inline def setEphemeralStorageUndefined: Self = StObject.set(x, "ephemeralStorage", js.undefined)
      
      inline def setInstanceCount(value: Input[Double]): Self = StObject.set(x, "instanceCount", value.asInstanceOf[js.Any])
      
      inline def setInstanceMatchCriteria(value: Input[String]): Self = StObject.set(x, "instanceMatchCriteria", value.asInstanceOf[js.Any])
      
      inline def setInstanceMatchCriteriaUndefined: Self = StObject.set(x, "instanceMatchCriteria", js.undefined)
      
      inline def setInstancePlatform(value: Input[InstancePlatform]): Self = StObject.set(x, "instancePlatform", value.asInstanceOf[js.Any])
      
      inline def setInstanceType(value: Input[InstanceType]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTenancy(value: Input[Tenancy]): Self = StObject.set(x, "tenancy", value.asInstanceOf[js.Any])
      
      inline def setTenancyUndefined: Self = StObject.set(x, "tenancy", js.undefined)
    }
  }
  
  trait CapacityReservationState extends StObject {
    
    /**
      * The ARN of the Capacity Reservation.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Availability Zone in which to create the Capacity Reservation.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether the Capacity Reservation supports EBS-optimized instances.
      */
    val ebsOptimized: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
      */
    val endDate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates the way in which the Capacity Reservation ends. Specify either `unlimited` or `limited`.
      */
    val endDateType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
      */
    val ephemeralStorage: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The number of instances for which to reserve capacity.
      */
    val instanceCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Indicates the type of instance launches that the Capacity Reservation accepts. Specify either `open` or `targeted`.
      */
    val instanceMatchCriteria: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of operating system for which to reserve capacity. Valid options are `Linux/UNIX`, `Red Hat Enterprise Linux`, `SUSE Linux`, `Windows`, `Windows with SQL Server`, `Windows with SQL Server Enterprise`, `Windows with SQL Server Standard` or `Windows with SQL Server Web`.
      */
    val instancePlatform: js.UndefOr[Input[InstancePlatform]] = js.undefined
    
    /**
      * The instance type for which to reserve capacity.
      */
    val instanceType: js.UndefOr[Input[InstanceType]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Indicates the tenancy of the Capacity Reservation. Specify either `default` or `dedicated`.
      */
    val tenancy: js.UndefOr[Input[Tenancy]] = js.undefined
  }
  object CapacityReservationState {
    
    inline def apply(): CapacityReservationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CapacityReservationState]
    }
    
    extension [Self <: CapacityReservationState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      inline def setEbsOptimized(value: Input[Boolean]): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
      
      inline def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
      
      inline def setEndDate(value: Input[String]): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateType(value: Input[String]): Self = StObject.set(x, "endDateType", value.asInstanceOf[js.Any])
      
      inline def setEndDateTypeUndefined: Self = StObject.set(x, "endDateType", js.undefined)
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setEphemeralStorage(value: Input[Boolean]): Self = StObject.set(x, "ephemeralStorage", value.asInstanceOf[js.Any])
      
      inline def setEphemeralStorageUndefined: Self = StObject.set(x, "ephemeralStorage", js.undefined)
      
      inline def setInstanceCount(value: Input[Double]): Self = StObject.set(x, "instanceCount", value.asInstanceOf[js.Any])
      
      inline def setInstanceCountUndefined: Self = StObject.set(x, "instanceCount", js.undefined)
      
      inline def setInstanceMatchCriteria(value: Input[String]): Self = StObject.set(x, "instanceMatchCriteria", value.asInstanceOf[js.Any])
      
      inline def setInstanceMatchCriteriaUndefined: Self = StObject.set(x, "instanceMatchCriteria", js.undefined)
      
      inline def setInstancePlatform(value: Input[InstancePlatform]): Self = StObject.set(x, "instancePlatform", value.asInstanceOf[js.Any])
      
      inline def setInstancePlatformUndefined: Self = StObject.set(x, "instancePlatform", js.undefined)
      
      inline def setInstanceType(value: Input[InstanceType]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTenancy(value: Input[Tenancy]): Self = StObject.set(x, "tenancy", value.asInstanceOf[js.Any])
      
      inline def setTenancyUndefined: Self = StObject.set(x, "tenancy", js.undefined)
    }
  }
}
