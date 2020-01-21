package typings.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait splitPanesWatch extends js.Object {
  def defaultPercent(`val`: js.Any): Unit
}

object splitPanesWatch {
  @scala.inline
  def apply(defaultPercent: js.Any => Unit): splitPanesWatch = {
    val __obj = js.Dynamic.literal(defaultPercent = js.Any.fromFunction1(defaultPercent))
  
    __obj.asInstanceOf[splitPanesWatch]
  }
}

