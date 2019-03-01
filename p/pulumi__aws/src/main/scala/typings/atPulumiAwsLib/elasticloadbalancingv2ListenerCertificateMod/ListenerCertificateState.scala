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

object ListenerCertificateState {
  @scala.inline
  def apply(
    certificateArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    listenerArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ListenerCertificateState = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (listenerArn != null) __obj.updateDynamic("listenerArn")(listenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerCertificateState]
  }
}

