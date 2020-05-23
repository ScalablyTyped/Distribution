package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[T /* <: js.Object */] extends js.Object {
  var props: Data[T]
}

object Props {
  @scala.inline
  def apply[T](props: Data[T]): Props[T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
}

