package typings.atPulumiAws.autoscalingGetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Auto Scaling group.
    */
  val arn: String = js.native
  /**
    * One or more Availability Zones for the group.
    */
  val availabilityZones: js.Array[String] = js.native
  val defaultCooldown: Double = js.native
  /**
    * The desired size of the group.
    */
  val desiredCapacity: Double = js.native
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service.
    */
  val healthCheckGracePeriod: Double = js.native
  /**
    * The service to use for the health checks. The valid values are EC2 and ELB.
    */
  val healthCheckType: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The name of the associated launch configuration.
    */
  val launchConfiguration: String = js.native
  /**
    * One or more load balancers associated with the group.
    */
  val loadBalancers: js.Array[String] = js.native
  /**
    * The maximum size of the group.
    */
  val maxSize: Double = js.native
  /**
    * The minimum size of the group.
    */
  val minSize: Double = js.native
  /**
    * The name of the Auto Scaling group.
    */
  val name: String = js.native
  val newInstancesProtectedFromScaleIn: Boolean = js.native
  /**
    * The name of the placement group into which to launch your instances, if any. For more information, see Placement Groups (http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the Amazon Elastic Compute Cloud User Guide.
    */
  val placementGroup: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf.
    */
  val serviceLinkedRoleArn: String = js.native
  /**
    * The current state of the group when DeleteAutoScalingGroup is in progress.
    */
  val status: String = js.native
  /**
    * The Amazon Resource Names (ARN) of the target groups for your load balancer.
    */
  val targetGroupArns: js.Array[String] = js.native
  /**
    * The termination policies for the group.
    */
  val terminationPolicies: js.Array[String] = js.native
  /**
    * VPC ID for the group.
    */
  val vpcZoneIdentifier: String = js.native
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
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], defaultCooldown = defaultCooldown.asInstanceOf[js.Any], desiredCapacity = desiredCapacity.asInstanceOf[js.Any], healthCheckGracePeriod = healthCheckGracePeriod.asInstanceOf[js.Any], healthCheckType = healthCheckType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], launchConfiguration = launchConfiguration.asInstanceOf[js.Any], loadBalancers = loadBalancers.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newInstancesProtectedFromScaleIn = newInstancesProtectedFromScaleIn.asInstanceOf[js.Any], placementGroup = placementGroup.asInstanceOf[js.Any], serviceLinkedRoleArn = serviceLinkedRoleArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], targetGroupArns = targetGroupArns.asInstanceOf[js.Any], terminationPolicies = terminationPolicies.asInstanceOf[js.Any], vpcZoneIdentifier = vpcZoneIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetGroupResult]
  }
}

