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
  def apply(gen: js.Function0[scala.Unit], name: java.lang.String): SimpleTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gen")(gen)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SimpleTask]
  }
}

