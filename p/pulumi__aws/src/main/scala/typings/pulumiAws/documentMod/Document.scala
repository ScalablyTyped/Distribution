package typings.pulumiAws.documentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ssm.DocumentAttachmentsSource
import typings.pulumiAws.outputMod.ssm.DocumentParameter
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  val arn: Output_[String] = js.native
  
  /**
    * One or more configuration blocks describing attachments sources to a version of a document. Defined below.
    */
  val attachmentsSources: Output_[js.UndefOr[js.Array[DocumentAttachmentsSource]]] = js.native
  
  /**
    * The JSON or YAML content of the document.
    */
  val content: Output_[String] = js.native
  
  /**
    * The date the document was created.
    */
  val createdDate: Output_[String] = js.native
  
  /**
    * The default version of the document.
    */
  val defaultVersion: Output_[String] = js.native
  
  /**
    * The description of the document.
    */
  val description: Output_[String] = js.native
  
  /**
    * The format of the document. Valid document types include: `JSON` and `YAML`
    */
  val documentFormat: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
    */
  val documentType: Output_[String] = js.native
  
  /**
    * The document version.
    */
  val documentVersion: Output_[String] = js.native
  
  /**
    * The sha1 or sha256 of the document content
    */
  val hash: Output_[String] = js.native
  
  /**
    * "Sha1" "Sha256". The hashing algorithm used when hashing the content.
    */
  val hashType: Output_[String] = js.native
  
  /**
    * The latest version of the document.
    */
  val latestVersion: Output_[String] = js.native
  
  /**
    * The name of the document.
    */
  val name: Output_[String] = js.native
  
  /**
    * The AWS user account of the person who created the document.
    */
  val owner: Output_[String] = js.native
  
  /**
    * The parameters that are available to this document.
    */
  val parameters: Output_[js.Array[DocumentParameter]] = js.native
  
  /**
    * Additional Permissions to attach to the document. See Permissions below for details.
    */
  val permissions: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * A list of OS platforms compatible with this SSM document, either "Windows" or "Linux".
    */
  val platformTypes: Output_[js.Array[String]] = js.native
  
  /**
    * The schema version of the document.
    */
  val schemaVersion: Output_[String] = js.native
  
  /**
    * "Creating", "Active" or "Deleting". The current status of the document.
    */
  val status: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the object.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
    */
  val targetType: Output_[js.UndefOr[String]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Document = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Document = js.native
  def get(name: String, id: Input[ID], state: DocumentState): Document = js.native
  def get(name: String, id: Input[ID], state: DocumentState, opts: CustomResourceOptions): Document = js.native
  
  /**
    * Returns true if the given object is an instance of Document.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/document.Document */ Boolean = js.native
}
