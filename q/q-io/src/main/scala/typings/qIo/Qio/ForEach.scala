package typings.qIo.Qio

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForEach extends js.Object {
  def forEach(callback: ForEachCallback): Promise[Unit]
}

object ForEach {
  @scala.inline
  def apply(forEach: ForEachCallback => Promise[Unit]): ForEach = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
    __obj.asInstanceOf[ForEach]
  }
}

