package typings.atPulumiAws.elasticloadbalancingv2ListenerCertificateMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerCertificateState extends js.Object {
  /**
    * The ARN of the certificate to attach to the listener.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of the listener to which to attach the certificate.
    */
  val listenerArn: js.UndefOr[Input[String]] = js.undefined
}

object ListenerCertificateState {
  @scala.inline
  def apply(certificateArn: Input[String] = null, listenerArn: Input[String] = null): ListenerCertificateState = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (listenerArn != null) __obj.updateDynamic("listenerArn")(listenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerCertificateState]
  }
}

