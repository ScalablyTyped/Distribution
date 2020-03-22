package typings.storybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnSelect extends js.Object {
  def onSelect(id: String): Unit = js.native
}

object AnonOnSelect {
  @scala.inline
  def apply(onSelect: String => Unit): AnonOnSelect = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect))
  
    __obj.asInstanceOf[AnonOnSelect]
  }
}

