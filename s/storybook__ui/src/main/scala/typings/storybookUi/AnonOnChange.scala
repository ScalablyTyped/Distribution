package typings.storybookUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnChange extends js.Object {
  def onChange(arg: String): Unit
}

object AnonOnChange {
  @scala.inline
  def apply(onChange: String => Unit): AnonOnChange = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[AnonOnChange]
  }
}

