package typings
package atPulumiAwsLib.applicationloadbalancingListenerCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerCertificateArgs extends js.Object {
  /**
    * The ARN of the certificate to attach to the listener.
    */
  val certificateArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ARN of the listener to which to attach the certificate.
    */
  val listenerArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object ListenerCertificateArgs {
  @scala.inline
  def apply(
    certificateArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    listenerArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): ListenerCertificateArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    __obj.updateDynamic("listenerArn")(listenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerCertificateArgs]
  }
}

