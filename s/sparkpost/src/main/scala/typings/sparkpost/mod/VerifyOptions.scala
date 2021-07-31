package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyOptions extends StObject {
  
  /**
    * A token retrieved from the verification link contained in the abuse@ verification email.
    *
    */
  var abuse_at_token: js.UndefOr[String] = js.undefined
  
  /**
    * Request an email with a verification link to be sent to the sending domain’s abuse@ mailbox.
    *
    */
  var abuse_at_verify: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request verification of CNAME record
    */
  var cname_verify: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request verification of DKIM record
    *
    */
  var dkim_verify: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A token retrieved from the verification link contained in the postmaster@ verification email.
    *
    */
  var postmaster_at_token: js.UndefOr[String] = js.undefined
  
  /**
    * Request an email with a verification link to be sent to the sending domain’s postmaster@ mailbox.
    *
    */
  var postmaster_at_verify: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request verification of SPF record
    *
    * @deprecated
    */
  var spf_verify: js.UndefOr[Boolean] = js.undefined
}
object VerifyOptions {
  
  @scala.inline
  def apply(): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyOptions]
  }
  
  @scala.inline
  implicit class VerifyOptionsMutableBuilder[Self <: VerifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbuse_at_token(value: String): Self = StObject.set(x, "abuse_at_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbuse_at_tokenUndefined: Self = StObject.set(x, "abuse_at_token", js.undefined)
    
    @scala.inline
    def setAbuse_at_verify(value: Boolean): Self = StObject.set(x, "abuse_at_verify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbuse_at_verifyUndefined: Self = StObject.set(x, "abuse_at_verify", js.undefined)
    
    @scala.inline
    def setCname_verify(value: Boolean): Self = StObject.set(x, "cname_verify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCname_verifyUndefined: Self = StObject.set(x, "cname_verify", js.undefined)
    
    @scala.inline
    def setDkim_verify(value: Boolean): Self = StObject.set(x, "dkim_verify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDkim_verifyUndefined: Self = StObject.set(x, "dkim_verify", js.undefined)
    
    @scala.inline
    def setPostmaster_at_token(value: String): Self = StObject.set(x, "postmaster_at_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostmaster_at_tokenUndefined: Self = StObject.set(x, "postmaster_at_token", js.undefined)
    
    @scala.inline
    def setPostmaster_at_verify(value: Boolean): Self = StObject.set(x, "postmaster_at_verify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostmaster_at_verifyUndefined: Self = StObject.set(x, "postmaster_at_verify", js.undefined)
    
    @scala.inline
    def setSpf_verify(value: Boolean): Self = StObject.set(x, "spf_verify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpf_verifyUndefined: Self = StObject.set(x, "spf_verify", js.undefined)
  }
}
