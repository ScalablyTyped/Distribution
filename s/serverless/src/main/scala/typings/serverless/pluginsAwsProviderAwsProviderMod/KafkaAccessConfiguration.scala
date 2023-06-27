package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaAccessConfiguration extends StObject {
  
  var clientCertificateTlsAuth: js.UndefOr[String] = js.undefined
  
  var saslPlainAuth: js.UndefOr[String] = js.undefined
  
  var saslScram256Auth: js.UndefOr[String] = js.undefined
  
  var saslScram512Auth: js.UndefOr[String] = js.undefined
  
  var serverRootCaCertificate: js.UndefOr[String] = js.undefined
  
  var vpcSecurityGroup: js.UndefOr[String] = js.undefined
  
  var vpcSubnet: js.UndefOr[js.Array[String]] = js.undefined
}
object KafkaAccessConfiguration {
  
  inline def apply(): KafkaAccessConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaAccessConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KafkaAccessConfiguration] (val x: Self) extends AnyVal {
    
    inline def setClientCertificateTlsAuth(value: String): Self = StObject.set(x, "clientCertificateTlsAuth", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateTlsAuthUndefined: Self = StObject.set(x, "clientCertificateTlsAuth", js.undefined)
    
    inline def setSaslPlainAuth(value: String): Self = StObject.set(x, "saslPlainAuth", value.asInstanceOf[js.Any])
    
    inline def setSaslPlainAuthUndefined: Self = StObject.set(x, "saslPlainAuth", js.undefined)
    
    inline def setSaslScram256Auth(value: String): Self = StObject.set(x, "saslScram256Auth", value.asInstanceOf[js.Any])
    
    inline def setSaslScram256AuthUndefined: Self = StObject.set(x, "saslScram256Auth", js.undefined)
    
    inline def setSaslScram512Auth(value: String): Self = StObject.set(x, "saslScram512Auth", value.asInstanceOf[js.Any])
    
    inline def setSaslScram512AuthUndefined: Self = StObject.set(x, "saslScram512Auth", js.undefined)
    
    inline def setServerRootCaCertificate(value: String): Self = StObject.set(x, "serverRootCaCertificate", value.asInstanceOf[js.Any])
    
    inline def setServerRootCaCertificateUndefined: Self = StObject.set(x, "serverRootCaCertificate", js.undefined)
    
    inline def setVpcSecurityGroup(value: String): Self = StObject.set(x, "vpcSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupUndefined: Self = StObject.set(x, "vpcSecurityGroup", js.undefined)
    
    inline def setVpcSubnet(value: js.Array[String]): Self = StObject.set(x, "vpcSubnet", value.asInstanceOf[js.Any])
    
    inline def setVpcSubnetUndefined: Self = StObject.set(x, "vpcSubnet", js.undefined)
    
    inline def setVpcSubnetVarargs(value: String*): Self = StObject.set(x, "vpcSubnet", js.Array(value*))
  }
}
