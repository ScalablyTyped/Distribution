package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSendingDomain extends js.Object {
  
  /** JSON object in which DKIM key configuration is defined. */
  var dkim: js.UndefOr[DKIM] = js.native
  
  /** Size, in bits, of the DKIM private key to be generated. This option only applies if generate_dkim is ‘true’. */
  var dkim_key_length: js.UndefOr[Double] = js.native
  
  /** Whether to generate a DKIM keypair on creation. */
  var generate_dkim: js.UndefOr[Boolean] = js.native
  
  /** Setting to true allows this domain to be used by subaccounts. Defaults to false, only available to domains belonging to a master account. */
  var shared_with_subaccounts: js.UndefOr[Boolean] = js.native
  
  /** Associated tracking domain. */
  var tracking_domain: js.UndefOr[String] = js.native
}
object UpdateSendingDomain {
  
  @scala.inline
  def apply(): UpdateSendingDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSendingDomain]
  }
  
  @scala.inline
  implicit class UpdateSendingDomainOps[Self <: UpdateSendingDomain] (val x: Self) extends AnyVal {
    
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
    def setDkim(value: DKIM): Self = this.set("dkim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDkim: Self = this.set("dkim", js.undefined)
    
    @scala.inline
    def setDkim_key_length(value: Double): Self = this.set("dkim_key_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDkim_key_length: Self = this.set("dkim_key_length", js.undefined)
    
    @scala.inline
    def setGenerate_dkim(value: Boolean): Self = this.set("generate_dkim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerate_dkim: Self = this.set("generate_dkim", js.undefined)
    
    @scala.inline
    def setShared_with_subaccounts(value: Boolean): Self = this.set("shared_with_subaccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared_with_subaccounts: Self = this.set("shared_with_subaccounts", js.undefined)
    
    @scala.inline
    def setTracking_domain(value: String): Self = this.set("tracking_domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracking_domain: Self = this.set("tracking_domain", js.undefined)
  }
}
