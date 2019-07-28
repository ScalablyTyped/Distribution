package typings.atPulumiAws.autoscalingGetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Auto Scaling group.
    */
  val arn: String
  /**
    * One or more Availability Zones for the group.
    */
  val availabilityZones: js.Array[String]
  val defaultCooldown: Double
  /**
    * The desired size of the group.
    */
  val desiredCapacity: Double
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service.
    */
  val healthCheckGracePeriod: Double
  /**
    * The service to use for the health checks. The valid values are EC2 and ELB.
    */
  val healthCheckType: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The name of the associated launch configuration.
    */
  val launchConfiguration: String
  /**
    * One or more load balancers associated with the group.
    */
  val loadBalancers: js.Array[String]
  /**
    * The maximum size of the group.
    */
  val maxSize: Double
  /**
    * The minimum size of the group.
    */
  val minSize: Double
  /**
    * The name of the Auto Scaling group.
    */
  val name: String
  val newInstancesProtectedFromScaleIn: Boolean
  /**
    * The name of the placement group into which to launch your instances, if any. For more information, see Placement Groups (http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the Amazon Elastic Compute Cloud User Guide.
    */
  val placementGroup: String
  /**
    * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf.
    */
  val serviceLinkedRoleArn: String
  /**
    * The current state of the group when DeleteAutoScalingGroup is in progress.
    */
  val status: String
  /**
    * The Amazon Resource Names (ARN) of the target groups for your load balancer.
    */
  val targetGroupArns: js.Array[String]
  /**
    * The termination policies for the group.
    */
  val terminationPolicies: js.Array[String]
  /**
    * VPC ID for the group.
    */
  val vpcZoneIdentifier: String
}

object GetGroupResult {
  @scala.inline
  def apply(
    arn: String,
    availabilityZones: js.Array[String],
    defaultCooldown: Double,
    desiredCapacity: Double,
    healthCheckGracePeriod: Double,
    healthCheckType: String,
    id: String,
    launchConfiguration: String,
    loadBalancers: js.Array[String],
    maxSize: Double,
    minSize: Double,
    name: String,
    newInstancesProtectedFromScaleIn: Boolean,
    placementGroup: String,
    serviceLinkedRoleArn: String,
    status: String,
    targetGroupArns: js.Array[String],
    terminationPolicies: js.Array[String],
    vpcZoneIdentifier: String
  ): GetGroupResult = {
    val __obj = js.Dynamic.literal(arn = arn, availabilityZones = availabilityZones, defaultCooldown = defaultCooldown, desiredCapacity = desiredCapacity, healthCheckGracePeriod = healthCheckGracePeriod, healthCheckType = healthCheckType, id = id, launchConfiguration = launchConfiguration, loadBalancers = loadBalancers, maxSize = maxSize, minSize = minSize, name = name, newInstancesProtectedFromScaleIn = newInstancesProtectedFromScaleIn, placementGroup = placementGroup, serviceLinkedRoleArn = serviceLinkedRoleArn, status = status, targetGroupArns = targetGroupArns, terminationPolicies = terminationPolicies, vpcZoneIdentifier = vpcZoneIdentifier)
  
    __obj.asInstanceOf[GetGroupResult]
  }
}

