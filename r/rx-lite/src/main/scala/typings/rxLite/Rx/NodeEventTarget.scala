package typings.rxLite.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeEventTarget extends js.Object {
  def addListener(name: String, cb: js.Function1[/* e */ js.Any, _]): Unit
}

object NodeEventTarget {
  @scala.inline
  def apply(addListener: (String, js.Function1[/* e */ js.Any, _]) => Unit): NodeEventTarget = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener))
    __obj.asInstanceOf[NodeEventTarget]
  }
}

