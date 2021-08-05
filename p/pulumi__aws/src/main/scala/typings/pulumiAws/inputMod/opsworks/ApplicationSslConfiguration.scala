package typings.pulumiAws.inputMod.opsworks

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSslConfiguration extends StObject {
  
  /**
    * The contents of the certificate's domain.crt file.
    */
  var certificate: Input[String]
  
  /**
    * Can be used to specify an intermediate certificate authority key or client authentication.
    */
  var chain: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The private key; the contents of the certificate's domain.key file.
    */
  var privateKey: Input[String]
}
object ApplicationSslConfiguration {
  
  inline def apply(certificate: Input[String], privateKey: Input[String]): ApplicationSslConfiguration = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSslConfiguration]
  }
  
  extension [Self <: ApplicationSslConfiguration](x: Self) {
    
    inline def setCertificate(value: Input[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setChain(value: Input[String]): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    inline def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
    
    inline def setPrivateKey(value: Input[String]): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
  }
}
