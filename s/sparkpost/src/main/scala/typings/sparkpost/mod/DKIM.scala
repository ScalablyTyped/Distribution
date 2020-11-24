package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DKIM extends js.Object {
  
  /** Header fields to be included in the DKIM signature. This field is currently ignored. */
  var headers: js.UndefOr[String] = js.native
  
  /** DKIM private key. */
  var `private`: js.UndefOr[String] = js.native
  
  /** DKIM public key. */
  var public: String = js.native
  
  /** DomainKey selector. */
  var selector: String = js.native
  
  /** Signing Domain Identifier (SDID). SparkPost Enterprise API only. */
  var signing_domain: js.UndefOr[String] = js.native
}
object DKIM {
  
  @scala.inline
  def apply(public: String, selector: String): DKIM = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DKIM]
  }
  
  @scala.inline
  implicit class DKIMOps[Self <: DKIM] (val x: Self) extends AnyVal {
    
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
    def setPublic(value: String): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: String): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setPrivate(value: String): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    
    @scala.inline
    def setSigning_domain(value: String): Self = this.set("signing_domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigning_domain: Self = this.set("signing_domain", js.undefined)
  }
}
