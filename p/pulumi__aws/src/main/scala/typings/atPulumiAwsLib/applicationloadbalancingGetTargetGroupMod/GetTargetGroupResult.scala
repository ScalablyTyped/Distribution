package typings
package atPulumiAwsLib.applicationloadbalancingGetTargetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTargetGroupResult extends js.Object {
  val arn: java.lang.String
  val arnSuffix: java.lang.String
  val deregistrationDelay: scala.Double
  val healthCheck: atPulumiAwsLib.Anon_PathHealthyThreshold
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val name: java.lang.String
  val port: scala.Double
  val protocol: java.lang.String
  val slowStart: scala.Double
  val stickiness: atPulumiAwsLib.Anon_TypeCookieDuration
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val vpcId: java.lang.String
}

