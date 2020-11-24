package typings.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDefinedFunctionResourceUri extends js.Object {
  
  /**
    * The type of the resource. can be one of `JAR`, `FILE`, and `ARCHIVE`.
    */
  var resourceType: String = js.native
  
  /**
    * The URI for accessing the resource.
    */
  var uri: String = js.native
}
object UserDefinedFunctionResourceUri {
  
  @scala.inline
  def apply(resourceType: String, uri: String): UserDefinedFunctionResourceUri = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefinedFunctionResourceUri]
  }
  
  @scala.inline
  implicit class UserDefinedFunctionResourceUriOps[Self <: UserDefinedFunctionResourceUri] (val x: Self) extends AnyVal {
    
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
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
}
