package typings.reactWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProps[P, S] extends js.Object {
  var props: P
  var state: S
}

object AnonProps {
  @scala.inline
  def apply[P, S](props: P, state: S): AnonProps[P, S] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProps[P, S]]
  }
}

