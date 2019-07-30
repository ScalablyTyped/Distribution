package typings.atPulumiAws.lbMod

import typings.atPulumiAws.lbListenerCertificateMod.ListenerCertificateArgs
import typings.atPulumiAws.lbListenerCertificateMod.ListenerCertificateState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lb", "ListenerCertificate")
@js.native
class ListenerCertificate protected ()
  extends typings.atPulumiAws.lbListenerCertificateMod.ListenerCertificate {
  /**
    * Create a ListenerCertificate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ListenerCertificateArgs) = this()
  def this(name: String, args: ListenerCertificateArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/lb", "ListenerCertificate")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.lbListenerCertificateMod.ListenerCertificate = js.native
  def get(name: String, id: Input[ID], state: ListenerCertificateState): typings.atPulumiAws.lbListenerCertificateMod.ListenerCertificate = js.native
  def get(name: String, id: Input[ID], state: ListenerCertificateState, opts: CustomResourceOptions): typings.atPulumiAws.lbListenerCertificateMod.ListenerCertificate = js.native
  /**
    * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/listenerCertificate.ListenerCertificate */ Boolean = js.native
}

