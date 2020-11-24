package typings.psl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedDomain extends js.Object {
  
  var domain: String | Null = js.native
  
  var error: js.UndefOr[scala.Nothing] = js.native
  
  var input: String = js.native
  
  var listed: Boolean = js.native
  
  var sld: String | Null = js.native
  
  var subdomain: String | Null = js.native
  
  var tld: String | Null = js.native
}
object ParsedDomain {
  
  @scala.inline
  def apply(input: String, listed: Boolean): ParsedDomain = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], listed = listed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedDomain]
  }
  
  @scala.inline
  implicit class ParsedDomainOps[Self <: ParsedDomain] (val x: Self) extends AnyVal {
    
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
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListed(value: Boolean): Self = this.set("listed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNull: Self = this.set("domain", null)
    
    @scala.inline
    def setSld(value: String): Self = this.set("sld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSldNull: Self = this.set("sld", null)
    
    @scala.inline
    def setSubdomain(value: String): Self = this.set("subdomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdomainNull: Self = this.set("subdomain", null)
    
    @scala.inline
    def setTld(value: String): Self = this.set("tld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTldNull: Self = this.set("tld", null)
  }
}
