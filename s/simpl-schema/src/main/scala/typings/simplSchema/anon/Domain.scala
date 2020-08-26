package typings.simplSchema.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Domain extends js.Object {
  var Domain: RegExp = js.native
  var Email: RegExp = js.native
  var EmailWithTLD: RegExp = js.native
  var IP: RegExp = js.native
  var IPv4: RegExp = js.native
  var IPv6: RegExp = js.native
  var Id: RegExp = js.native
  var Phone: RegExp = js.native
  var Url: RegExp = js.native
  var WeakDomain: RegExp = js.native
  var ZipCode: RegExp = js.native
}

object Domain {
  @scala.inline
  def apply(
    Domain: RegExp,
    Email: RegExp,
    EmailWithTLD: RegExp,
    IP: RegExp,
    IPv4: RegExp,
    IPv6: RegExp,
    Id: RegExp,
    Phone: RegExp,
    Url: RegExp,
    WeakDomain: RegExp,
    ZipCode: RegExp
  ): Domain = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], EmailWithTLD = EmailWithTLD.asInstanceOf[js.Any], IP = IP.asInstanceOf[js.Any], IPv4 = IPv4.asInstanceOf[js.Any], IPv6 = IPv6.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Phone = Phone.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], WeakDomain = WeakDomain.asInstanceOf[js.Any], ZipCode = ZipCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  @scala.inline
  implicit class DomainOps[Self <: Domain] (val x: Self) extends AnyVal {
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
    def setDomain(value: RegExp): Self = this.set("Domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: RegExp): Self = this.set("Email", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailWithTLD(value: RegExp): Self = this.set("EmailWithTLD", value.asInstanceOf[js.Any])
    @scala.inline
    def setIP(value: RegExp): Self = this.set("IP", value.asInstanceOf[js.Any])
    @scala.inline
    def setIPv4(value: RegExp): Self = this.set("IPv4", value.asInstanceOf[js.Any])
    @scala.inline
    def setIPv6(value: RegExp): Self = this.set("IPv6", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: RegExp): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: RegExp): Self = this.set("Phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: RegExp): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeakDomain(value: RegExp): Self = this.set("WeakDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def setZipCode(value: RegExp): Self = this.set("ZipCode", value.asInstanceOf[js.Any])
  }
  
}

