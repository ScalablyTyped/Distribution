package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait json extends js.Object {
  var conditions: js.UndefOr[js.Object] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double | scala.Boolean] = js.undefined
}

object json {
  @scala.inline
  def apply(
    conditions: js.Object = null,
    path: java.lang.String = null,
    value: java.lang.String | scala.Double | scala.Boolean = null
  ): json = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    if (path != null) __obj.updateDynamic("path")(path)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[json]
  }
}

