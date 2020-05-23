package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iot extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var name: String
  var sql: String
  var sqlVersion: String
}

object Iot {
  @scala.inline
  def apply(
    name: String,
    sql: String,
    sqlVersion: String,
    description: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): Iot = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any], sqlVersion = sqlVersion.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iot]
  }
}

