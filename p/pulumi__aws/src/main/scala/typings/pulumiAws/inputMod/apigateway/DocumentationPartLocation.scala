package typings.pulumiAws.inputMod.apigateway

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentationPartLocation extends js.Object {
  
  /**
    * The HTTP verb of a method. The default value is `*` for any method.
    */
  var method: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the targeted API entity.
    */
  var name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The URL path of the target. The default value is `/` for the root resource.
    */
  var path: js.UndefOr[Input[String]] = js.native
  
  /**
    * The HTTP status code of a response. The default value is `*` for any status code.
    */
  var statusCode: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of API entity to which the documentation content applies. e.g. `API`, `METHOD` or `REQUEST_BODY`
    */
  var `type`: Input[String] = js.native
}
object DocumentationPartLocation {
  
  @scala.inline
  def apply(`type`: Input[String]): DocumentationPartLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationPartLocation]
  }
  
  @scala.inline
  implicit class DocumentationPartLocationOps[Self <: DocumentationPartLocation] (val x: Self) extends AnyVal {
    
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
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: Input[String]): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Input[String]): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
}
