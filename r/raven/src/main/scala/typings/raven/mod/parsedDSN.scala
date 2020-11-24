package typings.raven.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait parsedDSN extends js.Object {
  
  var host: String = js.native
  
  var path: String = js.native
  
  var port: Double = js.native
  
  var private_key: String = js.native
  
  var project_id: String = js.native
  
  var protocol: String = js.native
  
  var public_key: String = js.native
}
object parsedDSN {
  
  @scala.inline
  def apply(
    host: String,
    path: String,
    port: Double,
    private_key: String,
    project_id: String,
    protocol: String,
    public_key: String
  ): parsedDSN = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[parsedDSN]
  }
  
  @scala.inline
  implicit class parsedDSNOps[Self <: parsedDSN] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate_key(value: String): Self = this.set("private_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject_id(value: String): Self = this.set("project_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_key(value: String): Self = this.set("public_key", value.asInstanceOf[js.Any])
  }
}
