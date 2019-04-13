package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactElement[P] extends js.Object {
  var key: Key | scala.Null
  var props: P
  var `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify T */ js.Any
}

object ReactElement {
  @scala.inline
  def apply[P](
    props: P,
    `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify T */ js.Any,
    key: Key = null
  ): ReactElement[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactElement[P]]
  }
}

