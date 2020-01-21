package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleTask extends js.Object {
  var name: String
  def gen(): Unit
}

object SimpleTask {
  @scala.inline
  def apply(gen: () => Unit, name: String): SimpleTask = {
    val __obj = js.Dynamic.literal(gen = js.Any.fromFunction0(gen), name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SimpleTask]
  }
}

