package typings.pulumiAws.outputMod.emr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterKerberosAttributes extends js.Object {
  
  /**
    * The Active Directory password for `adDomainJoinUser`. This provider cannot perform drift detection of this configuration.
    */
  var adDomainJoinPassword: js.UndefOr[String] = js.native
  
  /**
    * Required only when establishing a cross-realm trust with an Active Directory domain. A user with sufficient privileges to join resources to the domain. This provider cannot perform drift detection of this configuration.
    */
  var adDomainJoinUser: js.UndefOr[String] = js.native
  
  /**
    * Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm principal password, which must be identical across realms. This provider cannot perform drift detection of this configuration.
    */
  var crossRealmTrustPrincipalPassword: js.UndefOr[String] = js.native
  
  /**
    * The password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains Kerberos principals, password policies, and keytabs for the cluster. This provider cannot perform drift detection of this configuration.
    */
  var kdcAdminPassword: String = js.native
  
  /**
    * The name of the Kerberos realm to which all nodes in a cluster belong. For example, `EC2.INTERNAL`
    */
  var realm: String = js.native
}
object ClusterKerberosAttributes {
  
  @scala.inline
  def apply(kdcAdminPassword: String, realm: String): ClusterKerberosAttributes = {
    val __obj = js.Dynamic.literal(kdcAdminPassword = kdcAdminPassword.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterKerberosAttributes]
  }
  
  @scala.inline
  implicit class ClusterKerberosAttributesOps[Self <: ClusterKerberosAttributes] (val x: Self) extends AnyVal {
    
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
    def setKdcAdminPassword(value: String): Self = this.set("kdcAdminPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdDomainJoinPassword(value: String): Self = this.set("adDomainJoinPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdDomainJoinPassword: Self = this.set("adDomainJoinPassword", js.undefined)
    
    @scala.inline
    def setAdDomainJoinUser(value: String): Self = this.set("adDomainJoinUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdDomainJoinUser: Self = this.set("adDomainJoinUser", js.undefined)
    
    @scala.inline
    def setCrossRealmTrustPrincipalPassword(value: String): Self = this.set("crossRealmTrustPrincipalPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossRealmTrustPrincipalPassword: Self = this.set("crossRealmTrustPrincipalPassword", js.undefined)
  }
}
