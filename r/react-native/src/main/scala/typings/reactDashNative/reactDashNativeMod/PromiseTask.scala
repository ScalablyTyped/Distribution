package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseTask extends js.Object {
  var name: String
  def gen(): js.Promise[_]
}

object PromiseTask {
  @scala.inline
  def apply(gen: () => js.Promise[_], name: String): PromiseTask = {
    val __obj = js.Dynamic.literal(gen = js.Any.fromFunction0(gen), name = name)
  
    __obj.asInstanceOf[PromiseTask]
  }
}

