package typings.atPulumiAws.ssmDocumentMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AccountIdsType
import typings.atPulumiAws.Anon_DefaultValueDescription
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm/document", "Document")
@js.native
class Document protected () extends CustomResource {
  /**
    * Create a Document resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DocumentArgs) = this()
  def this(name: String, args: DocumentArgs, opts: CustomResourceOptions) = this()
  val arn: Output[String] = js.native
  /**
    * The JSON or YAML content of the document.
    */
  val content: Output[String] = js.native
  /**
    * The date the document was created.
    */
  val createdDate: Output[String] = js.native
  /**
    * The default version of the document.
    */
  val defaultVersion: Output[String] = js.native
  /**
    * The description of the document.
    */
  val description: Output[String] = js.native
  /**
    * The format of the document. Valid document types include: `JSON` and `YAML`
    */
  val documentFormat: Output[js.UndefOr[String]] = js.native
  /**
    * The type of the document. Valid document types include: `Command`, `Policy`, `Automation` and `Session`
    */
  val documentType: Output[String] = js.native
  /**
    * The sha1 or sha256 of the document content
    */
  val hash: Output[String] = js.native
  /**
    * "Sha1" "Sha256". The hashing algorithm used when hashing the content.
    */
  val hashType: Output[String] = js.native
  /**
    * The latest version of the document.
    */
  val latestVersion: Output[String] = js.native
  /**
    * The name of the document.
    */
  val name: Output[String] = js.native
  /**
    * The AWS user account of the person who created the document.
    */
  val owner: Output[String] = js.native
  /**
    * The parameters that are available to this document.
    */
  val parameters: Output[js.Array[Anon_DefaultValueDescription]] = js.native
  /**
    * Additional Permissions to attach to the document. See Permissions below for details.
    */
  val permissions: Output[js.UndefOr[Anon_AccountIdsType]] = js.native
  /**
    * A list of OS platforms compatible with this SSM document, either "Windows" or "Linux".
    */
  val platformTypes: Output[js.Array[String]] = js.native
  /**
    * The schema version of the document.
    */
  val schemaVersion: Output[String] = js.native
  /**
    * "Creating", "Active" or "Deleting". The current status of the document.
    */
  val status: Output[String] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ssm/document", "Document")
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
  def get(name: String, id: Input[ID]): Document = js.native
  def get(name: String, id: Input[ID], state: DocumentState): Document = js.native
  def get(name: String, id: Input[ID], state: DocumentState, opts: CustomResourceOptions): Document = js.native
  /**
    * Returns true if the given object is an instance of Document.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/document.Document */ Boolean = js.native
}

