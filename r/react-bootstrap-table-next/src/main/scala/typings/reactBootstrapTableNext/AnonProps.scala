package typings.reactBootstrapTableNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProps[T /* <: js.Object */] extends js.Object {
  var props: AnonData[T]
}

object AnonProps {
  @scala.inline
  def apply[T /* <: js.Object */](props: AnonData[T]): AnonProps[T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProps[T]]
  }
}

