package typings.pulumiAws.elbGetLoadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.elb.GetLoadBalancerAccessLogs
import typings.pulumiAws.outputMod.elb.GetLoadBalancerHealthCheck
import typings.pulumiAws.outputMod.elb.GetLoadBalancerListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerResult extends js.Object {
  val accessLogs: GetLoadBalancerAccessLogs = js.native
  val arn: String = js.native
  val availabilityZones: js.Array[String] = js.native
  val connectionDraining: Boolean = js.native
  val connectionDrainingTimeout: Double = js.native
  val crossZoneLoadBalancing: Boolean = js.native
  val dnsName: String = js.native
  val healthCheck: GetLoadBalancerHealthCheck = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val idleTimeout: Double = js.native
  val instances: js.Array[String] = js.native
  val internal: Boolean = js.native
  val listeners: js.Array[GetLoadBalancerListener] = js.native
  val name: String = js.native
  val securityGroups: js.Array[String] = js.native
  val sourceSecurityGroup: String = js.native
  val sourceSecurityGroupId: String = js.native
  val subnets: js.Array[String] = js.native
  val tags: StringDictionary[String] = js.native
  val zoneId: String = js.native
}

object GetLoadBalancerResult {
  @scala.inline
  def apply(
    accessLogs: GetLoadBalancerAccessLogs,
    arn: String,
    availabilityZones: js.Array[String],
    connectionDraining: Boolean,
    connectionDrainingTimeout: Double,
    crossZoneLoadBalancing: Boolean,
    dnsName: String,
    healthCheck: GetLoadBalancerHealthCheck,
    id: String,
    idleTimeout: Double,
    instances: js.Array[String],
    internal: Boolean,
    listeners: js.Array[GetLoadBalancerListener],
    name: String,
    securityGroups: js.Array[String],
    sourceSecurityGroup: String,
    sourceSecurityGroupId: String,
    subnets: js.Array[String],
    tags: StringDictionary[String],
    zoneId: String
  ): GetLoadBalancerResult = {
    val __obj = js.Dynamic.literal(accessLogs = accessLogs.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], connectionDraining = connectionDraining.asInstanceOf[js.Any], connectionDrainingTimeout = connectionDrainingTimeout.asInstanceOf[js.Any], crossZoneLoadBalancing = crossZoneLoadBalancing.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], idleTimeout = idleTimeout.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], sourceSecurityGroup = sourceSecurityGroup.asInstanceOf[js.Any], sourceSecurityGroupId = sourceSecurityGroupId.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerResult]
  }
  @scala.inline
  implicit class GetLoadBalancerResultOps[Self <: GetLoadBalancerResult] (val x: Self) extends AnyVal {
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
    def setAccessLogs(value: GetLoadBalancerAccessLogs): Self = this.set("accessLogs", value.asInstanceOf[js.Any])
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("availabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: js.Array[String]): Self = this.set("availabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionDraining(value: Boolean): Self = this.set("connectionDraining", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionDrainingTimeout(value: Double): Self = this.set("connectionDrainingTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrossZoneLoadBalancing(value: Boolean): Self = this.set("crossZoneLoadBalancing", value.asInstanceOf[js.Any])
    @scala.inline
    def setDnsName(value: String): Self = this.set("dnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHealthCheck(value: GetLoadBalancerHealthCheck): Self = this.set("healthCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdleTimeout(value: Double): Self = this.set("idleTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstancesVarargs(value: String*): Self = this.set("instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: js.Array[String]): Self = this.set("instances", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternal(value: Boolean): Self = this.set("internal", value.asInstanceOf[js.Any])
    @scala.inline
    def setListenersVarargs(value: GetLoadBalancerListener*): Self = this.set("listeners", js.Array(value :_*))
    @scala.inline
    def setListeners(value: js.Array[GetLoadBalancerListener]): Self = this.set("listeners", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityGroupsVarargs(value: String*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: js.Array[String]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceSecurityGroup(value: String): Self = this.set("sourceSecurityGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceSecurityGroupId(value: String): Self = this.set("sourceSecurityGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetsVarargs(value: String*): Self = this.set("subnets", js.Array(value :_*))
    @scala.inline
    def setSubnets(value: js.Array[String]): Self = this.set("subnets", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoneId(value: String): Self = this.set("zoneId", value.asInstanceOf[js.Any])
  }
  
}

