package typings.atPulumiAws.atPulumiAwsMod.iam

import typings.atPulumiAws.iamServerCertificateMod.ServerCertificateArgs
import typings.atPulumiAws.iamServerCertificateMod.ServerCertificateState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam.ServerCertificate")
@js.native
class ServerCertificate protected ()
  extends typings.atPulumiAws.iamMod.ServerCertificate {
  /**
    * Create a ServerCertificate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ServerCertificateArgs) = this()
  def this(name: String, args: ServerCertificateArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "iam.ServerCertificate")
@js.native
object ServerCertificate extends js.Object {
  /**
    * Get an existing ServerCertificate resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.iamServerCertificateMod.ServerCertificate = js.native
  def get(name: String, id: Input[ID], state: ServerCertificateState): typings.atPulumiAws.iamServerCertificateMod.ServerCertificate = js.native
  def get(name: String, id: Input[ID], state: ServerCertificateState, opts: CustomResourceOptions): typings.atPulumiAws.iamServerCertificateMod.ServerCertificate = js.native
  /**
    * Returns true if the given object is an instance of ServerCertificate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iam/serverCertificate.ServerCertificate */ Boolean = js.native
}

