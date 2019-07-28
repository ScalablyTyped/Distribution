package typings.atPulumiAws.elasticloadbalancingv2ListenerMod

import typings.atPulumiAws.Anon_AuthenticateCognitoAuthenticateOidc
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerArgs extends js.Object {
  /**
    * The ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the [`aws_lb_listener_certificate` resource](https://www.terraform.io/docs/providers/aws/r/lb_listener_certificate.html).
    */
  val certificateArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * An Action block. Action blocks are documented below.
    */
  val defaultActions: Input[js.Array[Input[Anon_AuthenticateCognitoAuthenticateOidc]]]
  /**
    * The ARN of the load balancer.
    */
  val loadBalancerArn: Input[String]
  /**
    * The port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
    */
  val port: Input[Double]
  /**
    * The protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
    */
  val protocol: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
    */
  val sslPolicy: js.UndefOr[Input[String]] = js.undefined
}

object ListenerArgs {
  @scala.inline
  def apply(
    defaultActions: Input[js.Array[Input[Anon_AuthenticateCognitoAuthenticateOidc]]],
    loadBalancerArn: Input[String],
    port: Input[Double],
    certificateArn: Input[String] = null,
    protocol: Input[String] = null,
    sslPolicy: Input[String] = null
  ): ListenerArgs = {
    val __obj = js.Dynamic.literal(defaultActions = defaultActions.asInstanceOf[js.Any], loadBalancerArn = loadBalancerArn.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (sslPolicy != null) __obj.updateDynamic("sslPolicy")(sslPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerArgs]
  }
}

