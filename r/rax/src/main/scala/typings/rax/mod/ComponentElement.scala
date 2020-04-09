package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentElement[P, T /* <: Component[P, ComponentState, _] */] extends RaxElement[P, ComponentClass[P, ComponentState]] {
  var ref: js.UndefOr[LegacyRef[T]] = js.undefined
}

object ComponentElement {
  @scala.inline
  def apply[P, T /* <: Component[P, ComponentState, _] */](props: P, `type`: ComponentClass[P, ComponentState], key: Key = null, ref: LegacyRef[T] = null): ComponentElement[P, T] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[P, T]]
  }
}

