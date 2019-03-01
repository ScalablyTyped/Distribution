package typings
package atPulumiAwsLib.elasticloadbalancingv2GetLoadBalancerMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessLogs")(accessLogs)
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("arnSuffix")(arnSuffix)
    __obj.updateDynamic("dnsName")(dnsName)
    __obj.updateDynamic("enableDeletionProtection")(enableDeletionProtection)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("idleTimeout")(idleTimeout)
    __obj.updateDynamic("internal")(internal)
    __obj.updateDynamic("loadBalancerType")(loadBalancerType)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("securityGroups")(securityGroups)
    __obj.updateDynamic("subnetMappings")(subnetMappings)
    __obj.updateDynamic("subnets")(subnets)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("vpcId")(vpcId)
    __obj.updateDynamic("zoneId")(zoneId)
    __obj.asInstanceOf[GetLoadBalancerResult]
  }
}

