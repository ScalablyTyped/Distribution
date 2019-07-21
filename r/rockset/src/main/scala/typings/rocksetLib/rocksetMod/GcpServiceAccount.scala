package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GcpServiceAccount extends js.Object {
  // Contents of JSON Service Account key file
  var service_account_key_file_json: java.lang.String
}

object GcpServiceAccount {
  @scala.inline
  def apply(service_account_key_file_json: java.lang.String): GcpServiceAccount = {
    val __obj = js.Dynamic.literal(service_account_key_file_json = service_account_key_file_json)
  
    __obj.asInstanceOf[GcpServiceAccount]
  }
}

