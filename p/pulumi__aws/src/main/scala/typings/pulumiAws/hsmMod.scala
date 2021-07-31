package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hsmMod {
  
  @JSImport("@pulumi/aws/cloudhsmv2/hsm", "Hsm")
  @js.native
  class Hsm protected () extends CustomResource {
    /**
      * Create a Hsm resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: HsmArgs) = this()
    def this(name: String, args: HsmArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The IDs of AZ in which HSM module will be located. Do not use together with subnet_id.
      */
    val availabilityZone: Output_[String] = js.native
    
    /**
      * The ID of Cloud HSM v2 cluster to which HSM will be added.
      */
    val clusterId: Output_[String] = js.native
    
    /**
      * The id of the ENI interface allocated for HSM module.
      */
    val hsmEniId: Output_[String] = js.native
    
    /**
      * The id of the HSM module.
      */
    val hsmId: Output_[String] = js.native
    
    /**
      * The state of the HSM module.
      */
    val hsmState: Output_[String] = js.native
    
    /**
      * The IP address of HSM module. Must be within the CIDR of selected subnet.
      */
    val ipAddress: Output_[String] = js.native
    
    /**
      * The ID of subnet in which HSM module will be located.
      */
    val subnetId: Output_[String] = js.native
  }
  /* static members */
  object Hsm {
    
    @JSImport("@pulumi/aws/cloudhsmv2/hsm", "Hsm")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Hsm resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Hsm = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Hsm]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Hsm = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Hsm]
    @scala.inline
    def get(name: String, id: Input[ID], state: HsmState): Hsm = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Hsm]
    @scala.inline
    def get(name: String, id: Input[ID], state: HsmState, opts: CustomResourceOptions): Hsm = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Hsm]
    
    /**
      * Returns true if the given object is an instance of Hsm.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudhsmv2/hsm.Hsm */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudhsmv2/hsm.Hsm */ Boolean]
  }
  
  trait HsmArgs extends StObject {
    
    /**
      * The IDs of AZ in which HSM module will be located. Do not use together with subnet_id.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of Cloud HSM v2 cluster to which HSM will be added.
      */
    val clusterId: Input[String]
    
    /**
      * The IP address of HSM module. Must be within the CIDR of selected subnet.
      */
    val ipAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of subnet in which HSM module will be located.
      */
    val subnetId: js.UndefOr[Input[String]] = js.undefined
  }
  object HsmArgs {
    
    @scala.inline
    def apply(clusterId: Input[String]): HsmArgs = {
      val __obj = js.Dynamic.literal(clusterId = clusterId.asInstanceOf[js.Any])
      __obj.asInstanceOf[HsmArgs]
    }
    
    @scala.inline
    implicit class HsmArgsMutableBuilder[Self <: HsmArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setClusterId(value: Input[String]): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddress(value: Input[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    }
  }
  
  trait HsmState extends StObject {
    
    /**
      * The IDs of AZ in which HSM module will be located. Do not use together with subnet_id.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of Cloud HSM v2 cluster to which HSM will be added.
      */
    val clusterId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The id of the ENI interface allocated for HSM module.
      */
    val hsmEniId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The id of the HSM module.
      */
    val hsmId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The state of the HSM module.
      */
    val hsmState: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IP address of HSM module. Must be within the CIDR of selected subnet.
      */
    val ipAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of subnet in which HSM module will be located.
      */
    val subnetId: js.UndefOr[Input[String]] = js.undefined
  }
  object HsmState {
    
    @scala.inline
    def apply(): HsmState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HsmState]
    }
    
    @scala.inline
    implicit class HsmStateMutableBuilder[Self <: HsmState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setClusterId(value: Input[String]): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
      
      @scala.inline
      def setHsmEniId(value: Input[String]): Self = StObject.set(x, "hsmEniId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHsmEniIdUndefined: Self = StObject.set(x, "hsmEniId", js.undefined)
      
      @scala.inline
      def setHsmId(value: Input[String]): Self = StObject.set(x, "hsmId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHsmIdUndefined: Self = StObject.set(x, "hsmId", js.undefined)
      
      @scala.inline
      def setHsmState(value: Input[String]): Self = StObject.set(x, "hsmState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHsmStateUndefined: Self = StObject.set(x, "hsmState", js.undefined)
      
      @scala.inline
      def setIpAddress(value: Input[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    }
  }
}
