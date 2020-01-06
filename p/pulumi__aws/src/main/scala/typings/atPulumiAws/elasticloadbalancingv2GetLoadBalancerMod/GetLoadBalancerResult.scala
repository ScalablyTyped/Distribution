package typings.atPulumiAws.elasticloadbalancingv2GetLoadBalancerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.elasticloadbalancingv2.GetLoadBalancerAccessLogs
import typings.atPulumiAws.typesOutputMod.elasticloadbalancingv2.GetLoadBalancerSubnetMapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerResult extends js.Object {
  val accessLogs: GetLoadBalancerAccessLogs = js.native
  val arn: String = js.native
  val arnSuffix: String = js.native
  val dnsName: String = js.native
  val enableDeletionProtection: Boolean = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val idleTimeout: Double = js.native
  val internal: Boolean = js.native
  val loadBalancerType: String = js.native
  val name: String = js.native
  val securityGroups: js.Array[String] = js.native
  val subnetMappings: js.Array[GetLoadBalancerSubnetMapping] = js.native
  val subnets: js.Array[String] = js.native
  val tags: StringDictionary[js.Any] = js.native
  val vpcId: String = js.native
  val zoneId: String = js.native
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
    val __obj = js.Dynamic.literal(accessLogs = accessLogs.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], arnSuffix = arnSuffix.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], enableDeletionProtection = enableDeletionProtection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], idleTimeout = idleTimeout.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], loadBalancerType = loadBalancerType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], subnetMappings = subnetMappings.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLoadBalancerResult]
  }
}

