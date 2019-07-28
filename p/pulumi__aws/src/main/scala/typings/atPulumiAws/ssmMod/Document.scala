package typings.atPulumiAws.ssmMod

import typings.atPulumiAws.ssmDocumentMod.DocumentArgs
import typings.atPulumiAws.ssmDocumentMod.DocumentState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm", "Document")
@js.native
class Document protected ()
  extends typings.atPulumiAws.ssmDocumentMod.Document {
  /**
    * Create a Document resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DocumentArgs) = this()
  def this(name: String, args: DocumentArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ssm", "Document")
@js.native
object Document extends js.Object {
  /**
    * Get an existing Document resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ssmDocumentMod.Document = js.native
  def get(name: String, id: Input[ID], state: DocumentState): typings.atPulumiAws.ssmDocumentMod.Document = js.native
  def get(name: String, id: Input[ID], state: DocumentState, opts: CustomResourceOptions): typings.atPulumiAws.ssmDocumentMod.Document = js.native
  /**
    * Returns true if the given object is an instance of Document.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/document.Document */ Boolean = js.native
}

