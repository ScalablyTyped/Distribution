package typings
package simplDashSchemaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Domain extends js.Object {
  var Domain: stdLib.RegExp
  var Email: stdLib.RegExp
  var EmailWithTLD: stdLib.RegExp
  var IP: stdLib.RegExp
  var IPv4: stdLib.RegExp
  var IPv6: stdLib.RegExp
  var Id: stdLib.RegExp
  var Phone: stdLib.RegExp
  var Url: stdLib.RegExp
  var WeakDomain: stdLib.RegExp
  var ZipCode: stdLib.RegExp
}

object Anon_Domain {
  @scala.inline
  def apply(
    Domain: stdLib.RegExp,
    Email: stdLib.RegExp,
    EmailWithTLD: stdLib.RegExp,
    IP: stdLib.RegExp,
    IPv4: stdLib.RegExp,
    IPv6: stdLib.RegExp,
    Id: stdLib.RegExp,
    Phone: stdLib.RegExp,
    Url: stdLib.RegExp,
    WeakDomain: stdLib.RegExp,
    ZipCode: stdLib.RegExp
  ): Anon_Domain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Domain")(Domain)
    __obj.updateDynamic("Email")(Email)
    __obj.updateDynamic("EmailWithTLD")(EmailWithTLD)
    __obj.updateDynamic("IP")(IP)
    __obj.updateDynamic("IPv4")(IPv4)
    __obj.updateDynamic("IPv6")(IPv6)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("Phone")(Phone)
    __obj.updateDynamic("Url")(Url)
    __obj.updateDynamic("WeakDomain")(WeakDomain)
    __obj.updateDynamic("ZipCode")(ZipCode)
    __obj.asInstanceOf[Anon_Domain]
  }
}

