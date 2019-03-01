package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dns extends js.Object {
  var dns: Anon_ServiceName
}

object Anon_Dns {
  @scala.inline
  def apply(dns: Anon_ServiceName): Anon_Dns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dns")(dns)
    __obj.asInstanceOf[Anon_Dns]
  }
}

