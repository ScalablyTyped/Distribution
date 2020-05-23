package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionComponentElement[P] extends ReactElement {
  var ref: js.UndefOr[js.Any] = js.undefined
}

object FunctionComponentElement {
  @scala.inline
  def apply[P](props: js.Any, `type`: js.Any, key: Key = null, ref: js.Any = null): FunctionComponentElement[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionComponentElement[P]]
  }
}

