package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionComponentElement[P] extends ReactElement[P] {
  var ref: js.UndefOr[js.Any] = js.undefined
}

object FunctionComponentElement {
  @scala.inline
  def apply[P](
    props: P,
    `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify T */ js.Any,
    key: Key = null,
    ref: js.Any = null
  ): FunctionComponentElement[P] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[FunctionComponentElement[P]]
  }
}

