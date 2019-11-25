package typings.selectorDashSet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[T] extends js.Object {
  var data: T
  var selector: String
}

object Anon_Data {
  @scala.inline
  def apply[T](data: T, selector: String): Anon_Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data[T]]
  }
}

