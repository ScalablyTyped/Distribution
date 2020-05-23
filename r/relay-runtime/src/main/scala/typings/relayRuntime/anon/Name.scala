package typings.relayRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  // RequestParameters type
  val name: String
  val operationKind: String
  val text: String
}

object Name {
  @scala.inline
  def apply(name: String, operationKind: String, text: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operationKind = operationKind.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

