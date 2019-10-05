package typings.atPulumiAws.lbGetLoadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.lb.GetLoadBalancerAccessLogs
import typings.atPulumiAws.typesOutputMod.lb.GetLoadBalancerSubnetMapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerResult extends js.Object {
  val accessLogs: GetLoadBalancerAccessLogs
  val arn: String
  val arnSuffix: String
  val dnsName: String
  val enableDeletionProtection: Boolean
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val idleTimeout: Double
  val internal: Boolean
  val loadBalancerType: String
  val name: String
  val securityGroups: js.Array[String]
  val subnetMappings: js.Array[GetLoadBalancerSubnetMapping]
  val subnets: js.Array[String]
  val tags: StringDictionary[js.Any]
  val vpcId: String
  val zoneId: String
}

object GetLoadBalancerResult {
  @scala.inline
  def apply(
    accessLogs: GetLoadBalancerAccessLogs,
    arn: String,
    arnSuffix: String,
    dnsName: String,
    enableDeletionProtection: Boolean,
    id: String,
    idleTimeout: Double,
    internal: Boolean,
    loadBalancerType: String,
    name: String,
    securityGroups: js.Array[String],
    subnetMappings: js.Array[GetLoadBalancerSubnetMapping],
    subnets: js.Array[String],
    tags: StringDictionary[js.Any],
    vpcId: String,
    zoneId: String
  ): GetLoadBalancerResult = {
    val __obj = js.Dynamic.literal(accessLogs = accessLogs, arn = arn, arnSuffix = arnSuffix, dnsName = dnsName, enableDeletionProtection = enableDeletionProtection, id = id, idleTimeout = idleTimeout, internal = internal, loadBalancerType = loadBalancerType, name = name, securityGroups = securityGroups, subnetMappings = subnetMappings, subnets = subnets, tags = tags, vpcId = vpcId, zoneId = zoneId)
  
    __obj.asInstanceOf[GetLoadBalancerResult]
  }
}

