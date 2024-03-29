package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterKerberosAttributes extends StObject {
  
  /**
    * The Active Directory password for `adDomainJoinUser`. This provider cannot perform drift detection of this configuration.
    */
  var adDomainJoinPassword: js.UndefOr[String] = js.undefined
  
  /**
    * Required only when establishing a cross-realm trust with an Active Directory domain. A user with sufficient privileges to join resources to the domain. This provider cannot perform drift detection of this configuration.
    */
  var adDomainJoinUser: js.UndefOr[String] = js.undefined
  
  /**
    * Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm principal password, which must be identical across realms. This provider cannot perform drift detection of this configuration.
    */
  var crossRealmTrustPrincipalPassword: js.UndefOr[String] = js.undefined
  
  /**
    * The password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains Kerberos principals, password policies, and keytabs for the cluster. This provider cannot perform drift detection of this configuration.
    */
  var kdcAdminPassword: String
  
  /**
    * The name of the Kerberos realm to which all nodes in a cluster belong. For example, `EC2.INTERNAL`
    */
  var realm: String
}
object ClusterKerberosAttributes {
  
  inline def apply(kdcAdminPassword: String, realm: String): ClusterKerberosAttributes = {
    val __obj = js.Dynamic.literal(kdcAdminPassword = kdcAdminPassword.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterKerberosAttributes]
  }
  
  extension [Self <: ClusterKerberosAttributes](x: Self) {
    
    inline def setAdDomainJoinPassword(value: String): Self = StObject.set(x, "adDomainJoinPassword", value.asInstanceOf[js.Any])
    
    inline def setAdDomainJoinPasswordUndefined: Self = StObject.set(x, "adDomainJoinPassword", js.undefined)
    
    inline def setAdDomainJoinUser(value: String): Self = StObject.set(x, "adDomainJoinUser", value.asInstanceOf[js.Any])
    
    inline def setAdDomainJoinUserUndefined: Self = StObject.set(x, "adDomainJoinUser", js.undefined)
    
    inline def setCrossRealmTrustPrincipalPassword(value: String): Self = StObject.set(x, "crossRealmTrustPrincipalPassword", value.asInstanceOf[js.Any])
    
    inline def setCrossRealmTrustPrincipalPasswordUndefined: Self = StObject.set(x, "crossRealmTrustPrincipalPassword", js.undefined)
    
    inline def setKdcAdminPassword(value: String): Self = StObject.set(x, "kdcAdminPassword", value.asInstanceOf[js.Any])
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
  }
}
