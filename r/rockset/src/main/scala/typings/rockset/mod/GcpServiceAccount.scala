package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GcpServiceAccount extends js.Object {
  // Contents of JSON Service Account key file
  var service_account_key_file_json: String
}

object GcpServiceAccount {
  @scala.inline
  def apply(service_account_key_file_json: String): GcpServiceAccount = {
    val __obj = js.Dynamic.literal(service_account_key_file_json = service_account_key_file_json.asInstanceOf[js.Any])
    __obj.asInstanceOf[GcpServiceAccount]
  }
}

