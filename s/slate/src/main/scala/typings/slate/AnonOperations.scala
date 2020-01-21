package typings.slate

import typings.immutable.Immutable.List
import typings.slate.mod.Operation
import typings.slate.mod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOperations extends js.Object {
  var operations: List[Operation]
  var value: Value
}

object AnonOperations {
  @scala.inline
  def apply(operations: List[Operation], value: Value): AnonOperations = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOperations]
  }
}

