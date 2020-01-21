package typings.pulumiAws.lbListenerMod

import typings.pulumiAws.inputMod.lb.ListenerDefaultAction
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerState extends js.Object {
  /**
    * The ARN of the listener (matches `id`)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the [`aws.lb.ListenerCertificate` resource](https://www.terraform.io/docs/providers/aws/r/lb_listener_certificate.html).
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * An Action block. Action blocks are documented below.
    */
  val defaultActions: js.UndefOr[Input[js.Array[Input[ListenerDefaultAction]]]] = js.native
  /**
    * The ARN of the load balancer.
    */
  val loadBalancerArn: js.UndefOr[Input[String]] = js.native
  /**
    * The port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  /**
    * The protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
    */
  val protocol: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
    */
  val sslPolicy: js.UndefOr[Input[String]] = js.native
}

object ListenerState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    certificateArn: Input[String] = null,
    defaultActions: Input[js.Array[Input[ListenerDefaultAction]]] = null,
    loadBalancerArn: Input[String] = null,
    port: Input[Double] = null,
    protocol: Input[String] = null,
    sslPolicy: Input[String] = null
  ): ListenerState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (defaultActions != null) __obj.updateDynamic("defaultActions")(defaultActions.asInstanceOf[js.Any])
    if (loadBalancerArn != null) __obj.updateDynamic("loadBalancerArn")(loadBalancerArn.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (sslPolicy != null) __obj.updateDynamic("sslPolicy")(sslPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerState]
  }
}

