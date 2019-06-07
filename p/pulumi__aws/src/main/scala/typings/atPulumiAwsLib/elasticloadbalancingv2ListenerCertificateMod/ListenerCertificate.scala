package typings
package atPulumiAwsLib.elasticloadbalancingv2ListenerCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancingv2/listenerCertificate", "ListenerCertificate")
@js.native
class ListenerCertificate protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ListenerCertificate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ListenerCertificateArgs) = this()
  def this(name: java.lang.String, args: ListenerCertificateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the certificate to attach to the listener.
    */
  val certificateArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ARN of the listener to which to attach the certificate.
    */
  val listenerArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticloadbalancingv2/listenerCertificate", "ListenerCertificate")
@js.native
object ListenerCertificate extends js.Object {
  /**
    * Get an existing ListenerCertificate resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificateState
  ): atPulumiAwsLib.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificateState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elasticloadbalancingv2ListenerCertificateMod.ListenerCertificate = js.native
  /**
    * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listenerCertificate.ListenerCertificate */ scala.Boolean = js.native
}

