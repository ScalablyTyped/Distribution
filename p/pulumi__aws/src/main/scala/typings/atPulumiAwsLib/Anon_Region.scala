package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Region extends js.Object {
  var region: java.lang.String
  var tableName: java.lang.String
  var useCallerCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Region {
  @scala.inline
  def apply(
    region: java.lang.String,
    tableName: java.lang.String,
    useCallerCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Region = {
    val __obj = js.Dynamic.literal(region = region, tableName = tableName)
    if (!js.isUndefined(useCallerCredentials)) __obj.updateDynamic("useCallerCredentials")(useCallerCredentials)
    __obj.asInstanceOf[Anon_Region]
  }
}

