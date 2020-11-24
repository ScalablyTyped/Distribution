package typings.pulumiAws.documentationVersionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentationVersionState extends js.Object {
  
  /**
    * The description of the API documentation version.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the associated Rest API
    */
  val restApiId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The version identifier of the API documentation snapshot.
    */
  val version: js.UndefOr[Input[String]] = js.native
}
object DocumentationVersionState {
  
  @scala.inline
  def apply(): DocumentationVersionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationVersionState]
  }
  
  @scala.inline
  implicit class DocumentationVersionStateOps[Self <: DocumentationVersionState] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setRestApiId(value: Input[String]): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestApiId: Self = this.set("restApiId", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
