package typings.pulumiAws.getDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDocumentResult extends js.Object {
  
  /**
    * The ARN of the document.
    */
  val arn: String = js.native
  
  /**
    * The contents of the document.
    */
  val content: String = js.native
  
  val documentFormat: js.UndefOr[String] = js.native
  
  /**
    * The type of the document.
    */
  val documentType: String = js.native
  
  val documentVersion: js.UndefOr[String] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val name: String = js.native
}
object GetDocumentResult {
  
  @scala.inline
  def apply(arn: String, content: String, documentType: String, id: String, name: String): GetDocumentResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], documentType = documentType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentResult]
  }
  
  @scala.inline
  implicit class GetDocumentResultOps[Self <: GetDocumentResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentType(value: String): Self = this.set("documentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentFormat(value: String): Self = this.set("documentFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentFormat: Self = this.set("documentFormat", js.undefined)
    
    @scala.inline
    def setDocumentVersion(value: String): Self = this.set("documentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentVersion: Self = this.set("documentVersion", js.undefined)
  }
}
