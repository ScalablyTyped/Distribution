package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSubaccountResponse extends js.Object {
  var key: String
  var label: String
  var short_key: String
  var subaccount_id: Double
}

object CreateSubaccountResponse {
  @scala.inline
  def apply(key: String, label: String, short_key: String, subaccount_id: Double): CreateSubaccountResponse = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], short_key = short_key.asInstanceOf[js.Any], subaccount_id = subaccount_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubaccountResponse]
  }
}

