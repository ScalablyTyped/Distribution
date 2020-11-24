package typings.pulumiAws.documentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ssm.DocumentAttachmentsSource
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentArgs extends js.Object {
  
  /**
    * One or more configuration blocks describing attachments sources to a version of a document. Defined below.
    */
  val attachmentsSources: js.UndefOr[Input[js.Array[Input[DocumentAttachmentsSource]]]] = js.native
  
  /**
    * The JSON or YAML content of the document.
    */
  val content: Input[String] = js.native
  
  /**
    * The format of the document. Valid document types include: `JSON` and `YAML`
    */
  val documentFormat: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of the document. Valid document types include: `Automation`, `Command`, `Package`, `Policy`, and `Session`
    */
  val documentType: Input[String] = js.native
  
  /**
    * The name of the document.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Additional Permissions to attach to the document. See Permissions below for details.
    */
  val permissions: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A map of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference (http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html)
    */
  val targetType: js.UndefOr[Input[String]] = js.native
}
object DocumentArgs {
  
  @scala.inline
  def apply(content: Input[String], documentType: Input[String]): DocumentArgs = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], documentType = documentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentArgs]
  }
  
  @scala.inline
  implicit class DocumentArgsOps[Self <: DocumentArgs] (val x: Self) extends AnyVal {
    
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
    def setContent(value: Input[String]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentType(value: Input[String]): Self = this.set("documentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsSourcesVarargs(value: Input[DocumentAttachmentsSource]*): Self = this.set("attachmentsSources", js.Array(value :_*))
    
    @scala.inline
    def setAttachmentsSources(value: Input[js.Array[Input[DocumentAttachmentsSource]]]): Self = this.set("attachmentsSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentsSources: Self = this.set("attachmentsSources", js.undefined)
    
    @scala.inline
    def setDocumentFormat(value: Input[String]): Self = this.set("documentFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentFormat: Self = this.set("documentFormat", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPermissions(value: Input[StringDictionary[Input[String]]]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
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
