package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentElement[P, T /* <: Component[P, ComponentState, _] */] extends ReactElement[P] {
  var ref: js.UndefOr[LegacyRef[T]] = js.undefined
}

object ComponentElement {
  @scala.inline
  def apply[P, T /* <: Component[P, ComponentState, _] */](
    props: P,
    `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify T */ js.Any,
    key: Key = null,
    ref: LegacyRef[T] = null
  ): ComponentElement[P, T] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentElement[P, T]]
  }
}

