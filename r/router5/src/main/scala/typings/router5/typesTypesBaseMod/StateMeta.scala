package typings.router5.typesTypesBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateMeta extends js.Object {
  var id: Double
  var options: NavigationOptions
  var params: Params
  var redirected: Boolean
  var source: js.UndefOr[String] = js.undefined
}

object StateMeta {
  @scala.inline
  def apply(id: Double, options: NavigationOptions, params: Params, redirected: Boolean, source: String = null): StateMeta = {
    val __obj = js.Dynamic.literal(id = id, options = options, params = params, redirected = redirected)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[StateMeta]
  }
}

