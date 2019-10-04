package typings.atPulumiAws.elbGetLoadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.elbNs.GetLoadBalancerAccessLogs
import typings.atPulumiAws.typesOutputMod.elbNs.GetLoadBalancerHealthCheck
import typings.atPulumiAws.typesOutputMod.elbNs.GetLoadBalancerListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerResult extends js.Object {
  val accessLogs: GetLoadBalancerAccessLogs
  val availabilityZones: js.Array[String]
  val connectionDraining: Boolean
  val connectionDrainingTimeout: Double
  val crossZoneLoadBalancing: Boolean
  val dnsName: String
  val healthCheck: GetLoadBalancerHealthCheck
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val idleTimeout: Double
  val instances: js.Array[String]
  val internal: Boolean
  val listeners: js.Array[GetLoadBalancerListener]
  val name: String
  val securityGroups: js.Array[String]
  val sourceSecurityGroup: String
  val sourceSecurityGroupId: String
  val subnets: js.Array[String]
  val tags: StringDictionary[js.Any]
  val zoneId: String
}

object GetLoadBalancerResult {
  @scala.inline
  def apply(
    accessLogs: GetLoadBalancerAccessLogs,
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
    val __obj = js.Dynamic.literal(accessLogs = accessLogs, availabilityZones = availabilityZones, connectionDraining = connectionDraining, connectionDrainingTimeout = connectionDrainingTimeout, crossZoneLoadBalancing = crossZoneLoadBalancing, dnsName = dnsName, healthCheck = healthCheck, id = id, idleTimeout = idleTimeout, instances = instances, internal = internal, listeners = listeners, name = name, securityGroups = securityGroups, sourceSecurityGroup = sourceSecurityGroup, sourceSecurityGroupId = sourceSecurityGroupId, subnets = subnets, tags = tags, zoneId = zoneId)
  
    __obj.asInstanceOf[GetLoadBalancerResult]
  }
}

