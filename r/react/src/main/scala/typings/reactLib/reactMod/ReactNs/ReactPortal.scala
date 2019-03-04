package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPortal
  extends ReactElement[js.Any] {
  var children: ReactNode
}

object ReactPortal {
  @scala.inline
  def apply(
    children: ReactNode,
    props: js.Any,
    `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify T */ js.Any,
    key: Key = null
  ): ReactPortal = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], props = props)
    __obj.updateDynamic("type")(`type`)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPortal]
  }
}

