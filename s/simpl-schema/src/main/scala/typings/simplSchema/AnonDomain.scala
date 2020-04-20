package typings.simplSchema

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomain extends js.Object {
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

object AnonDomain {
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
  ): AnonDomain = {
    val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], EmailWithTLD = EmailWithTLD.asInstanceOf[js.Any], IP = IP.asInstanceOf[js.Any], IPv4 = IPv4.asInstanceOf[js.Any], IPv6 = IPv6.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Phone = Phone.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], WeakDomain = WeakDomain.asInstanceOf[js.Any], ZipCode = ZipCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDomain]
  }
}

