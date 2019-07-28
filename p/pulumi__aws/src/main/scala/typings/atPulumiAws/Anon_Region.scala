package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Region extends js.Object {
  var region: String
  var tableName: String
  var useCallerCredentials: js.UndefOr[Boolean] = js.undefined
}

object Anon_Region {
  @scala.inline
  def apply(region: String, tableName: String, useCallerCredentials: js.UndefOr[Boolean] = js.undefined): Anon_Region = {
    val __obj = js.Dynamic.literal(region = region, tableName = tableName)
    if (!js.isUndefined(useCallerCredentials)) __obj.updateDynamic("useCallerCredentials")(useCallerCredentials)
    __obj.asInstanceOf[Anon_Region]
  }
}

