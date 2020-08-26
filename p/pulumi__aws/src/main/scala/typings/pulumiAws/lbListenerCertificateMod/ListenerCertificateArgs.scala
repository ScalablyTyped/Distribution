package typings.pulumiAws.lbListenerCertificateMod

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
  @scala.inline
  implicit class ListenerCertificateArgsOps[Self <: ListenerCertificateArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificateArn(value: Input[String]): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setListenerArn(value: Input[String]): Self = this.set("listenerArn", value.asInstanceOf[js.Any])
  }
  
}

