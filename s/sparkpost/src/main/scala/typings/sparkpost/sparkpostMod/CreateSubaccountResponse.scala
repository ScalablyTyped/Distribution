package typings.sparkpost.sparkpostMod

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
    val __obj = js.Dynamic.literal(key = key, label = label, short_key = short_key, subaccount_id = subaccount_id)
  
    __obj.asInstanceOf[CreateSubaccountResponse]
  }
}

