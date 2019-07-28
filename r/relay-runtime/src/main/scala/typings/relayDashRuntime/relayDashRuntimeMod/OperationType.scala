package typings.relayDashRuntime.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationType extends js.Object {
  val response: js.Any
  val variables: Variables
}

object OperationType {
  @scala.inline
  def apply(response: js.Any, variables: Variables): OperationType = {
    val __obj = js.Dynamic.literal(response = response, variables = variables)
  
    __obj.asInstanceOf[OperationType]
  }
}

