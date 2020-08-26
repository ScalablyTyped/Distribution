package typings.pulumiAws.principalAssociationMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ram/principalAssociation", "PrincipalAssociation")
@js.native
class PrincipalAssociation protected () extends CustomResource {
  /**
    * Create a PrincipalAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PrincipalAssociationArgs) = this()
  def this(name: String, args: PrincipalAssociationArgs, opts: CustomResourceOptions) = this()
  /**
    * The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ARN, or an AWS Organizations Organization Unit ARN.
    */
  val principal: Output_[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  val resourceShareArn: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ram/principalAssociation", "PrincipalAssociation")
@js.native
object PrincipalAssociation extends js.Object {
  /**
    * Get an existing PrincipalAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): PrincipalAssociation = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PrincipalAssociation = js.native
  def get(name: String, id: Input[ID], state: PrincipalAssociationState): PrincipalAssociation = js.native
  def get(name: String, id: Input[ID], state: PrincipalAssociationState, opts: CustomResourceOptions): PrincipalAssociation = js.native
  /**
    * Returns true if the given object is an instance of PrincipalAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/principalAssociation.PrincipalAssociation */ Boolean = js.native
}

