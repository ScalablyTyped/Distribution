package typings.storybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  def onSelect(id: String): Unit
}

object AnonId {
  @scala.inline
  def apply(onSelect: String => Unit): AnonId = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect))
  
    __obj.asInstanceOf[AnonId]
  }
}

