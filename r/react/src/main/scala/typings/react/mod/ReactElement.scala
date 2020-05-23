package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactElement extends js.Object {
  var key: Key | Null
  var props: js.Any
  var `type`: js.Any
}

object ReactElement {
  @scala.inline
  def apply(props: js.Any, `type`: js.Any, key: Key = null): ReactElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactElement]
  }
}

