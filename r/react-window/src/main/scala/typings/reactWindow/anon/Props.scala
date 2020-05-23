package typings.reactWindow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[P, S] extends js.Object {
  var props: P
  var state: S
}

object Props {
  @scala.inline
  def apply[P, S](props: P, state: S): Props[P, S] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[P, S]]
  }
}

