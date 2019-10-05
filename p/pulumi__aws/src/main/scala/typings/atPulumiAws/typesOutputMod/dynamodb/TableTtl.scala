package typings.atPulumiAws.typesOutputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableTtl extends js.Object {
  /**
    * The name of the table attribute to store the TTL timestamp in.
    */
  var attributeName: String
  /**
    * Whether to enable point-in-time recovery - note that it can take up to 10 minutes to enable for new tables. If the `pointInTimeRecovery` block is not provided then this defaults to `false`.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object TableTtl {
  @scala.inline
  def apply(attributeName: String, enabled: js.UndefOr[Boolean] = js.undefined): TableTtl = {
    val __obj = js.Dynamic.literal(attributeName = attributeName)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[TableTtl]
  }
}

