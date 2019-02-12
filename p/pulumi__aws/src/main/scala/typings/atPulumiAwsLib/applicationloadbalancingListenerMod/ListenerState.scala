package typings
package atPulumiAwsLib.applicationloadbalancingListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerState extends js.Object {
  /**
    * The ARN of the listener (matches `id`)
    */
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the [`aws_lb_listener_certificate` resource](https://www.terraform.io/docs/providers/aws/r/lb_listener_certificate.html).
    */
  val certificateArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * An Action block. Action blocks are documented below.
    */
  val defaultAction: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AuthenticateCognitoAuthenticateOidc]
  ] = js.undefined
  /**
    * The ARN of the load balancer.
    */
  val loadBalancerArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
    */
  val port: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
    */
  val protocol: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
    */
  val sslPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

