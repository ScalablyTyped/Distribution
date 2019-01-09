package typings
package atPulumiAwsLib.applicationloadbalancingGetListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetListenerResult extends js.Object {
  val arn: java.lang.String
  val certificateArn: java.lang.String
  val defaultActions: js.Array[atPulumiAwsLib.Anon_AuthenticateCognitos]
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val loadBalancerArn: java.lang.String
  val port: scala.Double
  val protocol: java.lang.String
  val sslPolicy: java.lang.String
}

