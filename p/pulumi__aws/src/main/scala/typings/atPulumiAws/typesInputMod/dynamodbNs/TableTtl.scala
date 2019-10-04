package typings.atPulumiAws.typesInputMod.dynamodbNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableTtl extends js.Object {
  /**
    * The name of the table attribute to store the TTL timestamp in.
    */
  var attributeName: Input[String]
  /**
    * Whether to enable point-in-time recovery - note that it can take up to 10 minutes to enable for new tables. If the `pointInTimeRecovery` block is not provided then this defaults to `false`.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
}

object TableTtl {
  @scala.inline
  def apply(attributeName: Input[String], enabled: Input[Boolean] = null): TableTtl = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableTtl]
  }
}

