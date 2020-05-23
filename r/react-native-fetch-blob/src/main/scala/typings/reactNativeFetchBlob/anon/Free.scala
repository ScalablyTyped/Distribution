package typings.reactNativeFetchBlob.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Free extends js.Object {
  var free: Double
  var total: Double
}

object Free {
  @scala.inline
  def apply(free: Double, total: Double): Free = {
    val __obj = js.Dynamic.literal(free = free.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Free]
  }
}

