package typings
package atPulumiAwsLib.applicationloadbalancingGetLoadBalancerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerResult extends js.Object {
  val accessLogs: atPulumiAwsLib.Anon_Bucket
  val arn: java.lang.String
  val arnSuffix: java.lang.String
  val dnsName: java.lang.String
  val enableDeletionProtection: scala.Boolean
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val idleTimeout: scala.Double
  val internal: scala.Boolean
  val loadBalancerType: java.lang.String
  val name: java.lang.String
  val securityGroups: js.Array[java.lang.String]
  val subnetMappings: js.Array[atPulumiAwsLib.Anon_AllocationId]
  val subnets: js.Array[java.lang.String]
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val vpcId: java.lang.String
  val zoneId: java.lang.String
}

object GetLoadBalancerResult {
  @scala.inline
  def apply(
    accessLogs: atPulumiAwsLib.Anon_Bucket,
    arn: java.lang.String,
    arnSuffix: java.lang.String,
    dnsName: java.lang.String,
    enableDeletionProtection: scala.Boolean,
    id: java.lang.String,
    idleTimeout: scala.Double,
    internal: scala.Boolean,
    loadBalancerType: java.lang.String,
    name: java.lang.String,
    securityGroups: js.Array[java.lang.String],
    subnetMappings: js.Array[atPulumiAwsLib.Anon_AllocationId],
    subnets: js.Array[java.lang.String],
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    vpcId: java.lang.String,
    zoneId: java.lang.String
  ): GetLoadBalancerResult = {
    val __obj = js.Dynamic.literal(accessLogs = accessLogs, arn = arn, arnSuffix = arnSuffix, dnsName = dnsName, enableDeletionProtection = enableDeletionProtection, id = id, idleTimeout = idleTimeout, internal = internal, loadBalancerType = loadBalancerType, name = name, securityGroups = securityGroups, subnetMappings = subnetMappings, subnets = subnets, tags = tags, vpcId = vpcId, zoneId = zoneId)
  
    __obj.asInstanceOf[GetLoadBalancerResult]
  }
}

