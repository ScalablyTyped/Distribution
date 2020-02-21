package typings.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  // RequestParameters type
  val name: String
  val operationKind: String
  val text: String
}

object AnonName {
  @scala.inline
  def apply(name: String, operationKind: String, text: String): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operationKind = operationKind.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

