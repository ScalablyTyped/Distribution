package typings.atPulumiAws.typesOutputMod.batchNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputeEnvironmentComputeResources extends js.Object {
  /**
    * Integer of minimum percentage that a Spot Instance price must be when compared with the On-Demand price for that instance type before instances are launched. For example, if your bid percentage is 20% (`20`), then the Spot price must be below 20% of the current On-Demand price for that EC2 instance. This parameter is required for SPOT compute environments.
    */
  var bidPercentage: js.UndefOr[Double] = js.undefined
  /**
    * The desired number of EC2 vCPUS in the compute environment.
    */
  var desiredVcpus: js.UndefOr[Double] = js.undefined
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
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * The type of compute environment. Valid items are `EC2` or `SPOT`.
    */
  var `type`: String
}

object ComputeEnvironmentComputeResources {
  @scala.inline
  def apply(
    instanceRole: String,
    instanceTypes: js.Array[String],
    maxVcpus: Double,
    minVcpus: Double,
    securityGroupIds: js.Array[String],
    subnets: js.Array[String],
    `type`: String,
    bidPercentage: Int | Double = null,
    desiredVcpus: Int | Double = null,
    ec2KeyPair: String = null,
    imageId: String = null,
    launchTemplate: ComputeEnvironmentComputeResourcesLaunchTemplate = null,
    spotIamFleetRole: String = null,
    tags: StringDictionary[js.Any] = null
  ): ComputeEnvironmentComputeResources = {
    val __obj = js.Dynamic.literal(instanceRole = instanceRole, instanceTypes = instanceTypes, maxVcpus = maxVcpus, minVcpus = minVcpus, securityGroupIds = securityGroupIds, subnets = subnets)
    __obj.updateDynamic("type")(`type`)
    if (bidPercentage != null) __obj.updateDynamic("bidPercentage")(bidPercentage.asInstanceOf[js.Any])
    if (desiredVcpus != null) __obj.updateDynamic("desiredVcpus")(desiredVcpus.asInstanceOf[js.Any])
    if (ec2KeyPair != null) __obj.updateDynamic("ec2KeyPair")(ec2KeyPair)
    if (imageId != null) __obj.updateDynamic("imageId")(imageId)
    if (launchTemplate != null) __obj.updateDynamic("launchTemplate")(launchTemplate)
    if (spotIamFleetRole != null) __obj.updateDynamic("spotIamFleetRole")(spotIamFleetRole)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ComputeEnvironmentComputeResources]
  }
}

