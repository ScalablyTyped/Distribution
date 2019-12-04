package typings.slateDashReact.slateDashReactMod

import typings.immutable.Immutable.List
import typings.slate.slateMod.Operation
import typings.slate.slateMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChangeParam extends js.Object {
  var operations: List[Operation]
  var value: Value
}

object OnChangeParam {
  @scala.inline
  def apply(operations: List[Operation], value: Value): OnChangeParam = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnChangeParam]
  }
}

