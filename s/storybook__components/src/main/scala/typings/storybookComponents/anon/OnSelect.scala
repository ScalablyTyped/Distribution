package typings.storybookComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSelect extends js.Object {
  def onSelect(id: String): Unit = js.native
}

object OnSelect {
  @scala.inline
  def apply(onSelect: String => Unit): OnSelect = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[OnSelect]
  }
}

