package typings
package router5Lib.typesTypesBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateMeta extends js.Object {
  var id: scala.Double
  var options: NavigationOptions
  var params: Params
  var redirected: scala.Boolean
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object StateMeta {
  @scala.inline
  def apply(
    id: scala.Double,
    options: NavigationOptions,
    params: Params,
    redirected: scala.Boolean,
    source: java.lang.String = null
  ): StateMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("redirected")(redirected)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[StateMeta]
  }
}

