package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightsailInstanceMod {
  
  @JSImport("@pulumi/aws/lightsail/instance", "Instance")
  @js.native
  class Instance protected () extends CustomResource {
    /**
      * Create a Instance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: InstanceArgs) = this()
    def this(name: String, args: InstanceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the Lightsail instance (matches `id`).
      */
    val arn: Output_[String] = js.native
    
    /**
      * The Availability Zone in which to create your
      * instance (see list below)
      */
    val availabilityZone: Output_[String] = js.native
    
    /**
      * The ID for a virtual private server image. A list of available blueprint IDs can be obtained using the AWS CLI command: `aws lightsail get-blueprints`
      */
    val blueprintId: Output_[String] = js.native
    
    /**
      * The bundle of specification information (see list below)
      */
    val bundleId: Output_[String] = js.native
    
    val cpuCount: Output_[Double] = js.native
    
    /**
      * The timestamp when the instance was created.
      * * `availabilityZone`
      * * `blueprintId`
      * * `bundleId`
      * * `keyPairName`
      * * `userData`
      */
    val createdAt: Output_[String] = js.native
    
    val ipv6Address: Output_[String] = js.native
    
    val isStaticIp: Output_[Boolean] = js.native
    
    /**
      * The name of your key pair. Created in the
      * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
      */
    val keyPairName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
      */
    val name: Output_[String] = js.native
    
    val privateIpAddress: Output_[String] = js.native
    
    val publicIpAddress: Output_[String] = js.native
    
    val ramSize: Output_[Double] = js.native
    
    /**
      * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * launch script to configure server with additional user data
      */
    val userData: Output_[js.UndefOr[String]] = js.native
    
    val username: Output_[String] = js.native
  }
  /* static members */
  object Instance {
    
    /**
      * Get an existing Instance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/lightsail/instance", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID]): Instance = js.native
    @JSImport("@pulumi/aws/lightsail/instance", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Instance = js.native
    @JSImport("@pulumi/aws/lightsail/instance", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceState): Instance = js.native
    @JSImport("@pulumi/aws/lightsail/instance", "Instance.get")
    @js.native
    def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): Instance = js.native
    
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/lightsail/instance", "Instance.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/instance.Instance */ Boolean = js.native
  }
  
  @js.native
  trait InstanceArgs extends StObject {
    
    /**
      * The Availability Zone in which to create your
      * instance (see list below)
      */
    val availabilityZone: Input[String] = js.native
    
    /**
      * The ID for a virtual private server image. A list of available blueprint IDs can be obtained using the AWS CLI command: `aws lightsail get-blueprints`
      */
    val blueprintId: Input[String] = js.native
    
    /**
      * The bundle of specification information (see list below)
      */
    val bundleId: Input[String] = js.native
    
    /**
      * The name of your key pair. Created in the
      * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
      */
    val keyPairName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * launch script to configure server with additional user data
      */
    val userData: js.UndefOr[Input[String]] = js.native
  }
  object InstanceArgs {
    
    @scala.inline
    def apply(availabilityZone: Input[String], blueprintId: Input[String], bundleId: Input[String]): InstanceArgs = {
      val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], blueprintId = blueprintId.asInstanceOf[js.Any], bundleId = bundleId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceArgs]
    }
    
    @scala.inline
    implicit class InstanceArgsMutableBuilder[Self <: InstanceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlueprintId(value: Input[String]): Self = StObject.set(x, "blueprintId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleId(value: Input[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPairName(value: Input[String]): Self = StObject.set(x, "keyPairName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPairNameUndefined: Self = StObject.set(x, "keyPairName", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUserData(value: Input[String]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
    }
  }
  
  @js.native
  trait InstanceState extends StObject {
    
    /**
      * The ARN of the Lightsail instance (matches `id`).
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Availability Zone in which to create your
      * instance (see list below)
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID for a virtual private server image. A list of available blueprint IDs can be obtained using the AWS CLI command: `aws lightsail get-blueprints`
      */
    val blueprintId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The bundle of specification information (see list below)
      */
    val bundleId: js.UndefOr[Input[String]] = js.native
    
    val cpuCount: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The timestamp when the instance was created.
      * * `availabilityZone`
      * * `blueprintId`
      * * `bundleId`
      * * `keyPairName`
      * * `userData`
      */
    val createdAt: js.UndefOr[Input[String]] = js.native
    
    val ipv6Address: js.UndefOr[Input[String]] = js.native
    
    val isStaticIp: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The name of your key pair. Created in the
      * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
      */
    val keyPairName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    val privateIpAddress: js.UndefOr[Input[String]] = js.native
    
    val publicIpAddress: js.UndefOr[Input[String]] = js.native
    
    val ramSize: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * launch script to configure server with additional user data
      */
    val userData: js.UndefOr[Input[String]] = js.native
    
    val username: js.UndefOr[Input[String]] = js.native
  }
  object InstanceState {
    
    @scala.inline
    def apply(): InstanceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceState]
    }
    
    @scala.inline
    implicit class InstanceStateMutableBuilder[Self <: InstanceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setBlueprintId(value: Input[String]): Self = StObject.set(x, "blueprintId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlueprintIdUndefined: Self = StObject.set(x, "blueprintId", js.undefined)
      
      @scala.inline
      def setBundleId(value: Input[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
      
      @scala.inline
      def setCpuCount(value: Input[Double]): Self = StObject.set(x, "cpuCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpuCountUndefined: Self = StObject.set(x, "cpuCount", js.undefined)
      
      @scala.inline
      def setCreatedAt(value: Input[String]): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
      
      @scala.inline
      def setIpv6Address(value: Input[String]): Self = StObject.set(x, "ipv6Address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6AddressUndefined: Self = StObject.set(x, "ipv6Address", js.undefined)
      
      @scala.inline
      def setIsStaticIp(value: Input[Boolean]): Self = StObject.set(x, "isStaticIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStaticIpUndefined: Self = StObject.set(x, "isStaticIp", js.undefined)
      
      @scala.inline
      def setKeyPairName(value: Input[String]): Self = StObject.set(x, "keyPairName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPairNameUndefined: Self = StObject.set(x, "keyPairName", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPrivateIpAddress(value: Input[String]): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIpAddressUndefined: Self = StObject.set(x, "privateIpAddress", js.undefined)
      
      @scala.inline
      def setPublicIpAddress(value: Input[String]): Self = StObject.set(x, "publicIpAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicIpAddressUndefined: Self = StObject.set(x, "publicIpAddress", js.undefined)
      
      @scala.inline
      def setRamSize(value: Input[Double]): Self = StObject.set(x, "ramSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRamSizeUndefined: Self = StObject.set(x, "ramSize", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUserData(value: Input[String]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
      
      @scala.inline
      def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
