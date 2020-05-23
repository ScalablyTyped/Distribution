package typings.reactSimpleCodeEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait History extends js.Object {
  var history: Offset
}

object History {
  @scala.inline
  def apply(history: Offset): History = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[History]
  }
}

