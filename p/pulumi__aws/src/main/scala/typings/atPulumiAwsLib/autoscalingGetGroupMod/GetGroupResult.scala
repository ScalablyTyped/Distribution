package typings
package atPulumiAwsLib.autoscalingGetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Auto Scaling group.
    */
  val arn: java.lang.String
  /**
    * One or more Availability Zones for the group.
    */
  val availabilityZones: js.Array[java.lang.String]
  val defaultCooldown: scala.Double
  /**
    * The desired size of the group.
    */
  val desiredCapacity: scala.Double
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service.
    */
  val healthCheckGracePeriod: scala.Double
  /**
    * The service to use for the health checks. The valid values are EC2 and ELB.
    */
  val healthCheckType: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The name of the associated launch configuration.
    */
  val launchConfiguration: java.lang.String
  /**
    * One or more load balancers associated with the group.
    */
  val loadBalancers: js.Array[java.lang.String]
  /**
    * The maximum size of the group.
    */
  val maxSize: scala.Double
  /**
    * The minimum size of the group.
    */
  val minSize: scala.Double
  val newInstancesProtectedFromScaleIn: scala.Boolean
  /**
    * The name of the placement group into which to launch your instances, if any. For more information, see Placement Groups (http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html) in the Amazon Elastic Compute Cloud User Guide.
    */
  val placementGroup: java.lang.String
  /**
    * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf.
    */
  val serviceLinkedRoleArn: java.lang.String
  /**
    * The current state of the group when DeleteAutoScalingGroup is in progress.
    */
  val status: java.lang.String
  /**
    * The Amazon Resource Names (ARN) of the target groups for your load balancer.
    */
  val targetGroupArns: js.Array[java.lang.String]
  /**
    * The termination policies for the group.
    */
  val terminationPolicies: js.Array[java.lang.String]
  /**
    * VPC ID for the group.
    */
  val vpcZoneIdentifier: java.lang.String
}

