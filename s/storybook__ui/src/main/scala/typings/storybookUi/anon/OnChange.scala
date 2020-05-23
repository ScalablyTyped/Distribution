package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChange extends js.Object {
  def onChange(arg: String): Unit
}

object OnChange {
  @scala.inline
  def apply(onChange: String => Unit): OnChange = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[OnChange]
  }
}

