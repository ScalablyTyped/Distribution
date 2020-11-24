package typings.solrClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddRemoteResourceOptions extends js.Object {
  
  var contentType: String = js.native
  
  var format: String = js.native
  
  var parameters: js.Object = js.native
  
  var path: String = js.native
}
object AddRemoteResourceOptions {
  
  @scala.inline
  def apply(contentType: String, format: String, parameters: js.Object, path: String): AddRemoteResourceOptions = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRemoteResourceOptions]
  }
  
  @scala.inline
  implicit class AddRemoteResourceOptionsOps[Self <: AddRemoteResourceOptions] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: js.Object): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}
