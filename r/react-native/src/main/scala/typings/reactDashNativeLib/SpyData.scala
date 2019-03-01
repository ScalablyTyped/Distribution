package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpyData extends js.Object {
  var args: js.Array[_]
  var method: java.lang.String | scala.Double
  var module: js.UndefOr[java.lang.String] = js.undefined
  var `type`: scala.Double
}

object SpyData {
  @scala.inline
  def apply(
    args: js.Array[_],
    method: java.lang.String | scala.Double,
    `type`: scala.Double,
    module: java.lang.String = null
  ): SpyData = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module)
    __obj.asInstanceOf[SpyData]
  }
}

