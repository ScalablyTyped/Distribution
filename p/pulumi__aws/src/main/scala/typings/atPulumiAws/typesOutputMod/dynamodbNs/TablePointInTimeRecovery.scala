package typings.atPulumiAws.typesOutputMod.dynamodbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TablePointInTimeRecovery extends js.Object {
  /**
    * Whether to enable point-in-time recovery - note that it can take up to 10 minutes to enable for new tables. If the `pointInTimeRecovery` block is not provided then this defaults to `false`.
    */
  var enabled: Boolean
}

object TablePointInTimeRecovery {
  @scala.inline
  def apply(enabled: Boolean): TablePointInTimeRecovery = {
    val __obj = js.Dynamic.literal(enabled = enabled)
  
    __obj.asInstanceOf[TablePointInTimeRecovery]
  }
}

