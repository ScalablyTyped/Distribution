package typings.reduxForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[P] extends js.Object {
  var props: P
}

object Props {
  @scala.inline
  def apply[P](props: P): Props[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[P]]
  }
}

