package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/lightsail/instance", "Instance")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Instance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Instance]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Instance]
    inline def get(name: String, id: Input[ID], state: InstanceState): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Instance]
    inline def get(name: String, id: Input[ID], state: InstanceState, opts: CustomResourceOptions): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Instance]
    
    /**
      * Returns true if the given object is an instance of Instance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lightsail/instance.Instance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/lightsail/instance.Instance */ Boolean]
  }
  
  trait InstanceArgs extends StObject {
    
    /**
      * The Availability Zone in which to create your
      * instance (see list below)
      */
    val availabilityZone: Input[String]
    
    /**
      * The ID for a virtual private server image. A list of available blueprint IDs can be obtained using the AWS CLI command: `aws lightsail get-blueprints`
      */
    val blueprintId: Input[String]
    
    /**
      * The bundle of specification information (see list below)
      */
    val bundleId: Input[String]
    
    /**
      * The name of your key pair. Created in the
      * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
      */
    val keyPairName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * launch script to configure server with additional user data
      */
    val userData: js.UndefOr[Input[String]] = js.undefined
  }
  object InstanceArgs {
    
    inline def apply(availabilityZone: Input[String], blueprintId: Input[String], bundleId: Input[String]): InstanceArgs = {
      val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any], blueprintId = blueprintId.asInstanceOf[js.Any], bundleId = bundleId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceArgs]
    }
    
    extension [Self <: InstanceArgs](x: Self) {
      
      inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setBlueprintId(value: Input[String]): Self = StObject.set(x, "blueprintId", value.asInstanceOf[js.Any])
      
      inline def setBundleId(value: Input[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      inline def setKeyPairName(value: Input[String]): Self = StObject.set(x, "keyPairName", value.asInstanceOf[js.Any])
      
      inline def setKeyPairNameUndefined: Self = StObject.set(x, "keyPairName", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUserData(value: Input[String]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
    }
  }
  
  trait InstanceState extends StObject {
    
    /**
      * The ARN of the Lightsail instance (matches `id`).
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Availability Zone in which to create your
      * instance (see list below)
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID for a virtual private server image. A list of available blueprint IDs can be obtained using the AWS CLI command: `aws lightsail get-blueprints`
      */
    val blueprintId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The bundle of specification information (see list below)
      */
    val bundleId: js.UndefOr[Input[String]] = js.undefined
    
    val cpuCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The timestamp when the instance was created.
      * * `availabilityZone`
      * * `blueprintId`
      * * `bundleId`
      * * `keyPairName`
      * * `userData`
      */
    val createdAt: js.UndefOr[Input[String]] = js.undefined
    
    val ipv6Address: js.UndefOr[Input[String]] = js.undefined
    
    val isStaticIp: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The name of your key pair. Created in the
      * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
      */
    val keyPairName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    val privateIpAddress: js.UndefOr[Input[String]] = js.undefined
    
    val publicIpAddress: js.UndefOr[Input[String]] = js.undefined
    
    val ramSize: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * launch script to configure server with additional user data
      */
    val userData: js.UndefOr[Input[String]] = js.undefined
    
    val username: js.UndefOr[Input[String]] = js.undefined
  }
  object InstanceState {
    
    inline def apply(): InstanceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceState]
    }
    
    extension [Self <: InstanceState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      inline def setBlueprintId(value: Input[String]): Self = StObject.set(x, "blueprintId", value.asInstanceOf[js.Any])
      
      inline def setBlueprintIdUndefined: Self = StObject.set(x, "blueprintId", js.undefined)
      
      inline def setBundleId(value: Input[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
      
      inline def setCpuCount(value: Input[Double]): Self = StObject.set(x, "cpuCount", value.asInstanceOf[js.Any])
      
      inline def setCpuCountUndefined: Self = StObject.set(x, "cpuCount", js.undefined)
      
      inline def setCreatedAt(value: Input[String]): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
      
      inline def setIpv6Address(value: Input[String]): Self = StObject.set(x, "ipv6Address", value.asInstanceOf[js.Any])
      
      inline def setIpv6AddressUndefined: Self = StObject.set(x, "ipv6Address", js.undefined)
      
      inline def setIsStaticIp(value: Input[Boolean]): Self = StObject.set(x, "isStaticIp", value.asInstanceOf[js.Any])
      
      inline def setIsStaticIpUndefined: Self = StObject.set(x, "isStaticIp", js.undefined)
      
      inline def setKeyPairName(value: Input[String]): Self = StObject.set(x, "keyPairName", value.asInstanceOf[js.Any])
      
      inline def setKeyPairNameUndefined: Self = StObject.set(x, "keyPairName", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPrivateIpAddress(value: Input[String]): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
      
      inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "privateIpAddress", js.undefined)
      
      inline def setPublicIpAddress(value: Input[String]): Self = StObject.set(x, "publicIpAddress", value.asInstanceOf[js.Any])
      
      inline def setPublicIpAddressUndefined: Self = StObject.set(x, "publicIpAddress", js.undefined)
      
      inline def setRamSize(value: Input[Double]): Self = StObject.set(x, "ramSize", value.asInstanceOf[js.Any])
      
      inline def setRamSizeUndefined: Self = StObject.set(x, "ramSize", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUserData(value: Input[String]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
      
      inline def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
