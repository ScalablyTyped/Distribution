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
  def apply[Input, Value](preload: Input => scala.Unit, read: Input => Value): Resource[Input, Value] = {
    val __obj = js.Dynamic.literal(preload = js.Any.fromFunction1(preload), read = js.Any.fromFunction1(read))
  
    __obj.asInstanceOf[Resource[Input, Value]]
  }
}

