package typings.storybookUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArg extends js.Object {
  def onChange(arg: String): Unit
}

object AnonArg {
  @scala.inline
  def apply(onChange: String => Unit): AnonArg = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
  
    __obj.asInstanceOf[AnonArg]
  }
}

