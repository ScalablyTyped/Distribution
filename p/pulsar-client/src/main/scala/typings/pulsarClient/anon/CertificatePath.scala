package typings.pulsarClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificatePath extends js.Object {
  
  var certificatePath: String = js.native
  
  var privateKeyPath: String = js.native
}
object CertificatePath {
  
  @scala.inline
  def apply(certificatePath: String, privateKeyPath: String): CertificatePath = {
    val __obj = js.Dynamic.literal(certificatePath = certificatePath.asInstanceOf[js.Any], privateKeyPath = privateKeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificatePath]
  }
  
  @scala.inline
  implicit class CertificatePathOps[Self <: CertificatePath] (val x: Self) extends AnyVal {
    
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
    def setCertificatePath(value: String): Self = this.set("certificatePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyPath(value: String): Self = this.set("privateKeyPath", value.asInstanceOf[js.Any])
  }
}
