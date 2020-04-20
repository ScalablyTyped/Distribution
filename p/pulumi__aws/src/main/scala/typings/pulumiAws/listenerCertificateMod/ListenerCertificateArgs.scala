package typings.pulumiAws.listenerCertificateMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerCertificateArgs extends js.Object {
  /**
    * The ARN of the certificate to attach to the listener.
    */
  val certificateArn: Input[String] = js.native
  /**
    * The ARN of the listener to which to attach the certificate.
    */
  val listenerArn: Input[String] = js.native
}

object ListenerCertificateArgs {
  @scala.inline
  def apply(certificateArn: Input[String], listenerArn: Input[String]): ListenerCertificateArgs = {
    val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any], listenerArn = listenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerCertificateArgs]
  }
}

