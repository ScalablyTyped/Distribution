package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseTask extends js.Object {
  var name: java.lang.String
  def gen(): js.Promise[_]
}

object PromiseTask {
  @scala.inline
  def apply(gen: () => js.Promise[_], name: java.lang.String): PromiseTask = {
    val __obj = js.Dynamic.literal(gen = js.Any.fromFunction0(gen), name = name)
  
    __obj.asInstanceOf[PromiseTask]
  }
}

