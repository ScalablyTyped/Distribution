package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPortal extends ReactElement {
  var children: ReactNode
}

object ReactPortal {
  @scala.inline
  def apply(children: ReactNode, props: js.Any, `type`: js.Any, key: Key = null): ReactPortal = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], props = props)
    __obj.updateDynamic("type")(`type`)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPortal]
  }
}

