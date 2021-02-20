package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterKerberosAttributes extends StObject {
  
  /**
    * The Active Directory password for `adDomainJoinUser`. This provider cannot perform drift detection of this configuration.
    */
  var adDomainJoinPassword: js.UndefOr[Input[String]] = js.native
  
  /**
    * Required only when establishing a cross-realm trust with an Active Directory domain. A user with sufficient privileges to join resources to the domain. This provider cannot perform drift detection of this configuration.
    */
  var adDomainJoinUser: js.UndefOr[Input[String]] = js.native
  
  /**
    * Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm principal password, which must be identical across realms. This provider cannot perform drift detection of this configuration.
    */
  var crossRealmTrustPrincipalPassword: js.UndefOr[Input[String]] = js.native
  
  /**
    * The password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains Kerberos principals, password policies, and keytabs for the cluster. This provider cannot perform drift detection of this configuration.
    */
  var kdcAdminPassword: Input[String] = js.native
  
  /**
    * The name of the Kerberos realm to which all nodes in a cluster belong. For example, `EC2.INTERNAL`
    */
  var realm: Input[String] = js.native
}
object ClusterKerberosAttributes {
  
  @scala.inline
  def apply(kdcAdminPassword: Input[String], realm: Input[String]): ClusterKerberosAttributes = {
    val __obj = js.Dynamic.literal(kdcAdminPassword = kdcAdminPassword.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterKerberosAttributes]
  }
  
  @scala.inline
  implicit class ClusterKerberosAttributesMutableBuilder[Self <: ClusterKerberosAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdDomainJoinPassword(value: Input[String]): Self = StObject.set(x, "adDomainJoinPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdDomainJoinPasswordUndefined: Self = StObject.set(x, "adDomainJoinPassword", js.undefined)
    
    @scala.inline
    def setAdDomainJoinUser(value: Input[String]): Self = StObject.set(x, "adDomainJoinUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdDomainJoinUserUndefined: Self = StObject.set(x, "adDomainJoinUser", js.undefined)
    
    @scala.inline
    def setCrossRealmTrustPrincipalPassword(value: Input[String]): Self = StObject.set(x, "crossRealmTrustPrincipalPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossRealmTrustPrincipalPasswordUndefined: Self = StObject.set(x, "crossRealmTrustPrincipalPassword", js.undefined)
    
    @scala.inline
    def setKdcAdminPassword(value: Input[String]): Self = StObject.set(x, "kdcAdminPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealm(value: Input[String]): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
  }
}
