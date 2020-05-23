package typings.propTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactElementLike extends _ReactNodeLike {
  var key: String | Double | Null
  var props: js.Any
  var `type`: ReactComponentLike
}

object ReactElementLike {
  @scala.inline
  def apply(props: js.Any, `type`: ReactComponentLike, key: String | Double = null): ReactElementLike = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactElementLike]
  }
}

