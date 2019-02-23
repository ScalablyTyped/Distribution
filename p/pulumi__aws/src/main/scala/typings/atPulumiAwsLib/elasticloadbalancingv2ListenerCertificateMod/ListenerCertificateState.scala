package typings
package atPulumiAwsLib.elasticloadbalancingv2ListenerCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerCertificateState extends js.Object {
  /**
    * The ARN of the certificate to attach to the listener.
    */
  val certificateArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the listener to which to attach the certificate.
    */
  val listenerArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

