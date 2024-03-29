package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.LaunchTemplateBlockDeviceMapping
import typings.pulumiAws.outputMod.ec2.LaunchTemplateCapacityReservationSpecification
import typings.pulumiAws.outputMod.ec2.LaunchTemplateCpuOptions
import typings.pulumiAws.outputMod.ec2.LaunchTemplateCreditSpecification
import typings.pulumiAws.outputMod.ec2.LaunchTemplateElasticGpuSpecification
import typings.pulumiAws.outputMod.ec2.LaunchTemplateElasticInferenceAccelerator
import typings.pulumiAws.outputMod.ec2.LaunchTemplateHibernationOptions
import typings.pulumiAws.outputMod.ec2.LaunchTemplateIamInstanceProfile
import typings.pulumiAws.outputMod.ec2.LaunchTemplateInstanceMarketOptions
import typings.pulumiAws.outputMod.ec2.LaunchTemplateLicenseSpecification
import typings.pulumiAws.outputMod.ec2.LaunchTemplateMetadataOptions
import typings.pulumiAws.outputMod.ec2.LaunchTemplateMonitoring
import typings.pulumiAws.outputMod.ec2.LaunchTemplateNetworkInterface
import typings.pulumiAws.outputMod.ec2.LaunchTemplatePlacement
import typings.pulumiAws.outputMod.ec2.LaunchTemplateTagSpecification
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object launchTemplateMod {
  
  @JSImport("@pulumi/aws/ec2/launchTemplate", "LaunchTemplate")
  @js.native
  class LaunchTemplate protected () extends CustomResource {
    /**
      * Create a LaunchTemplate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: LaunchTemplateArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: LaunchTemplateArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of the instance profile.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Specify volumes to attach to the instance besides the volumes specified by the AMI.
      * See Block Devices below for details.
      */
    val blockDeviceMappings: Output_[js.UndefOr[js.Array[LaunchTemplateBlockDeviceMapping]]] = js.native
    
    /**
      * Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
      */
    val capacityReservationSpecification: Output_[js.UndefOr[LaunchTemplateCapacityReservationSpecification]] = js.native
    
    /**
      * The CPU options for the instance. See CPU Options below for more details.
      */
    val cpuOptions: Output_[js.UndefOr[LaunchTemplateCpuOptions]] = js.native
    
    /**
      * Customize the credit specification of the instance. See Credit
      * Specification below for more details.
      */
    val creditSpecification: Output_[js.UndefOr[LaunchTemplateCreditSpecification]] = js.native
    
    /**
      * Default Version of the launch template.
      */
    val defaultVersion: Output_[Double] = js.native
    
    /**
      * Description of the launch template.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * If `true`, enables [EC2 Instance
      * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
      */
    val disableApiTermination: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * If `true`, the launched EC2 instance will be EBS-optimized.
      */
    val ebsOptimized: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The elastic GPU to attach to the instance. See Elastic GPU
      * below for more details.
      */
    val elasticGpuSpecifications: Output_[js.UndefOr[js.Array[LaunchTemplateElasticGpuSpecification]]] = js.native
    
    /**
      * Configuration block containing an Elastic Inference Accelerator to attach to the instance. See Elastic Inference Accelerator below for more details.
      */
    val elasticInferenceAccelerator: Output_[js.UndefOr[LaunchTemplateElasticInferenceAccelerator]] = js.native
    
    /**
      * The hibernation options for the instance. See Hibernation Options below for more details.
      */
    val hibernationOptions: Output_[js.UndefOr[LaunchTemplateHibernationOptions]] = js.native
    
    /**
      * The IAM Instance Profile to launch the instance with. See Instance Profile
      * below for more details.
      */
    val iamInstanceProfile: Output_[js.UndefOr[LaunchTemplateIamInstanceProfile]] = js.native
    
    /**
      * The AMI from which to launch the instance.
      */
    val imageId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Shutdown behavior for the instance. Can be `stop` or `terminate`.
      * (Default: `stop`).
      */
    val instanceInitiatedShutdownBehavior: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The market (purchasing) option for the instance. See Market Options
      * below for details.
      */
    val instanceMarketOptions: Output_[js.UndefOr[LaunchTemplateInstanceMarketOptions]] = js.native
    
    /**
      * The type of the instance.
      */
    val instanceType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The kernel ID.
      */
    val kernelId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The key name to use for the instance.
      */
    val keyName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The latest version of the launch template.
      */
    val latestVersion: Output_[Double] = js.native
    
    /**
      * A list of license specifications to associate with. See License Specification below for more details.
      */
    val licenseSpecifications: Output_[js.UndefOr[js.Array[LaunchTemplateLicenseSpecification]]] = js.native
    
    /**
      * Customize the metadata options for the instance. See Metadata Options below for more details.
      */
    val metadataOptions: Output_[LaunchTemplateMetadataOptions] = js.native
    
    /**
      * The monitoring option for the instance. See Monitoring below for more details.
      */
    val monitoring: Output_[js.UndefOr[LaunchTemplateMonitoring]] = js.native
    
    /**
      * The name of the launch template. If you leave this blank, this provider will auto-generate a unique name.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Customize network interfaces to be attached at instance boot time. See Network
      * Interfaces below for more details.
      */
    val networkInterfaces: Output_[js.UndefOr[js.Array[LaunchTemplateNetworkInterface]]] = js.native
    
    /**
      * The placement of the instance. See Placement below for more details.
      */
    val placement: Output_[js.UndefOr[LaunchTemplatePlacement]] = js.native
    
    /**
      * The ID of the RAM disk.
      */
    val ramDiskId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A list of security group names to associate with. If you are creating Instances in a VPC, use
      * `vpcSecurityGroupIds` instead.
      */
    val securityGroupNames: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The tags to apply to the resources during launch. See Tag Specifications below for more details.
      */
    val tagSpecifications: Output_[js.UndefOr[js.Array[LaunchTemplateTagSpecification]]] = js.native
    
    /**
      * A map of tags to assign to the launch template.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Whether to update Default Version each update. Conflicts with `defaultVersion`.
      */
    val updateDefaultVersion: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The Base64-encoded user data to provide when launching the instance.
      */
    val userData: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A list of security group IDs to associate with.
      */
    val vpcSecurityGroupIds: Output_[js.UndefOr[js.Array[String]]] = js.native
  }
  /* static members */
  object LaunchTemplate {
    
    @JSImport("@pulumi/aws/ec2/launchTemplate", "LaunchTemplate")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LaunchTemplate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): LaunchTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LaunchTemplate]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LaunchTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LaunchTemplate]
    inline def get(name: String, id: Input[ID], state: LaunchTemplateState): LaunchTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LaunchTemplate]
    inline def get(name: String, id: Input[ID], state: LaunchTemplateState, opts: CustomResourceOptions): LaunchTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LaunchTemplate]
    
    /**
      * Returns true if the given object is an instance of LaunchTemplate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/launchTemplate.LaunchTemplate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/launchTemplate.LaunchTemplate */ Boolean]
  }
  
  trait LaunchTemplateArgs extends StObject {
    
    /**
      * Specify volumes to attach to the instance besides the volumes specified by the AMI.
      * See Block Devices below for details.
      */
    val blockDeviceMappings: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateBlockDeviceMapping]]]
      ] = js.undefined
    
    /**
      * Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
      */
    val capacityReservationSpecification: js.UndefOr[
        Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateCapacityReservationSpecification]
      ] = js.undefined
    
    /**
      * The CPU options for the instance. See CPU Options below for more details.
      */
    val cpuOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateCpuOptions]] = js.undefined
    
    /**
      * Customize the credit specification of the instance. See Credit
      * Specification below for more details.
      */
    val creditSpecification: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateCreditSpecification]] = js.undefined
    
    /**
      * Default Version of the launch template.
      */
    val defaultVersion: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Description of the launch template.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If `true`, enables [EC2 Instance
      * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
      */
    val disableApiTermination: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * If `true`, the launched EC2 instance will be EBS-optimized.
      */
    val ebsOptimized: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The elastic GPU to attach to the instance. See Elastic GPU
      * below for more details.
      */
    val elasticGpuSpecifications: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateElasticGpuSpecification]]
        ]
      ] = js.undefined
    
    /**
      * Configuration block containing an Elastic Inference Accelerator to attach to the instance. See Elastic Inference Accelerator below for more details.
      */
    val elasticInferenceAccelerator: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateElasticInferenceAccelerator]] = js.undefined
    
    /**
      * The hibernation options for the instance. See Hibernation Options below for more details.
      */
    val hibernationOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateHibernationOptions]] = js.undefined
    
    /**
      * The IAM Instance Profile to launch the instance with. See Instance Profile
      * below for more details.
      */
    val iamInstanceProfile: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateIamInstanceProfile]] = js.undefined
    
    /**
      * The AMI from which to launch the instance.
      */
    val imageId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Shutdown behavior for the instance. Can be `stop` or `terminate`.
      * (Default: `stop`).
      */
    val instanceInitiatedShutdownBehavior: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The market (purchasing) option for the instance. See Market Options
      * below for details.
      */
    val instanceMarketOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateInstanceMarketOptions]] = js.undefined
    
    /**
      * The type of the instance.
      */
    val instanceType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The kernel ID.
      */
    val kernelId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The key name to use for the instance.
      */
    val keyName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of license specifications to associate with. See License Specification below for more details.
      */
    val licenseSpecifications: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateLicenseSpecification]]
        ]
      ] = js.undefined
    
    /**
      * Customize the metadata options for the instance. See Metadata Options below for more details.
      */
    val metadataOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateMetadataOptions]] = js.undefined
    
    /**
      * The monitoring option for the instance. See Monitoring below for more details.
      */
    val monitoring: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateMonitoring]] = js.undefined
    
    /**
      * The name of the launch template. If you leave this blank, this provider will auto-generate a unique name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Customize network interfaces to be attached at instance boot time. See Network
      * Interfaces below for more details.
      */
    val networkInterfaces: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateNetworkInterface]]]
      ] = js.undefined
    
    /**
      * The placement of the instance. See Placement below for more details.
      */
    val placement: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplatePlacement]] = js.undefined
    
    /**
      * The ID of the RAM disk.
      */
    val ramDiskId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of security group names to associate with. If you are creating Instances in a VPC, use
      * `vpcSecurityGroupIds` instead.
      */
    val securityGroupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The tags to apply to the resources during launch. See Tag Specifications below for more details.
      */
    val tagSpecifications: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateTagSpecification]]]
      ] = js.undefined
    
    /**
      * A map of tags to assign to the launch template.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Whether to update Default Version each update. Conflicts with `defaultVersion`.
      */
    val updateDefaultVersion: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The Base64-encoded user data to provide when launching the instance.
      */
    val userData: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of security group IDs to associate with.
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object LaunchTemplateArgs {
    
    inline def apply(): LaunchTemplateArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LaunchTemplateArgs]
    }
    
    extension [Self <: LaunchTemplateArgs](x: Self) {
      
      inline def setBlockDeviceMappings(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateBlockDeviceMapping]]]): Self = StObject.set(x, "blockDeviceMappings", value.asInstanceOf[js.Any])
      
      inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "blockDeviceMappings", js.undefined)
      
      inline def setBlockDeviceMappingsVarargs(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateBlockDeviceMapping]*): Self = StObject.set(x, "blockDeviceMappings", js.Array(value :_*))
      
      inline def setCapacityReservationSpecification(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateCapacityReservationSpecification]): Self = StObject.set(x, "capacityReservationSpecification", value.asInstanceOf[js.Any])
      
      inline def setCapacityReservationSpecificationUndefined: Self = StObject.set(x, "capacityReservationSpecification", js.undefined)
      
      inline def setCpuOptions(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateCpuOptions]): Self = StObject.set(x, "cpuOptions", value.asInstanceOf[js.Any])
      
      inline def setCpuOptionsUndefined: Self = StObject.set(x, "cpuOptions", js.undefined)
      
      inline def setCreditSpecification(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateCreditSpecification]): Self = StObject.set(x, "creditSpecification", value.asInstanceOf[js.Any])
      
      inline def setCreditSpecificationUndefined: Self = StObject.set(x, "creditSpecification", js.undefined)
      
      inline def setDefaultVersion(value: Input[Double]): Self = StObject.set(x, "defaultVersion", value.asInstanceOf[js.Any])
      
      inline def setDefaultVersionUndefined: Self = StObject.set(x, "defaultVersion", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisableApiTermination(value: Input[Boolean]): Self = StObject.set(x, "disableApiTermination", value.asInstanceOf[js.Any])
      
      inline def setDisableApiTerminationUndefined: Self = StObject.set(x, "disableApiTermination", js.undefined)
      
      inline def setEbsOptimized(value: Input[String]): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
      
      inline def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
      
      inline def setElasticGpuSpecifications(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateElasticGpuSpecification]]
            ]
      ): Self = StObject.set(x, "elasticGpuSpecifications", value.asInstanceOf[js.Any])
      
      inline def setElasticGpuSpecificationsUndefined: Self = StObject.set(x, "elasticGpuSpecifications", js.undefined)
      
      inline def setElasticGpuSpecificationsVarargs(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateElasticGpuSpecification]*): Self = StObject.set(x, "elasticGpuSpecifications", js.Array(value :_*))
      
      inline def setElasticInferenceAccelerator(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateElasticInferenceAccelerator]): Self = StObject.set(x, "elasticInferenceAccelerator", value.asInstanceOf[js.Any])
      
      inline def setElasticInferenceAcceleratorUndefined: Self = StObject.set(x, "elasticInferenceAccelerator", js.undefined)
      
      inline def setHibernationOptions(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateHibernationOptions]): Self = StObject.set(x, "hibernationOptions", value.asInstanceOf[js.Any])
      
      inline def setHibernationOptionsUndefined: Self = StObject.set(x, "hibernationOptions", js.undefined)
      
      inline def setIamInstanceProfile(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateIamInstanceProfile]): Self = StObject.set(x, "iamInstanceProfile", value.asInstanceOf[js.Any])
      
      inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "iamInstanceProfile", js.undefined)
      
      inline def setImageId(value: Input[String]): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
      
      inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
      
      inline def setInstanceInitiatedShutdownBehavior(value: Input[String]): Self = StObject.set(x, "instanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
      
      inline def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "instanceInitiatedShutdownBehavior", js.undefined)
      
      inline def setInstanceMarketOptions(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateInstanceMarketOptions]): Self = StObject.set(x, "instanceMarketOptions", value.asInstanceOf[js.Any])
      
      inline def setInstanceMarketOptionsUndefined: Self = StObject.set(x, "instanceMarketOptions", js.undefined)
      
      inline def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
      
      inline def setKernelId(value: Input[String]): Self = StObject.set(x, "kernelId", value.asInstanceOf[js.Any])
      
      inline def setKernelIdUndefined: Self = StObject.set(x, "kernelId", js.undefined)
      
      inline def setKeyName(value: Input[String]): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
      
      inline def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
      
      inline def setLicenseSpecifications(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateLicenseSpecification]]
            ]
      ): Self = StObject.set(x, "licenseSpecifications", value.asInstanceOf[js.Any])
      
      inline def setLicenseSpecificationsUndefined: Self = StObject.set(x, "licenseSpecifications", js.undefined)
      
      inline def setLicenseSpecificationsVarargs(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateLicenseSpecification]*): Self = StObject.set(x, "licenseSpecifications", js.Array(value :_*))
      
      inline def setMetadataOptions(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateMetadataOptions]): Self = StObject.set(x, "metadataOptions", value.asInstanceOf[js.Any])
      
      inline def setMetadataOptionsUndefined: Self = StObject.set(x, "metadataOptions", js.undefined)
      
      inline def setMonitoring(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateMonitoring]): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
      
      inline def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNetworkInterfaces(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateNetworkInterface]]]): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
      
      inline def setNetworkInterfacesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateNetworkInterface]*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
      
      inline def setPlacement(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplatePlacement]): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setRamDiskId(value: Input[String]): Self = StObject.set(x, "ramDiskId", value.asInstanceOf[js.Any])
      
      inline def setRamDiskIdUndefined: Self = StObject.set(x, "ramDiskId", js.undefined)
      
      inline def setSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupNames", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupNamesUndefined: Self = StObject.set(x, "securityGroupNames", js.undefined)
      
      inline def setSecurityGroupNamesVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupNames", js.Array(value :_*))
      
      inline def setTagSpecifications(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateTagSpecification]]]): Self = StObject.set(x, "tagSpecifications", value.asInstanceOf[js.Any])
      
      inline def setTagSpecificationsUndefined: Self = StObject.set(x, "tagSpecifications", js.undefined)
      
      inline def setTagSpecificationsVarargs(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateTagSpecification]*): Self = StObject.set(x, "tagSpecifications", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUpdateDefaultVersion(value: Input[Boolean]): Self = StObject.set(x, "updateDefaultVersion", value.asInstanceOf[js.Any])
      
      inline def setUpdateDefaultVersionUndefined: Self = StObject.set(x, "updateDefaultVersion", js.undefined)
      
      inline def setUserData(value: Input[String]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
      
      inline def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
      
      inline def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
  
  trait LaunchTemplateState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the instance profile.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specify volumes to attach to the instance besides the volumes specified by the AMI.
      * See Block Devices below for details.
      */
    val blockDeviceMappings: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateBlockDeviceMapping]]]
      ] = js.undefined
    
    /**
      * Targeting for EC2 capacity reservations. See Capacity Reservation Specification below for more details.
      */
    val capacityReservationSpecification: js.UndefOr[
        Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateCapacityReservationSpecification]
      ] = js.undefined
    
    /**
      * The CPU options for the instance. See CPU Options below for more details.
      */
    val cpuOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateCpuOptions]] = js.undefined
    
    /**
      * Customize the credit specification of the instance. See Credit
      * Specification below for more details.
      */
    val creditSpecification: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateCreditSpecification]] = js.undefined
    
    /**
      * Default Version of the launch template.
      */
    val defaultVersion: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Description of the launch template.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If `true`, enables [EC2 Instance
      * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
      */
    val disableApiTermination: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * If `true`, the launched EC2 instance will be EBS-optimized.
      */
    val ebsOptimized: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The elastic GPU to attach to the instance. See Elastic GPU
      * below for more details.
      */
    val elasticGpuSpecifications: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateElasticGpuSpecification]]
        ]
      ] = js.undefined
    
    /**
      * Configuration block containing an Elastic Inference Accelerator to attach to the instance. See Elastic Inference Accelerator below for more details.
      */
    val elasticInferenceAccelerator: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateElasticInferenceAccelerator]] = js.undefined
    
    /**
      * The hibernation options for the instance. See Hibernation Options below for more details.
      */
    val hibernationOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateHibernationOptions]] = js.undefined
    
    /**
      * The IAM Instance Profile to launch the instance with. See Instance Profile
      * below for more details.
      */
    val iamInstanceProfile: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateIamInstanceProfile]] = js.undefined
    
    /**
      * The AMI from which to launch the instance.
      */
    val imageId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Shutdown behavior for the instance. Can be `stop` or `terminate`.
      * (Default: `stop`).
      */
    val instanceInitiatedShutdownBehavior: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The market (purchasing) option for the instance. See Market Options
      * below for details.
      */
    val instanceMarketOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateInstanceMarketOptions]] = js.undefined
    
    /**
      * The type of the instance.
      */
    val instanceType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The kernel ID.
      */
    val kernelId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The key name to use for the instance.
      */
    val keyName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The latest version of the launch template.
      */
    val latestVersion: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A list of license specifications to associate with. See License Specification below for more details.
      */
    val licenseSpecifications: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateLicenseSpecification]]
        ]
      ] = js.undefined
    
    /**
      * Customize the metadata options for the instance. See Metadata Options below for more details.
      */
    val metadataOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateMetadataOptions]] = js.undefined
    
    /**
      * The monitoring option for the instance. See Monitoring below for more details.
      */
    val monitoring: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateMonitoring]] = js.undefined
    
    /**
      * The name of the launch template. If you leave this blank, this provider will auto-generate a unique name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Customize network interfaces to be attached at instance boot time. See Network
      * Interfaces below for more details.
      */
    val networkInterfaces: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateNetworkInterface]]]
      ] = js.undefined
    
    /**
      * The placement of the instance. See Placement below for more details.
      */
    val placement: js.UndefOr[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplatePlacement]] = js.undefined
    
    /**
      * The ID of the RAM disk.
      */
    val ramDiskId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of security group names to associate with. If you are creating Instances in a VPC, use
      * `vpcSecurityGroupIds` instead.
      */
    val securityGroupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The tags to apply to the resources during launch. See Tag Specifications below for more details.
      */
    val tagSpecifications: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateTagSpecification]]]
      ] = js.undefined
    
    /**
      * A map of tags to assign to the launch template.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Whether to update Default Version each update. Conflicts with `defaultVersion`.
      */
    val updateDefaultVersion: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The Base64-encoded user data to provide when launching the instance.
      */
    val userData: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of security group IDs to associate with.
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object LaunchTemplateState {
    
    inline def apply(): LaunchTemplateState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LaunchTemplateState]
    }
    
    extension [Self <: LaunchTemplateState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setBlockDeviceMappings(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateBlockDeviceMapping]]]): Self = StObject.set(x, "blockDeviceMappings", value.asInstanceOf[js.Any])
      
      inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "blockDeviceMappings", js.undefined)
      
      inline def setBlockDeviceMappingsVarargs(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateBlockDeviceMapping]*): Self = StObject.set(x, "blockDeviceMappings", js.Array(value :_*))
      
      inline def setCapacityReservationSpecification(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateCapacityReservationSpecification]): Self = StObject.set(x, "capacityReservationSpecification", value.asInstanceOf[js.Any])
      
      inline def setCapacityReservationSpecificationUndefined: Self = StObject.set(x, "capacityReservationSpecification", js.undefined)
      
      inline def setCpuOptions(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateCpuOptions]): Self = StObject.set(x, "cpuOptions", value.asInstanceOf[js.Any])
      
      inline def setCpuOptionsUndefined: Self = StObject.set(x, "cpuOptions", js.undefined)
      
      inline def setCreditSpecification(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateCreditSpecification]): Self = StObject.set(x, "creditSpecification", value.asInstanceOf[js.Any])
      
      inline def setCreditSpecificationUndefined: Self = StObject.set(x, "creditSpecification", js.undefined)
      
      inline def setDefaultVersion(value: Input[Double]): Self = StObject.set(x, "defaultVersion", value.asInstanceOf[js.Any])
      
      inline def setDefaultVersionUndefined: Self = StObject.set(x, "defaultVersion", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisableApiTermination(value: Input[Boolean]): Self = StObject.set(x, "disableApiTermination", value.asInstanceOf[js.Any])
      
      inline def setDisableApiTerminationUndefined: Self = StObject.set(x, "disableApiTermination", js.undefined)
      
      inline def setEbsOptimized(value: Input[String]): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
      
      inline def setEbsOptimizedUndefined: Self = StObject.set(x, "ebsOptimized", js.undefined)
      
      inline def setElasticGpuSpecifications(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateElasticGpuSpecification]]
            ]
      ): Self = StObject.set(x, "elasticGpuSpecifications", value.asInstanceOf[js.Any])
      
      inline def setElasticGpuSpecificationsUndefined: Self = StObject.set(x, "elasticGpuSpecifications", js.undefined)
      
      inline def setElasticGpuSpecificationsVarargs(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateElasticGpuSpecification]*): Self = StObject.set(x, "elasticGpuSpecifications", js.Array(value :_*))
      
      inline def setElasticInferenceAccelerator(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateElasticInferenceAccelerator]): Self = StObject.set(x, "elasticInferenceAccelerator", value.asInstanceOf[js.Any])
      
      inline def setElasticInferenceAcceleratorUndefined: Self = StObject.set(x, "elasticInferenceAccelerator", js.undefined)
      
      inline def setHibernationOptions(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateHibernationOptions]): Self = StObject.set(x, "hibernationOptions", value.asInstanceOf[js.Any])
      
      inline def setHibernationOptionsUndefined: Self = StObject.set(x, "hibernationOptions", js.undefined)
      
      inline def setIamInstanceProfile(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateIamInstanceProfile]): Self = StObject.set(x, "iamInstanceProfile", value.asInstanceOf[js.Any])
      
      inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "iamInstanceProfile", js.undefined)
      
      inline def setImageId(value: Input[String]): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
      
      inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
      
      inline def setInstanceInitiatedShutdownBehavior(value: Input[String]): Self = StObject.set(x, "instanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
      
      inline def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "instanceInitiatedShutdownBehavior", js.undefined)
      
      inline def setInstanceMarketOptions(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateInstanceMarketOptions]): Self = StObject.set(x, "instanceMarketOptions", value.asInstanceOf[js.Any])
      
      inline def setInstanceMarketOptionsUndefined: Self = StObject.set(x, "instanceMarketOptions", js.undefined)
      
      inline def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
      
      inline def setKernelId(value: Input[String]): Self = StObject.set(x, "kernelId", value.asInstanceOf[js.Any])
      
      inline def setKernelIdUndefined: Self = StObject.set(x, "kernelId", js.undefined)
      
      inline def setKeyName(value: Input[String]): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
      
      inline def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
      
      inline def setLatestVersion(value: Input[Double]): Self = StObject.set(x, "latestVersion", value.asInstanceOf[js.Any])
      
      inline def setLatestVersionUndefined: Self = StObject.set(x, "latestVersion", js.undefined)
      
      inline def setLicenseSpecifications(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateLicenseSpecification]]
            ]
      ): Self = StObject.set(x, "licenseSpecifications", value.asInstanceOf[js.Any])
      
      inline def setLicenseSpecificationsUndefined: Self = StObject.set(x, "licenseSpecifications", js.undefined)
      
      inline def setLicenseSpecificationsVarargs(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateLicenseSpecification]*): Self = StObject.set(x, "licenseSpecifications", js.Array(value :_*))
      
      inline def setMetadataOptions(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateMetadataOptions]): Self = StObject.set(x, "metadataOptions", value.asInstanceOf[js.Any])
      
      inline def setMetadataOptionsUndefined: Self = StObject.set(x, "metadataOptions", js.undefined)
      
      inline def setMonitoring(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateMonitoring]): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
      
      inline def setMonitoringUndefined: Self = StObject.set(x, "monitoring", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNetworkInterfaces(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateNetworkInterface]]]): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "networkInterfaces", js.undefined)
      
      inline def setNetworkInterfacesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateNetworkInterface]*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
      
      inline def setPlacement(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplatePlacement]): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setRamDiskId(value: Input[String]): Self = StObject.set(x, "ramDiskId", value.asInstanceOf[js.Any])
      
      inline def setRamDiskIdUndefined: Self = StObject.set(x, "ramDiskId", js.undefined)
      
      inline def setSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupNames", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupNamesUndefined: Self = StObject.set(x, "securityGroupNames", js.undefined)
      
      inline def setSecurityGroupNamesVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupNames", js.Array(value :_*))
      
      inline def setTagSpecifications(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateTagSpecification]]]): Self = StObject.set(x, "tagSpecifications", value.asInstanceOf[js.Any])
      
      inline def setTagSpecificationsUndefined: Self = StObject.set(x, "tagSpecifications", js.undefined)
      
      inline def setTagSpecificationsVarargs(value: Input[typings.pulumiAws.inputMod.ec2.LaunchTemplateTagSpecification]*): Self = StObject.set(x, "tagSpecifications", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUpdateDefaultVersion(value: Input[Boolean]): Self = StObject.set(x, "updateDefaultVersion", value.asInstanceOf[js.Any])
      
      inline def setUpdateDefaultVersionUndefined: Self = StObject.set(x, "updateDefaultVersion", js.undefined)
      
      inline def setUserData(value: Input[String]): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
      
      inline def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
      
      inline def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
}
