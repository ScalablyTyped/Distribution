package typings
package atPulumiAwsLib.elasticloadbalancingGetLoadBalancerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoadBalancerResult extends js.Object {
  val accessLogs: atPulumiAwsLib.Anon_BucketIntervalBucketPrefix
  val availabilityZones: js.Array[java.lang.String]
  val connectionDraining: scala.Boolean
  val connectionDrainingTimeout: scala.Double
  val crossZoneLoadBalancing: scala.Boolean
  val dnsName: java.lang.String
  val healthCheck: atPulumiAwsLib.Anon_HealthyThreshold
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val idleTimeout: scala.Double
  val instances: js.Array[java.lang.String]
  val internal: scala.Boolean
  val listeners: js.Array[atPulumiAwsLib.Anon_InstancePortLbPortSslCertificateId]
  val securityGroups: js.Array[java.lang.String]
  val sourceSecurityGroup: java.lang.String
  val sourceSecurityGroupId: java.lang.String
  val subnets: js.Array[java.lang.String]
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val zoneId: java.lang.String
}

