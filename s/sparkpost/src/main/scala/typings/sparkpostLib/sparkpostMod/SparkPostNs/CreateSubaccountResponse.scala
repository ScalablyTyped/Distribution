package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSubaccountResponse extends js.Object {
  var key: java.lang.String
  var label: java.lang.String
  var short_key: java.lang.String
  var subaccount_id: scala.Double
}

object CreateSubaccountResponse {
  @scala.inline
  def apply(
    key: java.lang.String,
    label: java.lang.String,
    short_key: java.lang.String,
    subaccount_id: scala.Double
  ): CreateSubaccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("short_key")(short_key)
    __obj.updateDynamic("subaccount_id")(subaccount_id)
    __obj.asInstanceOf[CreateSubaccountResponse]
  }
}

