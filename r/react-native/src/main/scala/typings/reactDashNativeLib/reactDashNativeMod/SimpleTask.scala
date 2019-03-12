package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleTask extends js.Object {
  var name: java.lang.String
  def gen(): scala.Unit
}

object SimpleTask {
  @scala.inline
  def apply(gen: () => scala.Unit, name: java.lang.String): SimpleTask = {
    val __obj = js.Dynamic.literal(gen = js.Any.fromFunction0(gen), name = name)
  
    __obj.asInstanceOf[SimpleTask]
  }
}

