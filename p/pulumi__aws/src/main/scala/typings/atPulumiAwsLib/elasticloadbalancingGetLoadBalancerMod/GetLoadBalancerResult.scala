package typings
package atPulumiAwsLib.elasticloadbalancingGetLoadBalancerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerResult extends js.Object {
  val accessLogs: atPulumiAwsLib.Anon_BucketBucketPrefix
  val availabilityZones: js.Array[java.lang.String]
  val connectionDraining: scala.Boolean
  val connectionDrainingTimeout: scala.Double
  val crossZoneLoadBalancing: scala.Boolean
  val dnsName: java.lang.String
  val healthCheck: atPulumiAwsLib.Anon_HealthyThresholdIntervalTarget
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val idleTimeout: scala.Double
  val instances: js.Array[java.lang.String]
  val internal: scala.Boolean
  val listeners: js.Array[atPulumiAwsLib.Anon_InstancePort]
  val securityGroups: js.Array[java.lang.String]
  val sourceSecurityGroup: java.lang.String
  val sourceSecurityGroupId: java.lang.String
  val subnets: js.Array[java.lang.String]
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val zoneId: java.lang.String
}

object GetLoadBalancerResult {
  @scala.inline
  def apply(
    accessLogs: atPulumiAwsLib.Anon_BucketBucketPrefix,
    availabilityZones: js.Array[java.lang.String],
    connectionDraining: scala.Boolean,
    connectionDrainingTimeout: scala.Double,
    crossZoneLoadBalancing: scala.Boolean,
    dnsName: java.lang.String,
    healthCheck: atPulumiAwsLib.Anon_HealthyThresholdIntervalTarget,
    id: java.lang.String,
    idleTimeout: scala.Double,
    instances: js.Array[java.lang.String],
    internal: scala.Boolean,
    listeners: js.Array[atPulumiAwsLib.Anon_InstancePort],
    securityGroups: js.Array[java.lang.String],
    sourceSecurityGroup: java.lang.String,
    sourceSecurityGroupId: java.lang.String,
    subnets: js.Array[java.lang.String],
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    zoneId: java.lang.String
  ): GetLoadBalancerResult = {
    val __obj = js.Dynamic.literal(accessLogs = accessLogs, availabilityZones = availabilityZones, connectionDraining = connectionDraining, connectionDrainingTimeout = connectionDrainingTimeout, crossZoneLoadBalancing = crossZoneLoadBalancing, dnsName = dnsName, healthCheck = healthCheck, id = id, idleTimeout = idleTimeout, instances = instances, internal = internal, listeners = listeners, securityGroups = securityGroups, sourceSecurityGroup = sourceSecurityGroup, sourceSecurityGroupId = sourceSecurityGroupId, subnets = subnets, tags = tags, zoneId = zoneId)
  
    __obj.asInstanceOf[GetLoadBalancerResult]
  }
}

