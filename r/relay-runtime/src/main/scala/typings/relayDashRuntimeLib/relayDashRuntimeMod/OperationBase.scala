package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationBase extends js.Object {
  var response: js.Object
  var variables: js.Object
}

object OperationBase {
  @scala.inline
  def apply(response: js.Object, variables: js.Object): OperationBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("response")(response)
    __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[OperationBase]
  }
}

