package typings.pulumiAws.outputMod.opsworks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSslConfiguration extends StObject {
  
  /**
    * The contents of the certificate's domain.crt file.
    */
  var certificate: String
  
  /**
    * Can be used to specify an intermediate certificate authority key or client authentication.
    */
  var chain: js.UndefOr[String] = js.undefined
  
  /**
    * The private key; the contents of the certificate's domain.key file.
    */
  var privateKey: String
}
object ApplicationSslConfiguration {
  
  @scala.inline
  def apply(certificate: String, privateKey: String): ApplicationSslConfiguration = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSslConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationSslConfigurationMutableBuilder[Self <: ApplicationSslConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChain(value: String): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
  }
}
