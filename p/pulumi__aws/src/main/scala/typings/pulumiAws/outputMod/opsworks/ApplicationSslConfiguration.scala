package typings.pulumiAws.outputMod.opsworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationSslConfiguration extends js.Object {
  
  /**
    * The contents of the certificate's domain.crt file.
    */
  var certificate: String = js.native
  
  /**
    * Can be used to specify an intermediate certificate authority key or client authentication.
    */
  var chain: js.UndefOr[String] = js.native
  
  /**
    * The private key; the contents of the certificate's domain.key file.
    */
  var privateKey: String = js.native
}
object ApplicationSslConfiguration {
  
  @scala.inline
  def apply(certificate: String, privateKey: String): ApplicationSslConfiguration = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSslConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationSslConfigurationOps[Self <: ApplicationSslConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCertificate(value: String): Self = this.set("certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChain(value: String): Self = this.set("chain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChain: Self = this.set("chain", js.undefined)
  }
}
