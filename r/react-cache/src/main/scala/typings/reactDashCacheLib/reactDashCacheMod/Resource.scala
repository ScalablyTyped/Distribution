package typings
package reactDashCacheLib.reactDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource[Input, Value] extends js.Object {
  def preload(key: Input): scala.Unit
  def read(key: Input): Value
}

object Resource {
  @scala.inline
  def apply[Input, Value](preload: js.Function1[Input, scala.Unit], read: js.Function1[Input, Value]): Resource[Input, Value] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("preload")(preload)
    __obj.updateDynamic("read")(read)
    __obj.asInstanceOf[Resource[Input, Value]]
  }
}

