package typings.simplDashSchema

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Domain extends js.Object {
  var Domain: RegExp
  var Email: RegExp
  var EmailWithTLD: RegExp
  var IP: RegExp
  var IPv4: RegExp
  var IPv6: RegExp
  var Id: RegExp
  var Phone: RegExp
  var Url: RegExp
  var WeakDomain: RegExp
  var ZipCode: RegExp
}

object Anon_Domain {
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
  ): Anon_Domain = {
    val __obj = js.Dynamic.literal(Domain = Domain, Email = Email, EmailWithTLD = EmailWithTLD, IP = IP, IPv4 = IPv4, IPv6 = IPv6, Id = Id, Phone = Phone, Url = Url, WeakDomain = WeakDomain, ZipCode = ZipCode)
  
    __obj.asInstanceOf[Anon_Domain]
  }
}

