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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateMeta]
  }
}

