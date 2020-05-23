package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPortal extends ReactElement {
  var children: ReactNode
}

object ReactPortal {
  @scala.inline
  def apply(props: js.Any, `type`: js.Any, children: ReactNode = null, key: Key = null): ReactPortal = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPortal]
  }
}

