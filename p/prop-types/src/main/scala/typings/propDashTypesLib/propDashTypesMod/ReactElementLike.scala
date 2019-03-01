package typings
package propDashTypesLib.propDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactElementLike extends js.Object {
  var key: java.lang.String | scala.Double | scala.Null
  var props: js.Any
  var `type`: ReactComponentLike
}

object ReactElementLike {
  @scala.inline
  def apply(props: js.Any, `type`: ReactComponentLike, key: java.lang.String | scala.Double = null): ReactElementLike = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("props")(props)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactElementLike]
  }
}

