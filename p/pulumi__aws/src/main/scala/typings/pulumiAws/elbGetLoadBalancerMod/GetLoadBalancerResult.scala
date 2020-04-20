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
    * id is the provider-assigned unique ID for this managed resource.
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
  val tags: StringDictionary[js.Any] = js.native
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
    tags: StringDictionary[js.Any],
    zoneId: String
  ): GetLoadBalancerResult = {
    val __obj = js.Dynamic.literal(accessLogs = accessLogs.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], connectionDraining = connectionDraining.asInstanceOf[js.Any], connectionDrainingTimeout = connectionDrainingTimeout.asInstanceOf[js.Any], crossZoneLoadBalancing = crossZoneLoadBalancing.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], idleTimeout = idleTimeout.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], sourceSecurityGroup = sourceSecurityGroup.asInstanceOf[js.Any], sourceSecurityGroupId = sourceSecurityGroupId.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerResult]
  }
}

