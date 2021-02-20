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
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing InstanceFleet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/emr/instanceFleet", "InstanceFleet.get")
    @js.native
    def get(name: String, id: Input[ID]): InstanceFleet = js.native
    @JSImport("@pulumi/aws/emr/instanceFleet", "InstanceFleet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): InstanceFleet = js.native
    @JSImport("@pulumi/aws/emr/instanceFleet", "InstanceFleet.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceFleetState): InstanceFleet = js.native
    @JSImport("@pulumi/aws/emr/instanceFleet", "InstanceFleet.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceFleetState, opts: CustomResourceOptions): InstanceFleet = js.native
    
    /**
      * Returns true if the given object is an instance of InstanceFleet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/emr/instanceFleet", "InstanceFleet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/instanceFleet.InstanceFleet */ Boolean = js.native
  }
  
  @js.native
  trait InstanceFleetArgs extends StObject {
    
    /**
      * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
      */
    val clusterId: Input[String] = js.native
    
    /**
      * Configuration block for instance fleet
      */
    val instanceTypeConfigs: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.emr.InstanceFleetInstanceTypeConfig]]]
      ] = js.native
    
    /**
      * Configuration block for launch specification
      */
    val launchSpecifications: js.UndefOr[Input[typings.pulumiAws.inputMod.emr.InstanceFleetLaunchSpecifications]] = js.native
    
    /**
      * Friendly name given to the instance fleet.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
      */
    val targetOnDemandCapacity: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
      */
    val targetSpotCapacity: js.UndefOr[Input[Double]] = js.native
  }
  object InstanceFleetArgs {
    
    @scala.inline
    def apply(clusterId: Input[String]): InstanceFleetArgs = {
      val __obj = js.Dynamic.literal(clusterId = clusterId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceFleetArgs]
    }
    
    @scala.inline
    implicit class InstanceFleetArgsMutableBuilder[Self <: InstanceFleetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterId(value: Input[String]): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypeConfigs(value: Input[js.Array[Input[typings.pulumiAws.inputMod.emr.InstanceFleetInstanceTypeConfig]]]): Self = StObject.set(x, "instanceTypeConfigs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypeConfigsUndefined: Self = StObject.set(x, "instanceTypeConfigs", js.undefined)
      
      @scala.inline
      def setInstanceTypeConfigsVarargs(value: Input[typings.pulumiAws.inputMod.emr.InstanceFleetInstanceTypeConfig]*): Self = StObject.set(x, "instanceTypeConfigs", js.Array(value :_*))
      
      @scala.inline
      def setLaunchSpecifications(value: Input[typings.pulumiAws.inputMod.emr.InstanceFleetLaunchSpecifications]): Self = StObject.set(x, "launchSpecifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchSpecificationsUndefined: Self = StObject.set(x, "launchSpecifications", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTargetOnDemandCapacity(value: Input[Double]): Self = StObject.set(x, "targetOnDemandCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOnDemandCapacityUndefined: Self = StObject.set(x, "targetOnDemandCapacity", js.undefined)
      
      @scala.inline
      def setTargetSpotCapacity(value: Input[Double]): Self = StObject.set(x, "targetSpotCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetSpotCapacityUndefined: Self = StObject.set(x, "targetSpotCapacity", js.undefined)
    }
  }
  
  @js.native
  trait InstanceFleetState extends StObject {
    
    /**
      * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
      */
    val clusterId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block for instance fleet
      */
    val instanceTypeConfigs: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.emr.InstanceFleetInstanceTypeConfig]]]
      ] = js.native
    
    /**
      * Configuration block for launch specification
      */
    val launchSpecifications: js.UndefOr[Input[typings.pulumiAws.inputMod.emr.InstanceFleetLaunchSpecifications]] = js.native
    
    /**
      * Friendly name given to the instance fleet.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    val provisionedOnDemandCapacity: js.UndefOr[Input[Double]] = js.native
    
    val provisionedSpotCapacity: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
      */
    val targetOnDemandCapacity: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
      */
    val targetSpotCapacity: js.UndefOr[Input[Double]] = js.native
  }
  object InstanceFleetState {
    
    @scala.inline
    def apply(): InstanceFleetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceFleetState]
    }
    
    @scala.inline
    implicit class InstanceFleetStateMutableBuilder[Self <: InstanceFleetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterId(value: Input[String]): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
      
      @scala.inline
      def setInstanceTypeConfigs(value: Input[js.Array[Input[typings.pulumiAws.inputMod.emr.InstanceFleetInstanceTypeConfig]]]): Self = StObject.set(x, "instanceTypeConfigs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypeConfigsUndefined: Self = StObject.set(x, "instanceTypeConfigs", js.undefined)
      
      @scala.inline
      def setInstanceTypeConfigsVarargs(value: Input[typings.pulumiAws.inputMod.emr.InstanceFleetInstanceTypeConfig]*): Self = StObject.set(x, "instanceTypeConfigs", js.Array(value :_*))
      
      @scala.inline
      def setLaunchSpecifications(value: Input[typings.pulumiAws.inputMod.emr.InstanceFleetLaunchSpecifications]): Self = StObject.set(x, "launchSpecifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchSpecificationsUndefined: Self = StObject.set(x, "launchSpecifications", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProvisionedOnDemandCapacity(value: Input[Double]): Self = StObject.set(x, "provisionedOnDemandCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedOnDemandCapacityUndefined: Self = StObject.set(x, "provisionedOnDemandCapacity", js.undefined)
      
      @scala.inline
      def setProvisionedSpotCapacity(value: Input[Double]): Self = StObject.set(x, "provisionedSpotCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisionedSpotCapacityUndefined: Self = StObject.set(x, "provisionedSpotCapacity", js.undefined)
      
      @scala.inline
      def setTargetOnDemandCapacity(value: Input[Double]): Self = StObject.set(x, "targetOnDemandCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOnDemandCapacityUndefined: Self = StObject.set(x, "targetOnDemandCapacity", js.undefined)
      
      @scala.inline
      def setTargetSpotCapacity(value: Input[Double]): Self = StObject.set(x, "targetSpotCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetSpotCapacityUndefined: Self = StObject.set(x, "targetSpotCapacity", js.undefined)
    }
  }
}
