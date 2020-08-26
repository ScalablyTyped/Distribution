package typings.pulumiAws.getGroupMod

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
    * The provider-assigned unique ID for this managed resource.
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
  @scala.inline
  implicit class GetGroupResultOps[Self <: GetGroupResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("availabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: js.Array[String]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultCooldown(value: Double): Self = this.set("defaultCooldown", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesiredCapacity(value: Double): Self = this.set("desiredCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setHealthCheckGracePeriod(value: Double): Self = this.set("healthCheckGracePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def setHealthCheckType(value: String): Self = this.set("healthCheckType", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLaunchConfiguration(value: String): Self = this.set("launchConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBalancersVarargs(value: String*): Self = this.set("loadBalancers", js.Array(value :_*))
    @scala.inline
    def setLoadBalancers(value: js.Array[String]): Self = this.set("loadBalancers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewInstancesProtectedFromScaleIn(value: Boolean): Self = this.set("newInstancesProtectedFromScaleIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlacementGroup(value: String): Self = this.set("placementGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceLinkedRoleArn(value: String): Self = this.set("serviceLinkedRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetGroupArnsVarargs(value: String*): Self = this.set("targetGroupArns", js.Array(value :_*))
    @scala.inline
    def setTargetGroupArns(value: js.Array[String]): Self = this.set("targetGroupArns", value.asInstanceOf[js.Any])
    @scala.inline
    def setTerminationPoliciesVarargs(value: String*): Self = this.set("terminationPolicies", js.Array(value :_*))
    @scala.inline
    def setTerminationPolicies(value: js.Array[String]): Self = this.set("terminationPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcZoneIdentifier(value: String): Self = this.set("vpcZoneIdentifier", value.asInstanceOf[js.Any])
  }
  
}

