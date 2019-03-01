package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IpAddresses extends js.Object {
  var ipAddresses: js.Array[java.lang.String]
  var ipFamily: java.lang.String
}

object Anon_IpAddresses {
  @scala.inline
  def apply(ipAddresses: js.Array[java.lang.String], ipFamily: java.lang.String): Anon_IpAddresses = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ipAddresses")(ipAddresses)
    __obj.updateDynamic("ipFamily")(ipFamily)
    __obj.asInstanceOf[Anon_IpAddresses]
  }
}

