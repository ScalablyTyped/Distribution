package typings.pulumiAws.documentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ssm.DocumentAttachmentsSource
import typings.pulumiAws.inputMod.ssm.DocumentParameter
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentState extends js.Object {
  
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * One or more configuration blocks describing attachments sources to a version of a document. Defined below.
    */
  val attachmentsSources: js.UndefOr[Input[js.Array[Input[DocumentAttachmentsSource]]]] = js.native
  
  /**
    * The JSON or YAML content of the document.
    */
  val content: js.UndefOr[Input[String]] = js.native
  
  /**
    * The date the document was created.
    */
  val createdDate: js.UndefOr[Input[String]] = js.native
  
  /**
    * The default version of the document.
    */
  val defaultVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The description of the document.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The format of the document. Valid document types include: `JSON` and `YAML`
    */
  val documentFormat: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
    */
  val documentType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The document version.
    */
  val documentVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The sha1 or sha256 of the document content
    */
  val hash: js.UndefOr[Input[String]] = js.native
  
  /**
    * "Sha1" "Sha256". The hashing algorithm used when hashing the content.
    */
  val hashType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The latest version of the document.
    */
  val latestVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the document.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The AWS user account of the person who created the document.
    */
  val owner: js.UndefOr[Input[String]] = js.native
  
  /**
    * The parameters that are available to this document.
    */
  val parameters: js.UndefOr[Input[js.Array[Input[DocumentParameter]]]] = js.native
  
  /**
    * Additional Permissions to attach to the document. See Permissions below for details.
    */
  val permissions: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A list of OS platforms compatible with this SSM document, either "Windows" or "Linux".
    */
  val platformTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The schema version of the document.
    */
  val schemaVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * "Creating", "Active" or "Deleting". The current status of the document.
    */
  val status: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
    */
  val targetType: js.UndefOr[Input[String]] = js.native
}
object DocumentState {
  
  @scala.inline
  def apply(): DocumentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentState]
  }
  
  @scala.inline
  implicit class DocumentStateOps[Self <: DocumentState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAttachmentsSourcesVarargs(value: Input[DocumentAttachmentsSource]*): Self = this.set("attachmentsSources", js.Array(value :_*))
    
    @scala.inline
    def setAttachmentsSources(value: Input[js.Array[Input[DocumentAttachmentsSource]]]): Self = this.set("attachmentsSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentsSources: Self = this.set("attachmentsSources", js.undefined)
    
    @scala.inline
    def setContent(value: Input[String]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Input[String]): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setDefaultVersion(value: Input[String]): Self = this.set("defaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultVersion: Self = this.set("defaultVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDocumentFormat(value: Input[String]): Self = this.set("documentFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentFormat: Self = this.set("documentFormat", js.undefined)
    
    @scala.inline
    def setDocumentType(value: Input[String]): Self = this.set("documentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentType: Self = this.set("documentType", js.undefined)
    
    @scala.inline
    def setDocumentVersion(value: Input[String]): Self = this.set("documentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentVersion: Self = this.set("documentVersion", js.undefined)
    
    @scala.inline
    def setHash(value: Input[String]): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setHashType(value: Input[String]): Self = this.set("hashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashType: Self = this.set("hashType", js.undefined)
    
    @scala.inline
    def setLatestVersion(value: Input[String]): Self = this.set("latestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestVersion: Self = this.set("latestVersion", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwner(value: Input[String]): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: Input[DocumentParameter]*): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: Input[js.Array[Input[DocumentParameter]]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setPermissions(value: Input[StringDictionary[Input[String]]]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setPlatformTypesVarargs(value: Input[String]*): Self = this.set("platformTypes", js.Array(value :_*))
    
    @scala.inline
    def setPlatformTypes(value: Input[js.Array[Input[String]]]): Self = this.set("platformTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformTypes: Self = this.set("platformTypes", js.undefined)
    
    @scala.inline
    def setSchemaVersion(value: Input[String]): Self = this.set("schemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersion: Self = this.set("schemaVersion", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTargetType(value: Input[String]): Self = this.set("targetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetType: Self = this.set("targetType", js.undefined)
  }
}
