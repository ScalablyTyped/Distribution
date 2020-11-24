package typings.samlp.mod

import typings.node.Buffer
import typings.samlp.anon.Post
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdPMetadataOptions extends js.Object {
  
  var cert: String | Buffer = js.native
  
  var issuer: String = js.native
  
  var logoutEndpointPaths: js.UndefOr[Post] = js.native
  
  var postEndpointPath: js.UndefOr[String] = js.native
  
  var profileMapper: js.UndefOr[ProfileMapperConstructor] = js.native
  
  var redirectEndpointPath: js.UndefOr[String] = js.native
}
object IdPMetadataOptions {
  
  @scala.inline
  def apply(cert: String | Buffer, issuer: String): IdPMetadataOptions = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdPMetadataOptions]
  }
  
  @scala.inline
  implicit class IdPMetadataOptionsOps[Self <: IdPMetadataOptions] (val x: Self) extends AnyVal {
    
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
    def setCert(value: String | Buffer): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoutEndpointPaths(value: Post): Self = this.set("logoutEndpointPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogoutEndpointPaths: Self = this.set("logoutEndpointPaths", js.undefined)
    
    @scala.inline
    def setPostEndpointPath(value: String): Self = this.set("postEndpointPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostEndpointPath: Self = this.set("postEndpointPath", js.undefined)
    
    @scala.inline
    def setProfileMapper(value: ProfileMapperConstructor): Self = this.set("profileMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileMapper: Self = this.set("profileMapper", js.undefined)
    
    @scala.inline
    def setRedirectEndpointPath(value: String): Self = this.set("redirectEndpointPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectEndpointPath: Self = this.set("redirectEndpointPath", js.undefined)
  }
}
