package typings
package atPulumiAwsLib.ssmDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm/document", "Document")
@js.native
class Document protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a Document resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: DocumentArgs) = this()
  def this(name: java.lang.String, args: DocumentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val arn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The JSON or YAML content of the document.
    */
  val content: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The date the document was created.
    */
  val createdDate: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The default version of the document.
    */
  val defaultVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The description of the document.
    */
  val description: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The format of the document. Valid document types include: `JSON` and `YAML`
    */
  val documentFormat: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The type of the document. Valid document types include: `Command`, `Policy`, `Automation` and `Session`
    */
  val documentType: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The sha1 or sha256 of the document content
    */
  val hash: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * "Sha1" "Sha256". The hashing algorithm used when hashing the content.
    */
  val hashType: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The latest version of the document.
    */
  val latestVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the document.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The AWS user account of the person who created the document.
    */
  val owner: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The parameters that are available to this document.
    */
  val parameters: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiAwsLib.Anon_TypeDescription]] = js.native
  /**
    * Additional Permissions to attach to the document. See Permissions below for details.
    */
  val permissions: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_TypeAccountIds]] = js.native
  /**
    * A list of OS platforms compatible with this SSM document, either "Windows" or "Linux".
    */
  val platformTypes: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The schema version of the document.
    */
  val schemaVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * "Creating", "Active" or "Deleting". The current status of the document.
    */
  val status: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
}

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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ssmDocumentMod.Document = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ssmDocumentMod.DocumentState
  ): atPulumiAwsLib.ssmDocumentMod.Document = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ssmDocumentMod.DocumentState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ssmDocumentMod.Document = js.native
}

