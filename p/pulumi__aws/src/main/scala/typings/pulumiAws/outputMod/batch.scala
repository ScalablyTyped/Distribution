package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batch {
  
  trait ComputeEnvironmentComputeResources extends StObject {
    
    /**
      * The allocation strategy to use for the compute resource in case not enough instances of the best fitting instance type can be allocated. Valid items are `BEST_FIT_PROGRESSIVE`, `SPOT_CAPACITY_OPTIMIZED` or `BEST_FIT`. Defaults to `BEST_FIT`. See [AWS docs](https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html) for details.
      */
    var allocationStrategy: js.UndefOr[String] = js.undefined
    
    /**
      * Integer of minimum percentage that a Spot Instance price must be when compared with the On-Demand price for that instance type before instances are launched. For example, if your bid percentage is 20% (`20`), then the Spot price must be below 20% of the current On-Demand price for that EC2 instance. This parameter is required for SPOT compute environments.
      */
    var bidPercentage: js.UndefOr[Double] = js.undefined
    
    /**
      * The desired number of EC2 vCPUS in the compute environment.
      */
    var desiredVcpus: Double
    
    /**
      * The EC2 key pair that is used for instances launched in the compute environment.
      */
    var ec2KeyPair: js.UndefOr[String] = js.undefined
    
    /**
      * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment.
      */
    var imageId: js.UndefOr[String] = js.undefined
    
    /**
      * The Amazon ECS instance role applied to Amazon EC2 instances in a compute environment.
      */
    var instanceRole: String
    
    /**
      * A list of instance types that may be launched.
      */
    var instanceTypes: js.Array[String]
    
    /**
      * The launch template to use for your compute resources. See details below.
      */
    var launchTemplate: js.UndefOr[ComputeEnvironmentComputeResourcesLaunchTemplate] = js.undefined
    
    /**
      * The maximum number of EC2 vCPUs that an environment can reach.
      */
    var maxVcpus: Double
    
    /**
      * The minimum number of EC2 vCPUs that an environment should maintain.
      */
    var minVcpus: Double
    
    /**
      * A list of EC2 security group that are associated with instances launched in the compute environment.
      */
    var securityGroupIds: js.Array[String]
    
    /**
      * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a SPOT compute environment. This parameter is required for SPOT compute environments.
      */
    var spotIamFleetRole: js.UndefOr[String] = js.undefined
    
    /**
      * A list of VPC subnets into which the compute resources are launched.
      */
    var subnets: js.Array[String]
    
    /**
      * Key-value pair tags to be applied to resources that are launched in the compute environment.
      */
    var tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The type of compute environment. Valid items are `EC2` or `SPOT`.
      */
    var `type`: String
  }
  object ComputeEnvironmentComputeResources {
    
    inline def apply(
      desiredVcpus: Double,
      instanceRole: String,
      instanceTypes: js.Array[String],
      maxVcpus: Double,
      minVcpus: Double,
      securityGroupIds: js.Array[String],
      subnets: js.Array[String],
      `type`: String
    ): ComputeEnvironmentComputeResources = {
      val __obj = js.Dynamic.literal(desiredVcpus = desiredVcpus.asInstanceOf[js.Any], instanceRole = instanceRole.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any], maxVcpus = maxVcpus.asInstanceOf[js.Any], minVcpus = minVcpus.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeEnvironmentComputeResources]
    }
    
    extension [Self <: ComputeEnvironmentComputeResources](x: Self) {
      
      inline def setAllocationStrategy(value: String): Self = StObject.set(x, "allocationStrategy", value.asInstanceOf[js.Any])
      
      inline def setAllocationStrategyUndefined: Self = StObject.set(x, "allocationStrategy", js.undefined)
      
      inline def setBidPercentage(value: Double): Self = StObject.set(x, "bidPercentage", value.asInstanceOf[js.Any])
      
      inline def setBidPercentageUndefined: Self = StObject.set(x, "bidPercentage", js.undefined)
      
      inline def setDesiredVcpus(value: Double): Self = StObject.set(x, "desiredVcpus", value.asInstanceOf[js.Any])
      
      inline def setEc2KeyPair(value: String): Self = StObject.set(x, "ec2KeyPair", value.asInstanceOf[js.Any])
      
      inline def setEc2KeyPairUndefined: Self = StObject.set(x, "ec2KeyPair", js.undefined)
      
      inline def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
      
      inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
      
      inline def setInstanceRole(value: String): Self = StObject.set(x, "instanceRole", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
      
      inline def setInstanceTypesVarargs(value: String*): Self = StObject.set(x, "instanceTypes", js.Array(value :_*))
      
      inline def setLaunchTemplate(value: ComputeEnvironmentComputeResourcesLaunchTemplate): Self = StObject.set(x, "launchTemplate", value.asInstanceOf[js.Any])
      
      inline def setLaunchTemplateUndefined: Self = StObject.set(x, "launchTemplate", js.undefined)
      
      inline def setMaxVcpus(value: Double): Self = StObject.set(x, "maxVcpus", value.asInstanceOf[js.Any])
      
      inline def setMinVcpus(value: Double): Self = StObject.set(x, "minVcpus", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      inline def setSpotIamFleetRole(value: String): Self = StObject.set(x, "spotIamFleetRole", value.asInstanceOf[js.Any])
      
      inline def setSpotIamFleetRoleUndefined: Self = StObject.set(x, "spotIamFleetRole", js.undefined)
      
      inline def setSubnets(value: js.Array[String]): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
      
      inline def setSubnetsVarargs(value: String*): Self = StObject.set(x, "subnets", js.Array(value :_*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComputeEnvironmentComputeResourcesLaunchTemplate extends StObject {
    
    /**
      * ID of the launch template. You must specify either the launch template ID or launch template name in the request, but not both.
      */
    var launchTemplateId: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the launch template.
      */
    var launchTemplateName: js.UndefOr[String] = js.undefined
    
    /**
      * The version number of the launch template. Default: The default version of the launch template.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object ComputeEnvironmentComputeResourcesLaunchTemplate {
    
    inline def apply(): ComputeEnvironmentComputeResourcesLaunchTemplate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComputeEnvironmentComputeResourcesLaunchTemplate]
    }
    
    extension [Self <: ComputeEnvironmentComputeResourcesLaunchTemplate](x: Self) {
      
      inline def setLaunchTemplateId(value: String): Self = StObject.set(x, "launchTemplateId", value.asInstanceOf[js.Any])
      
      inline def setLaunchTemplateIdUndefined: Self = StObject.set(x, "launchTemplateId", js.undefined)
      
      inline def setLaunchTemplateName(value: String): Self = StObject.set(x, "launchTemplateName", value.asInstanceOf[js.Any])
      
      inline def setLaunchTemplateNameUndefined: Self = StObject.set(x, "launchTemplateName", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait GetJobQueueComputeEnvironmentOrder extends StObject {
    
    var computeEnvironment: String
    
    var order: Double
  }
  object GetJobQueueComputeEnvironmentOrder {
    
    inline def apply(computeEnvironment: String, order: Double): GetJobQueueComputeEnvironmentOrder = {
      val __obj = js.Dynamic.literal(computeEnvironment = computeEnvironment.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetJobQueueComputeEnvironmentOrder]
    }
    
    extension [Self <: GetJobQueueComputeEnvironmentOrder](x: Self) {
      
      inline def setComputeEnvironment(value: String): Self = StObject.set(x, "computeEnvironment", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    }
  }
  
  trait JobDefinitionRetryStrategy extends StObject {
    
    /**
      * The number of times to move a job to the `RUNNABLE` status. You may specify between `1` and `10` attempts.
      */
    var attempts: js.UndefOr[Double] = js.undefined
  }
  object JobDefinitionRetryStrategy {
    
    inline def apply(): JobDefinitionRetryStrategy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobDefinitionRetryStrategy]
    }
    
    extension [Self <: JobDefinitionRetryStrategy](x: Self) {
      
      inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      inline def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
    }
  }
  
  trait JobDefinitionTimeout extends StObject {
    
    /**
      * The time duration in seconds after which AWS Batch terminates your jobs if they have not finished. The minimum value for the timeout is `60` seconds.
      */
    var attemptDurationSeconds: js.UndefOr[Double] = js.undefined
  }
  object JobDefinitionTimeout {
    
    inline def apply(): JobDefinitionTimeout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobDefinitionTimeout]
    }
    
    extension [Self <: JobDefinitionTimeout](x: Self) {
      
      inline def setAttemptDurationSeconds(value: Double): Self = StObject.set(x, "attemptDurationSeconds", value.asInstanceOf[js.Any])
      
      inline def setAttemptDurationSecondsUndefined: Self = StObject.set(x, "attemptDurationSeconds", js.undefined)
    }
  }
}
