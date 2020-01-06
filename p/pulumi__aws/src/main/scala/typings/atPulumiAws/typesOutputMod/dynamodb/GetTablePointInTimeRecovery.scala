package typings.atPulumiAws.typesOutputMod.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTablePointInTimeRecovery extends js.Object {
  var enabled: Boolean = js.native
}

object GetTablePointInTimeRecovery {
  @scala.inline
  def apply(enabled: Boolean): GetTablePointInTimeRecovery = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTablePointInTimeRecovery]
  }
}

