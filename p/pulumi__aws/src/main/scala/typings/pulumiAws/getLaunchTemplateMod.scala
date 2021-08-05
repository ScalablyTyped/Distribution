package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetLaunchTemplateFilter
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateBlockDeviceMapping
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateCreditSpecification
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateElasticGpuSpecification
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateHibernationOption
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateIamInstanceProfile
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateInstanceMarketOption
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateMetadataOption
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateMonitoring
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateNetworkInterface
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplatePlacement
import typings.pulumiAws.outputMod.ec2.GetLaunchTemplateTagSpecification
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLaunchTemplateMod {
  
  @JSImport("@pulumi/aws/ec2/getLaunchTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLaunchTemplate(): js.Promise[GetLaunchTemplateResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLaunchTemplate")().asInstanceOf[js.Promise[GetLaunchTemplateResult]]
  inline def getLaunchTemplate(args: Unit, opts: InvokeOptions): js.Promise[GetLaunchTemplateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLaunchTemplate")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLaunchTemplateResult]]
  inline def getLaunchTemplate(args: GetLaunchTemplateArgs): js.Promise[GetLaunchTemplateResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLaunchTemplate")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLaunchTemplateResult]]
  inline def getLaunchTemplate(args: GetLaunchTemplateArgs, opts: InvokeOptions): js.Promise[GetLaunchTemplateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLaunchTemplate")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLaunchTemplateResult]]
  
  trait GetLaunchTemplateArgs extends StObject {
    
    /**
      * Configuration block(s) for filtering. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetLaunchTemplateFilter]] = js.undefined
    
    /**
      * The name of the filter field. Valid values can be found in the [EC2 DescribeLaunchTemplates API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLaunchTemplates.html).
      */
    val name: js.UndefOr[String] = js.undefined
    
    /**
      * A map of tags, each pair of which must exactly match a pair on the desired Launch Template.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetLaunchTemplateArgs {
    
    inline def apply(): GetLaunchTemplateArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetLaunchTemplateArgs]
    }
    
    extension [Self <: GetLaunchTemplateArgs](x: Self) {
      
      inline def setFilters(value: js.Array[GetLaunchTemplateFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetLaunchTemplateFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetLaunchTemplateResult extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the launch template.
      */
    val arn: String
    
    /**
      * Specify volumes to attach to the instance besides the volumes specified by the AMI.
      */
    val blockDeviceMappings: js.Array[GetLaunchTemplateBlockDeviceMapping]
    
    /**
      * Customize the credit specification of the instance. See Credit
      * Specification below for more details.
      */
    val creditSpecifications: js.Array[GetLaunchTemplateCreditSpecification]
    
    /**
      * The default version of the launch template.
      */
    val defaultVersion: Double
    
    /**
      * Description of the launch template.
      */
    val description: String
    
    /**
      * If `true`, enables [EC2 Instance
      * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
      */
    val disableApiTermination: Boolean
    
    /**
      * If `true`, the launched EC2 instance will be EBS-optimized.
      */
    val ebsOptimized: String
    
    /**
      * The elastic GPU to attach to the instance. See Elastic GPU
      * below for more details.
      */
    val elasticGpuSpecifications: js.Array[GetLaunchTemplateElasticGpuSpecification]
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetLaunchTemplateFilter]] = js.undefined
    
    /**
      * The hibernation options for the instance.
      */
    val hibernationOptions: js.Array[GetLaunchTemplateHibernationOption]
    
    /**
      * The IAM Instance Profile to launch the instance with. See Instance Profile
      * below for more details.
      */
    val iamInstanceProfiles: js.Array[GetLaunchTemplateIamInstanceProfile]
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The AMI from which to launch the instance.
      */
    val imageId: String
    
    /**
      * Shutdown behavior for the instance. Can be `stop` or `terminate`.
      * (Default: `stop`).
      */
    val instanceInitiatedShutdownBehavior: String
    
    /**
      * The market (purchasing) option for the instance.
      * below for details.
      */
    val instanceMarketOptions: js.Array[GetLaunchTemplateInstanceMarketOption]
    
    /**
      * The type of the instance.
      */
    val instanceType: String
    
    /**
      * The kernel ID.
      */
    val kernelId: String
    
    /**
      * The key name to use for the instance.
      */
    val keyName: String
    
    /**
      * The latest version of the launch template.
      */
    val latestVersion: Double
    
    /**
      * The metadata options for the instance.
      */
    val metadataOptions: js.Array[GetLaunchTemplateMetadataOption]
    
    /**
      * The monitoring option for the instance.
      */
    val monitorings: js.Array[GetLaunchTemplateMonitoring]
    
    val name: js.UndefOr[String] = js.undefined
    
    /**
      * Customize network interfaces to be attached at instance boot time. See Network
      * Interfaces below for more details.
      */
    val networkInterfaces: js.Array[GetLaunchTemplateNetworkInterface]
    
    /**
      * The placement of the instance.
      */
    val placements: js.Array[GetLaunchTemplatePlacement]
    
    /**
      * The ID of the RAM disk.
      */
    val ramDiskId: String
    
    /**
      * A list of security group names to associate with. If you are creating Instances in a VPC, use
      * `vpcSecurityGroupIds` instead.
      */
    val securityGroupNames: js.Array[String]
    
    /**
      * The tags to apply to the resources during launch.
      */
    val tagSpecifications: js.Array[GetLaunchTemplateTagSpecification]
    
    /**
      * (Optional) A map of tags to assign to the launch template.
      */
    val tags: StringDictionary[String]
    
    /**
      * The Base64-encoded user data to provide when launching the instance.
      */
    val userData: String
    
    /**
      * A list of security group IDs to associate with.
      */
    val vpcSecurityGroupIds: js.Array[String]
  }
  object GetLaunchTemplateResult {
    
    inline def apply(
      arn: String,
      blockDeviceMappings: js.Array[GetLaunchTemplateBlockDeviceMapping],
      creditSpecifications: js.Array[GetLaunchTemplateCreditSpecification],
      defaultVersion: Double,
      description: String,
      disableApiTermination: Boolean,
      ebsOptimized: String,
      elasticGpuSpecifications: js.Array[GetLaunchTemplateElasticGpuSpecification],
      hibernationOptions: js.Array[GetLaunchTemplateHibernationOption],
      iamInstanceProfiles: js.Array[GetLaunchTemplateIamInstanceProfile],
      id: String,
      imageId: String,
      instanceInitiatedShutdownBehavior: String,
      instanceMarketOptions: js.Array[GetLaunchTemplateInstanceMarketOption],
      instanceType: String,
      kernelId: String,
      keyName: String,
      latestVersion: Double,
      metadataOptions: js.Array[GetLaunchTemplateMetadataOption],
      monitorings: js.Array[GetLaunchTemplateMonitoring],
      networkInterfaces: js.Array[GetLaunchTemplateNetworkInterface],
      placements: js.Array[GetLaunchTemplatePlacement],
      ramDiskId: String,
      securityGroupNames: js.Array[String],
      tagSpecifications: js.Array[GetLaunchTemplateTagSpecification],
      tags: StringDictionary[String],
      userData: String,
      vpcSecurityGroupIds: js.Array[String]
    ): GetLaunchTemplateResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], blockDeviceMappings = blockDeviceMappings.asInstanceOf[js.Any], creditSpecifications = creditSpecifications.asInstanceOf[js.Any], defaultVersion = defaultVersion.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disableApiTermination = disableApiTermination.asInstanceOf[js.Any], ebsOptimized = ebsOptimized.asInstanceOf[js.Any], elasticGpuSpecifications = elasticGpuSpecifications.asInstanceOf[js.Any], hibernationOptions = hibernationOptions.asInstanceOf[js.Any], iamInstanceProfiles = iamInstanceProfiles.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.asInstanceOf[js.Any], instanceMarketOptions = instanceMarketOptions.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any], kernelId = kernelId.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], metadataOptions = metadataOptions.asInstanceOf[js.Any], monitorings = monitorings.asInstanceOf[js.Any], networkInterfaces = networkInterfaces.asInstanceOf[js.Any], placements = placements.asInstanceOf[js.Any], ramDiskId = ramDiskId.asInstanceOf[js.Any], securityGroupNames = securityGroupNames.asInstanceOf[js.Any], tagSpecifications = tagSpecifications.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLaunchTemplateResult]
    }
    
    extension [Self <: GetLaunchTemplateResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setBlockDeviceMappings(value: js.Array[GetLaunchTemplateBlockDeviceMapping]): Self = StObject.set(x, "blockDeviceMappings", value.asInstanceOf[js.Any])
      
      inline def setBlockDeviceMappingsVarargs(value: GetLaunchTemplateBlockDeviceMapping*): Self = StObject.set(x, "blockDeviceMappings", js.Array(value :_*))
      
      inline def setCreditSpecifications(value: js.Array[GetLaunchTemplateCreditSpecification]): Self = StObject.set(x, "creditSpecifications", value.asInstanceOf[js.Any])
      
      inline def setCreditSpecificationsVarargs(value: GetLaunchTemplateCreditSpecification*): Self = StObject.set(x, "creditSpecifications", js.Array(value :_*))
      
      inline def setDefaultVersion(value: Double): Self = StObject.set(x, "defaultVersion", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDisableApiTermination(value: Boolean): Self = StObject.set(x, "disableApiTermination", value.asInstanceOf[js.Any])
      
      inline def setEbsOptimized(value: String): Self = StObject.set(x, "ebsOptimized", value.asInstanceOf[js.Any])
      
      inline def setElasticGpuSpecifications(value: js.Array[GetLaunchTemplateElasticGpuSpecification]): Self = StObject.set(x, "elasticGpuSpecifications", value.asInstanceOf[js.Any])
      
      inline def setElasticGpuSpecificationsVarargs(value: GetLaunchTemplateElasticGpuSpecification*): Self = StObject.set(x, "elasticGpuSpecifications", js.Array(value :_*))
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetLaunchTemplateFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetLaunchTemplateFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setHibernationOptions(value: js.Array[GetLaunchTemplateHibernationOption]): Self = StObject.set(x, "hibernationOptions", value.asInstanceOf[js.Any])
      
      inline def setHibernationOptionsVarargs(value: GetLaunchTemplateHibernationOption*): Self = StObject.set(x, "hibernationOptions", js.Array(value :_*))
      
      inline def setIamInstanceProfiles(value: js.Array[GetLaunchTemplateIamInstanceProfile]): Self = StObject.set(x, "iamInstanceProfiles", value.asInstanceOf[js.Any])
      
      inline def setIamInstanceProfilesVarargs(value: GetLaunchTemplateIamInstanceProfile*): Self = StObject.set(x, "iamInstanceProfiles", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
      
      inline def setInstanceInitiatedShutdownBehavior(value: String): Self = StObject.set(x, "instanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
      
      inline def setInstanceMarketOptions(value: js.Array[GetLaunchTemplateInstanceMarketOption]): Self = StObject.set(x, "instanceMarketOptions", value.asInstanceOf[js.Any])
      
      inline def setInstanceMarketOptionsVarargs(value: GetLaunchTemplateInstanceMarketOption*): Self = StObject.set(x, "instanceMarketOptions", js.Array(value :_*))
      
      inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      inline def setKernelId(value: String): Self = StObject.set(x, "kernelId", value.asInstanceOf[js.Any])
      
      inline def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
      
      inline def setLatestVersion(value: Double): Self = StObject.set(x, "latestVersion", value.asInstanceOf[js.Any])
      
      inline def setMetadataOptions(value: js.Array[GetLaunchTemplateMetadataOption]): Self = StObject.set(x, "metadataOptions", value.asInstanceOf[js.Any])
      
      inline def setMetadataOptionsVarargs(value: GetLaunchTemplateMetadataOption*): Self = StObject.set(x, "metadataOptions", js.Array(value :_*))
      
      inline def setMonitorings(value: js.Array[GetLaunchTemplateMonitoring]): Self = StObject.set(x, "monitorings", value.asInstanceOf[js.Any])
      
      inline def setMonitoringsVarargs(value: GetLaunchTemplateMonitoring*): Self = StObject.set(x, "monitorings", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNetworkInterfaces(value: js.Array[GetLaunchTemplateNetworkInterface]): Self = StObject.set(x, "networkInterfaces", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfacesVarargs(value: GetLaunchTemplateNetworkInterface*): Self = StObject.set(x, "networkInterfaces", js.Array(value :_*))
      
      inline def setPlacements(value: js.Array[GetLaunchTemplatePlacement]): Self = StObject.set(x, "placements", value.asInstanceOf[js.Any])
      
      inline def setPlacementsVarargs(value: GetLaunchTemplatePlacement*): Self = StObject.set(x, "placements", js.Array(value :_*))
      
      inline def setRamDiskId(value: String): Self = StObject.set(x, "ramDiskId", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupNames(value: js.Array[String]): Self = StObject.set(x, "securityGroupNames", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupNamesVarargs(value: String*): Self = StObject.set(x, "securityGroupNames", js.Array(value :_*))
      
      inline def setTagSpecifications(value: js.Array[GetLaunchTemplateTagSpecification]): Self = StObject.set(x, "tagSpecifications", value.asInstanceOf[js.Any])
      
      inline def setTagSpecificationsVarargs(value: GetLaunchTemplateTagSpecification*): Self = StObject.set(x, "tagSpecifications", js.Array(value :_*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setUserData(value: String): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
      
      inline def setVpcSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
}
