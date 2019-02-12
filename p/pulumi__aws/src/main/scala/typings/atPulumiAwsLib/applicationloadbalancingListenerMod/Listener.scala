package typings
package atPulumiAwsLib.applicationloadbalancingListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/applicationloadbalancing/listener", "Listener")
@js.native
class Listener protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Listener resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ListenerArgs) = this()
  def this(name: java.lang.String, args: ListenerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the listener (matches `id`)
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the [`aws_lb_listener_certificate` resource](https://www.terraform.io/docs/providers/aws/r/lb_listener_certificate.html).
    */
  val certificateArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * An Action block. Action blocks are documented below.
    */
  val defaultAction: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_AuthenticateCognito] = js.native
  /**
    * The ARN of the load balancer.
    */
  val loadBalancerArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
    */
  val port: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * The protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
    */
  val protocol: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
    */
  val sslPolicy: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/applicationloadbalancing/listener", "Listener")
@js.native
object Listener extends js.Object {
  /**
    * Get an existing Listener resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.applicationloadbalancingListenerMod.Listener = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.applicationloadbalancingListenerMod.ListenerState
  ): atPulumiAwsLib.applicationloadbalancingListenerMod.Listener = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.applicationloadbalancingListenerMod.ListenerState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.applicationloadbalancingListenerMod.Listener = js.native
}

