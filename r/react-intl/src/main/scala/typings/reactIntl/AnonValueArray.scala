package typings.reactIntl

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueArray extends js.Object {
  var value: js.Array[ReactNode]
}

object AnonValueArray {
  @scala.inline
  def apply(value: js.Array[ReactNode]): AnonValueArray = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValueArray]
  }
}

