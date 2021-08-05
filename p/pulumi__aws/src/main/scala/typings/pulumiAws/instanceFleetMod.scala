package typings.pulumiAws

import typings.pulumiAws.outputMod.emr.InstanceFleetInstanceTypeConfig
import typings.pulumiAws.outputMod.emr.InstanceFleetLaunchSpecifications
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceFleetMod {
  
  @JSImport("@pulumi/aws/emr/instanceFleet", "InstanceFleet")
  @js.native
  class InstanceFleet protected () extends CustomResource {
    /**
      * Create a InstanceFleet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InstanceFleetArgs) = this()
    def this(name: String, args: InstanceFleetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
      */
    val clusterId: Output_[String] = js.native
    
    /**
      * Configuration block for instance fleet
      */
    val instanceTypeConfigs: Output_[js.UndefOr[js.Array[InstanceFleetInstanceTypeConfig]]] = js.native
    
    /**
      * Configuration block for launch specification
      */
    val launchSpecifications: Output_[js.UndefOr[InstanceFleetLaunchSpecifications]] = js.native
    
    /**
      * Friendly name given to the instance fleet.
      */
    val name: Output_[String] = js.native
    
    val provisionedOnDemandCapacity: Output_[Double] = js.native
    
    val provisionedSpotCapacity: Output_[Double] = js.native
    
    /**
      * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
      */
    val targetOnDemandCapacity: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
      */
    val targetSpotCapacity: Output_[js.UndefOr[Double]] = js.native
  }
  /* static members */
  object InstanceFleet {
    
    @JSImport("@pulumi/aws/emr/instanceFleet", "InstanceFleet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing InstanceFleet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): InstanceFleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[InstanceFleet]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): InstanceFleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[InstanceFleet]
    inline def get(name: String, id: Input[ID], state: InstanceFleetState): InstanceFleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[InstanceFleet]
    inline def get(name: String, id: Input[ID], state: InstanceFleetState, opts: CustomResourceOptions): InstanceFleet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[InstanceFleet]
    
    /**
      * Returns true if the given object is an instance of InstanceFleet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/instanceFleet.InstanceFleet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/emr/instanceFleet.InstanceFleet */ Boolean]
  }
  
  trait InstanceFleetArgs extends StObject {
    
    /**
      * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
      */
    val clusterId: Input[String]
    
    /**
      * Configuration block for instance fleet
      */
    val instanceTypeConfigs: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.emr.InstanceFleetInstanceTypeConfig]]]
      ] = js.undefined
    
    /**
      * Configuration block for launch specification
      */
    val launchSpecifications: js.UndefOr[Input[typings.pulumiAws.inputMod.emr.InstanceFleetLaunchSpecifications]] = js.undefined
    
    /**
      * Friendly name given to the instance fleet.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
      */
    val targetOnDemandCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
      */
    val targetSpotCapacity: js.UndefOr[Input[Double]] = js.undefined
  }
  object InstanceFleetArgs {
    
    inline def apply(clusterId: Input[String]): InstanceFleetArgs = {
      val __obj = js.Dynamic.literal(clusterId = clusterId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceFleetArgs]
    }
    
    extension [Self <: InstanceFleetArgs](x: Self) {
      
      inline def setClusterId(value: Input[String]): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypeConfigs(value: Input[js.Array[Input[typings.pulumiAws.inputMod.emr.InstanceFleetInstanceTypeConfig]]]): Self = StObject.set(x, "instanceTypeConfigs", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypeConfigsUndefined: Self = StObject.set(x, "instanceTypeConfigs", js.undefined)
      
      inline def setInstanceTypeConfigsVarargs(value: Input[typings.pulumiAws.inputMod.emr.InstanceFleetInstanceTypeConfig]*): Self = StObject.set(x, "instanceTypeConfigs", js.Array(value :_*))
      
      inline def setLaunchSpecifications(value: Input[typings.pulumiAws.inputMod.emr.InstanceFleetLaunchSpecifications]): Self = StObject.set(x, "launchSpecifications", value.asInstanceOf[js.Any])
      
      inline def setLaunchSpecificationsUndefined: Self = StObject.set(x, "launchSpecifications", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTargetOnDemandCapacity(value: Input[Double]): Self = StObject.set(x, "targetOnDemandCapacity", value.asInstanceOf[js.Any])
      
      inline def setTargetOnDemandCapacityUndefined: Self = StObject.set(x, "targetOnDemandCapacity", js.undefined)
      
      inline def setTargetSpotCapacity(value: Input[Double]): Self = StObject.set(x, "targetSpotCapacity", value.asInstanceOf[js.Any])
      
      inline def setTargetSpotCapacityUndefined: Self = StObject.set(x, "targetSpotCapacity", js.undefined)
    }
  }
  
  trait InstanceFleetState extends StObject {
    
    /**
      * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
      */
    val clusterId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block for instance fleet
      */
    val instanceTypeConfigs: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.emr.InstanceFleetInstanceTypeConfig]]]
      ] = js.undefined
    
    /**
      * Configuration block for launch specification
      */
    val launchSpecifications: js.UndefOr[Input[typings.pulumiAws.inputMod.emr.InstanceFleetLaunchSpecifications]] = js.undefined
    
    /**
      * Friendly name given to the instance fleet.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    val provisionedOnDemandCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    val provisionedSpotCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
      */
    val targetOnDemandCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
      */
    val targetSpotCapacity: js.UndefOr[Input[Double]] = js.undefined
  }
  object InstanceFleetState {
    
    inline def apply(): InstanceFleetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceFleetState]
    }
    
    extension [Self <: InstanceFleetState](x: Self) {
      
      inline def setClusterId(value: Input[String]): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
      
      inline def setInstanceTypeConfigs(value: Input[js.Array[Input[typings.pulumiAws.inputMod.emr.InstanceFleetInstanceTypeConfig]]]): Self = StObject.set(x, "instanceTypeConfigs", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypeConfigsUndefined: Self = StObject.set(x, "instanceTypeConfigs", js.undefined)
      
      inline def setInstanceTypeConfigsVarargs(value: Input[typings.pulumiAws.inputMod.emr.InstanceFleetInstanceTypeConfig]*): Self = StObject.set(x, "instanceTypeConfigs", js.Array(value :_*))
      
      inline def setLaunchSpecifications(value: Input[typings.pulumiAws.inputMod.emr.InstanceFleetLaunchSpecifications]): Self = StObject.set(x, "launchSpecifications", value.asInstanceOf[js.Any])
      
      inline def setLaunchSpecificationsUndefined: Self = StObject.set(x, "launchSpecifications", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProvisionedOnDemandCapacity(value: Input[Double]): Self = StObject.set(x, "provisionedOnDemandCapacity", value.asInstanceOf[js.Any])
      
      inline def setProvisionedOnDemandCapacityUndefined: Self = StObject.set(x, "provisionedOnDemandCapacity", js.undefined)
      
      inline def setProvisionedSpotCapacity(value: Input[Double]): Self = StObject.set(x, "provisionedSpotCapacity", value.asInstanceOf[js.Any])
      
      inline def setProvisionedSpotCapacityUndefined: Self = StObject.set(x, "provisionedSpotCapacity", js.undefined)
      
      inline def setTargetOnDemandCapacity(value: Input[Double]): Self = StObject.set(x, "targetOnDemandCapacity", value.asInstanceOf[js.Any])
      
      inline def setTargetOnDemandCapacityUndefined: Self = StObject.set(x, "targetOnDemandCapacity", js.undefined)
      
      inline def setTargetSpotCapacity(value: Input[Double]): Self = StObject.set(x, "targetSpotCapacity", value.asInstanceOf[js.Any])
      
      inline def setTargetSpotCapacityUndefined: Self = StObject.set(x, "targetSpotCapacity", js.undefined)
    }
  }
}
