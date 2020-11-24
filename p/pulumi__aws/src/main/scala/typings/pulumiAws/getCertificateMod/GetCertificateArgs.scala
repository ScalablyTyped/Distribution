package typings.pulumiAws.getCertificateMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCertificateArgs extends js.Object {
  
  /**
    * The domain of the certificate to look up. If no certificate is found with this name, an error will be returned.
    */
  val domain: String = js.native
  
  /**
    * A list of key algorithms to filter certificates. By default, ACM does not return all certificate types when searching. Valid values are `RSA_1024`, `RSA_2048`, `RSA_4096`, `EC_prime256v1`, `EC_secp384r1`, and `EC_secp521r1`.
    */
  val keyTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If set to true, it sorts the certificates matched by previous criteria by the NotBefore field, returning only the most recent one. If set to false, it returns an error if more than one certificate is found. Defaults to false.
    */
  val mostRecent: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of statuses on which to filter the returned list. Valid values are `PENDING_VALIDATION`, `ISSUED`,
    * `INACTIVE`, `EXPIRED`, `VALIDATION_TIMED_OUT`, `REVOKED` and `FAILED`. If no value is specified, only certificates in the `ISSUED` state
    * are returned.
    */
  val statuses: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A mapping of tags for the resource.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * A list of types on which to filter the returned list. Valid values are `AMAZON_ISSUED` and `IMPORTED`.
    */
  val types: js.UndefOr[js.Array[String]] = js.native
}
object GetCertificateArgs {
  
  @scala.inline
  def apply(domain: String): GetCertificateArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateArgs]
  }
  
  @scala.inline
  implicit class GetCertificateArgsOps[Self <: GetCertificateArgs] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTypesVarargs(value: String*): Self = this.set("keyTypes", js.Array(value :_*))
    
    @scala.inline
    def setKeyTypes(value: js.Array[String]): Self = this.set("keyTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyTypes: Self = this.set("keyTypes", js.undefined)
    
    @scala.inline
    def setMostRecent(value: Boolean): Self = this.set("mostRecent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMostRecent: Self = this.set("mostRecent", js.undefined)
    
    @scala.inline
    def setStatusesVarargs(value: String*): Self = this.set("statuses", js.Array(value :_*))
    
    @scala.inline
    def setStatuses(value: js.Array[String]): Self = this.set("statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatuses: Self = this.set("statuses", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
