package typings
package receptacleLib.receptacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Items[T] extends js.Object {
  var key: java.lang.String
  var value: T
}

object Items {
  @scala.inline
  def apply[T](key: java.lang.String, value: T): Items[T] = {
    val __obj = js.Dynamic.literal(key = key, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Items[T]]
  }
}

